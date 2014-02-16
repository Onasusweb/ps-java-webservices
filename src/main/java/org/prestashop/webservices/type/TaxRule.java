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
public class TaxRule implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_tax_rules_group", required = true)
    protected Long idTaxRulesGroup;
    
    @XmlElement(name = "id_state", required = false)
    protected Long idState;
    
    @XmlElement(name = "id_country", required = true)
    protected Long idCountry;
    
    @XmlElement(name = "zipcode_from", required = false)
    protected String zipcodeFrom;
    
    @XmlElement(name = "zipcode_to", required = false)
    protected String zipcodeTo;
    
    @XmlElement(name = "id_tax", required = true)
    protected Long idTax;
    
    @XmlElement(name = "behavior", required = false)
    protected Integer behavior;
    
    @XmlElement(name = "description", required = false)
    protected String description;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }
    
    public void setIdTaxRulesGroup(Long idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }
    
    public Long getIdState() {
        return idState;
    }
    
    public void setIdState(Long idState) {
        this.idState = idState;
    }
    
    public Long getIdCountry() {
        return idCountry;
    }
    
    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    public String getZipcodeFrom() {
        return zipcodeFrom;
    }
    
    public void setZipcodeFrom(String zipcodeFrom) {
        this.zipcodeFrom = zipcodeFrom;
    }
    
    public String getZipcodeTo() {
        return zipcodeTo;
    }
    
    public void setZipcodeTo(String zipcodeTo) {
        this.zipcodeTo = zipcodeTo;
    }
    
    public Long getIdTax() {
        return idTax;
    }
    
    public void setIdTax(Long idTax) {
        this.idTax = idTax;
    }
    
    public Integer getBehavior() {
        return behavior;
    }
    
    public void setBehavior(Integer behavior) {
        this.behavior = behavior;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
}
