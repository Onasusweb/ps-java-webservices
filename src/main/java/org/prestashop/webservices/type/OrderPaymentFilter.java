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


public class OrderPaymentFilter {
    
    private String id;
    private String orderReference;
    private String idCurrency;
    private String amount;
    private String paymentMethod;
    private String conversionRate;
    private String transactionId;
    private String cardNumber;
    private String cardBrand;
    private String cardExpiration;
    private String cardHolder;
    private String dateAdd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[order_reference]")
    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String filter) {
        this.orderReference = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[amount]")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String filter) {
        this.amount = filter;
    }
    
    @QueryParam(value="filter[payment_method]")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String filter) {
        this.paymentMethod = filter;
    }
    
    @QueryParam(value="filter[conversion_rate]")
    public String getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(String filter) {
        this.conversionRate = filter;
    }
    
    @QueryParam(value="filter[transaction_id]")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String filter) {
        this.transactionId = filter;
    }
    
    @QueryParam(value="filter[card_number]")
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String filter) {
        this.cardNumber = filter;
    }
    
    @QueryParam(value="filter[card_brand]")
    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(String filter) {
        this.cardBrand = filter;
    }
    
    @QueryParam(value="filter[card_expiration]")
    public String getCardExpiration() {
        return cardExpiration;
    }

    public void setCardExpiration(String filter) {
        this.cardExpiration = filter;
    }
    
    @QueryParam(value="filter[card_holder]")
    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String filter) {
        this.cardHolder = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
}
