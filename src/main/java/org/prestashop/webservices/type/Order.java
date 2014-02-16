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
public class Order implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_address_delivery", required = true)
    protected Long idAddressDelivery;
    
    @XmlElement(name = "id_address_invoice", required = true)
    protected Long idAddressInvoice;
    
    @XmlElement(name = "id_cart", required = true)
    protected Long idCart;
    
    @XmlElement(name = "id_currency", required = true)
    protected Long idCurrency;
    
    @XmlElement(name = "id_lang", required = true)
    protected Long idLang;
    
    @XmlElement(name = "id_customer", required = true)
    protected Long idCustomer;
    
    @XmlElement(name = "id_carrier", required = true)
    protected Long idCarrier;
    
    @XmlElement(name = "current_state", required = false)
    protected Long currentState;
    
    @XmlElement(name = "module", required = true)
    protected String module;
    
    @XmlElement(name = "invoice_number", required = false)
    protected String invoiceNumber;
    
    @XmlElement(name = "invoice_date", required = false)
    protected String invoiceDate;
    
    @XmlElement(name = "delivery_number", required = false)
    protected String deliveryNumber;
    
    @XmlElement(name = "delivery_date", required = false)
    protected String deliveryDate;
    
    @XmlElement(name = "valid", required = false)
    protected String valid;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "id_shop", required = false)
    protected Long idShop;
    
    @XmlElement(name = "secure_key", required = false)
    protected String secureKey;
    
    @XmlElement(name = "payment", required = true)
    protected String payment;
    
    @XmlElement(name = "recyclable", required = false)
    protected Integer recyclable;
    
    @XmlElement(name = "gift", required = false)
    protected Integer gift;
    
    @XmlElement(name = "gift_message", required = false)
    protected String giftMessage;
    
    @XmlElement(name = "mobile_theme", required = false)
    protected Integer mobileTheme;
    
    @XmlElement(name = "total_discounts", required = false)
    protected String totalDiscounts;
    
    @XmlElement(name = "total_discounts_tax_incl", required = false)
    protected String totalDiscountsTaxIncl;
    
    @XmlElement(name = "total_discounts_tax_excl", required = false)
    protected String totalDiscountsTaxExcl;
    
    @XmlElement(name = "total_paid", required = true)
    protected String totalPaid;
    
    @XmlElement(name = "total_paid_tax_incl", required = false)
    protected String totalPaidTaxIncl;
    
    @XmlElement(name = "total_paid_tax_excl", required = false)
    protected String totalPaidTaxExcl;
    
    @XmlElement(name = "total_paid_real", required = true)
    protected String totalPaidReal;
    
    @XmlElement(name = "total_products", required = true)
    protected String totalProducts;
    
    @XmlElement(name = "total_products_wt", required = true)
    protected String totalProductsWt;
    
    @XmlElement(name = "total_shipping", required = false)
    protected String totalShipping;
    
    @XmlElement(name = "total_shipping_tax_incl", required = false)
    protected String totalShippingTaxIncl;
    
    @XmlElement(name = "total_shipping_tax_excl", required = false)
    protected String totalShippingTaxExcl;
    
    @XmlElement(name = "carrier_tax_rate", required = false)
    protected BigDecimal carrierTaxRate;
    
    @XmlElement(name = "total_wrapping", required = false)
    protected String totalWrapping;
    
    @XmlElement(name = "total_wrapping_tax_incl", required = false)
    protected String totalWrappingTaxIncl;
    
    @XmlElement(name = "total_wrapping_tax_excl", required = false)
    protected String totalWrappingTaxExcl;
    
    @XmlElement(name = "shipping_number", required = false)
    protected String shippingNumber;
    
    @XmlElement(name = "conversion_rate", required = true)
    protected BigDecimal conversionRate;
    
    @XmlElement(name = "reference", required = false)
    protected String reference;
    
    @XmlElement(name = "associations", required = false)
    protected OrderAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdAddressDelivery() {
        return idAddressDelivery;
    }
    
    public void setIdAddressDelivery(Long idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }
    
    public Long getIdAddressInvoice() {
        return idAddressInvoice;
    }
    
    public void setIdAddressInvoice(Long idAddressInvoice) {
        this.idAddressInvoice = idAddressInvoice;
    }
    
    public Long getIdCart() {
        return idCart;
    }
    
    public void setIdCart(Long idCart) {
        this.idCart = idCart;
    }
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Long getIdLang() {
        return idLang;
    }
    
    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }
    
    public Long getIdCustomer() {
        return idCustomer;
    }
    
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public Long getIdCarrier() {
        return idCarrier;
    }
    
    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
    }
    
    public Long getCurrentState() {
        return currentState;
    }
    
    public void setCurrentState(Long currentState) {
        this.currentState = currentState;
    }
    
    public String getModule() {
        return module;
    }
    
    public void setModule(String module) {
        this.module = module;
    }
    
    public String getInvoiceNumber() {
        return invoiceNumber;
    }
    
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
    
    public String getInvoiceDate() {
        return invoiceDate;
    }
    
    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    public String getDeliveryNumber() {
        return deliveryNumber;
    }
    
    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
    
    public String getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public String getValid() {
        return valid;
    }
    
    public void setValid(String valid) {
        this.valid = valid;
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
    
    public Long getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public String getSecureKey() {
        return secureKey;
    }
    
    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }
    
    public String getPayment() {
        return payment;
    }
    
    public void setPayment(String payment) {
        this.payment = payment;
    }
    
    public Integer getRecyclable() {
        return recyclable;
    }
    
    public void setRecyclable(Integer recyclable) {
        this.recyclable = recyclable;
    }
    
    public Integer getGift() {
        return gift;
    }
    
    public void setGift(Integer gift) {
        this.gift = gift;
    }
    
    public String getGiftMessage() {
        return giftMessage;
    }
    
    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }
    
    public Integer getMobileTheme() {
        return mobileTheme;
    }
    
    public void setMobileTheme(Integer mobileTheme) {
        this.mobileTheme = mobileTheme;
    }
    
    public String getTotalDiscounts() {
        return totalDiscounts;
    }
    
    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }
    
    public String getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }
    
    public void setTotalDiscountsTaxIncl(String totalDiscountsTaxIncl) {
        this.totalDiscountsTaxIncl = totalDiscountsTaxIncl;
    }
    
    public String getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }
    
    public void setTotalDiscountsTaxExcl(String totalDiscountsTaxExcl) {
        this.totalDiscountsTaxExcl = totalDiscountsTaxExcl;
    }
    
    public String getTotalPaid() {
        return totalPaid;
    }
    
    public void setTotalPaid(String totalPaid) {
        this.totalPaid = totalPaid;
    }
    
    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }
    
    public void setTotalPaidTaxIncl(String totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }
    
    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }
    
    public void setTotalPaidTaxExcl(String totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }
    
    public String getTotalPaidReal() {
        return totalPaidReal;
    }
    
    public void setTotalPaidReal(String totalPaidReal) {
        this.totalPaidReal = totalPaidReal;
    }
    
    public String getTotalProducts() {
        return totalProducts;
    }
    
    public void setTotalProducts(String totalProducts) {
        this.totalProducts = totalProducts;
    }
    
    public String getTotalProductsWt() {
        return totalProductsWt;
    }
    
    public void setTotalProductsWt(String totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }
    
    public String getTotalShipping() {
        return totalShipping;
    }
    
    public void setTotalShipping(String totalShipping) {
        this.totalShipping = totalShipping;
    }
    
    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }
    
    public void setTotalShippingTaxIncl(String totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }
    
    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }
    
    public void setTotalShippingTaxExcl(String totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }
    
    public BigDecimal getCarrierTaxRate() {
        return carrierTaxRate;
    }
    
    public void setCarrierTaxRate(BigDecimal carrierTaxRate) {
        this.carrierTaxRate = carrierTaxRate;
    }
    
    public String getTotalWrapping() {
        return totalWrapping;
    }
    
    public void setTotalWrapping(String totalWrapping) {
        this.totalWrapping = totalWrapping;
    }
    
    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }
    
    public void setTotalWrappingTaxIncl(String totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }
    
    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }
    
    public void setTotalWrappingTaxExcl(String totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }
    
    public String getShippingNumber() {
        return shippingNumber;
    }
    
    public void setShippingNumber(String shippingNumber) {
        this.shippingNumber = shippingNumber;
    }
    
    public BigDecimal getConversionRate() {
        return conversionRate;
    }
    
    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public OrderAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(OrderAssociations associations) {
        this.associations = associations;
    }
    
}
