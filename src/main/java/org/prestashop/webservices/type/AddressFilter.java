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
package org.prestashop.webservices.type;

import javax.ws.rs.QueryParam;


public class AddressFilter {
    
    private String id;
    private String idCustomer;
    private String idManufacturer;
    private String idSupplier;
    private String idWarehouse;
    private String idCountry;
    private String idState;
    private String alias;
    private String company;
    private String lastname;
    private String firstname;
    private String vatNumber;
    private String address1;
    private String address2;
    private String postcode;
    private String city;
    private String other;
    private String phone;
    private String phoneMobile;
    private String dni;
    private String deleted;
    private String dateAdd;
    private String dateUpd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[id_manufacturer]")
    public String getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(String filter) {
        this.idManufacturer = filter;
    }
    
    @QueryParam(value="filter[id_supplier]")
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String filter) {
        this.idSupplier = filter;
    }
    
    @QueryParam(value="filter[id_warehouse]")
    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String filter) {
        this.idWarehouse = filter;
    }
    
    @QueryParam(value="filter[id_country]")
    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String filter) {
        this.idCountry = filter;
    }
    
    @QueryParam(value="filter[id_state]")
    public String getIdState() {
        return idState;
    }

    public void setIdState(String filter) {
        this.idState = filter;
    }
    
    @QueryParam(value="filter[alias]")
    public String getAlias() {
        return alias;
    }

    public void setAlias(String filter) {
        this.alias = filter;
    }
    
    @QueryParam(value="filter[company]")
    public String getCompany() {
        return company;
    }

    public void setCompany(String filter) {
        this.company = filter;
    }
    
    @QueryParam(value="filter[lastname]")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String filter) {
        this.lastname = filter;
    }
    
    @QueryParam(value="filter[firstname]")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String filter) {
        this.firstname = filter;
    }
    
    @QueryParam(value="filter[vat_number]")
    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String filter) {
        this.vatNumber = filter;
    }
    
    @QueryParam(value="filter[address1]")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String filter) {
        this.address1 = filter;
    }
    
    @QueryParam(value="filter[address2]")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String filter) {
        this.address2 = filter;
    }
    
    @QueryParam(value="filter[postcode]")
    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String filter) {
        this.postcode = filter;
    }
    
    @QueryParam(value="filter[city]")
    public String getCity() {
        return city;
    }

    public void setCity(String filter) {
        this.city = filter;
    }
    
    @QueryParam(value="filter[other]")
    public String getOther() {
        return other;
    }

    public void setOther(String filter) {
        this.other = filter;
    }
    
    @QueryParam(value="filter[phone]")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String filter) {
        this.phone = filter;
    }
    
    @QueryParam(value="filter[phone_mobile]")
    public String getPhoneMobile() {
        return phoneMobile;
    }

    public void setPhoneMobile(String filter) {
        this.phoneMobile = filter;
    }
    
    @QueryParam(value="filter[dni]")
    public String getDni() {
        return dni;
    }

    public void setDni(String filter) {
        this.dni = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
    @QueryParam(value="filter[date_upd]")
    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String filter) {
        this.dateUpd = filter;
    }
    
}
