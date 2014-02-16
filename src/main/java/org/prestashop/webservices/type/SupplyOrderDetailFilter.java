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


public class SupplyOrderDetailFilter {
    
    private String id;
    private String idSupplyOrder;
    private String idProduct;
    private String idProductAttribute;
    private String reference;
    private String supplierReference;
    private String name;
    private String ean13;
    private String upc;
    private String exchangeRate;
    private String unitPriceTe;
    private String quantityExpected;
    private String quantityReceived;
    private String priceTe;
    private String discountRate;
    private String discountValueTe;
    private String priceWithDiscountTe;
    private String taxRate;
    private String taxValue;
    private String priceTi;
    private String taxValueWithOrderDiscount;
    private String priceWithOrderDiscountTe;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_supply_order]")
    public String getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(String filter) {
        this.idSupplyOrder = filter;
    }
    
    @QueryParam(value="filter[id_product]")
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String filter) {
        this.idProduct = filter;
    }
    
    @QueryParam(value="filter[id_product_attribute]")
    public String getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(String filter) {
        this.idProductAttribute = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[supplier_reference]")
    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String filter) {
        this.supplierReference = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[ean13]")
    public String getEan13() {
        return ean13;
    }

    public void setEan13(String filter) {
        this.ean13 = filter;
    }
    
    @QueryParam(value="filter[upc]")
    public String getUpc() {
        return upc;
    }

    public void setUpc(String filter) {
        this.upc = filter;
    }
    
    @QueryParam(value="filter[exchange_rate]")
    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String filter) {
        this.exchangeRate = filter;
    }
    
    @QueryParam(value="filter[unit_price_te]")
    public String getUnitPriceTe() {
        return unitPriceTe;
    }

    public void setUnitPriceTe(String filter) {
        this.unitPriceTe = filter;
    }
    
    @QueryParam(value="filter[quantity_expected]")
    public String getQuantityExpected() {
        return quantityExpected;
    }

    public void setQuantityExpected(String filter) {
        this.quantityExpected = filter;
    }
    
    @QueryParam(value="filter[quantity_received]")
    public String getQuantityReceived() {
        return quantityReceived;
    }

    public void setQuantityReceived(String filter) {
        this.quantityReceived = filter;
    }
    
    @QueryParam(value="filter[price_te]")
    public String getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(String filter) {
        this.priceTe = filter;
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
    
    @QueryParam(value="filter[price_with_discount_te]")
    public String getPriceWithDiscountTe() {
        return priceWithDiscountTe;
    }

    public void setPriceWithDiscountTe(String filter) {
        this.priceWithDiscountTe = filter;
    }
    
    @QueryParam(value="filter[tax_rate]")
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String filter) {
        this.taxRate = filter;
    }
    
    @QueryParam(value="filter[tax_value]")
    public String getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(String filter) {
        this.taxValue = filter;
    }
    
    @QueryParam(value="filter[price_ti]")
    public String getPriceTi() {
        return priceTi;
    }

    public void setPriceTi(String filter) {
        this.priceTi = filter;
    }
    
    @QueryParam(value="filter[tax_value_with_order_discount]")
    public String getTaxValueWithOrderDiscount() {
        return taxValueWithOrderDiscount;
    }

    public void setTaxValueWithOrderDiscount(String filter) {
        this.taxValueWithOrderDiscount = filter;
    }
    
    @QueryParam(value="filter[price_with_order_discount_te]")
    public String getPriceWithOrderDiscountTe() {
        return priceWithOrderDiscountTe;
    }

    public void setPriceWithOrderDiscountTe(String filter) {
        this.priceWithOrderDiscountTe = filter;
    }
    
}
