package com.vmware.samples.performance.widgets;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private StatsTableModel tableModel;
	private JLabel label;

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

	class StatsTableModel extends AbstractTableModel {
		/**
	 * 
	 */
		private static final long serialVersionUID = 1L;
		private String[] columnNames;
		private Vector data;

		StatsTableModel(String[] columnNames) {
			this.columnNames = columnNames;
			data = new Vector();
		}

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.size();
		}

		@Override
		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			return ((Object[]) data.get(row))[col];
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

		public void setData(Vector data) {
			this.data = data;
			fireTableDataChanged();
		}
	}
}
