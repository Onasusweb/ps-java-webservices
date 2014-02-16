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


public class OrderInvoiceFilter {
    
    private String id;
    private String idOrder;
    private String number;
    private String deliveryNumber;
    private String deliveryDate;
    private String totalDiscountTaxExcl;
    private String totalDiscountTaxIncl;
    private String totalPaidTaxExcl;
    private String totalPaidTaxIncl;
    private String totalProducts;
    private String totalProductsWt;
    private String totalShippingTaxExcl;
    private String totalShippingTaxIncl;
    private String shippingTaxComputationMethod;
    private String totalWrappingTaxExcl;
    private String totalWrappingTaxIncl;
    private String note;
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
    
    @QueryParam(value="filter[number]")
    public String getNumber() {
        return number;
    }

    public void setNumber(String filter) {
        this.number = filter;
    }
    
    @QueryParam(value="filter[delivery_number]")
    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String filter) {
        this.deliveryNumber = filter;
    }
    
    @QueryParam(value="filter[delivery_date]")
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String filter) {
        this.deliveryDate = filter;
    }
    
    @QueryParam(value="filter[total_discount_tax_excl]")
    public String getTotalDiscountTaxExcl() {
        return totalDiscountTaxExcl;
    }

    public void setTotalDiscountTaxExcl(String filter) {
        this.totalDiscountTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_discount_tax_incl]")
    public String getTotalDiscountTaxIncl() {
        return totalDiscountTaxIncl;
    }

    public void setTotalDiscountTaxIncl(String filter) {
        this.totalDiscountTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_paid_tax_excl]")
    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(String filter) {
        this.totalPaidTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_paid_tax_incl]")
    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(String filter) {
        this.totalPaidTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_products]")
    public String getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(String filter) {
        this.totalProducts = filter;
    }
    
    @QueryParam(value="filter[total_products_wt]")
    public String getTotalProductsWt() {
        return totalProductsWt;
    }

    public void setTotalProductsWt(String filter) {
        this.totalProductsWt = filter;
    }
    
    @QueryParam(value="filter[total_shipping_tax_excl]")
    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(String filter) {
        this.totalShippingTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_shipping_tax_incl]")
    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(String filter) {
        this.totalShippingTaxIncl = filter;
    }
    
    @QueryParam(value="filter[shipping_tax_computation_method]")
    public String getShippingTaxComputationMethod() {
        return shippingTaxComputationMethod;
    }

    public void setShippingTaxComputationMethod(String filter) {
        this.shippingTaxComputationMethod = filter;
    }
    
    @QueryParam(value="filter[total_wrapping_tax_excl]")
    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(String filter) {
        this.totalWrappingTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_wrapping_tax_incl]")
    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(String filter) {
        this.totalWrappingTaxIncl = filter;
    }
    
    @QueryParam(value="filter[note]")
    public String getNote() {
        return note;
    }

    public void setNote(String filter) {
        this.note = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
}
