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


public class GroupFilter {
    
    private String id;
    private String reduction;
    private String priceDisplayMethod;
    private String showPrices;
    private String dateAdd;
    private String dateUpd;
    private String name;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[reduction]")
    public String getReduction() {
        return reduction;
    }

    public void setReduction(String filter) {
        this.reduction = filter;
    }
    
    @QueryParam(value="filter[price_display_method]")
    public String getPriceDisplayMethod() {
        return priceDisplayMethod;
    }

    public void setPriceDisplayMethod(String filter) {
        this.priceDisplayMethod = filter;
    }
    
    @QueryParam(value="filter[show_prices]")
    public String getShowPrices() {
        return showPrices;
    }

    public void setShowPrices(String filter) {
        this.showPrices = filter;
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
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
}
