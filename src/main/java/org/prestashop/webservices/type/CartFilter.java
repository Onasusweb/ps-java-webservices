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


public class CartFilter {
    
    private String id;
    private String idAddressDelivery;
    private String idAddressInvoice;
    private String idCurrency;
    private String idCustomer;
    private String idGuest;
    private String idLang;
    private String idShopGroup;
    private String idShop;
    private String idCarrier;
    private String recyclable;
    private String gift;
    private String giftMessage;
    private String mobileTheme;
    private String deliveryOption;
    private String secureKey;
    private String allowSeperatedPackage;
    private String dateAdd;
    private String dateUpd;
    
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
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[id_guest]")
    public String getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(String filter) {
        this.idGuest = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
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
    
    @QueryParam(value="filter[id_carrier]")
    public String getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(String filter) {
        this.idCarrier = filter;
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
    
    @QueryParam(value="filter[delivery_option]")
    public String getDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(String filter) {
        this.deliveryOption = filter;
    }
    
    @QueryParam(value="filter[secure_key]")
    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String filter) {
        this.secureKey = filter;
    }
    
    @QueryParam(value="filter[allow_seperated_package]")
    public String getAllowSeperatedPackage() {
        return allowSeperatedPackage;
    }

    public void setAllowSeperatedPackage(String filter) {
        this.allowSeperatedPackage = filter;
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
