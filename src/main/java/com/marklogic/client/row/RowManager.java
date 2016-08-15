/*
 * Copyright 2016 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.client.row;

import com.marklogic.client.Transaction;
import com.marklogic.client.expression.PlanBuilder;
import com.marklogic.client.expression.PlanBuilder.Plan;
import com.marklogic.client.io.marker.JSONWriteHandle;
import com.marklogic.client.io.marker.RowReadHandle;

/* STATUS

   DONE:
   + PlanBuilder - fromView(), fromTriples(), fromLexicon(), fromLiterals(), expressions
   + PlanBuilder - placeholder parameter binding
   + PlanBuilder - cts.query
   + RowManager.newPlanBuilder()
   + RowManager.resultDoc()
   + RowManager.resultDocAs()
   + RowManager.resultRows()
   + RowManager - placeholder parameters
   + RawPlanDefinition
   + RowSet
   + RowRecord
   + RowRecord - column metadata

   TO DO:
   + RowRecord - sequence column values
   + RowManager.resultRowsAs()
   + PlanBuilder - node constructors
 */

// TODO: JavaDoc
public interface RowManager {
	PlanBuilder newPlanBuilder();

	RawPlanDefinition newRawPlanDefinition(JSONWriteHandle handle);

	RowSet<RowRecord> resultRows(Plan plan);
	RowSet<RowRecord> resultRows(Plan plan, Transaction transaction);

	<T extends RowReadHandle> RowSet<T> resultRows(Plan plan, T rowHandle);
    <T extends RowReadHandle> RowSet<T> resultRows(Plan plan, T rowHandle, Transaction transaction);

/* TODO:
    <T> RowSet<T> resultRows(Plan plan, Class<T> as);
    <T> RowSet<T> resultRows(Plan plan, Class<T> as, Transaction transaction);
 */

	<T extends RowReadHandle> T resultDoc(Plan plan, T handle);
	<T extends RowReadHandle> T resultDoc(Plan plan, T handle, Transaction transaction);

	<T> T resultDocAs(Plan plan, Class<T> as);
	<T> T resultDocAs(Plan plan, Class<T> as, Transaction transaction);
}
