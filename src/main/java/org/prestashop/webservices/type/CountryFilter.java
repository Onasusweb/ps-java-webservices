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


public class CountryFilter {
    
    private String id;
    private String idZone;
    private String idCurrency;
    private String callPrefix;
    private String isoCode;
    private String active;
    private String containsStates;
    private String needIdentificationNumber;
    private String needZipCode;
    private String zipCodeFormat;
    private String displayTaxLabel;
    private String name;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_zone]")
    public String getIdZone() {
        return idZone;
    }

    public void setIdZone(String filter) {
        this.idZone = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[call_prefix]")
    public String getCallPrefix() {
        return callPrefix;
    }

    public void setCallPrefix(String filter) {
        this.callPrefix = filter;
    }
    
    @QueryParam(value="filter[iso_code]")
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String filter) {
        this.isoCode = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[contains_states]")
    public String getContainsStates() {
        return containsStates;
    }

    public void setContainsStates(String filter) {
        this.containsStates = filter;
    }
    
    @QueryParam(value="filter[need_identification_number]")
    public String getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }

    public void setNeedIdentificationNumber(String filter) {
        this.needIdentificationNumber = filter;
    }
    
    @QueryParam(value="filter[need_zip_code]")
    public String getNeedZipCode() {
        return needZipCode;
    }

    public void setNeedZipCode(String filter) {
        this.needZipCode = filter;
    }
    
    @QueryParam(value="filter[zip_code_format]")
    public String getZipCodeFormat() {
        return zipCodeFormat;
    }

    public void setZipCodeFormat(String filter) {
        this.zipCodeFormat = filter;
    }
    
    @QueryParam(value="filter[display_tax_label]")
    public String getDisplayTaxLabel() {
        return displayTaxLabel;
    }

    public void setDisplayTaxLabel(String filter) {
        this.displayTaxLabel = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
}
