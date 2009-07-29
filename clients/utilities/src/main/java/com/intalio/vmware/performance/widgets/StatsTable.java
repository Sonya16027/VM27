package com.intalio.vmware.performance.widgets;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class StatsTable extends JPanel {
	class StatsTableModel extends AbstractTableModel {
		/**
	 * 
	 */
		protected static final long serialVersionUID = 1L;
		protected String[] columnNames;
		protected Vector data;

		StatsTableModel(String[] columnNames) {
			this.columnNames = columnNames;
			data = new Vector();
		}

		/*
		 * JTable uses this method to determine the default renderer/ editor for
		 * each cell.
		 */
		@Override
		public Class getColumnClass(int c) {
			if (c == 0) {
				return String.class;
			} else {
				return Long.class;
			}
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public int getRowCount() {
			return data.size();
		}

		public Object getValueAt(int row, int col) {
			return ((Object[]) data.get(row))[col];
		}

		public void setData(Vector data) {
			this.data = data;
			fireTableDataChanged();
		}
	}

	/**
	 * 
	 */
	protected static final long serialVersionUID = 1L;
	protected StatsTableModel tableModel;

	protected JLabel label;

	public StatsTable(String[] columnNames) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		tableModel = new StatsTableModel(columnNames);
		JTable table = new JTable(tableModel);
		table.setPreferredScrollableViewportSize(new Dimension(500, 70));

		// Create the scroll pane and add the table to it.
		JScrollPane scrollPane = new JScrollPane(table);

		// Add the scroll pane to this panel.
		label = new JLabel("");
		add(label);
		add(scrollPane);
	}

	public void setData(Calendar timeStamp, long overallUsage, String units,
			Vector data) {
		SimpleDateFormat sdf = new SimpleDateFormat("h:mm:ss a");
		String text = "Overall Usage : " + overallUsage + " " + units + "     "
				+ sdf.format(timeStamp.getTime());
		label.setText(text);
		tableModel.setData(data);
	}
}
