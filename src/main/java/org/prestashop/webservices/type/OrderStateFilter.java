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


public class OrderStateFilter {
    
    private String id;
    private String unremovable;
    private String delivery;
    private String hidden;
    private String sendEmail;
    private String moduleName;
    private String invoice;
    private String color;
    private String logable;
    private String shipped;
    private String paid;
    private String deleted;
    private String name;
    private String template;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[unremovable]")
    public String getUnremovable() {
        return unremovable;
    }

    public void setUnremovable(String filter) {
        this.unremovable = filter;
    }
    
    @QueryParam(value="filter[delivery]")
    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String filter) {
        this.delivery = filter;
    }
    
    @QueryParam(value="filter[hidden]")
    public String getHidden() {
        return hidden;
    }

    public void setHidden(String filter) {
        this.hidden = filter;
    }
    
    @QueryParam(value="filter[send_email]")
    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String filter) {
        this.sendEmail = filter;
    }
    
    @QueryParam(value="filter[module_name]")
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String filter) {
        this.moduleName = filter;
    }
    
    @QueryParam(value="filter[invoice]")
    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String filter) {
        this.invoice = filter;
    }
    
    @QueryParam(value="filter[color]")
    public String getColor() {
        return color;
    }

    public void setColor(String filter) {
        this.color = filter;
    }
    
    @QueryParam(value="filter[logable]")
    public String getLogable() {
        return logable;
    }

    public void setLogable(String filter) {
        this.logable = filter;
    }
    
    @QueryParam(value="filter[shipped]")
    public String getShipped() {
        return shipped;
    }

    public void setShipped(String filter) {
        this.shipped = filter;
    }
    
    @QueryParam(value="filter[paid]")
    public String getPaid() {
        return paid;
    }

    public void setPaid(String filter) {
        this.paid = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[template]")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String filter) {
        this.template = filter;
    }
    
}
