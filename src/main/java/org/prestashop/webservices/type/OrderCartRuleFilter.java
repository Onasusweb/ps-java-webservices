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


public class OrderCartRuleFilter {
    
    private String id;
    private String idOrder;
    private String idCartRule;
    private String idOrderInvoice;
    private String name;
    private String value;
    private String valueTaxExcl;
    private String freeShipping;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_order]")
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String filter) {
        this.idOrder = filter;
    }
    
    @QueryParam(value="filter[id_cart_rule]")
    public String getIdCartRule() {
        return idCartRule;
    }

    public void setIdCartRule(String filter) {
        this.idCartRule = filter;
    }
    
    @QueryParam(value="filter[id_order_invoice]")
    public String getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(String filter) {
        this.idOrderInvoice = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[value]")
    public String getValue() {
        return value;
    }

    public void setValue(String filter) {
        this.value = filter;
    }
    
    @QueryParam(value="filter[value_tax_excl]")
    public String getValueTaxExcl() {
        return valueTaxExcl;
    }

    public void setValueTaxExcl(String filter) {
        this.valueTaxExcl = filter;
    }
    
    @QueryParam(value="filter[free_shipping]")
    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String filter) {
        this.freeShipping = filter;
    }
    
}
