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
public class Stock implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_warehouse", required = true)
    protected Long idWarehouse;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "id_product_attribute", required = true)
    protected Long idProductAttribute;
    
    @XmlElement(name = "real_quantity", required = false)
    protected String realQuantity;
    
    @XmlElement(name = "reference", required = false)
    protected Long reference;
    
    @XmlElement(name = "ean13", required = false)
    protected String ean13;
    
    @XmlElement(name = "upc", required = false)
    protected String upc;
    
    @XmlElement(name = "physical_quantity", required = true)
    protected Integer physicalQuantity;
    
    @XmlElement(name = "usable_quantity", required = true)
    protected Integer usableQuantity;
    
    @XmlElement(name = "price_te", required = true)
    protected String priceTe;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdWarehouse() {
        return idWarehouse;
    }
    
    public void setIdWarehouse(Long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    public Long getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }
    
    public Long getIdProductAttribute() {
        return idProductAttribute;
    }
    
    public void setIdProductAttribute(Long idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }
    
    public String getRealQuantity() {
        return realQuantity;
    }
    
    public void setRealQuantity(String realQuantity) {
        this.realQuantity = realQuantity;
    }
    
    public Long getReference() {
        return reference;
    }
    
    public void setReference(Long reference) {
        this.reference = reference;
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
    
    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }
    
    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }
    
    public Integer getUsableQuantity() {
        return usableQuantity;
    }
    
    public void setUsableQuantity(Integer usableQuantity) {
        this.usableQuantity = usableQuantity;
    }
    
    public String getPriceTe() {
        return priceTe;
    }
    
    public void setPriceTe(String priceTe) {
        this.priceTe = priceTe;
    }
    
}
