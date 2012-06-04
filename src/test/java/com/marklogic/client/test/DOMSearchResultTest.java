package com.marklogic.client.test;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.Document;

import com.marklogic.client.QueryManager;
import com.marklogic.client.config.StringQueryDefinition;
import com.marklogic.client.io.DOMHandle;

public class DOMSearchResultTest {
    @BeforeClass
    public static void beforeClass() {
        Common.connect();
    }

    @AfterClass
    public static void afterClass() {
        Common.release();
    }

    @Test
    public void testStringSearch() throws IOException, ParserConfigurationException {
        // This test really just exists to show how to get search results in other formats.
        QueryManager queryMgr = Common.client.newQueryManager();
        StringQueryDefinition qdef = queryMgr.newStringDefinition(null);
        qdef.setCriteria("leaf3");

        DOMHandle results = queryMgr.search(qdef, new DOMHandle());
        Document doc = results.get();
        assertNotNull(doc);
    }
}