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
package com.cloud.bridge.service.exception;

/**
 * @author Kelven Yang
 */
public class PermissionDeniedException extends RuntimeException {
	private static final long serialVersionUID = -5816172859594116468L;

	public PermissionDeniedException() {
	}
	
	public PermissionDeniedException(String message) {
		super(message);
	}

	public PermissionDeniedException(Throwable e) {
		super(e);
	}
	
	public PermissionDeniedException(String message, Throwable e) {
		super(message, e);
	}
}
