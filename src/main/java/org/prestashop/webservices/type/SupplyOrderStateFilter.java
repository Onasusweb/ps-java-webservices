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


public class SupplyOrderStateFilter {
    
    private String id;
    private String deliveryNote;
    private String editable;
    private String receiptState;
    private String pendingReceipt;
    private String enclosed;
    private String color;
    private String name;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[delivery_note]")
    public String getDeliveryNote() {
        return deliveryNote;
    }

    public void setDeliveryNote(String filter) {
        this.deliveryNote = filter;
    }
    
    @QueryParam(value="filter[editable]")
    public String getEditable() {
        return editable;
    }

    public void setEditable(String filter) {
        this.editable = filter;
    }
    
    @QueryParam(value="filter[receipt_state]")
    public String getReceiptState() {
        return receiptState;
    }

    public void setReceiptState(String filter) {
        this.receiptState = filter;
    }
    
    @QueryParam(value="filter[pending_receipt]")
    public String getPendingReceipt() {
        return pendingReceipt;
    }

    public void setPendingReceipt(String filter) {
        this.pendingReceipt = filter;
    }
    
    @QueryParam(value="filter[enclosed]")
    public String getEnclosed() {
        return enclosed;
    }

    public void setEnclosed(String filter) {
        this.enclosed = filter;
    }
    
    @QueryParam(value="filter[color]")
    public String getColor() {
        return color;
    }

    public void setColor(String filter) {
        this.color = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
}
