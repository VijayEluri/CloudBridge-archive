
/**
 * RunningInstancesItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package com.amazon.ec2;
            

            /**
            *  RunningInstancesItemType bean class
            */
        
        public  class RunningInstancesItemType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = RunningInstancesItemType
                Namespace URI = http://ec2.amazonaws.com/doc/2009-11-30/
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://ec2.amazonaws.com/doc/2009-11-30/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for InstanceId
                        */

                        
                                    protected java.lang.String localInstanceId ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInstanceId(){
                               return localInstanceId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstanceId
                               */
                               public void setInstanceId(java.lang.String param){
                            
                                            this.localInstanceId=param;
                                    

                               }
                            

                        /**
                        * field for ImageId
                        */

                        
                                    protected java.lang.String localImageId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImageIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getImageId(){
                               return localImageId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ImageId
                               */
                               public void setImageId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localImageIdTracker = true;
                                       } else {
                                          localImageIdTracker = false;
                                              
                                       }
                                   
                                            this.localImageId=param;
                                    

                               }
                            

                        /**
                        * field for InstanceState
                        */

                        
                                    protected com.amazon.ec2.InstanceStateType localInstanceState ;
                                

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.InstanceStateType
                           */
                           public  com.amazon.ec2.InstanceStateType getInstanceState(){
                               return localInstanceState;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstanceState
                               */
                               public void setInstanceState(com.amazon.ec2.InstanceStateType param){
                            
                                            this.localInstanceState=param;
                                    

                               }
                            

                        /**
                        * field for PrivateDnsName
                        */

                        
                                    protected java.lang.String localPrivateDnsName ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrivateDnsName(){
                               return localPrivateDnsName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrivateDnsName
                               */
                               public void setPrivateDnsName(java.lang.String param){
                            
                                            this.localPrivateDnsName=param;
                                    

                               }
                            

                        /**
                        * field for DnsName
                        */

                        
                                    protected java.lang.String localDnsName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDnsNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getDnsName(){
                               return localDnsName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DnsName
                               */
                               public void setDnsName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localDnsNameTracker = true;
                                       } else {
                                          localDnsNameTracker = false;
                                              
                                       }
                                   
                                            this.localDnsName=param;
                                    

                               }
                            

                        /**
                        * field for Reason
                        */

                        
                                    protected java.lang.String localReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReasonTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReason(){
                               return localReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Reason
                               */
                               public void setReason(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReasonTracker = true;
                                       } else {
                                          localReasonTracker = false;
                                              
                                       }
                                   
                                            this.localReason=param;
                                    

                               }
                            

                        /**
                        * field for KeyName
                        */

                        
                                    protected java.lang.String localKeyName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKeyNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKeyName(){
                               return localKeyName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KeyName
                               */
                               public void setKeyName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localKeyNameTracker = true;
                                       } else {
                                          localKeyNameTracker = false;
                                              
                                       }
                                   
                                            this.localKeyName=param;
                                    

                               }
                            

                        /**
                        * field for AmiLaunchIndex
                        */

                        
                                    protected java.lang.String localAmiLaunchIndex ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAmiLaunchIndexTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getAmiLaunchIndex(){
                               return localAmiLaunchIndex;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AmiLaunchIndex
                               */
                               public void setAmiLaunchIndex(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localAmiLaunchIndexTracker = true;
                                       } else {
                                          localAmiLaunchIndexTracker = false;
                                              
                                       }
                                   
                                            this.localAmiLaunchIndex=param;
                                    

                               }
                            

                        /**
                        * field for ProductCodes
                        */

                        
                                    protected com.amazon.ec2.ProductCodesSetType localProductCodes ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductCodesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.ProductCodesSetType
                           */
                           public  com.amazon.ec2.ProductCodesSetType getProductCodes(){
                               return localProductCodes;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ProductCodes
                               */
                               public void setProductCodes(com.amazon.ec2.ProductCodesSetType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localProductCodesTracker = true;
                                       } else {
                                          localProductCodesTracker = false;
                                              
                                       }
                                   
                                            this.localProductCodes=param;
                                    

                               }
                            

                        /**
                        * field for InstanceType
                        */

                        
                                    protected java.lang.String localInstanceType ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInstanceType(){
                               return localInstanceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstanceType
                               */
                               public void setInstanceType(java.lang.String param){
                            
                                            this.localInstanceType=param;
                                    

                               }
                            

                        /**
                        * field for LaunchTime
                        */

                        
                                    protected java.util.Calendar localLaunchTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getLaunchTime(){
                               return localLaunchTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param LaunchTime
                               */
                               public void setLaunchTime(java.util.Calendar param){
                            
                                            this.localLaunchTime=param;
                                    

                               }
                            

                        /**
                        * field for Placement
                        */

                        
                                    protected com.amazon.ec2.PlacementResponseType localPlacement ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlacementTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.PlacementResponseType
                           */
                           public  com.amazon.ec2.PlacementResponseType getPlacement(){
                               return localPlacement;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Placement
                               */
                               public void setPlacement(com.amazon.ec2.PlacementResponseType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPlacementTracker = true;
                                       } else {
                                          localPlacementTracker = false;
                                              
                                       }
                                   
                                            this.localPlacement=param;
                                    

                               }
                            

                        /**
                        * field for KernelId
                        */

                        
                                    protected java.lang.String localKernelId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localKernelIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getKernelId(){
                               return localKernelId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param KernelId
                               */
                               public void setKernelId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localKernelIdTracker = true;
                                       } else {
                                          localKernelIdTracker = false;
                                              
                                       }
                                   
                                            this.localKernelId=param;
                                    

                               }
                            

                        /**
                        * field for RamdiskId
                        */

                        
                                    protected java.lang.String localRamdiskId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRamdiskIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRamdiskId(){
                               return localRamdiskId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RamdiskId
                               */
                               public void setRamdiskId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRamdiskIdTracker = true;
                                       } else {
                                          localRamdiskIdTracker = false;
                                              
                                       }
                                   
                                            this.localRamdiskId=param;
                                    

                               }
                            

                        /**
                        * field for Platform
                        */

                        
                                    protected java.lang.String localPlatform ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPlatformTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPlatform(){
                               return localPlatform;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Platform
                               */
                               public void setPlatform(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPlatformTracker = true;
                                       } else {
                                          localPlatformTracker = false;
                                              
                                       }
                                   
                                            this.localPlatform=param;
                                    

                               }
                            

                        /**
                        * field for Monitoring
                        */

                        
                                    protected com.amazon.ec2.InstanceMonitoringStateType localMonitoring ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMonitoringTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.InstanceMonitoringStateType
                           */
                           public  com.amazon.ec2.InstanceMonitoringStateType getMonitoring(){
                               return localMonitoring;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Monitoring
                               */
                               public void setMonitoring(com.amazon.ec2.InstanceMonitoringStateType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMonitoringTracker = true;
                                       } else {
                                          localMonitoringTracker = false;
                                              
                                       }
                                   
                                            this.localMonitoring=param;
                                    

                               }
                            

                        /**
                        * field for SubnetId
                        */

                        
                                    protected java.lang.String localSubnetId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSubnetIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSubnetId(){
                               return localSubnetId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SubnetId
                               */
                               public void setSubnetId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSubnetIdTracker = true;
                                       } else {
                                          localSubnetIdTracker = false;
                                              
                                       }
                                   
                                            this.localSubnetId=param;
                                    

                               }
                            

                        /**
                        * field for VpcId
                        */

                        
                                    protected java.lang.String localVpcId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVpcIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVpcId(){
                               return localVpcId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param VpcId
                               */
                               public void setVpcId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localVpcIdTracker = true;
                                       } else {
                                          localVpcIdTracker = false;
                                              
                                       }
                                   
                                            this.localVpcId=param;
                                    

                               }
                            

                        /**
                        * field for PrivateIpAddress
                        */

                        
                                    protected java.lang.String localPrivateIpAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPrivateIpAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getPrivateIpAddress(){
                               return localPrivateIpAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PrivateIpAddress
                               */
                               public void setPrivateIpAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localPrivateIpAddressTracker = true;
                                       } else {
                                          localPrivateIpAddressTracker = false;
                                              
                                       }
                                   
                                            this.localPrivateIpAddress=param;
                                    

                               }
                            

                        /**
                        * field for IpAddress
                        */

                        
                                    protected java.lang.String localIpAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIpAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getIpAddress(){
                               return localIpAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param IpAddress
                               */
                               public void setIpAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localIpAddressTracker = true;
                                       } else {
                                          localIpAddressTracker = false;
                                              
                                       }
                                   
                                            this.localIpAddress=param;
                                    

                               }
                            

                        /**
                        * field for StateReason
                        */

                        
                                    protected com.amazon.ec2.StateReasonType localStateReason ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStateReasonTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.StateReasonType
                           */
                           public  com.amazon.ec2.StateReasonType getStateReason(){
                               return localStateReason;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param StateReason
                               */
                               public void setStateReason(com.amazon.ec2.StateReasonType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localStateReasonTracker = true;
                                       } else {
                                          localStateReasonTracker = false;
                                              
                                       }
                                   
                                            this.localStateReason=param;
                                    

                               }
                            

                        /**
                        * field for Architecture
                        */

                        
                                    protected java.lang.String localArchitecture ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localArchitectureTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getArchitecture(){
                               return localArchitecture;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Architecture
                               */
                               public void setArchitecture(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localArchitectureTracker = true;
                                       } else {
                                          localArchitectureTracker = false;
                                              
                                       }
                                   
                                            this.localArchitecture=param;
                                    

                               }
                            

                        /**
                        * field for RootDeviceType
                        */

                        
                                    protected java.lang.String localRootDeviceType ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRootDeviceTypeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRootDeviceType(){
                               return localRootDeviceType;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RootDeviceType
                               */
                               public void setRootDeviceType(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRootDeviceTypeTracker = true;
                                       } else {
                                          localRootDeviceTypeTracker = false;
                                              
                                       }
                                   
                                            this.localRootDeviceType=param;
                                    

                               }
                            

                        /**
                        * field for RootDeviceName
                        */

                        
                                    protected java.lang.String localRootDeviceName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRootDeviceNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRootDeviceName(){
                               return localRootDeviceName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RootDeviceName
                               */
                               public void setRootDeviceName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRootDeviceNameTracker = true;
                                       } else {
                                          localRootDeviceNameTracker = false;
                                              
                                       }
                                   
                                            this.localRootDeviceName=param;
                                    

                               }
                            

                        /**
                        * field for BlockDeviceMapping
                        */

                        
                                    protected com.amazon.ec2.InstanceBlockDeviceMappingResponseType localBlockDeviceMapping ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBlockDeviceMappingTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return com.amazon.ec2.InstanceBlockDeviceMappingResponseType
                           */
                           public  com.amazon.ec2.InstanceBlockDeviceMappingResponseType getBlockDeviceMapping(){
                               return localBlockDeviceMapping;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param BlockDeviceMapping
                               */
                               public void setBlockDeviceMapping(com.amazon.ec2.InstanceBlockDeviceMappingResponseType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localBlockDeviceMappingTracker = true;
                                       } else {
                                          localBlockDeviceMappingTracker = false;
                                              
                                       }
                                   
                                            this.localBlockDeviceMapping=param;
                                    

                               }
                            

                        /**
                        * field for InstanceLifecycle
                        */

                        
                                    protected java.lang.String localInstanceLifecycle ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localInstanceLifecycleTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getInstanceLifecycle(){
                               return localInstanceLifecycle;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param InstanceLifecycle
                               */
                               public void setInstanceLifecycle(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localInstanceLifecycleTracker = true;
                                       } else {
                                          localInstanceLifecycleTracker = false;
                                              
                                       }
                                   
                                            this.localInstanceLifecycle=param;
                                    

                               }
                            

                        /**
                        * field for SpotInstanceRequestId
                        */

                        
                                    protected java.lang.String localSpotInstanceRequestId ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSpotInstanceRequestIdTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSpotInstanceRequestId(){
                               return localSpotInstanceRequestId;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SpotInstanceRequestId
                               */
                               public void setSpotInstanceRequestId(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSpotInstanceRequestIdTracker = true;
                                       } else {
                                          localSpotInstanceRequestIdTracker = false;
                                              
                                       }
                                   
                                            this.localSpotInstanceRequestId=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       RunningInstancesItemType.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://ec2.amazonaws.com/doc/2009-11-30/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":RunningInstancesItemType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "RunningInstancesItemType",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"instanceId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"instanceId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("instanceId");
                                    }
                                

                                          if (localInstanceId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instanceId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstanceId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localImageIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"imageId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"imageId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("imageId");
                                    }
                                

                                          if (localImageId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("imageId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localImageId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                                            if (localInstanceState==null){
                                                 throw new org.apache.axis2.databinding.ADBException("instanceState cannot be null!!");
                                            }
                                           localInstanceState.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","instanceState"),
                                               factory,xmlWriter);
                                        
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"privateDnsName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"privateDnsName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("privateDnsName");
                                    }
                                

                                          if (localPrivateDnsName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("privateDnsName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrivateDnsName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localDnsNameTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"dnsName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"dnsName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("dnsName");
                                    }
                                

                                          if (localDnsName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("dnsName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localDnsName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReasonTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"reason", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"reason");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("reason");
                                    }
                                

                                          if (localReason==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("reason cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReason);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localKeyNameTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"keyName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"keyName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("keyName");
                                    }
                                

                                          if (localKeyName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("keyName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKeyName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAmiLaunchIndexTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"amiLaunchIndex", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"amiLaunchIndex");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("amiLaunchIndex");
                                    }
                                

                                          if (localAmiLaunchIndex==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("amiLaunchIndex cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localAmiLaunchIndex);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localProductCodesTracker){
                                            if (localProductCodes==null){
                                                 throw new org.apache.axis2.databinding.ADBException("productCodes cannot be null!!");
                                            }
                                           localProductCodes.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","productCodes"),
                                               factory,xmlWriter);
                                        }
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"instanceType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"instanceType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("instanceType");
                                    }
                                

                                          if (localInstanceType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instanceType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstanceType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"launchTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"launchTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("launchTime");
                                    }
                                

                                          if (localLaunchTime==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("launchTime cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLaunchTime));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localPlacementTracker){
                                            if (localPlacement==null){
                                                 throw new org.apache.axis2.databinding.ADBException("placement cannot be null!!");
                                            }
                                           localPlacement.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","placement"),
                                               factory,xmlWriter);
                                        } if (localKernelIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"kernelId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"kernelId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("kernelId");
                                    }
                                

                                          if (localKernelId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("kernelId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localKernelId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRamdiskIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ramdiskId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ramdiskId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ramdiskId");
                                    }
                                

                                          if (localRamdiskId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ramdiskId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRamdiskId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPlatformTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"platform", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"platform");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("platform");
                                    }
                                

                                          if (localPlatform==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("platform cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPlatform);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMonitoringTracker){
                                            if (localMonitoring==null){
                                                 throw new org.apache.axis2.databinding.ADBException("monitoring cannot be null!!");
                                            }
                                           localMonitoring.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","monitoring"),
                                               factory,xmlWriter);
                                        } if (localSubnetIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"subnetId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"subnetId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("subnetId");
                                    }
                                

                                          if (localSubnetId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("subnetId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSubnetId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localVpcIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"vpcId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"vpcId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("vpcId");
                                    }
                                

                                          if (localVpcId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("vpcId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localVpcId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPrivateIpAddressTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"privateIpAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"privateIpAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("privateIpAddress");
                                    }
                                

                                          if (localPrivateIpAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("privateIpAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localPrivateIpAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localIpAddressTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ipAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ipAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ipAddress");
                                    }
                                

                                          if (localIpAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ipAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localIpAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localStateReasonTracker){
                                            if (localStateReason==null){
                                                 throw new org.apache.axis2.databinding.ADBException("stateReason cannot be null!!");
                                            }
                                           localStateReason.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","stateReason"),
                                               factory,xmlWriter);
                                        } if (localArchitectureTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"architecture", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"architecture");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("architecture");
                                    }
                                

                                          if (localArchitecture==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("architecture cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localArchitecture);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRootDeviceTypeTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rootDeviceType", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rootDeviceType");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rootDeviceType");
                                    }
                                

                                          if (localRootDeviceType==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("rootDeviceType cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRootDeviceType);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRootDeviceNameTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"rootDeviceName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"rootDeviceName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("rootDeviceName");
                                    }
                                

                                          if (localRootDeviceName==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("rootDeviceName cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRootDeviceName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localBlockDeviceMappingTracker){
                                            if (localBlockDeviceMapping==null){
                                                 throw new org.apache.axis2.databinding.ADBException("blockDeviceMapping cannot be null!!");
                                            }
                                           localBlockDeviceMapping.serialize(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","blockDeviceMapping"),
                                               factory,xmlWriter);
                                        } if (localInstanceLifecycleTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"instanceLifecycle", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"instanceLifecycle");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("instanceLifecycle");
                                    }
                                

                                          if (localInstanceLifecycle==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("instanceLifecycle cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localInstanceLifecycle);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSpotInstanceRequestIdTracker){
                                    namespace = "http://ec2.amazonaws.com/doc/2009-11-30/";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"spotInstanceRequestId", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"spotInstanceRequestId");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("spotInstanceRequestId");
                                    }
                                

                                          if (localSpotInstanceRequestId==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("spotInstanceRequestId cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSpotInstanceRequestId);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "instanceId"));
                                 
                                        if (localInstanceId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstanceId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instanceId cannot be null!!");
                                        }
                                     if (localImageIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "imageId"));
                                 
                                        if (localImageId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localImageId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("imageId cannot be null!!");
                                        }
                                    }
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "instanceState"));
                            
                            
                                    if (localInstanceState==null){
                                         throw new org.apache.axis2.databinding.ADBException("instanceState cannot be null!!");
                                    }
                                    elementList.add(localInstanceState);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "privateDnsName"));
                                 
                                        if (localPrivateDnsName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrivateDnsName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("privateDnsName cannot be null!!");
                                        }
                                     if (localDnsNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "dnsName"));
                                 
                                        if (localDnsName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDnsName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("dnsName cannot be null!!");
                                        }
                                    } if (localReasonTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "reason"));
                                 
                                        if (localReason != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReason));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("reason cannot be null!!");
                                        }
                                    } if (localKeyNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "keyName"));
                                 
                                        if (localKeyName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKeyName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("keyName cannot be null!!");
                                        }
                                    } if (localAmiLaunchIndexTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "amiLaunchIndex"));
                                 
                                        if (localAmiLaunchIndex != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAmiLaunchIndex));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("amiLaunchIndex cannot be null!!");
                                        }
                                    } if (localProductCodesTracker){
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "productCodes"));
                            
                            
                                    if (localProductCodes==null){
                                         throw new org.apache.axis2.databinding.ADBException("productCodes cannot be null!!");
                                    }
                                    elementList.add(localProductCodes);
                                }
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "instanceType"));
                                 
                                        if (localInstanceType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstanceType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instanceType cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "launchTime"));
                                 
                                        if (localLaunchTime != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLaunchTime));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("launchTime cannot be null!!");
                                        }
                                     if (localPlacementTracker){
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "placement"));
                            
                            
                                    if (localPlacement==null){
                                         throw new org.apache.axis2.databinding.ADBException("placement cannot be null!!");
                                    }
                                    elementList.add(localPlacement);
                                } if (localKernelIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "kernelId"));
                                 
                                        if (localKernelId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKernelId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("kernelId cannot be null!!");
                                        }
                                    } if (localRamdiskIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "ramdiskId"));
                                 
                                        if (localRamdiskId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRamdiskId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ramdiskId cannot be null!!");
                                        }
                                    } if (localPlatformTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "platform"));
                                 
                                        if (localPlatform != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPlatform));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("platform cannot be null!!");
                                        }
                                    } if (localMonitoringTracker){
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "monitoring"));
                            
                            
                                    if (localMonitoring==null){
                                         throw new org.apache.axis2.databinding.ADBException("monitoring cannot be null!!");
                                    }
                                    elementList.add(localMonitoring);
                                } if (localSubnetIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "subnetId"));
                                 
                                        if (localSubnetId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSubnetId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("subnetId cannot be null!!");
                                        }
                                    } if (localVpcIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "vpcId"));
                                 
                                        if (localVpcId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVpcId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("vpcId cannot be null!!");
                                        }
                                    } if (localPrivateIpAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "privateIpAddress"));
                                 
                                        if (localPrivateIpAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrivateIpAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("privateIpAddress cannot be null!!");
                                        }
                                    } if (localIpAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "ipAddress"));
                                 
                                        if (localIpAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIpAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ipAddress cannot be null!!");
                                        }
                                    } if (localStateReasonTracker){
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "stateReason"));
                            
                            
                                    if (localStateReason==null){
                                         throw new org.apache.axis2.databinding.ADBException("stateReason cannot be null!!");
                                    }
                                    elementList.add(localStateReason);
                                } if (localArchitectureTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "architecture"));
                                 
                                        if (localArchitecture != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArchitecture));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("architecture cannot be null!!");
                                        }
                                    } if (localRootDeviceTypeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "rootDeviceType"));
                                 
                                        if (localRootDeviceType != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRootDeviceType));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("rootDeviceType cannot be null!!");
                                        }
                                    } if (localRootDeviceNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "rootDeviceName"));
                                 
                                        if (localRootDeviceName != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRootDeviceName));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("rootDeviceName cannot be null!!");
                                        }
                                    } if (localBlockDeviceMappingTracker){
                            elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "blockDeviceMapping"));
                            
                            
                                    if (localBlockDeviceMapping==null){
                                         throw new org.apache.axis2.databinding.ADBException("blockDeviceMapping cannot be null!!");
                                    }
                                    elementList.add(localBlockDeviceMapping);
                                } if (localInstanceLifecycleTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "instanceLifecycle"));
                                 
                                        if (localInstanceLifecycle != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInstanceLifecycle));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("instanceLifecycle cannot be null!!");
                                        }
                                    } if (localSpotInstanceRequestIdTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/",
                                                                      "spotInstanceRequestId"));
                                 
                                        if (localSpotInstanceRequestId != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSpotInstanceRequestId));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("spotInstanceRequestId cannot be null!!");
                                        }
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static RunningInstancesItemType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            RunningInstancesItemType object =
                new RunningInstancesItemType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"RunningInstancesItemType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (RunningInstancesItemType)com.amazon.ec2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","instanceId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInstanceId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","imageId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setImageId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","instanceState").equals(reader.getName())){
                                
                                                object.setInstanceState(com.amazon.ec2.InstanceStateType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","privateDnsName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrivateDnsName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","dnsName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setDnsName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","reason").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReason(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","keyName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKeyName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","amiLaunchIndex").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAmiLaunchIndex(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","productCodes").equals(reader.getName())){
                                
                                                object.setProductCodes(com.amazon.ec2.ProductCodesSetType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","instanceType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInstanceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","launchTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setLaunchTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","placement").equals(reader.getName())){
                                
                                                object.setPlacement(com.amazon.ec2.PlacementResponseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","kernelId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setKernelId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","ramdiskId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRamdiskId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","platform").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPlatform(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","monitoring").equals(reader.getName())){
                                
                                                object.setMonitoring(com.amazon.ec2.InstanceMonitoringStateType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","subnetId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSubnetId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","vpcId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVpcId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","privateIpAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setPrivateIpAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","ipAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setIpAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","stateReason").equals(reader.getName())){
                                
                                                object.setStateReason(com.amazon.ec2.StateReasonType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","architecture").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setArchitecture(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","rootDeviceType").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRootDeviceType(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","rootDeviceName").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRootDeviceName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","blockDeviceMapping").equals(reader.getName())){
                                
                                                object.setBlockDeviceMapping(com.amazon.ec2.InstanceBlockDeviceMappingResponseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","instanceLifecycle").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setInstanceLifecycle(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://ec2.amazonaws.com/doc/2009-11-30/","spotInstanceRequestId").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSpotInstanceRequestId(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          