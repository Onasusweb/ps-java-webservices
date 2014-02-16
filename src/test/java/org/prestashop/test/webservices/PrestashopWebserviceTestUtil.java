/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.prestashop.test.webservices;

import java.util.Properties;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.JAXRSClientFactoryBean;
import org.apache.cxf.jaxrs.client.WebClient;
import org.prestashop.webservices.PrestashopWebservice;

public class PrestashopWebserviceTestUtil {
    private String url;
    private String key;
    
    public PrestashopWebserviceTestUtil(String url, String key) {
        this.url = url;
        this.key = key;
        Properties properties = System.getProperties();
        properties.put("org.apache.cxf.stax.allowInsecureParser", "1");
        System.setProperties(properties);
    }

    public PrestashopWebservice createInstance() {
        PrestashopWebservice clientLocalhost;

        JAXRSClientFactoryBean clientFactory = new JAXRSClientFactoryBean();
        clientFactory.setResourceClass(PrestashopWebservice.class);
        clientFactory.setAddress(url);
        clientFactory.setUsername(key);
        clientFactory.setPassword("");
        clientFactory.getInInterceptors().add(new LoggingInInterceptor());
        clientFactory.getInFaultInterceptors().add(new LoggingInInterceptor());
        clientFactory.getOutInterceptors().add(new LoggingOutInterceptor());
        clientFactory.getOutFaultInterceptors().add(new LoggingOutInterceptor());
        
        WebClient client = clientFactory.createWebClient();
        clientLocalhost = JAXRSClientFactory.fromClient(client, PrestashopWebservice.class);
        return clientLocalhost;
    }

}
