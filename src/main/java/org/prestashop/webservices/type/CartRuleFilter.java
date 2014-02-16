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


public class CartRuleFilter {
    
    private String id;
    private String idCustomer;
    private String dateFrom;
    private String dateTo;
    private String description;
    private String quantity;
    private String quantityPerUser;
    private String priority;
    private String partialUse;
    private String code;
    private String minimumAmount;
    private String minimumAmountTax;
    private String minimumAmountCurrency;
    private String minimumAmountShipping;
    private String countryRestriction;
    private String carrierRestriction;
    private String groupRestriction;
    private String cartRuleRestriction;
    private String productRestriction;
    private String shopRestriction;
    private String freeShipping;
    private String reductionPercent;
    private String reductionAmount;
    private String reductionTax;
    private String reductionCurrency;
    private String reductionProduct;
    private String giftProduct;
    private String giftProductAttribute;
    private String highlight;
    private String active;
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
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[date_from]")
    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String filter) {
        this.dateFrom = filter;
    }
    
    @QueryParam(value="filter[date_to]")
    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String filter) {
        this.dateTo = filter;
    }
    
    @QueryParam(value="filter[description]")
    public String getDescription() {
        return description;
    }

    public void setDescription(String filter) {
        this.description = filter;
    }
    
    @QueryParam(value="filter[quantity]")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String filter) {
        this.quantity = filter;
    }
    
    @QueryParam(value="filter[quantity_per_user]")
    public String getQuantityPerUser() {
        return quantityPerUser;
    }

    public void setQuantityPerUser(String filter) {
        this.quantityPerUser = filter;
    }
    
    @QueryParam(value="filter[priority]")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String filter) {
        this.priority = filter;
    }
    
    @QueryParam(value="filter[partial_use]")
    public String getPartialUse() {
        return partialUse;
    }

    public void setPartialUse(String filter) {
        this.partialUse = filter;
    }
    
    @QueryParam(value="filter[code]")
    public String getCode() {
        return code;
    }

    public void setCode(String filter) {
        this.code = filter;
    }
    
    @QueryParam(value="filter[minimum_amount]")
    public String getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(String filter) {
        this.minimumAmount = filter;
    }
    
    @QueryParam(value="filter[minimum_amount_tax]")
    public String getMinimumAmountTax() {
        return minimumAmountTax;
    }

    public void setMinimumAmountTax(String filter) {
        this.minimumAmountTax = filter;
    }
    
    @QueryParam(value="filter[minimum_amount_currency]")
    public String getMinimumAmountCurrency() {
        return minimumAmountCurrency;
    }

    public void setMinimumAmountCurrency(String filter) {
        this.minimumAmountCurrency = filter;
    }
    
    @QueryParam(value="filter[minimum_amount_shipping]")
    public String getMinimumAmountShipping() {
        return minimumAmountShipping;
    }

    public void setMinimumAmountShipping(String filter) {
        this.minimumAmountShipping = filter;
    }
    
    @QueryParam(value="filter[country_restriction]")
    public String getCountryRestriction() {
        return countryRestriction;
    }

    public void setCountryRestriction(String filter) {
        this.countryRestriction = filter;
    }
    
    @QueryParam(value="filter[carrier_restriction]")
    public String getCarrierRestriction() {
        return carrierRestriction;
    }

    public void setCarrierRestriction(String filter) {
        this.carrierRestriction = filter;
    }
    
    @QueryParam(value="filter[group_restriction]")
    public String getGroupRestriction() {
        return groupRestriction;
    }

    public void setGroupRestriction(String filter) {
        this.groupRestriction = filter;
    }
    
    @QueryParam(value="filter[cart_rule_restriction]")
    public String getCartRuleRestriction() {
        return cartRuleRestriction;
    }

    public void setCartRuleRestriction(String filter) {
        this.cartRuleRestriction = filter;
    }
    
    @QueryParam(value="filter[product_restriction]")
    public String getProductRestriction() {
        return productRestriction;
    }

    public void setProductRestriction(String filter) {
        this.productRestriction = filter;
    }
    
    @QueryParam(value="filter[shop_restriction]")
    public String getShopRestriction() {
        return shopRestriction;
    }

    public void setShopRestriction(String filter) {
        this.shopRestriction = filter;
    }
    
    @QueryParam(value="filter[free_shipping]")
    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String filter) {
        this.freeShipping = filter;
    }
    
    @QueryParam(value="filter[reduction_percent]")
    public String getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(String filter) {
        this.reductionPercent = filter;
    }
    
    @QueryParam(value="filter[reduction_amount]")
    public String getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(String filter) {
        this.reductionAmount = filter;
    }
    
    @QueryParam(value="filter[reduction_tax]")
    public String getReductionTax() {
        return reductionTax;
    }

    public void setReductionTax(String filter) {
        this.reductionTax = filter;
    }
    
    @QueryParam(value="filter[reduction_currency]")
    public String getReductionCurrency() {
        return reductionCurrency;
    }

    public void setReductionCurrency(String filter) {
        this.reductionCurrency = filter;
    }
    
    @QueryParam(value="filter[reduction_product]")
    public String getReductionProduct() {
        return reductionProduct;
    }

    public void setReductionProduct(String filter) {
        this.reductionProduct = filter;
    }
    
    @QueryParam(value="filter[gift_product]")
    public String getGiftProduct() {
        return giftProduct;
    }

    public void setGiftProduct(String filter) {
        this.giftProduct = filter;
    }
    
    @QueryParam(value="filter[gift_product_attribute]")
    public String getGiftProductAttribute() {
        return giftProductAttribute;
    }

    public void setGiftProductAttribute(String filter) {
        this.giftProductAttribute = filter;
    }
    
    @QueryParam(value="filter[highlight]")
    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String filter) {
        this.highlight = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
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
