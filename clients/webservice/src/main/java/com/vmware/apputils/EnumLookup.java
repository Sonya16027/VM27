package com.vmware.apputils;

import java.util.HashMap;

/**
 * Java representation of all the enum types for the properties
 * supported by the QueryList API method.
 */
public class EnumLookup {
   /**
    * Multipathing Status
    */
   public enum multipathingStatus {
                     /** Full redundancy */
                     up,
                     /** Partial/No redundancy */
                     degraded,
                     /** All paths down */
                     down,
                     /** Unknown */
                     unknown,
   }

   /**
    * Datastore Volume Type
    */
   public enum datastoreType {
                     /** Local file system */
                     local,
                     /** Network Attached Storage */
                     nas,
                     /** VMware file system */
                     vmfs,
   }

   /**
    * VM File Type
    */
   public enum vmFileType {
                     /** Config (vmx) file */
                     config,
                     /** Core (core) file */
                     core,
                     /** Disk descriptor (vmdk) file */
                     diskDescriptor,
                     /** Disk extent (-flat/-delta/-s/-rdm/-rdmp.vmdk) file */
                     diskExtent,
                     /** Extended config (vmxf) file */
                     extendedConfig,
                     /** Log (log) file */
                     log,
                     /** Non-volatile RAM (nvram) file */
                     nvram,
                     /** Screenshot file */
                     screenshot,
                     /** Snapshot data (vmsn) file */
                     snapshotData,
                     /** Snapshot metadata (vmsd) file */
                     snapshotList,
                     /** Virtual machine statistics (stat) file */
                     stat,
                     /** Suspend (vmss) file */
                     suspend,
                     /** Swap (vswp/vmem) file */
                     swap,
   }

   /**
    * SCSI Adapter Type
    */
   public enum scsiAdapterType {
                     /** Parallel SCSI */
                     parallelScsi,
                     /** Fibre Channel */
                     fc,
                     /** iSCSI */
                     iscsi,
                     /** Block devices */
                     block,
   }

   /**
    * SCSI Adapter Status
    */
   public enum scsiAdapterStatus {
                     /** Operational */
                     up,
                     /** Not operational */
                     down,
                     /** Unknown */
                     unknown,
   }

   /**
    * SCSI Target Status
    */
   public enum scsiTargetStatus {
                     /** Accessible */
                     up,
                     /** Not accessible */
                     down,
                     /** Unknown */
                     unknown,
   }

   /**
    * NAS Mount Type
    */
   public enum nasMountType {
                     /** Network File System */
                     nfs,
                     /** Common Internet File System */
                     cifs,
   }

   /**
    * NAS Mount Status
    */
   public enum nasMountStatus {
                     /** Accessible */
                     up,
                     /** Not accessible */
                     down,
                     /** Unknown */
                     unknown,
   }

   /**
    * SCSI Volume Device Type
    */
   public enum scsiVolumeDeviceType {
                     /** CD-ROM */
                     cdrom,
                     /** Communications */
                     communications,
                     /** Disk */
                     disk,
                     /** Enclosure */
                     enclosure,
                     /** Media changer */
                     mediaChanger,
                     /** Optical device */
                     opticalDevice,
                     /** Printer */
                     printer,
                     /** Processor */
                     processor,
                     /** Scanner */
                     scanner,
                     /** Storage array controller */
                     storageArrayController,
                     /** Tape device */
                     tape,
                     /** Unknown */
                     unknown,
                     /** Write-Once-Read-Many device */
                     worm,
   }

   /**
    * Status of SCSI Volume
    */
   public enum scsiVolumeStatus {
                     /** Accessible from all connected hosts */
                     up,
                     /** Not accessible from all connected hosts */
                     down,
                     /** Accessible from some connected hosts */
                     degraded,
                     /** Unknown */
                     unknown,
   }

   /**
    * SCSI Path Usage
    */
   public enum scsiPathStatus {
                     /** Operational */
                     up,
                     /** Not operational */
                     down,
                     /** Unknown */
                     unknown,
   }

