/*
 * Copyright 2012 MarkLogic Corporation
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
package com.marklogic.client.test;

import com.marklogic.client.config.StructuredQueryBuilder;
import com.marklogic.client.config.StructuredQueryDefinition;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class StructuredQueryBuilderTest {
    @Test
    public void testBuilder() throws IOException {
        StructuredQueryBuilder qb = new StructuredQueryBuilder(null);
        StructuredQueryDefinition t = qb.term("leaf3");
        
        assertEquals("<query xmlns='http://marklogic.com/appservices/search'><term><text>leaf3</text></term></query>", t.serialize());
    }
}
