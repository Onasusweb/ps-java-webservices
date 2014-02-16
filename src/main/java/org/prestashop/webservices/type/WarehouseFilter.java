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


public class WarehouseFilter {
    
    private String id;
    private String idAddress;
    private String idEmployee;
    private String idCurrency;
    private String valuation;
    private String deleted;
    private String reference;
    private String name;
    private String managementType;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_address]")
    public String getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(String filter) {
        this.idAddress = filter;
    }
    
    @QueryParam(value="filter[id_employee]")
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String filter) {
        this.idEmployee = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[valuation]")
    public String getValuation() {
        return valuation;
    }

    public void setValuation(String filter) {
        this.valuation = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[management_type]")
    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String filter) {
        this.managementType = filter;
    }
    
}
