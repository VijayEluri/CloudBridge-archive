/*
 * Copyright (C) 2011 Citrix Systems, Inc.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloud.stack.models;

import com.google.gson.annotations.SerializedName;

public class CloudStackIpAddress {
	
    @SerializedName(ApiConstants.ID)
    private Long id;
    @SerializedName(ApiConstants.ACCOUNT)
    private String accountName;
    @SerializedName(ApiConstants.ALLOCATED)
    private String allocated;
    @SerializedName(ApiConstants.ASSOCIATED_NETWORK_ID)
    private Long associatedNetworkId;
    @SerializedName(ApiConstants.DOMAIN)
    private String domainName;
    @SerializedName(ApiConstants.DOMAIN_ID)
    private Long domainId;
    @SerializedName(ApiConstants.FOR_VIRTUAL_NETWORK)
    private Boolean forVirtualNetwork;
    @SerializedName(ApiConstants.IP_ADDRESS)
    private String ipAddress;
    @SerializedName(ApiConstants.IS_SOURCE_NAT)
    private Boolean sourceNat;
    @SerializedName(ApiConstants.IS_STATIC_NAT)
    private Boolean staticNat;
    @SerializedName(ApiConstants.JOB_ID)
    private Long jobId;
    @SerializedName(ApiConstants.JOB_STATUS)
    private Integer jobStatus;
    @SerializedName(ApiConstants.NETWORK_ID)
    private Long networkId;
    @SerializedName(ApiConstants.STATE)
    private String state;
    @SerializedName(ApiConstants.VIRTUAL_MACHINE_DISPLAY_NAME)
    private String virtualMachineDisplayName;
    @SerializedName(ApiConstants.VIRTUAL_MACHINE_ID)
    private Long virtualMachineId;
    @SerializedName(ApiConstants.VIRTUAL_MACHINE_NAME)
    private String virtualMachineName;
    @SerializedName(ApiConstants.VLAN_ID)
    private Long vlanId;
    @SerializedName(ApiConstants.VLAN_NAME)
    private String vlanName;
    @SerializedName(ApiConstants.ZONE_ID)
    private Long zoneId;
    @SerializedName(ApiConstants.ZONE_NAME)
    private String zoneName;

    public CloudStackIpAddress() {
    }

	public Long getId() {
		return id;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public String getAllocated() {
		return allocated;
	}

	public Long getZoneId() {
		return zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public Boolean getSourceNat() {
		return sourceNat;
	}

	public String getAccountName() {
		return accountName;
	}

	public Long getDomainId() {
		return domainId;
	}

	public String getDomainName() {
		return domainName;
	}

	public Boolean getForVirtualNetwork() {
		return forVirtualNetwork;
	}

	public Long getVlanId() {
		return vlanId;
	}

	public String getVlanName() {
		return vlanName;
	}

	public Boolean getStaticNat() {
		return staticNat;
	}

	public Long getVirtualMachineId() {
		return virtualMachineId;
	}

	public String getVirtualMachineName() {
		return virtualMachineName;
	}

	public String getVirtualMachineDisplayName() {
		return virtualMachineDisplayName;
	}

	public Long getAssociatedNetworkId() {
		return associatedNetworkId;
	}

	public Long getNetworkId() {
		return networkId;
	}

	public String getState() {
		return state;
	}

	public Long getJobId() {
		return jobId;
	}

	public Integer getJobStatus() {
		return jobStatus;
	}
}