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
public class Customer implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_default_group", required = false)
    protected String idDefaultGroup;
    
    @XmlElement(name = "id_lang", required = false)
    protected Long idLang;
    
    @XmlElement(name = "newsletter_date_add", required = false)
    protected String newsletterDateAdd;
    
    @XmlElement(name = "ip_registration_newsletter", required = false)
    protected String ipRegistrationNewsletter;
    
    @XmlElement(name = "last_passwd_gen", required = false)
    protected String lastPasswdGen;
    
    @XmlElement(name = "secure_key", required = false)
    protected String secureKey;
    
    @XmlElement(name = "deleted", required = false)
    protected Integer deleted;
    
    @XmlElement(name = "passwd", required = true)
    protected String passwd;
    
    @XmlElement(name = "lastname", required = true)
    protected String lastname;
    
    @XmlElement(name = "firstname", required = true)
    protected String firstname;
    
    @XmlElement(name = "email", required = true)
    protected String email;
    
    @XmlElement(name = "id_gender", required = false)
    protected Long idGender;
    
    @XmlElement(name = "birthday", required = false)
    protected String birthday;
    
    @XmlElement(name = "newsletter", required = false)
    protected Integer newsletter;
    
    @XmlElement(name = "optin", required = false)
    protected Integer optin;
    
    @XmlElement(name = "website", required = false)
    protected String website;
    
    @XmlElement(name = "company", required = false)
    protected String company;
    
    @XmlElement(name = "siret", required = false)
    protected String siret;
    
    @XmlElement(name = "ape", required = false)
    protected String ape;
    
    @XmlElement(name = "outstanding_allow_amount", required = false)
    protected BigDecimal outstandingAllowAmount;
    
    @XmlElement(name = "show_public_prices", required = false)
    protected Integer showPublicPrices;
    
    @XmlElement(name = "id_risk", required = false)
    protected Integer idRisk;
    
    @XmlElement(name = "max_payment_days", required = false)
    protected Integer maxPaymentDays;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    @XmlElement(name = "note", required = false)
    protected String note;
    
    @XmlElement(name = "is_guest", required = false)
    protected Integer isGuest;
    
    @XmlElement(name = "id_shop", required = false)
    protected Long idShop;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "associations", required = false)
    protected CustomerAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getIdDefaultGroup() {
        return idDefaultGroup;
    }
    
    public void setIdDefaultGroup(String idDefaultGroup) {
        this.idDefaultGroup = idDefaultGroup;
    }
    
    public Long getIdLang() {
        return idLang;
    }
    
    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }
    
    public String getNewsletterDateAdd() {
        return newsletterDateAdd;
    }
    
    public void setNewsletterDateAdd(String newsletterDateAdd) {
        this.newsletterDateAdd = newsletterDateAdd;
    }
    
    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }
    
    public void setIpRegistrationNewsletter(String ipRegistrationNewsletter) {
        this.ipRegistrationNewsletter = ipRegistrationNewsletter;
    }
    
    public String getLastPasswdGen() {
        return lastPasswdGen;
    }
    
    public void setLastPasswdGen(String lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }
    
    public String getSecureKey() {
        return secureKey;
    }
    
    public void setSecureKey(String secureKey) {
        this.secureKey = secureKey;
    }
    
    public Integer getDeleted() {
        return deleted;
    }
    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    
    public String getPasswd() {
        return passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Long getIdGender() {
        return idGender;
    }
    
    public void setIdGender(Long idGender) {
        this.idGender = idGender;
    }
    
    public String getBirthday() {
        return birthday;
    }
    
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    public Integer getNewsletter() {
        return newsletter;
    }
    
    public void setNewsletter(Integer newsletter) {
        this.newsletter = newsletter;
    }
    
    public Integer getOptin() {
        return optin;
    }
    
    public void setOptin(Integer optin) {
        this.optin = optin;
    }
    
    public String getWebsite() {
        return website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getSiret() {
        return siret;
    }
    
    public void setSiret(String siret) {
        this.siret = siret;
    }
    
    public String getApe() {
        return ape;
    }
    
    public void setApe(String ape) {
        this.ape = ape;
    }
    
    public BigDecimal getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }
    
    public void setOutstandingAllowAmount(BigDecimal outstandingAllowAmount) {
        this.outstandingAllowAmount = outstandingAllowAmount;
    }
    
    public Integer getShowPublicPrices() {
        return showPublicPrices;
    }
    
    public void setShowPublicPrices(Integer showPublicPrices) {
        this.showPublicPrices = showPublicPrices;
    }
    
    public Integer getIdRisk() {
        return idRisk;
    }
    
    public void setIdRisk(Integer idRisk) {
        this.idRisk = idRisk;
    }
    
    public Integer getMaxPaymentDays() {
        return maxPaymentDays;
    }
    
    public void setMaxPaymentDays(Integer maxPaymentDays) {
        this.maxPaymentDays = maxPaymentDays;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public Integer getIsGuest() {
        return isGuest;
    }
    
    public void setIsGuest(Integer isGuest) {
        this.isGuest = isGuest;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public Long getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
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
    
    public CustomerAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(CustomerAssociations associations) {
        this.associations = associations;
    }
    
}
