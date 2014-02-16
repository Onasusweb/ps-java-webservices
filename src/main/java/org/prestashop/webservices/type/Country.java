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
public class Country implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_zone", required = true)
    protected Long idZone;
    
    @XmlElement(name = "id_currency", required = false)
    protected Long idCurrency;
    
    @XmlElement(name = "call_prefix", required = false)
    protected Integer callPrefix;
    
    @XmlElement(name = "iso_code", required = true)
    protected String isoCode;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    @XmlElement(name = "contains_states", required = true)
    protected Integer containsStates;
    
    @XmlElement(name = "need_identification_number", required = true)
    protected Integer needIdentificationNumber;
    
    @XmlElement(name = "need_zip_code", required = false)
    protected Integer needZipCode;
    
    @XmlElement(name = "zip_code_format", required = false)
    protected String zipCodeFormat;
    
    @XmlElement(name = "display_tax_label", required = true)
    protected Integer displayTaxLabel;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdZone() {
        return idZone;
    }
    
    public void setIdZone(Long idZone) {
        this.idZone = idZone;
    }
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Integer getCallPrefix() {
        return callPrefix;
    }
    
    public void setCallPrefix(Integer callPrefix) {
        this.callPrefix = callPrefix;
    }
    
    public String getIsoCode() {
        return isoCode;
    }
    
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public Integer getContainsStates() {
        return containsStates;
    }
    
    public void setContainsStates(Integer containsStates) {
        this.containsStates = containsStates;
    }
    
    public Integer getNeedIdentificationNumber() {
        return needIdentificationNumber;
    }
    
    public void setNeedIdentificationNumber(Integer needIdentificationNumber) {
        this.needIdentificationNumber = needIdentificationNumber;
    }
    
    public Integer getNeedZipCode() {
        return needZipCode;
    }
    
    public void setNeedZipCode(Integer needZipCode) {
        this.needZipCode = needZipCode;
    }
    
    public String getZipCodeFormat() {
        return zipCodeFormat;
    }
    
    public void setZipCodeFormat(String zipCodeFormat) {
        this.zipCodeFormat = zipCodeFormat;
    }
    
    public Integer getDisplayTaxLabel() {
        return displayTaxLabel;
    }
    
    public void setDisplayTaxLabel(Integer displayTaxLabel) {
        this.displayTaxLabel = displayTaxLabel;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
