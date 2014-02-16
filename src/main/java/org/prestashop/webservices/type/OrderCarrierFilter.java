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


public class OrderCarrierFilter {
    
    private String id;
    private String idOrder;
    private String idCarrier;
    private String idOrderInvoice;
    private String weight;
    private String shippingCostTaxExcl;
    private String shippingCostTaxIncl;
    private String trackingNumber;
    private String dateAdd;
    
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
    
    @QueryParam(value="filter[id_carrier]")
    public String getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(String filter) {
        this.idCarrier = filter;
    }
    
    @QueryParam(value="filter[id_order_invoice]")
    public String getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(String filter) {
        this.idOrderInvoice = filter;
    }
    
    @QueryParam(value="filter[weight]")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String filter) {
        this.weight = filter;
    }
    
    @QueryParam(value="filter[shipping_cost_tax_excl]")
    public String getShippingCostTaxExcl() {
        return shippingCostTaxExcl;
    }

    public void setShippingCostTaxExcl(String filter) {
        this.shippingCostTaxExcl = filter;
    }
    
    @QueryParam(value="filter[shipping_cost_tax_incl]")
    public String getShippingCostTaxIncl() {
        return shippingCostTaxIncl;
    }

    public void setShippingCostTaxIncl(String filter) {
        this.shippingCostTaxIncl = filter;
    }
    
    @QueryParam(value="filter[tracking_number]")
    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String filter) {
        this.trackingNumber = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
}
