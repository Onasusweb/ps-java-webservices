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


public class SupplyOrderFilter {
    
    private String id;
    private String idSupplier;
    private String idLang;
    private String idWarehouse;
    private String idSupplyOrderState;
    private String idCurrency;
    private String supplierName;
    private String reference;
    private String dateDeliveryExpected;
    private String totalTe;
    private String totalWithDiscountTe;
    private String totalTi;
    private String totalTax;
    private String discountRate;
    private String discountValueTe;
    private String isTemplate;
    private String dateAdd;
    private String dateUpd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_supplier]")
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String filter) {
        this.idSupplier = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
    }
    
    @QueryParam(value="filter[id_warehouse]")
    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String filter) {
        this.idWarehouse = filter;
    }
    
    @QueryParam(value="filter[id_supply_order_state]")
    public String getIdSupplyOrderState() {
        return idSupplyOrderState;
    }

    public void setIdSupplyOrderState(String filter) {
        this.idSupplyOrderState = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[supplier_name]")
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String filter) {
        this.supplierName = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[date_delivery_expected]")
    public String getDateDeliveryExpected() {
        return dateDeliveryExpected;
    }

    public void setDateDeliveryExpected(String filter) {
        this.dateDeliveryExpected = filter;
    }
    
    @QueryParam(value="filter[total_te]")
    public String getTotalTe() {
        return totalTe;
    }

    public void setTotalTe(String filter) {
        this.totalTe = filter;
    }
    
    @QueryParam(value="filter[total_with_discount_te]")
    public String getTotalWithDiscountTe() {
        return totalWithDiscountTe;
    }

    public void setTotalWithDiscountTe(String filter) {
        this.totalWithDiscountTe = filter;
    }
    
    @QueryParam(value="filter[total_ti]")
    public String getTotalTi() {
        return totalTi;
    }

    public void setTotalTi(String filter) {
        this.totalTi = filter;
    }
    
    @QueryParam(value="filter[total_tax]")
    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String filter) {
        this.totalTax = filter;
    }
    
    @QueryParam(value="filter[discount_rate]")
    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String filter) {
        this.discountRate = filter;
    }
    
    @QueryParam(value="filter[discount_value_te]")
    public String getDiscountValueTe() {
        return discountValueTe;
    }

    public void setDiscountValueTe(String filter) {
        this.discountValueTe = filter;
    }
    
    @QueryParam(value="filter[is_template]")
    public String getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(String filter) {
        this.isTemplate = filter;
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
