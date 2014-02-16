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


public class CustomerFilter {
    
    private String id;
    private String idDefaultGroup;
    private String idLang;
    private String newsletterDateAdd;
    private String ipRegistrationNewsletter;
    private String lastPasswdGen;
    private String secureKey;
    private String deleted;
    private String passwd;
    private String lastname;
    private String firstname;
    private String email;
    private String idGender;
    private String birthday;
    private String newsletter;
    private String optin;
    private String website;
    private String company;
    private String siret;
    private String ape;
    private String outstandingAllowAmount;
    private String showPublicPrices;
    private String idRisk;
    private String maxPaymentDays;
    private String active;
    private String note;
    private String isGuest;
    private String idShop;
    private String idShopGroup;
    private String dateAdd;
    private String dateUpd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_default_group]")
    public String getIdDefaultGroup() {
        return idDefaultGroup;
    }

    public void setIdDefaultGroup(String filter) {
        this.idDefaultGroup = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
    }
    
    @QueryParam(value="filter[newsletter_date_add]")
    public String getNewsletterDateAdd() {
        return newsletterDateAdd;
    }

    public void setNewsletterDateAdd(String filter) {
        this.newsletterDateAdd = filter;
    }
    
    @QueryParam(value="filter[ip_registration_newsletter]")
    public String getIpRegistrationNewsletter() {
        return ipRegistrationNewsletter;
    }

    public void setIpRegistrationNewsletter(String filter) {
        this.ipRegistrationNewsletter = filter;
    }
    
    @QueryParam(value="filter[last_passwd_gen]")
    public String getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(String filter) {
        this.lastPasswdGen = filter;
    }
    
    @QueryParam(value="filter[secure_key]")
    public String getSecureKey() {
        return secureKey;
    }

    public void setSecureKey(String filter) {
        this.secureKey = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[passwd]")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String filter) {
        this.passwd = filter;
    }
    
    @QueryParam(value="filter[lastname]")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String filter) {
        this.lastname = filter;
    }
    
    @QueryParam(value="filter[firstname]")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String filter) {
        this.firstname = filter;
    }
    
    @QueryParam(value="filter[email]")
    public String getEmail() {
        return email;
    }

    public void setEmail(String filter) {
        this.email = filter;
    }
    
    @QueryParam(value="filter[id_gender]")
    public String getIdGender() {
        return idGender;
    }

    public void setIdGender(String filter) {
        this.idGender = filter;
    }
    
    @QueryParam(value="filter[birthday]")
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String filter) {
        this.birthday = filter;
    }
    
    @QueryParam(value="filter[newsletter]")
    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String filter) {
        this.newsletter = filter;
    }
    
    @QueryParam(value="filter[optin]")
    public String getOptin() {
        return optin;
    }

    public void setOptin(String filter) {
        this.optin = filter;
    }
    
    @QueryParam(value="filter[website]")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String filter) {
        this.website = filter;
    }
    
    @QueryParam(value="filter[company]")
    public String getCompany() {
        return company;
    }

    public void setCompany(String filter) {
        this.company = filter;
    }
    
    @QueryParam(value="filter[siret]")
    public String getSiret() {
        return siret;
    }

    public void setSiret(String filter) {
        this.siret = filter;
    }
    
    @QueryParam(value="filter[ape]")
    public String getApe() {
        return ape;
    }

    public void setApe(String filter) {
        this.ape = filter;
    }
    
    @QueryParam(value="filter[outstanding_allow_amount]")
    public String getOutstandingAllowAmount() {
        return outstandingAllowAmount;
    }

    public void setOutstandingAllowAmount(String filter) {
        this.outstandingAllowAmount = filter;
    }
    
    @QueryParam(value="filter[show_public_prices]")
    public String getShowPublicPrices() {
        return showPublicPrices;
    }

    public void setShowPublicPrices(String filter) {
        this.showPublicPrices = filter;
    }
    
    @QueryParam(value="filter[id_risk]")
    public String getIdRisk() {
        return idRisk;
    }

    public void setIdRisk(String filter) {
        this.idRisk = filter;
    }
    
    @QueryParam(value="filter[max_payment_days]")
    public String getMaxPaymentDays() {
        return maxPaymentDays;
    }

    public void setMaxPaymentDays(String filter) {
        this.maxPaymentDays = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[note]")
    public String getNote() {
        return note;
    }

    public void setNote(String filter) {
        this.note = filter;
    }
    
    @QueryParam(value="filter[is_guest]")
    public String getIsGuest() {
        return isGuest;
    }

    public void setIsGuest(String filter) {
        this.isGuest = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[id_shop_group]")
    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String filter) {
        this.idShopGroup = filter;
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
