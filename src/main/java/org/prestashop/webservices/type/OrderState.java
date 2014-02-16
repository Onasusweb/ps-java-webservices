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
public class OrderState implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "unremovable", required = false)
    protected Integer unremovable;
    
    @XmlElement(name = "delivery", required = false)
    protected Integer delivery;
    
    @XmlElement(name = "hidden", required = false)
    protected Integer hidden;
    
    @XmlElement(name = "send_email", required = false)
    protected Integer sendEmail;
    
    @XmlElement(name = "module_name", required = false)
    protected String moduleName;
    
    @XmlElement(name = "invoice", required = false)
    protected Integer invoice;
    
    @XmlElement(name = "color", required = false)
    protected String color;
    
    @XmlElement(name = "logable", required = false)
    protected Integer logable;
    
    @XmlElement(name = "shipped", required = false)
    protected Integer shipped;
    
    @XmlElement(name = "paid", required = false)
    protected Integer paid;
    
    @XmlElement(name = "deleted", required = false)
    protected String deleted;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "template", required = false)
    protected String template;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getUnremovable() {
        return unremovable;
    }
    
    public void setUnremovable(Integer unremovable) {
        this.unremovable = unremovable;
    }
    
    public Integer getDelivery() {
        return delivery;
    }
    
    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }
    
    public Integer getHidden() {
        return hidden;
    }
    
    public void setHidden(Integer hidden) {
        this.hidden = hidden;
    }
    
    public Integer getSendEmail() {
        return sendEmail;
    }
    
    public void setSendEmail(Integer sendEmail) {
        this.sendEmail = sendEmail;
    }
    
    public String getModuleName() {
        return moduleName;
    }
    
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    
    public Integer getInvoice() {
        return invoice;
    }
    
    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public Integer getLogable() {
        return logable;
    }
    
    public void setLogable(Integer logable) {
        this.logable = logable;
    }
    
    public Integer getShipped() {
        return shipped;
    }
    
    public void setShipped(Integer shipped) {
        this.shipped = shipped;
    }
    
    public Integer getPaid() {
        return paid;
    }
    
    public void setPaid(Integer paid) {
        this.paid = paid;
    }
    
    public String getDeleted() {
        return deleted;
    }
    
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTemplate() {
        return template;
    }
    
    public void setTemplate(String template) {
        this.template = template;
    }
    
}
