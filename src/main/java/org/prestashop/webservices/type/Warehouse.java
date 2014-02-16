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
public class Warehouse implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_address", required = true)
    protected Long idAddress;
    
    @XmlElement(name = "id_employee", required = true)
    protected Long idEmployee;
    
    @XmlElement(name = "id_currency", required = true)
    protected Long idCurrency;
    
    @XmlElement(name = "valuation", required = false)
    protected String valuation;
    
    @XmlElement(name = "deleted", required = false)
    protected String deleted;
    
    @XmlElement(name = "reference", required = true)
    protected String reference;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "management_type", required = true)
    protected String managementType;
    
    @XmlElement(name = "associations", required = false)
    protected WarehouseAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdAddress() {
        return idAddress;
    }
    
    public void setIdAddress(Long idAddress) {
        this.idAddress = idAddress;
    }
    
    public Long getIdEmployee() {
        return idEmployee;
    }
    
    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public String getValuation() {
        return valuation;
    }
    
    public void setValuation(String valuation) {
        this.valuation = valuation;
    }
    
    public String getDeleted() {
        return deleted;
    }
    
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getManagementType() {
        return managementType;
    }
    
    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }
    
    public WarehouseAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(WarehouseAssociations associations) {
        this.associations = associations;
    }
    
}
