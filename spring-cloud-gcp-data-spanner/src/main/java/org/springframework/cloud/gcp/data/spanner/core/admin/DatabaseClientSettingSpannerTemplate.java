/*
 * Copyright 2017-2019 the original author or authors.
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

package org.springframework.cloud.gcp.data.spanner.core.admin;

/**
 * This class is used with
 * {@code ConfigurableDatabaseClientSpannerTemplateFactory.prepareDatabaseClientConfigurationSpannerTemplate}
 * to allow setting the database client on a per-method and argument-based basis.
 *
 * @author Chengyuan Zhao
 *
 * @since 1.2
 */
public class DatabaseClientSettingSpannerTemplate extends SettableClientSpannerTemplate {

	DatabaseClientSettingSpannerTemplate() {

	}
}