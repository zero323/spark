/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.execution.command.v1

import org.apache.spark.sql.connector.catalog.CatalogManager
import org.apache.spark.sql.test.SharedSparkSession

/**
 * The trait contains settings and utility functions. It can be mixed to the test suites for
 * datasource v1 In-Memory catalog. This trait complements the common trait
 * `org.apache.spark.sql.execution.command.DDLCommandTestUtils` with utility functions and
 * settings for all unified datasource V1 and V2 test suites.
 */
trait CommandSuiteBase extends SharedSparkSession {
  def version: String = "V1" // The prefix is added to test names
  def catalog: String = CatalogManager.SESSION_CATALOG_NAME
  def defaultUsing: String = "USING parquet" // The clause is used in creating tables under testing
}
