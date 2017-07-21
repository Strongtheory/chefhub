/**
 * Copyright {2017} chefhub.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.savor.common.exceptions.status;

/**
 * <h1>{@link io.savor.common.exceptions.status.ResourceNotFoundException}</h1>
 *
 * Custom exception for HTTP status 404.
 * <p>
 *
 * @author  Chefhub
 * @version 0.0.1
 * @since   0.0.1
 */
public class ResourceNotFoundException extends RuntimeException {

	// Default
	public ResourceNotFoundException() {
		super();
	}

	// Message
	public ResourceNotFoundException(final String message) {
		super(message);
	}

	// Cause
	public ResourceNotFoundException(final Throwable cause) {
		super(cause);
	}

	// Message, Cause
	public ResourceNotFoundException(final String message, final Throwable cause) {
		super(message, cause);
	}
}
