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
public class SpecificPriceRule implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_shop", required = true)
    protected Long idShop;
    
    @XmlElement(name = "id_country", required = true)
    protected Long idCountry;
    
    @XmlElement(name = "id_currency", required = true)
    protected String idCurrency;
    
    @XmlElement(name = "id_group", required = true)
    protected Long idGroup;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "from_quantity", required = true)
    protected Integer fromQuantity;
    
    @XmlElement(name = "price", required = true)
    protected BigDecimal price;
    
    @XmlElement(name = "reduction", required = true)
    protected String reduction;
    
    @XmlElement(name = "reduction_type", required = true)
    protected String reductionType;
    
    @XmlElement(name = "from", required = false)
    protected String from;
    
    @XmlElement(name = "to", required = false)
    protected String to;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public Long getIdCountry() {
        return idCountry;
    }
    
    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    public String getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Long getIdGroup() {
        return idGroup;
    }
    
    public void setIdGroup(Long idGroup) {
        this.idGroup = idGroup;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getFromQuantity() {
        return fromQuantity;
    }
    
    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public String getReduction() {
        return reduction;
    }
    
    public void setReduction(String reduction) {
        this.reduction = reduction;
    }
    
    public String getReductionType() {
        return reductionType;
    }
    
    public void setReductionType(String reductionType) {
        this.reductionType = reductionType;
    }
    
    public String getFrom() {
        return from;
    }
    
    public void setFrom(String from) {
        this.from = from;
    }
    
    public String getTo() {
        return to;
    }
    
    public void setTo(String to) {
        this.to = to;
    }
    
}
