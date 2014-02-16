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


public class OrderFilter {
    
    private String id;
    private String idAddressDelivery;
    private String idAddressInvoice;
    private String idCart;
    private String idCurrency;
    private String idLang;
    private String idCustomer;
    private String idCarrier;
    private String currentState;
    private String module;
    private String invoiceNumber;
    private String invoiceDate;
    private String deliveryNumber;
    private String deliveryDate;
    private String valid;
    private String dateAdd;
    private String dateUpd;
    private String idShopGroup;
    private String idShop;
    private String secureKey;
    private String payment;
    private String recyclable;
    private String gift;
    private String giftMessage;
    private String mobileTheme;
    private String totalDiscounts;
    private String totalDiscountsTaxIncl;
    private String totalDiscountsTaxExcl;
    private String totalPaid;
    private String totalPaidTaxIncl;
    private String totalPaidTaxExcl;
    private String totalPaidReal;
    private String totalProducts;
    private String totalProductsWt;
    private String totalShipping;
    private String totalShippingTaxIncl;
    private String totalShippingTaxExcl;
    private String carrierTaxRate;
    private String totalWrapping;
    private String totalWrappingTaxIncl;
    private String totalWrappingTaxExcl;
    private String shippingNumber;
    private String conversionRate;
    private String reference;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_address_delivery]")
    public String getIdAddressDelivery() {
        return idAddressDelivery;
    }

    public void setIdAddressDelivery(String filter) {
        this.idAddressDelivery = filter;
    }
    
    @QueryParam(value="filter[id_address_invoice]")
    public String getIdAddressInvoice() {
        return idAddressInvoice;
    }

    public void setIdAddressInvoice(String filter) {
        this.idAddressInvoice = filter;
    }
    
    @QueryParam(value="filter[id_cart]")
    public String getIdCart() {
        return idCart;
    }

    public void setIdCart(String filter) {
        this.idCart = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
    }
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[id_carrier]")
    public String getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(String filter) {
        this.idCarrier = filter;
    }
    
    @QueryParam(value="filter[current_state]")
    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String filter) {
        this.currentState = filter;
    }
    
    @QueryParam(value="filter[module]")
    public String getModule() {
        return module;
    }

    public void setModule(String filter) {
        this.module = filter;
    }
    
    @QueryParam(value="filter[invoice_number]")
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String filter) {
        this.invoiceNumber = filter;
    }
    
    @QueryParam(value="filter[invoice_date]")
    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String filter) {
        this.invoiceDate = filter;
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
    
    @QueryParam(value="filter[valid]")
    public String getValid() {
        return valid;
    }

    public void setValid(String filter) {
        this.valid = filter;
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
    
    @QueryParam(value="filter[id_shop_group]")
    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String filter) {
        this.idShopGroup = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[secure_key]")
    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String filter) {
        this.secureKey = filter;
    }
    
    @QueryParam(value="filter[payment]")
    public String getPayment() {
        return payment;
    }

    public void setPayment(String filter) {
        this.payment = filter;
    }
    
    @QueryParam(value="filter[recyclable]")
    public String getRecyclable() {
        return recyclable;
    }

    public void setRecyclable(String filter) {
        this.recyclable = filter;
    }
    
    @QueryParam(value="filter[gift]")
    public String getGift() {
        return gift;
    }

    public void setGift(String filter) {
        this.gift = filter;
    }
    
    @QueryParam(value="filter[gift_message]")
    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String filter) {
        this.giftMessage = filter;
    }
    
    @QueryParam(value="filter[mobile_theme]")
    public String getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(String filter) {
        this.mobileTheme = filter;
    }
    
    @QueryParam(value="filter[total_discounts]")
    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(String filter) {
        this.totalDiscounts = filter;
    }
    
    @QueryParam(value="filter[total_discounts_tax_incl]")
    public String getTotalDiscountsTaxIncl() {
        return totalDiscountsTaxIncl;
    }

    public void setTotalDiscountsTaxIncl(String filter) {
        this.totalDiscountsTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_discounts_tax_excl]")
    public String getTotalDiscountsTaxExcl() {
        return totalDiscountsTaxExcl;
    }

    public void setTotalDiscountsTaxExcl(String filter) {
        this.totalDiscountsTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_paid]")
    public String getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(String filter) {
        this.totalPaid = filter;
    }
    
    @QueryParam(value="filter[total_paid_tax_incl]")
    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }

    public void setTotalPaidTaxIncl(String filter) {
        this.totalPaidTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_paid_tax_excl]")
    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }

    public void setTotalPaidTaxExcl(String filter) {
        this.totalPaidTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_paid_real]")
    public String getTotalPaidReal() {
        return totalPaidReal;
    }

    public void setTotalPaidReal(String filter) {
        this.totalPaidReal = filter;
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
    
    @QueryParam(value="filter[total_shipping]")
    public String getTotalShipping() {
        return totalShipping;
    }

    public void setTotalShipping(String filter) {
        this.totalShipping = filter;
    }
    
    @QueryParam(value="filter[total_shipping_tax_incl]")
    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }

    public void setTotalShippingTaxIncl(String filter) {
        this.totalShippingTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_shipping_tax_excl]")
    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }

    public void setTotalShippingTaxExcl(String filter) {
        this.totalShippingTaxExcl = filter;
    }
    
    @QueryParam(value="filter[carrier_tax_rate]")
    public String getCarrierTaxRate() {
        return carrierTaxRate;
    }

    public void setCarrierTaxRate(String filter) {
        this.carrierTaxRate = filter;
    }
    
    @QueryParam(value="filter[total_wrapping]")
    public String getTotalWrapping() {
        return totalWrapping;
    }

    public void setTotalWrapping(String filter) {
        this.totalWrapping = filter;
    }
    
    @QueryParam(value="filter[total_wrapping_tax_incl]")
    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }

    public void setTotalWrappingTaxIncl(String filter) {
        this.totalWrappingTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_wrapping_tax_excl]")
    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }

    public void setTotalWrappingTaxExcl(String filter) {
        this.totalWrappingTaxExcl = filter;
    }
    
    @QueryParam(value="filter[shipping_number]")
    public String getShippingNumber() {
        return shippingNumber;
    }

    public void setShippingNumber(String filter) {
        this.shippingNumber = filter;
    }
    
    @QueryParam(value="filter[conversion_rate]")
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String filter) {
        this.conversionRate = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
}
