/*
 * Copyright 2010 Cloud.com, Inc.
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
package com.cloud.bridge.service;

/**
 * @author Kelven Yang
 */
public class UserInfo {
	private String accessKey;
	private String secretKey;
	private String canonicalUserId;
	private String description;

	public UserInfo() {
	}
	
	public String getAccessKey() {
		return accessKey;
	}
	
	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}
	
	public String getSecretKey() {
		return secretKey;
	}
	
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	
	public String getCanonicalUserId() {
		return canonicalUserId;
	}
	
	public void setCanonicalUserId(String canonicalUserId) {
		this.canonicalUserId = canonicalUserId;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String discription) {
		this.description = discription;
	}
}
