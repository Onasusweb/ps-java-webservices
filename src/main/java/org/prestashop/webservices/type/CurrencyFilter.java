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


public class CurrencyFilter {
    
    private String id;
    private String name;
    private String isoCode;
    private String isoCodeNum;
    private String blank;
    private String sign;
    private String format;
    private String decimals;
    private String conversionRate;
    private String deleted;
    private String active;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[iso_code]")
    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String filter) {
        this.isoCode = filter;
    }
    
    @QueryParam(value="filter[iso_code_num]")
    public String getIsoCodeNum() {
        return isoCodeNum;
    }

    public void setIsoCodeNum(String filter) {
        this.isoCodeNum = filter;
    }
    
    @QueryParam(value="filter[blank]")
    public String getBlank() {
        return blank;
    }

    public void setBlank(String filter) {
        this.blank = filter;
    }
    
    @QueryParam(value="filter[sign]")
    public String getSign() {
        return sign;
    }

    public void setSign(String filter) {
        this.sign = filter;
    }
    
    @QueryParam(value="filter[format]")
    public String getFormat() {
        return format;
    }

    public void setFormat(String filter) {
        this.format = filter;
    }
    
    @QueryParam(value="filter[decimals]")
    public String getDecimals() {
        return decimals;
    }

    public void setDecimals(String filter) {
        this.decimals = filter;
    }
    
    @QueryParam(value="filter[conversion_rate]")
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String filter) {
        this.conversionRate = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
}
