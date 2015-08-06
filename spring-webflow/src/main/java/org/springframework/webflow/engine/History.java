/*
 * Copyright 2004-2008 the original author or authors.
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
package org.springframework.webflow.engine;

/**
 * View state history policies.
 * 
 * @see ViewState
 * @author Keith Donald
 */
public enum History {

	/**
	 * The history of the view state should be preserved when the view state exits to support back-tracking.
	 */
	PRESERVE,

	/**
	 * The history of the view state should be discarded when the view state exits to prevent back-tracking.
	 */
	DISCARD,

	/**
	 * The history of the view state and all previous view state should be invalidated to completely restrict back
	 * tracking.
	 */
	INVALIDATE

}