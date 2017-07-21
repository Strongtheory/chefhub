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
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <h1>{@link io.savor.common.environment.PrimaryDotenv}</h1>
 *
 * Helper class that creates a {@link DotenvFactory} instance.
 * Provides helper methods to retrieve each key values.
 * <p>
 *
 * @author  Chefhub
 * @version 0.0.1
 * @since   0.0.1
 */
public class PrimaryDotenv {

	// Class Logger
	private final static Logger LOGGER = Logger.getLogger(PrimaryDotenv.class.getName());

	// Default
	public PrimaryDotenv() {}

	/**
	 * Creates a DotenvFactory instance with the correct
	 * location of the .env file.
	 *
	 * @return dotenv - configured instance of DotenvFactory
	 */
	public static Dotenv createDotenvInstance() {
		try {
			LOGGER.log(Level.INFO, "Create dotenv instance "
						+ "with location to chefhub.env file.");
			return new DotenvDriver()
					.envLocation("src/main/resources")
					.createInstance();
		} catch (DotenvException e) {
			LOGGER.log(Level.SEVERE,
					"Did not find file",
					ExceptionUtils.getStackTrace(e));
			e.printStackTrace();
			return null;
		}
	}
}
