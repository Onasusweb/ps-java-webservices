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


public class ShopGroupFilter {
    
    private String id;
    private String name;
    private String shareCustomer;
    private String shareOrder;
    private String shareStock;
    private String active;
    private String deleted;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[share_customer]")
    public String getShareCustomer() {
        return shareCustomer;
    }

    public void setShareCustomer(String filter) {
        this.shareCustomer = filter;
    }
    
    @QueryParam(value="filter[share_order]")
    public String getShareOrder() {
        return shareOrder;
    }

    public void setShareOrder(String filter) {
        this.shareOrder = filter;
    }
    
    @QueryParam(value="filter[share_stock]")
    public String getShareStock() {
        return shareStock;
    }

    public void setShareStock(String filter) {
        this.shareStock = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
}