   /**
    * SCSI Path Active State
    */
   public enum scsiPathActivityState {
                     /** Operational and in use */
                     active,
                     /** Operational but not in use */
                     standby,
                     /** Unknown */
                     unknown,
   }

   /**
    * SCSI Path Preferred
    */
   public enum scsiPathPreferred {
                     /** Preferred */
                     yes,
                     /** Not preferred */
                     no,
   }

   /**
    * Datastore Status
    */
   public enum datastoreStatus {
                     /** Accessible from all connected hosts */
                     up,
                     /** Not accessible from all connected hosts */
                     down,
                     /** Accessible from some connected hosts */
                     degraded,
                     /** Unknown */
                     unknown,
   }


   /**
    * Data structure to store mapping of value for each supported enum type.
    */
   public final HashMap<String, HashMap<String, Boolean>> enumMap
      = new HashMap<String, HashMap<String, Boolean>>()
      {
         {
            put("multipathingStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("degraded", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("datastoreType", new HashMap<String, Boolean>()
               {
                  {
                     put("local", Boolean.TRUE);
                     put("nas", Boolean.TRUE);
                     put("vmfs", Boolean.TRUE);
                  }
               }
            );
            put("vmFileType", new HashMap<String, Boolean>()
               {
                  {
                     put("config", Boolean.TRUE);
                     put("core", Boolean.TRUE);
                     put("diskDescriptor", Boolean.TRUE);
                     put("diskExtent", Boolean.TRUE);
                     put("extendedConfig", Boolean.TRUE);
                     put("log", Boolean.TRUE);
                     put("nvram", Boolean.TRUE);
                     put("screenshot", Boolean.TRUE);
                     put("snapshotData", Boolean.TRUE);
                     put("snapshotList", Boolean.TRUE);
                     put("stat", Boolean.TRUE);
                     put("suspend", Boolean.TRUE);
                     put("swap", Boolean.TRUE);
                  }
               }
            );
            put("scsiAdapterType", new HashMap<String, Boolean>()
               {
                  {
                     put("parallelScsi", Boolean.TRUE);
                     put("fc", Boolean.TRUE);
                     put("iscsi", Boolean.TRUE);
                     put("block", Boolean.TRUE);
                  }
               }
            );
            put("scsiAdapterStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("scsiTargetStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("nasMountType", new HashMap<String, Boolean>()
               {
                  {
                     put("nfs", Boolean.TRUE);
                     put("cifs", Boolean.TRUE);
                  }
               }
            );
            put("nasMountStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("scsiVolumeDeviceType", new HashMap<String, Boolean>()
               {
                  {
                     put("cdrom", Boolean.TRUE);
                     put("communications", Boolean.TRUE);
                     put("disk", Boolean.TRUE);
                     put("enclosure", Boolean.TRUE);
                     put("mediaChanger", Boolean.TRUE);
                     put("opticalDevice", Boolean.TRUE);
                     put("printer", Boolean.TRUE);
                     put("processor", Boolean.TRUE);
                     put("scanner", Boolean.TRUE);
                     put("storageArrayController", Boolean.TRUE);
                     put("tape", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                     put("worm", Boolean.TRUE);
                  }
               }
            );
            put("scsiVolumeStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("degraded", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("scsiPathStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("scsiPathActivityState", new HashMap<String, Boolean>()
               {
                  {
                     put("active", Boolean.TRUE);
                     put("standby", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
            put("scsiPathPreferred", new HashMap<String, Boolean>()
               {
                  {
                     put("yes", Boolean.TRUE);
                     put("no", Boolean.TRUE);
                  }
               }
            );
            put("datastoreStatus", new HashMap<String, Boolean>()
               {
                  {
                     put("up", Boolean.TRUE);
                     put("down", Boolean.TRUE);
                     put("degraded", Boolean.TRUE);
                     put("unknown", Boolean.TRUE);
                  }
               }
            );
         }
      };
}
