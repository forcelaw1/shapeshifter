/**
 * Copyright 2012, 2013 Turn, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.turn.shapeshifter;

/**
 * Thrown when an error occurs upon parsing JSON content.
 *
 * @author jsilland
 */
@SuppressWarnings("serial")
public class ParsingException extends Exception {

	/**
	 * Builds a new instance on this class with the given root cause.
	 *
	 * @param cause the root cause of this exception
	 */
	public ParsingException(Throwable cause) {
		super(cause);
	}
}