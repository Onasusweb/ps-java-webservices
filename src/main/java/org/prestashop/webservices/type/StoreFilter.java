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


public class StoreFilter {
    
    private String id;
    private String idCountry;
    private String idState;
    private String hours;
    private String name;
    private String address1;
    private String address2;
    private String postcode;
    private String city;
    private String latitude;
    private String longitude;
    private String phone;
    private String fax;
    private String note;
    private String email;
    private String active;
    private String dateAdd;
    private String dateUpd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
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
    
    @QueryParam(value="filter[hours]")
    public String getHours() {
        return hours;
    }

    public void setHours(String filter) {
        this.hours = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
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
    
    @QueryParam(value="filter[latitude]")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String filter) {
        this.latitude = filter;
    }
    
    @QueryParam(value="filter[longitude]")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String filter) {
        this.longitude = filter;
    }
    
    @QueryParam(value="filter[phone]")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String filter) {
        this.phone = filter;
    }
    
    @QueryParam(value="filter[fax]")
    public String getFax() {
        return fax;
    }

    public void setFax(String filter) {
        this.fax = filter;
    }
    
    @QueryParam(value="filter[note]")
    public String getNote() {
        return note;
    }

    public void setNote(String filter) {
        this.note = filter;
    }
    
    @QueryParam(value="filter[email]")
    public String getEmail() {
        return email;
    }

    public void setEmail(String filter) {
        this.email = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
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
