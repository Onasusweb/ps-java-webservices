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
public class Combination implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "location", required = false)
    protected String location;
    
    @XmlElement(name = "ean13", required = false)
    protected String ean13;
    
    @XmlElement(name = "upc", required = false)
    protected String upc;
    
    @XmlElement(name = "quantity", required = false)
    protected Integer quantity;
    
    @XmlElement(name = "reference", required = false)
    protected String reference;
    
    @XmlElement(name = "supplier_reference", required = false)
    protected String supplierReference;
    
    @XmlElement(name = "wholesale_price", required = false)
    protected String wholesalePrice;
    
    @XmlElement(name = "price", required = false)
    protected BigDecimal price;
    
    @XmlElement(name = "ecotax", required = false)
    protected String ecotax;
    
    @XmlElement(name = "weight", required = false)
    protected BigDecimal weight;
    
    @XmlElement(name = "unit_price_impact", required = false)
    protected BigDecimal unitPriceImpact;
    
    @XmlElement(name = "minimal_quantity", required = true)
    protected Long minimalQuantity;
    
    @XmlElement(name = "default_on", required = false)
    protected Integer defaultOn;
    
    @XmlElement(name = "available_date", required = false)
    protected String availableDate;
    
    @XmlElement(name = "associations", required = false)
    protected CombinationAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getEan13() {
        return ean13;
    }
    
    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }
    
    public String getUpc() {
        return upc;
    }
    
    public void setUpc(String upc) {
        this.upc = upc;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public String getSupplierReference() {
        return supplierReference;
    }
    
    public void setSupplierReference(String supplierReference) {
        this.supplierReference = supplierReference;
    }
    
    public String getWholesalePrice() {
        return wholesalePrice;
    }
    
    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public String getEcotax() {
        return ecotax;
    }
    
    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }
    
    public BigDecimal getWeight() {
        return weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    
    public BigDecimal getUnitPriceImpact() {
        return unitPriceImpact;
    }
    
    public void setUnitPriceImpact(BigDecimal unitPriceImpact) {
        this.unitPriceImpact = unitPriceImpact;
    }
    
    public Long getMinimalQuantity() {
        return minimalQuantity;
    }
    
    public void setMinimalQuantity(Long minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }
    
    public Integer getDefaultOn() {
        return defaultOn;
    }
    
    public void setDefaultOn(Integer defaultOn) {
        this.defaultOn = defaultOn;
    }
    
    public String getAvailableDate() {
        return availableDate;
    }
    
    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }
    
    public CombinationAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(CombinationAssociations associations) {
        this.associations = associations;
    }
    
}
