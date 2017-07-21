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
package io.savor.common;

import io.savor.common.environment.Dotenv;
import io.savor.common.exceptions.DotenvException;
import org.neo4j.driver.v1.Driver;

/**
 * <h1>{@link io.savor.common.DriverFactory}</h1>
 *
 * Factory class to establish connection
 * with Graph Database through the URL's.
 * <p>
 *
 * @author Numis
 * @version 0.0.1
 * @since 0.0.1
 */
public class DriverFactory {

	// Class Instance
	private DriverFactory driverFactory;

	// Dotenv Instance
	private static Dotenv envInstance;

	// Empty
	private DriverFactory() {}

	/**
	 *
	 * @return driver - Established connection to the bolt database URI
	 * @throws DotenvException
	 */
	private Driver createConnection() throws DotenvException {
		return null;
	}
}
