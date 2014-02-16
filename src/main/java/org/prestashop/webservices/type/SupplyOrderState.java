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
public class SupplyOrderState implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "delivery_note", required = false)
    protected Integer deliveryNote;
    
    @XmlElement(name = "editable", required = false)
    protected Integer editable;
    
    @XmlElement(name = "receipt_state", required = false)
    protected Integer receiptState;
    
    @XmlElement(name = "pending_receipt", required = false)
    protected Integer pendingReceipt;
    
    @XmlElement(name = "enclosed", required = false)
    protected Integer enclosed;
    
    @XmlElement(name = "color", required = false)
    protected String color;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getDeliveryNote() {
        return deliveryNote;
    }
    
    public void setDeliveryNote(Integer deliveryNote) {
        this.deliveryNote = deliveryNote;
    }
    
    public Integer getEditable() {
        return editable;
    }
    
    public void setEditable(Integer editable) {
        this.editable = editable;
    }
    
    public Integer getReceiptState() {
        return receiptState;
    }
    
    public void setReceiptState(Integer receiptState) {
        this.receiptState = receiptState;
    }
    
    public Integer getPendingReceipt() {
        return pendingReceipt;
    }
    
    public void setPendingReceipt(Integer pendingReceipt) {
        this.pendingReceipt = pendingReceipt;
    }
    
    public Integer getEnclosed() {
        return enclosed;
    }
    
    public void setEnclosed(Integer enclosed) {
        this.enclosed = enclosed;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
