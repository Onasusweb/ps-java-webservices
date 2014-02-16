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

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.junit.Assert;
import org.junit.Test;
import org.prestashop.webservices.type.*;

public class MarshallUnmarschallTestCase {

    @Test
    public void testAddresses() throws Exception {
        File in = new File("src/test/resources/examples/addresses-1.xml");
        File out = new File("src/test/resources/examples/addresses-1-out.xml"); 
        PrestashopAddress prestashop = (PrestashopAddress) JAXBContext.newInstance(PrestashopAddress.class).createUnmarshaller().unmarshal(in);
        
        Assert.assertNotNull(prestashop);
        Assert.assertNotNull(prestashop.getAddress());
        Assert.assertNotNull(prestashop.getAddress());
        Assert.assertNotNull(prestashop.getAddress().getId());
        Assert.assertNotNull(prestashop.getAddress().getIdCustomer());
        
        Marshaller m = JAXBContext.newInstance(PrestashopAddress.class).createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(prestashop, out); 
        
        XMLAssert.assertEquals(in, out);
    }
    

    @Test
    public void testCarriers() throws Exception {
        File in = new File("src/test/resources/examples/carriers-1.xml");
        File out = new File("src/test/resources/examples/carriers-1-out.xml"); 
        PrestashopCarrier prestashop = (PrestashopCarrier) JAXBContext.newInstance(PrestashopCarrier.class).createUnmarshaller().unmarshal(in);
        
        Assert.assertNotNull(prestashop);
        Assert.assertNotNull(prestashop.getCarrier());
        Assert.assertNotNull(prestashop.getCarrier());
        Assert.assertNotNull(prestashop.getCarrier().getId());
        
        Marshaller m = JAXBContext.newInstance(PrestashopCarrier.class).createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(prestashop, out); 
        
        XMLAssert.assertEquals(in, out);
    }
    

    @Test
    public void testCarts() throws Exception {
        File in = new File("src/test/resources/examples/carts-1.xml");
        File out = new File("src/test/resources/examples/carts-1-out.xml"); 
        PrestashopCart prestashop = (PrestashopCart) JAXBContext.newInstance(PrestashopCart.class).createUnmarshaller().unmarshal(in);
        
        Assert.assertNotNull(prestashop);
        Assert.assertNotNull(prestashop.getCart());
        Assert.assertNotNull(prestashop.getCart());
        Assert.assertNotNull(prestashop.getCart().getId());
        
        Marshaller m = JAXBContext.newInstance(PrestashopCart.class).createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(prestashop, out); 
        
        XMLAssert.assertEquals(in, out);
    }
    
    @Test
    public void testCategories() throws Exception {
        File in = new File("src/test/resources/examples/categories-1.xml");
        File out = new File("src/test/resources/examples/categories-1-out.xml"); 
        PrestashopCategory prestashop = (PrestashopCategory) JAXBContext.newInstance(PrestashopCategory.class).createUnmarshaller().unmarshal(in);
        
        Assert.assertNotNull(prestashop);
        Assert.assertNotNull(prestashop.getCategory());
        Assert.assertNotNull(prestashop.getCategory().getId());

        Marshaller m = JAXBContext.newInstance(PrestashopCategory.class).createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(prestashop, out); 
        
        XMLAssert.assertEquals(in, out);
    }
    
}
