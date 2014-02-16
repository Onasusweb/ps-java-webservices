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

import java.util.Random;

import javax.ws.rs.NotFoundException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.prestashop.webservices.PrestashopWebservice;
import org.prestashop.webservices.type.Address;
import org.prestashop.webservices.type.AddressFilter;
import org.prestashop.webservices.type.PrestashopAddress;
import org.prestashop.webservices.type.PrestashopAddresses;

public class PrestashopWebserviceTestCase {

    /*
     * http://doc.prestashop.com/display/PS15/Cheat-sheet+-+Concepts+outlined+in+this+tutorial
     * http://doc.prestashop.com/display/PS15/Chapter+8+-+Advanced+Use#Chapter8-AdvancedUse-Onlyincludethefirstandlastnamesofcustomers%22customers%22whoseidsare1or5
    
     * DISPLAY: http://127.0.0.1/prestashop/api/countries?display=[id,iso_code]&limit=5
     * FILTER:  http://127.0.0.1/prestashop/api/countries?filter[iso_code]=%[D]%
     * SORT:    http://127.0.0.1/prestashop/api/countries?sort=[id_DESC]
     * LIMIT:   URL: (Store URL)/api/states/?display=full&limit=9,5
    
     */
    
    private static String testEnvironmentUrl = "http://127.0.0.1/prestashop_1.5.6.2/api";
    private static String testEnvironmentKey = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456";
    
    private PrestashopWebservice webservice;
    
    @Before
    public void setUp() throws Exception {
        PrestashopWebserviceTestUtil util = new PrestashopWebserviceTestUtil(testEnvironmentUrl, testEnvironmentKey);
        webservice = util.createInstance();
    }

    @Test
    public void ApiTestCase() throws Exception {
        Assert.assertNotNull(webservice.api());
    }
    
    @Test
    public void addressesTestCase() throws Exception {
        AddressFilter filter = new AddressFilter();
        filter.setId("[1]");
        PrestashopAddresses o = webservice.readAddresses("[id]",filter,"[id_ASC]",null);
        Assert.assertNotNull(o);
        Assert.assertNotNull(o.getAddresses().size());
    }
    
    @Test
    public void readAndUpdateAddressTestCase() throws Exception {
        String saveValue = "TEST:"+new Random().nextInt(100000000);
        
        PrestashopAddress address = webservice.readAddress(2L);
        String fieldAddress01 = address.getAddress().getAddress1();
        Assert.assertNotNull(fieldAddress01);
        String fieldAddress02 = address.getAddress().getAddress2();
        Assert.assertNotNull(fieldAddress02);
        
        address.getAddress().setAddress2(saveValue);
        PrestashopAddress savedAddress = webservice.updateAddress(address);
        Assert.assertEquals(saveValue, savedAddress.getAddress().getAddress2());
        
        AddressFilter filter = new AddressFilter();
        filter.setAddress2("["+saveValue+"]");
        PrestashopAddresses list = webservice.readAddresses("[id]", filter , null, null);
        Assert.assertEquals(1, list.getAddresses().size());
        Assert.assertEquals(Long.valueOf(2), list.getAddresses().get(0).getId());
    }
    
    @Test
    public void createAndDeleteAddressTestCase() throws Exception {
        PrestashopAddress pa = new PrestashopAddress();
        Address a = new Address();
        pa.setAddress(a);
        a.setIdManufacturer(1L);
        a.setLastname("lastname");
        a.setFirstname("firstname");
        a.setAddress1("address1");
        a.setAddress2("address2");
        a.setCity("city");
        a.setIdCountry(1L);
        a.setAlias("alias");
        PrestashopAddress aSaved = webservice.createAddress(pa);
        Long aSavedId = aSaved.getAddress().getId();
        Assert.assertNotNull(aSavedId);
        
        PrestashopAddress exist = webservice.readAddress(aSavedId);
        Assert.assertNotNull(exist);
        
        webservice.deleteAddress(aSavedId);
        
        boolean notFoundException = false;
        try{
            webservice.readAddress(aSavedId);
        }catch(NotFoundException e){
            notFoundException = true;
        }
        Assert.assertEquals(true, notFoundException);
    }
    
    
}
