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


public class TaxRuleFilter {
    
    private String id;
    private String idTaxRulesGroup;
    private String idState;
    private String idCountry;
    private String zipcodeFrom;
    private String zipcodeTo;
    private String idTax;
    private String behavior;
    private String description;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_tax_rules_group]")
    public String getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(String filter) {
        this.idTaxRulesGroup = filter;
    }
    
    @QueryParam(value="filter[id_state]")
    public String getIdState() {
        return idState;
    }

    public void setIdState(String filter) {
        this.idState = filter;
    }
    
    @QueryParam(value="filter[id_country]")
    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String filter) {
        this.idCountry = filter;
    }
    
    @QueryParam(value="filter[zipcode_from]")
    public String getZipcodeFrom() {
        return zipcodeFrom;
    }

    public void setZipcodeFrom(String filter) {
        this.zipcodeFrom = filter;
    }
    
    @QueryParam(value="filter[zipcode_to]")
    public String getZipcodeTo() {
        return zipcodeTo;
    }

    public void setZipcodeTo(String filter) {
        this.zipcodeTo = filter;
    }
    
    @QueryParam(value="filter[id_tax]")
    public String getIdTax() {
        return idTax;
    }

    public void setIdTax(String filter) {
        this.idTax = filter;
    }
    
    @QueryParam(value="filter[behavior]")
    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String filter) {
        this.behavior = filter;
    }
    
    @QueryParam(value="filter[description]")
    public String getDescription() {
        return description;
    }

    public void setDescription(String filter) {
        this.description = filter;
    }
    
}
