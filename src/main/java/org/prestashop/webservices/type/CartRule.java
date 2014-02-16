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

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
public class CartRule implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_customer", required = false)
    protected Long idCustomer;
    
    @XmlElement(name = "date_from", required = true)
    protected String dateFrom;
    
    @XmlElement(name = "date_to", required = true)
    protected String dateTo;
    
    @XmlElement(name = "description", required = false)
    protected String description;
    
    @XmlElement(name = "quantity", required = false)
    protected Integer quantity;
    
    @XmlElement(name = "quantity_per_user", required = false)
    protected Integer quantityPerUser;
    
    @XmlElement(name = "priority", required = false)
    protected Integer priority;
    
    @XmlElement(name = "partial_use", required = false)
    protected Integer partialUse;
    
    @XmlElement(name = "code", required = false)
    protected String code;
    
    @XmlElement(name = "minimum_amount", required = false)
    protected BigDecimal minimumAmount;
    
    @XmlElement(name = "minimum_amount_tax", required = false)
    protected Integer minimumAmountTax;
    
    @XmlElement(name = "minimum_amount_currency", required = false)
    protected Integer minimumAmountCurrency;
    
    @XmlElement(name = "minimum_amount_shipping", required = false)
    protected Integer minimumAmountShipping;
    
    @XmlElement(name = "country_restriction", required = false)
    protected Integer countryRestriction;
    
    @XmlElement(name = "carrier_restriction", required = false)
    protected Integer carrierRestriction;
    
    @XmlElement(name = "group_restriction", required = false)
    protected Integer groupRestriction;
    
    @XmlElement(name = "cart_rule_restriction", required = false)
    protected Integer cartRuleRestriction;
    
    @XmlElement(name = "product_restriction", required = false)
    protected Integer productRestriction;
    
    @XmlElement(name = "shop_restriction", required = false)
    protected Integer shopRestriction;
    
    @XmlElement(name = "free_shipping", required = false)
    protected Integer freeShipping;
    
    @XmlElement(name = "reduction_percent", required = false)
    protected String reductionPercent;
    
    @XmlElement(name = "reduction_amount", required = false)
    protected BigDecimal reductionAmount;
    
    @XmlElement(name = "reduction_tax", required = false)
    protected Integer reductionTax;
    
    @XmlElement(name = "reduction_currency", required = false)
    protected Long reductionCurrency;
    
    @XmlElement(name = "reduction_product", required = false)
    protected Integer reductionProduct;
    
    @XmlElement(name = "gift_product", required = false)
    protected Long giftProduct;
    
    @XmlElement(name = "gift_product_attribute", required = false)
    protected Long giftProductAttribute;
    
    @XmlElement(name = "highlight", required = false)
    protected Integer highlight;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdCustomer() {
        return idCustomer;
    }
    
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public String getDateFrom() {
        return dateFrom;
    }
    
    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }
    
    public String getDateTo() {
        return dateTo;
    }
    
    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Integer getQuantityPerUser() {
        return quantityPerUser;
    }
    
    public void setQuantityPerUser(Integer quantityPerUser) {
        this.quantityPerUser = quantityPerUser;
    }
    
    public Integer getPriority() {
        return priority;
    }
    
    public void setPriority(Integer priority) {
        this.priority = priority;
    }
    
    public Integer getPartialUse() {
        return partialUse;
    }
    
    public void setPartialUse(Integer partialUse) {
        this.partialUse = partialUse;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public BigDecimal getMinimumAmount() {
        return minimumAmount;
    }
    
    public void setMinimumAmount(BigDecimal minimumAmount) {
        this.minimumAmount = minimumAmount;
    }
    
    public Integer getMinimumAmountTax() {
        return minimumAmountTax;
    }
    
    public void setMinimumAmountTax(Integer minimumAmountTax) {
        this.minimumAmountTax = minimumAmountTax;
    }
    
    public Integer getMinimumAmountCurrency() {
        return minimumAmountCurrency;
    }
    
    public void setMinimumAmountCurrency(Integer minimumAmountCurrency) {
        this.minimumAmountCurrency = minimumAmountCurrency;
    }
    
    public Integer getMinimumAmountShipping() {
        return minimumAmountShipping;
    }
    
    public void setMinimumAmountShipping(Integer minimumAmountShipping) {
        this.minimumAmountShipping = minimumAmountShipping;
    }
    
    public Integer getCountryRestriction() {
        return countryRestriction;
    }
    
    public void setCountryRestriction(Integer countryRestriction) {
        this.countryRestriction = countryRestriction;
    }
    
    public Integer getCarrierRestriction() {
        return carrierRestriction;
    }
    
    public void setCarrierRestriction(Integer carrierRestriction) {
        this.carrierRestriction = carrierRestriction;
    }
    
    public Integer getGroupRestriction() {
        return groupRestriction;
    }
    
    public void setGroupRestriction(Integer groupRestriction) {
        this.groupRestriction = groupRestriction;
    }
    
    public Integer getCartRuleRestriction() {
        return cartRuleRestriction;
    }
    
    public void setCartRuleRestriction(Integer cartRuleRestriction) {
        this.cartRuleRestriction = cartRuleRestriction;
    }
    
    public Integer getProductRestriction() {
        return productRestriction;
    }
    
    public void setProductRestriction(Integer productRestriction) {
        this.productRestriction = productRestriction;
    }
    
    public Integer getShopRestriction() {
        return shopRestriction;
    }
    
    public void setShopRestriction(Integer shopRestriction) {
        this.shopRestriction = shopRestriction;
    }
    
    public Integer getFreeShipping() {
        return freeShipping;
    }
    
    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }
    
    public String getReductionPercent() {
        return reductionPercent;
    }
    
    public void setReductionPercent(String reductionPercent) {
        this.reductionPercent = reductionPercent;
    }
    
    public BigDecimal getReductionAmount() {
        return reductionAmount;
    }
    
    public void setReductionAmount(BigDecimal reductionAmount) {
        this.reductionAmount = reductionAmount;
    }
    
    public Integer getReductionTax() {
        return reductionTax;
    }
    
    public void setReductionTax(Integer reductionTax) {
        this.reductionTax = reductionTax;
    }
    
    public Long getReductionCurrency() {
        return reductionCurrency;
    }
    
    public void setReductionCurrency(Long reductionCurrency) {
        this.reductionCurrency = reductionCurrency;
    }
    
    public Integer getReductionProduct() {
        return reductionProduct;
    }
    
    public void setReductionProduct(Integer reductionProduct) {
        this.reductionProduct = reductionProduct;
    }
    
    public Long getGiftProduct() {
        return giftProduct;
    }
    
    public void setGiftProduct(Long giftProduct) {
        this.giftProduct = giftProduct;
    }
    
    public Long getGiftProductAttribute() {
        return giftProductAttribute;
    }
    
    public void setGiftProductAttribute(Long giftProductAttribute) {
        this.giftProductAttribute = giftProductAttribute;
    }
    
    public Integer getHighlight() {
        return highlight;
    }
    
    public void setHighlight(Integer highlight) {
        this.highlight = highlight;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public String getDateUpd() {
        return dateUpd;
    }
    
    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
