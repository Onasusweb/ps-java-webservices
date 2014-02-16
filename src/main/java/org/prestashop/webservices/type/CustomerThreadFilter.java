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


public class CustomerThreadFilter {
    
    private String id;
    private String idLang;
    private String idShop;
    private String idCustomer;
    private String idOrder;
    private String idProduct;
    private String idContact;
    private String email;
    private String token;
    private String status;
    private String dateAdd;
    private String dateUpd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[id_order]")
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String filter) {
        this.idOrder = filter;
    }
    
    @QueryParam(value="filter[id_product]")
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String filter) {
        this.idProduct = filter;
    }
    
    @QueryParam(value="filter[id_contact]")
    public String getIdContact() {
        return idContact;
    }

    public void setIdContact(String filter) {
        this.idContact = filter;
    }
    
    @QueryParam(value="filter[email]")
    public String getEmail() {
        return email;
    }

    public void setEmail(String filter) {
        this.email = filter;
    }
    
    @QueryParam(value="filter[token]")
    public String getToken() {
        return token;
    }

    public void setToken(String filter) {
        this.token = filter;
    }
    
    @QueryParam(value="filter[status]")
    public String getStatus() {
        return status;
    }

    public void setStatus(String filter) {
        this.status = filter;
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
