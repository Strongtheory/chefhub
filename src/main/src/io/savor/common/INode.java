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

/**
 * <h1>{@link io.savor.common.INode}</h1>
 *
 * Comparable node class that extends
 * {@link Comparable<INode>}
 * <p>
 * Used by standard domain node templates.
 * <p>
 *
 *
 * @author  Chefhub
 * @version 0.0.1
 * @since   0.0.1
 */
public interface INode extends Comparable<INode> {

	/**
	 *
	 * @return id - id of the node
	 */
	Long getId();
}
