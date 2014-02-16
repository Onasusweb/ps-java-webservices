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


public class SpecificPriceRuleFilter {
    
    private String id;
    private String idShop;
    private String idCountry;
    private String idCurrency;
    private String idGroup;
    private String name;
    private String fromQuantity;
    private String price;
    private String reduction;
    private String reductionType;
    private String from;
    private String to;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[id_country]")
    public String getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(String filter) {
        this.idCountry = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[id_group]")
    public String getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(String filter) {
        this.idGroup = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[from_quantity]")
    public String getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(String filter) {
        this.fromQuantity = filter;
    }
    
    @QueryParam(value="filter[price]")
    public String getPrice() {
        return price;
    }

    public void setPrice(String filter) {
        this.price = filter;
    }
    
    @QueryParam(value="filter[reduction]")
    public String getReduction() {
        return reduction;
    }

    public void setReduction(String filter) {
        this.reduction = filter;
    }
    
    @QueryParam(value="filter[reduction_type]")
    public String getReductionType() {
        return reductionType;
    }

    public void setReductionType(String filter) {
        this.reductionType = filter;
    }
    
    @QueryParam(value="filter[from]")
    public String getFrom() {
        return from;
    }

    public void setFrom(String filter) {
        this.from = filter;
    }
    
    @QueryParam(value="filter[to]")
    public String getTo() {
        return to;
    }

    public void setTo(String filter) {
        this.to = filter;
    }
    
}
