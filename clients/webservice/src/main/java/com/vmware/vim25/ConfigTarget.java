/**
 * ConfigTarget.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.vmware.vim25;

public class ConfigTarget  extends com.vmware.vim25.DynamicData  implements java.io.Serializable {
    private int numCpus;

    private int numCpuCores;

    private int numNumaNodes;

    private com.vmware.vim25.VirtualMachineDatastoreInfo[] datastore;

    private com.vmware.vim25.VirtualMachineNetworkInfo[] network;

    private com.vmware.vim25.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup;

    private com.vmware.vim25.DistributedVirtualSwitchInfo[] distributedVirtualSwitch;

    private com.vmware.vim25.VirtualMachineCdromInfo[] cdRom;

    private com.vmware.vim25.VirtualMachineSerialInfo[] serial;

    private com.vmware.vim25.VirtualMachineParallelInfo[] parallel;

    private com.vmware.vim25.VirtualMachineSoundInfo[] sound;

    private com.vmware.vim25.VirtualMachineUsbInfo[] usb;

    private com.vmware.vim25.VirtualMachineFloppyInfo[] floppy;

    private com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo;

    private com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] scsiPassthrough;

    private com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] scsiDisk;

    private com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo[] ideDisk;

    private int maxMemMBOptimalPerf;

    private com.vmware.vim25.ResourcePoolRuntimeInfo resourcePool;

    private java.lang.Boolean autoVmotion;

    private com.vmware.vim25.VirtualMachinePciPassthroughInfo[] pciPassthrough;

    public ConfigTarget() {
    }

    public ConfigTarget(
           java.lang.String dynamicType,
           com.vmware.vim25.DynamicProperty[] dynamicProperty,
           int numCpus,
           int numCpuCores,
           int numNumaNodes,
           com.vmware.vim25.VirtualMachineDatastoreInfo[] datastore,
           com.vmware.vim25.VirtualMachineNetworkInfo[] network,
           com.vmware.vim25.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup,
           com.vmware.vim25.DistributedVirtualSwitchInfo[] distributedVirtualSwitch,
           com.vmware.vim25.VirtualMachineCdromInfo[] cdRom,
           com.vmware.vim25.VirtualMachineSerialInfo[] serial,
           com.vmware.vim25.VirtualMachineParallelInfo[] parallel,
           com.vmware.vim25.VirtualMachineSoundInfo[] sound,
           com.vmware.vim25.VirtualMachineUsbInfo[] usb,
           com.vmware.vim25.VirtualMachineFloppyInfo[] floppy,
           com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo,
           com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] scsiPassthrough,
           com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] scsiDisk,
           com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo[] ideDisk,
           int maxMemMBOptimalPerf,
           com.vmware.vim25.ResourcePoolRuntimeInfo resourcePool,
           java.lang.Boolean autoVmotion,
           com.vmware.vim25.VirtualMachinePciPassthroughInfo[] pciPassthrough) {
        super(
            dynamicType,
            dynamicProperty);
        this.numCpus = numCpus;
        this.numCpuCores = numCpuCores;
        this.numNumaNodes = numNumaNodes;
        this.datastore = datastore;
        this.network = network;
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
        this.distributedVirtualSwitch = distributedVirtualSwitch;
        this.cdRom = cdRom;
        this.serial = serial;
        this.parallel = parallel;
        this.sound = sound;
        this.usb = usb;
        this.floppy = floppy;
        this.legacyNetworkInfo = legacyNetworkInfo;
        this.scsiPassthrough = scsiPassthrough;
        this.scsiDisk = scsiDisk;
        this.ideDisk = ideDisk;
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
        this.resourcePool = resourcePool;
        this.autoVmotion = autoVmotion;
        this.pciPassthrough = pciPassthrough;
    }


    /**
     * Gets the numCpus value for this ConfigTarget.
     * 
     * @return numCpus
     */
    public int getNumCpus() {
        return numCpus;
    }


    /**
     * Sets the numCpus value for this ConfigTarget.
     * 
     * @param numCpus
     */
    public void setNumCpus(int numCpus) {
        this.numCpus = numCpus;
    }


    /**
     * Gets the numCpuCores value for this ConfigTarget.
     * 
     * @return numCpuCores
     */
    public int getNumCpuCores() {
        return numCpuCores;
    }


    /**
     * Sets the numCpuCores value for this ConfigTarget.
     * 
     * @param numCpuCores
     */
    public void setNumCpuCores(int numCpuCores) {
        this.numCpuCores = numCpuCores;
    }


    /**
     * Gets the numNumaNodes value for this ConfigTarget.
     * 
     * @return numNumaNodes
     */
    public int getNumNumaNodes() {
        return numNumaNodes;
    }


    /**
     * Sets the numNumaNodes value for this ConfigTarget.
     * 
     * @param numNumaNodes
     */
    public void setNumNumaNodes(int numNumaNodes) {
        this.numNumaNodes = numNumaNodes;
    }


    /**
     * Gets the datastore value for this ConfigTarget.
     * 
     * @return datastore
     */
    public com.vmware.vim25.VirtualMachineDatastoreInfo[] getDatastore() {
        return datastore;
    }


    /**
     * Sets the datastore value for this ConfigTarget.
     * 
     * @param datastore
     */
    public void setDatastore(com.vmware.vim25.VirtualMachineDatastoreInfo[] datastore) {
        this.datastore = datastore;
    }

    public com.vmware.vim25.VirtualMachineDatastoreInfo getDatastore(int i) {
        return this.datastore[i];
    }

    public void setDatastore(int i, com.vmware.vim25.VirtualMachineDatastoreInfo _value) {
        this.datastore[i] = _value;
    }


    /**
     * Gets the network value for this ConfigTarget.
     * 
     * @return network
     */
    public com.vmware.vim25.VirtualMachineNetworkInfo[] getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this ConfigTarget.
     * 
     * @param network
     */
    public void setNetwork(com.vmware.vim25.VirtualMachineNetworkInfo[] network) {
        this.network = network;
    }

    public com.vmware.vim25.VirtualMachineNetworkInfo getNetwork(int i) {
        return this.network[i];
    }

    public void setNetwork(int i, com.vmware.vim25.VirtualMachineNetworkInfo _value) {
        this.network[i] = _value;
    }


    /**
     * Gets the distributedVirtualPortgroup value for this ConfigTarget.
     * 
     * @return distributedVirtualPortgroup
     */
    public com.vmware.vim25.DistributedVirtualPortgroupInfo[] getDistributedVirtualPortgroup() {
        return distributedVirtualPortgroup;
    }


    /**
     * Sets the distributedVirtualPortgroup value for this ConfigTarget.
     * 
     * @param distributedVirtualPortgroup
     */
    public void setDistributedVirtualPortgroup(com.vmware.vim25.DistributedVirtualPortgroupInfo[] distributedVirtualPortgroup) {
        this.distributedVirtualPortgroup = distributedVirtualPortgroup;
    }

    public com.vmware.vim25.DistributedVirtualPortgroupInfo getDistributedVirtualPortgroup(int i) {
        return this.distributedVirtualPortgroup[i];
    }

    public void setDistributedVirtualPortgroup(int i, com.vmware.vim25.DistributedVirtualPortgroupInfo _value) {
        this.distributedVirtualPortgroup[i] = _value;
    }


    /**
     * Gets the distributedVirtualSwitch value for this ConfigTarget.
     * 
     * @return distributedVirtualSwitch
     */
    public com.vmware.vim25.DistributedVirtualSwitchInfo[] getDistributedVirtualSwitch() {
        return distributedVirtualSwitch;
    }


    /**
     * Sets the distributedVirtualSwitch value for this ConfigTarget.
     * 
     * @param distributedVirtualSwitch
     */
    public void setDistributedVirtualSwitch(com.vmware.vim25.DistributedVirtualSwitchInfo[] distributedVirtualSwitch) {
        this.distributedVirtualSwitch = distributedVirtualSwitch;
    }

    public com.vmware.vim25.DistributedVirtualSwitchInfo getDistributedVirtualSwitch(int i) {
        return this.distributedVirtualSwitch[i];
    }

    public void setDistributedVirtualSwitch(int i, com.vmware.vim25.DistributedVirtualSwitchInfo _value) {
        this.distributedVirtualSwitch[i] = _value;
    }


    /**
     * Gets the cdRom value for this ConfigTarget.
     * 
     * @return cdRom
     */
    public com.vmware.vim25.VirtualMachineCdromInfo[] getCdRom() {
        return cdRom;
    }


    /**
     * Sets the cdRom value for this ConfigTarget.
     * 
     * @param cdRom
     */
    public void setCdRom(com.vmware.vim25.VirtualMachineCdromInfo[] cdRom) {
        this.cdRom = cdRom;
    }

    public com.vmware.vim25.VirtualMachineCdromInfo getCdRom(int i) {
        return this.cdRom[i];
    }

    public void setCdRom(int i, com.vmware.vim25.VirtualMachineCdromInfo _value) {
        this.cdRom[i] = _value;
    }


    /**
     * Gets the serial value for this ConfigTarget.
     * 
     * @return serial
     */
    public com.vmware.vim25.VirtualMachineSerialInfo[] getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this ConfigTarget.
     * 
     * @param serial
     */
    public void setSerial(com.vmware.vim25.VirtualMachineSerialInfo[] serial) {
        this.serial = serial;
    }

    public com.vmware.vim25.VirtualMachineSerialInfo getSerial(int i) {
        return this.serial[i];
    }

    public void setSerial(int i, com.vmware.vim25.VirtualMachineSerialInfo _value) {
        this.serial[i] = _value;
    }


    /**
     * Gets the parallel value for this ConfigTarget.
     * 
     * @return parallel
     */
    public com.vmware.vim25.VirtualMachineParallelInfo[] getParallel() {
        return parallel;
    }


    /**
     * Sets the parallel value for this ConfigTarget.
     * 
     * @param parallel
     */
    public void setParallel(com.vmware.vim25.VirtualMachineParallelInfo[] parallel) {
        this.parallel = parallel;
    }

    public com.vmware.vim25.VirtualMachineParallelInfo getParallel(int i) {
        return this.parallel[i];
    }

    public void setParallel(int i, com.vmware.vim25.VirtualMachineParallelInfo _value) {
        this.parallel[i] = _value;
    }


    /**
     * Gets the sound value for this ConfigTarget.
     * 
     * @return sound
     */
    public com.vmware.vim25.VirtualMachineSoundInfo[] getSound() {
        return sound;
    }


    /**
     * Sets the sound value for this ConfigTarget.
     * 
     * @param sound
     */
    public void setSound(com.vmware.vim25.VirtualMachineSoundInfo[] sound) {
        this.sound = sound;
    }

    public com.vmware.vim25.VirtualMachineSoundInfo getSound(int i) {
        return this.sound[i];
    }

    public void setSound(int i, com.vmware.vim25.VirtualMachineSoundInfo _value) {
        this.sound[i] = _value;
    }


    /**
     * Gets the usb value for this ConfigTarget.
     * 
     * @return usb
     */
    public com.vmware.vim25.VirtualMachineUsbInfo[] getUsb() {
        return usb;
    }


    /**
     * Sets the usb value for this ConfigTarget.
     * 
     * @param usb
     */
    public void setUsb(com.vmware.vim25.VirtualMachineUsbInfo[] usb) {
        this.usb = usb;
    }

    public com.vmware.vim25.VirtualMachineUsbInfo getUsb(int i) {
        return this.usb[i];
    }

    public void setUsb(int i, com.vmware.vim25.VirtualMachineUsbInfo _value) {
        this.usb[i] = _value;
    }


    /**
     * Gets the floppy value for this ConfigTarget.
     * 
     * @return floppy
     */
    public com.vmware.vim25.VirtualMachineFloppyInfo[] getFloppy() {
        return floppy;
    }


    /**
     * Sets the floppy value for this ConfigTarget.
     * 
     * @param floppy
     */
    public void setFloppy(com.vmware.vim25.VirtualMachineFloppyInfo[] floppy) {
        this.floppy = floppy;
    }

    public com.vmware.vim25.VirtualMachineFloppyInfo getFloppy(int i) {
        return this.floppy[i];
    }

    public void setFloppy(int i, com.vmware.vim25.VirtualMachineFloppyInfo _value) {
        this.floppy[i] = _value;
    }


    /**
     * Gets the legacyNetworkInfo value for this ConfigTarget.
     * 
     * @return legacyNetworkInfo
     */
    public com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] getLegacyNetworkInfo() {
        return legacyNetworkInfo;
    }


    /**
     * Sets the legacyNetworkInfo value for this ConfigTarget.
     * 
     * @param legacyNetworkInfo
     */
    public void setLegacyNetworkInfo(com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo[] legacyNetworkInfo) {
        this.legacyNetworkInfo = legacyNetworkInfo;
    }

    public com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo getLegacyNetworkInfo(int i) {
        return this.legacyNetworkInfo[i];
    }

    public void setLegacyNetworkInfo(int i, com.vmware.vim25.VirtualMachineLegacyNetworkSwitchInfo _value) {
        this.legacyNetworkInfo[i] = _value;
    }


    /**
     * Gets the scsiPassthrough value for this ConfigTarget.
     * 
     * @return scsiPassthrough
     */
    public com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] getScsiPassthrough() {
        return scsiPassthrough;
    }


    /**
     * Sets the scsiPassthrough value for this ConfigTarget.
     * 
     * @param scsiPassthrough
     */
    public void setScsiPassthrough(com.vmware.vim25.VirtualMachineScsiPassthroughInfo[] scsiPassthrough) {
        this.scsiPassthrough = scsiPassthrough;
    }

    public com.vmware.vim25.VirtualMachineScsiPassthroughInfo getScsiPassthrough(int i) {
        return this.scsiPassthrough[i];
    }

    public void setScsiPassthrough(int i, com.vmware.vim25.VirtualMachineScsiPassthroughInfo _value) {
        this.scsiPassthrough[i] = _value;
    }


    /**
     * Gets the scsiDisk value for this ConfigTarget.
     * 
     * @return scsiDisk
     */
    public com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] getScsiDisk() {
        return scsiDisk;
    }


    /**
     * Sets the scsiDisk value for this ConfigTarget.
     * 
     * @param scsiDisk
     */
    public void setScsiDisk(com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo[] scsiDisk) {
        this.scsiDisk = scsiDisk;
    }

    public com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo getScsiDisk(int i) {
        return this.scsiDisk[i];
    }

    public void setScsiDisk(int i, com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo _value) {
        this.scsiDisk[i] = _value;
    }


    /**
     * Gets the ideDisk value for this ConfigTarget.
     * 
     * @return ideDisk
     */
    public com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo[] getIdeDisk() {
        return ideDisk;
    }


    /**
     * Sets the ideDisk value for this ConfigTarget.
     * 
     * @param ideDisk
     */
    public void setIdeDisk(com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo[] ideDisk) {
        this.ideDisk = ideDisk;
    }

    public com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo getIdeDisk(int i) {
        return this.ideDisk[i];
    }

    public void setIdeDisk(int i, com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo _value) {
        this.ideDisk[i] = _value;
    }


    /**
     * Gets the maxMemMBOptimalPerf value for this ConfigTarget.
     * 
     * @return maxMemMBOptimalPerf
     */
    public int getMaxMemMBOptimalPerf() {
        return maxMemMBOptimalPerf;
    }


    /**
     * Sets the maxMemMBOptimalPerf value for this ConfigTarget.
     * 
     * @param maxMemMBOptimalPerf
     */
    public void setMaxMemMBOptimalPerf(int maxMemMBOptimalPerf) {
        this.maxMemMBOptimalPerf = maxMemMBOptimalPerf;
    }


    /**
     * Gets the resourcePool value for this ConfigTarget.
     * 
     * @return resourcePool
     */
    public com.vmware.vim25.ResourcePoolRuntimeInfo getResourcePool() {
        return resourcePool;
    }


    /**
     * Sets the resourcePool value for this ConfigTarget.
     * 
     * @param resourcePool
     */
    public void setResourcePool(com.vmware.vim25.ResourcePoolRuntimeInfo resourcePool) {
        this.resourcePool = resourcePool;
    }


    /**
     * Gets the autoVmotion value for this ConfigTarget.
     * 
     * @return autoVmotion
     */
    public java.lang.Boolean getAutoVmotion() {
        return autoVmotion;
    }


    /**
     * Sets the autoVmotion value for this ConfigTarget.
     * 
     * @param autoVmotion
     */
    public void setAutoVmotion(java.lang.Boolean autoVmotion) {
        this.autoVmotion = autoVmotion;
    }


    /**
     * Gets the pciPassthrough value for this ConfigTarget.
     * 
     * @return pciPassthrough
     */
    public com.vmware.vim25.VirtualMachinePciPassthroughInfo[] getPciPassthrough() {
        return pciPassthrough;
    }


    /**
     * Sets the pciPassthrough value for this ConfigTarget.
     * 
     * @param pciPassthrough
     */
    public void setPciPassthrough(com.vmware.vim25.VirtualMachinePciPassthroughInfo[] pciPassthrough) {
        this.pciPassthrough = pciPassthrough;
    }

    public com.vmware.vim25.VirtualMachinePciPassthroughInfo getPciPassthrough(int i) {
        return this.pciPassthrough[i];
    }

    public void setPciPassthrough(int i, com.vmware.vim25.VirtualMachinePciPassthroughInfo _value) {
        this.pciPassthrough[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigTarget)) return false;
        ConfigTarget other = (ConfigTarget) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.numCpus == other.getNumCpus() &&
            this.numCpuCores == other.getNumCpuCores() &&
            this.numNumaNodes == other.getNumNumaNodes() &&
            ((this.datastore==null && other.getDatastore()==null) || 
             (this.datastore!=null &&
              java.util.Arrays.equals(this.datastore, other.getDatastore()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              java.util.Arrays.equals(this.network, other.getNetwork()))) &&
            ((this.distributedVirtualPortgroup==null && other.getDistributedVirtualPortgroup()==null) || 
             (this.distributedVirtualPortgroup!=null &&
              java.util.Arrays.equals(this.distributedVirtualPortgroup, other.getDistributedVirtualPortgroup()))) &&
            ((this.distributedVirtualSwitch==null && other.getDistributedVirtualSwitch()==null) || 
             (this.distributedVirtualSwitch!=null &&
              java.util.Arrays.equals(this.distributedVirtualSwitch, other.getDistributedVirtualSwitch()))) &&
            ((this.cdRom==null && other.getCdRom()==null) || 
             (this.cdRom!=null &&
              java.util.Arrays.equals(this.cdRom, other.getCdRom()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              java.util.Arrays.equals(this.serial, other.getSerial()))) &&
            ((this.parallel==null && other.getParallel()==null) || 
             (this.parallel!=null &&
              java.util.Arrays.equals(this.parallel, other.getParallel()))) &&
            ((this.sound==null && other.getSound()==null) || 
             (this.sound!=null &&
              java.util.Arrays.equals(this.sound, other.getSound()))) &&
            ((this.usb==null && other.getUsb()==null) || 
             (this.usb!=null &&
              java.util.Arrays.equals(this.usb, other.getUsb()))) &&
            ((this.floppy==null && other.getFloppy()==null) || 
             (this.floppy!=null &&
              java.util.Arrays.equals(this.floppy, other.getFloppy()))) &&
            ((this.legacyNetworkInfo==null && other.getLegacyNetworkInfo()==null) || 
             (this.legacyNetworkInfo!=null &&
              java.util.Arrays.equals(this.legacyNetworkInfo, other.getLegacyNetworkInfo()))) &&
            ((this.scsiPassthrough==null && other.getScsiPassthrough()==null) || 
             (this.scsiPassthrough!=null &&
              java.util.Arrays.equals(this.scsiPassthrough, other.getScsiPassthrough()))) &&
            ((this.scsiDisk==null && other.getScsiDisk()==null) || 
             (this.scsiDisk!=null &&
              java.util.Arrays.equals(this.scsiDisk, other.getScsiDisk()))) &&
            ((this.ideDisk==null && other.getIdeDisk()==null) || 
             (this.ideDisk!=null &&
              java.util.Arrays.equals(this.ideDisk, other.getIdeDisk()))) &&
            this.maxMemMBOptimalPerf == other.getMaxMemMBOptimalPerf() &&
            ((this.resourcePool==null && other.getResourcePool()==null) || 
             (this.resourcePool!=null &&
              this.resourcePool.equals(other.getResourcePool()))) &&
            ((this.autoVmotion==null && other.getAutoVmotion()==null) || 
             (this.autoVmotion!=null &&
              this.autoVmotion.equals(other.getAutoVmotion()))) &&
            ((this.pciPassthrough==null && other.getPciPassthrough()==null) || 
             (this.pciPassthrough!=null &&
              java.util.Arrays.equals(this.pciPassthrough, other.getPciPassthrough())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += getNumCpus();
        _hashCode += getNumCpuCores();
        _hashCode += getNumNumaNodes();
        if (getDatastore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatastore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatastore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualPortgroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualPortgroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualPortgroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDistributedVirtualSwitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDistributedVirtualSwitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDistributedVirtualSwitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdRom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCdRom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCdRom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerial() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerial());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerial(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParallel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParallel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParallel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSound() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSound());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSound(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsb(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFloppy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFloppy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFloppy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegacyNetworkInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegacyNetworkInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegacyNetworkInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiPassthrough() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScsiPassthrough());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScsiPassthrough(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScsiDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScsiDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScsiDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdeDisk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdeDisk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdeDisk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMaxMemMBOptimalPerf();
        if (getResourcePool() != null) {
            _hashCode += getResourcePool().hashCode();
        }
        if (getAutoVmotion() != null) {
            _hashCode += getAutoVmotion().hashCode();
        }
        if (getPciPassthrough() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPciPassthrough());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPciPassthrough(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigTarget.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ConfigTarget"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCpus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCpuCores");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numCpuCores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numNumaNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "numNumaNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datastore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "datastore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineDatastoreInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineNetworkInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualPortgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualPortgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualPortgroupInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributedVirtualSwitch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "distributedVirtualSwitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "DistributedVirtualSwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdRom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "cdRom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineCdromInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSerialInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parallel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "parallel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineParallelInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sound");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "sound"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineSoundInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "usb"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineUsbInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floppy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "floppy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineFloppyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legacyNetworkInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "legacyNetworkInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineLegacyNetworkSwitchInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiPassthrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiPassthrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiPassthroughInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scsiDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "scsiDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineScsiDiskDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ideDisk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "ideDisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachineIdeDiskDeviceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxMemMBOptimalPerf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "maxMemMBOptimalPerf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourcePool");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "resourcePool"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "ResourcePoolRuntimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoVmotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "autoVmotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pciPassthrough");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:vim25", "pciPassthrough"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:vim25", "VirtualMachinePciPassthroughInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
