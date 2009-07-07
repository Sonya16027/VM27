package com.vmware.samples.performance;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.vmware.vim.*;
import com.vmware.apputils.*;
import com.vmware.apputils.vim.*;
import com.vmware.samples.performance.widgets.LineChart;

/**
*
* <p>This sample creates a GUI for graphical representation of the counters.</p>
* <p><b>Parameters:</b></p>
* <ul><li>host  Required.  Name of the host</li>
* <li>counter  Required.   Full name of counter in dotted notation (group.counter.rollup). For
* example, "cpu.usage.none"</li></ul>
* <p><b>Command Line:</b>
* <p>run.bat com.vmware.samples.performance.VIUsage --url [webserviceurl]
* --username [username] --password [password] --host [host name] --counter
* [Counter_type {group.counter.rollup}]>
*
*/


public class VIUsage implements ActionListener {
   private static AppUtil cb = null;   
   static JFrame frame;
   VimPortType service = null;
   ManagedObjectReference perfMgr;
   ManagedObjectReference hostmor;
   PerfInterval[] intervals;
   LineChart chart;
   JPanel mainPanel, selectPanel, displayPanel;
   JComboBox intervalBox = null;
   JLabel chartLabel = null;
   String stats;
   
   private void populateData() throws Exception {      
      createMainPanel();
      initChart();
      updateChart();
   }   
   private void displayUsage() throws Exception {
      stats = cb.get_option("counter");
      hostmor = cb.getServiceUtil().getDecendentMoRef(null,"HostSystem",
                                                      cb.get_option("host"));
      if(hostmor == null) {
         System.out.println("Host "+cb.get_option("host")+" Not Found");
         return;
      }
      perfMgr = cb.getConnection().getServiceContent().getPerfManager();
      service = cb.getConnection().getService();
      Object property = getProperty(service, perfMgr, "historicalInterval");
      ArrayOfPerfInterval arrayInterval = (ArrayOfPerfInterval)property;
      intervals = arrayInterval.getPerfInterval();
      if (intervals.length == 0) {
         System.err.println("No historical intervals");
         return;
      }
      javax.swing.SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            try {
               createAndShowGUI();
            }
            catch(Exception ex) {
               System.out.println("Exception -: " + ex.getMessage());
               ex.printStackTrace();
            }
         }
      });
   }
   private void initChart() {
      PerfInterval interval = intervals[intervalBox.getSelectedIndex()];
      int period = interval.getSamplingPeriod();
      int tickInterval;
      String format;
      if (period <= 300) {
         tickInterval = 3600 / period;
         format = "{3}:{4}";
      } else if (period <= 3600) {
         tickInterval = 6 * 3600 / period;
         format = "{1}/{2} {3}:{4}";
      } else {
         tickInterval = 24 * 3600 / period;
         format = "{1}/{2}";
      }
      int movingAvg = tickInterval;
      if (chart != null) {
         displayPanel.remove(chart);
      }
      chart 
         = new LineChart(tickInterval, period * 1000, format, format, movingAvg, true);
      chart.setPreferredSize(new Dimension(600, 150));
      displayPanel.add(chart);
      if (frame != null) {
         frame.pack();
      }
   }
   private void updateChart() {
      PerfCounterInfo[] counterInfoList;
      try {
         Object property = getProperty(service, perfMgr, "perfCounter");
         ArrayOfPerfCounterInfo arrayCounter = (ArrayOfPerfCounterInfo)property;
         counterInfoList = arrayCounter.getPerfCounterInfo();
      } catch (Exception x) {
         System.out.println("Error in getting perfCounter property: " + x);
         return;
      }
      Map<String, PerfCounterInfo> counterMap = new HashMap<String, PerfCounterInfo>();
      for (PerfCounterInfo counterInfo: counterInfoList) {
         String group = counterInfo.getGroupInfo().getKey();
         String counter = counterInfo.getNameInfo().getKey();
         String rollup = counterInfo.getRollupType().getValue();
         String key = group + "." + counter + "." + rollup;         
         counterMap.put(key, counterInfo);
      }
      
      PerfMetricId[] metricIds = new PerfMetricId[1];      
      String statNames[] = new String[1];            
      String key = stats;
      if (counterMap.containsKey(key)) {
         PerfCounterInfo counterInfo = counterMap.get(key);
         statNames[0] = counterInfo.getNameInfo().getLabel();
         String instance = "";
         metricIds[0] = new PerfMetricId(null, null, counterInfo.getKey(), instance);
      } 
      else {
         System.out.println("Unknown counter " + key);         
         for (PerfCounterInfo counterInfo: counterInfoList) {
            String group = counterInfo.getGroupInfo().getKey();
            String counter = counterInfo.getNameInfo().getKey();
            String rollup = counterInfo.getRollupType().getValue();            
            System.out.println("Counter " + group + "." + counter + "." + rollup);
         }
         System.out.println("Select The Counter From This list");    
         System.exit(1);
      }
      
      PerfInterval interval = intervals[intervalBox.getSelectedIndex()];
      Calendar endTime = Calendar.getInstance();
      PerfQuerySpec querySpec = new PerfQuerySpec();
      querySpec.setEntity(hostmor);
      querySpec.setFormat("csv");
      querySpec.setIntervalId(interval.getSamplingPeriod());
      querySpec.setEndTime(endTime);
      querySpec.setMetricId(metricIds);
      PerfEntityMetricBase[] metrics;
      try {
         metrics = service.queryPerf(perfMgr, new PerfQuerySpec[] {querySpec});
      } catch (Exception x) {
         System.out.println("Error in queryPerf: " + x);
         return;
      }
      if (metrics == null || metrics.length == 0) {
         System.out.println("queryPerf returned no entity metrics");
         return;
      }
      PerfEntityMetricBase metric = metrics[0];
      PerfEntityMetricCSV csvMetric = (PerfEntityMetricCSV)metric;
      PerfMetricSeriesCSV[] csvSeriesList = csvMetric.getValue();
      if (csvSeriesList.length == 0) {
         System.out.println("queryPerf returned no CSV series");
         return;
      }
      String statName = statNames[0];
      PerfMetricSeriesCSV csvSeries = csvSeriesList[0];
      String[] strValues = csvSeries.getValue().split(",");
      int[] values = new int[strValues.length];
      for (int i = 0; i < strValues.length; ++i) {
         values[i] = Integer.parseInt(strValues[i]);
      }
      chart.setValues(values, endTime.getTimeInMillis());
      displayPanel.setBorder(BorderFactory.createCompoundBorder(
      BorderFactory.createTitledBorder(statName), 
      BorderFactory.createEmptyBorder(5,5,5,5)));
   }

   private void createMainPanel() {
      selectPanel = new JPanel();
      displayPanel = new JPanel();

      chartLabel = new JLabel();
      chartLabel.setHorizontalAlignment(JLabel.CENTER);
      chartLabel.setVerticalAlignment(JLabel.CENTER);
      chartLabel.setVerticalTextPosition(JLabel.CENTER);
      chartLabel.setHorizontalTextPosition(JLabel.CENTER);

      String[] intervalNames = new String[intervals.length];
      for (int i = 0; i < intervals.length; ++i) {
         intervalNames[i] = intervals[i].getName();
      }
      intervalBox = new JComboBox(intervalNames);
      selectPanel.setBorder(BorderFactory.createCompoundBorder(
      BorderFactory.createTitledBorder("Interval"), 
      BorderFactory.createEmptyBorder(5,5,5,5)));
      displayPanel.setBorder(BorderFactory.createCompoundBorder(
      BorderFactory.createTitledBorder("Metric Name"), 
      BorderFactory.createEmptyBorder(5,5,5,5)));
      displayPanel.add(chartLabel);
      selectPanel.add(intervalBox);
      intervalBox.addActionListener(this);
      mainPanel = new JPanel();
      mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
      mainPanel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
      mainPanel.add(selectPanel);
      mainPanel.add(displayPanel);
   }

   public void actionPerformed(ActionEvent event) {
      if ("comboBoxChanged".equals(event.getActionCommand())) {
         System.out.println("Updating interval");
         initChart();
         updateChart();
      }
   }

   private void createAndShowGUI() throws Exception{
      try {
         String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
         UIManager.setLookAndFeel(lookAndFeel);
         JFrame.setDefaultLookAndFeelDecorated(true);
      } catch (Exception x) {}      
      populateData(); 
      frame = new JFrame("VIUsage");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      frame.setContentPane(mainPanel);
      frame.pack();
      frame.setVisible(true);
   }
   
   private Object[] getProperties(VimPortType service, 
                                  ManagedObjectReference moRef, 
                                  String[] properties)  
                                  throws RuntimeFault, RemoteException {
      PropertySpec pSpec = new PropertySpec();
      pSpec.setType(moRef.getType());
      pSpec.setPathSet(properties);
      ObjectSpec oSpec = new ObjectSpec();
      oSpec.setObj(moRef);
      PropertyFilterSpec pfSpec = new PropertyFilterSpec();
      pfSpec.setPropSet(new PropertySpec[] {pSpec});
      pfSpec.setObjectSet(new ObjectSpec[] {oSpec});
      ObjectContent[] ocs = service.retrieveProperties(
         cb.getConnection().getServiceContent().getPropertyCollector(),
         new PropertyFilterSpec[] {pfSpec}
      );
      Object[] ret = new Object[properties.length];
      if(ocs != null) {
         for(int i=0; i<ocs.length; ++i) {
            ObjectContent oc = ocs[i];
            DynamicProperty[] dps = oc.getPropSet();
            if(dps != null) {
               for(int j=0; j<dps.length; ++j) {
                  DynamicProperty dp = dps[j];
                  for(int p=0; p<ret.length; ++p) {
                     if(properties[p].equals(dp.getName())) {
                          ret[p] = dp.getVal();
                     }
                  }
               }
            }
         }       
      }
      return ret;
   }
   
   private Object getProperty(VimPortType service,
                              ManagedObjectReference moRef,
                              String prop) throws RuntimeFault, RemoteException {
      Object[] props = getProperties(service, moRef, new String[] {prop});
      if (props.length > 0) {
         return props[0];
      } 
      else {
         return null;
      }
   }
   
   private static OptionSpec[] constructOptions() {
      OptionSpec [] useroptions = new OptionSpec[2];
      useroptions[0] = new OptionSpec("host","String",1
                                      ,"Name of the host"
                                      ,null);
      useroptions[1] = new OptionSpec("counter","String",1,
                                      "Type of Counter [group.counter.rollup]"
                                     +" e.g. cpu.usage.none",
                                      null);
      return useroptions;
   }
   
   public static void main(String[] args) throws Exception {
      VIUsage viUsage = new VIUsage();
      cb = AppUtil.initialize("VIUsage"
                              ,VIUsage.constructOptions()
                              ,args);      
      cb.connect();                        
      viUsage.displayUsage();    
   }  
}