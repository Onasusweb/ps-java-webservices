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
public class Cart implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_address_delivery", required = false)
    protected Long idAddressDelivery;
    
    @XmlElement(name = "id_address_invoice", required = false)
    protected Long idAddressInvoice;
    
    @XmlElement(name = "id_currency", required = true)
    protected Long idCurrency;
    
    @XmlElement(name = "id_customer", required = false)
    protected Long idCustomer;
    
    @XmlElement(name = "id_guest", required = false)
    protected Long idGuest;
    
    @XmlElement(name = "id_lang", required = true)
    protected Long idLang;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "id_shop", required = false)
    protected Long idShop;
    
    @XmlElement(name = "id_carrier", required = false)
    protected Long idCarrier;
    
    @XmlElement(name = "recyclable", required = false)
    protected Integer recyclable;
    
    @XmlElement(name = "gift", required = false)
    protected Integer gift;
    
    @XmlElement(name = "gift_message", required = false)
    protected String giftMessage;
    
    @XmlElement(name = "mobile_theme", required = false)
    protected Integer mobileTheme;
    
    @XmlElement(name = "delivery_option", required = false)
    protected String deliveryOption;
    
    @XmlElement(name = "secure_key", required = false)
    protected String secureKey;
    
    @XmlElement(name = "allow_seperated_package", required = false)
    protected Integer allowSeperatedPackage;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "associations", required = false)
    protected CartAssociations associations;
    
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
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Long getIdCustomer() {
        return idCustomer;
    }
    
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public Long getIdGuest() {
        return idGuest;
    }
    
    public void setIdGuest(Long idGuest) {
        this.idGuest = idGuest;
    }
    
    public Long getIdLang() {
        return idLang;
    }
    
    public void setIdLang(Long idLang) {
        this.idLang = idLang;
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
    
    public Long getIdCarrier() {
        return idCarrier;
    }
    
    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
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
    
    public String getDeliveryOption() {
        return deliveryOption;
    }
    
    public void setDeliveryOption(String deliveryOption) {
        this.deliveryOption = deliveryOption;
    }
    
    public String getSecureKey() {
        return secureKey;
    }
    
    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }
    
    public Integer getAllowSeperatedPackage() {
        return allowSeperatedPackage;
    }
    
    public void setAllowSeperatedPackage(Integer allowSeperatedPackage) {
        this.allowSeperatedPackage = allowSeperatedPackage;
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
    
    public CartAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(CartAssociations associations) {
        this.associations = associations;
    }
    
}
