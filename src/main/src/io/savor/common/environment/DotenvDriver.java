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
package io.savor.common.environment;

import io.savor.common.exceptions.DotenvException;

/**
 * <h1>{@link io.savor.common.environment.DotenvDriver}</h1>
 *
 * Dotenv Factory class that creates
 * the primary instance for reading
 * in the .env file from a local or
 * global location.
 * <p>
 * Contains a private inner class that provides
 * the instance methods for validating and retrieving
 * the variables from the .env file.
 * <p>
 *
 * @author  Chefhub
 * @version 0.0.1
 * @since   0.0.1
 */
public class DotenvDriver {

	// Root Folder
	private String location = System.getProperty("user.dir");

	// Default
	public DotenvDriver() {}

	/**
	 * Finds the location of the .env file
	 * in the directory starting from the root project.
	 *
	 * @param location  - preset location
	 * @return location - location of the .env file
	 */
	public DotenvDriver envLocation(String location) {
		if (!location.endsWith("/"))
			location += "/";
		setLocation(location);
		return this;
	}

	/**
	 * Used to create a dotenv instance.
	 *
	 * @return DotenvDriver Instance - Provided object with methods to extract information
	 * @throws DotenvException       - invalid .env file or cannot access file
	 */
	public Dotenv createInstance() throws DotenvException {
		return new DotenvFactory(location);
	}

	/**
	 *
	 * @param location - location to set
	 */
	private void setLocation(String location) {
		this.location = location;
	}
}
