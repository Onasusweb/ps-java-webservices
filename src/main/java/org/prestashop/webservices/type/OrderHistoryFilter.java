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


public class OrderHistoryFilter {
    
    private String id;
    private String idOrderState;
    private String idOrder;
    private String idEmployee;
    private String dateAdd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_order_state]")
    public String getIdOrderState() {
        return idOrderState;
    }

    public void setIdOrderState(String filter) {
        this.idOrderState = filter;
    }
    
    @QueryParam(value="filter[id_order]")
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String filter) {
        this.idOrder = filter;
    }
    
    @QueryParam(value="filter[id_employee]")
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String filter) {
        this.idEmployee = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
}
