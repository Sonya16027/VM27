package com.intalio.vmware.sms;

import com.vmware.apputils.Log;
import com.vmware.apputils.SmAppUtil;
import com.vmware.apputils.SmServiceConnection;
import com.vmware.vim.sms.EntityReference;
import com.vmware.vim.sms.EntityReferenceEntityType;
import com.vmware.vim.sms.Metadata;
import com.vmware.vim.sms.QueryResult;
import com.vmware.vim.sms.RowData;
import com.vmware.vim.sms.SmPortType;

/**
 *<pre>
 * his sample implements a function that
 * 
 * ul&gt;
 * li&gt; Gets the list of all instances of datacenter in the vCenter inventory. 
 * li&gt; Iterates over each instance of datacenter and lists instances of SCSIvolumes(LUNs) associated with it. 
 * /ul&gt;
 * 
 * b&gt;Command line:&lt;/b&gt; 
 * un.bat com.intalio.vmware.sms.QueryScsiVolumesInDc --url &lt;webserviceurl&gt; 
 * -username &lt;username&gt; --password &lt;password&gt;
 * 
 *</pre>
 */

public class QueryScsiVolumesInDc {
	private static SmPortType service;
	private static com.vmware.vim.sms.ManagedObjectReference si;

	private static SmAppUtil cb = null;

	public static void main(String[] args) throws Exception {
		QueryScsiVolumesInDc obj = new QueryScsiVolumesInDc();
		cb = SmAppUtil.initialize("QueryScsiVolumesInDc", args);
		cb.connect();
		obj.execute();
		cb.disConnect();
	}

	Log log = new Log();

	public void execute() throws Exception {
		SmServiceConnection conn = cb.getSmConnection();
		service = conn.getService();

		// Get all instances of datacenter
		QueryResult entityResult = service.queryList(si, null,
				EntityReferenceEntityType.datacenter, null);

		Metadata metadata = entityResult.getMetadata();
		System.out.println("Retrieved " + metadata.getNumRows() + " "
				+ "datacenter(s)");
		printDetailedQueryListResult(entityResult);

		RowData[] rowData = entityResult.getRow();

		int entityIdIdx = 0;
		String[] propertyNames = metadata.getPropertyName();
		for (int i = 0; i < propertyNames.length; ++i) {
			if (propertyNames[i].equalsIgnoreCase("entityid")) {
				entityIdIdx = i;
			}
		}
		// Iterates over each instance of datacenter and lists instances of
		// SCSIVolumes associated with it.
		for (int j = 0; j < metadata.getNumRows(); ++j) {
			String entityId = rowData[j].getColumn()[entityIdIdx];
			EntityReference entityRef = new EntityReference();
			entityRef.setId(entityId);
			entityRef.setType(EntityReferenceEntityType.datacenter);

			QueryResult relEntityResult = service.queryList(si, entityRef,
					EntityReferenceEntityType.scsiVolume, null);

			System.out.println("For datacenter - " + (j + 1) + " Retrieved "
					+ relEntityResult.getMetadata().getNumRows()
					+ "scsiVolume(s)");

			printDetailedQueryListResult(relEntityResult);

		}
	}

	public void printDetailedQueryListResult(QueryResult result)
			throws Exception {

		int numRows = result.getMetadata().getTotalRows();
		RowData[] rows = result.getRow();
		String[] columnNames = result.getMetadata().getPropertyName();

		// Display the detailed information of all scsiVolumes hosted on this
		// datacenter
		for (int rowCounter = 0; rowCounter < numRows; rowCounter++) {
			System.out
					.println("--------------------------------------------------------------------");
			int columnCounter = 0;
			String[] columnValues = rows[rowCounter].getColumn();
			while (columnCounter < result.getMetadata().getPropertyName().length) {
				System.out.println(columnNames[columnCounter] + " : "
						+ columnValues[columnCounter]);
				columnCounter++;
			}
			columnCounter = 0;
		}
	}
}
