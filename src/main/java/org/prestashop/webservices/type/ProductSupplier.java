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
public class ProductSupplier implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "id_product_attribute", required = true)
    protected Long idProductAttribute;
    
    @XmlElement(name = "id_supplier", required = true)
    protected Long idSupplier;
    
    @XmlElement(name = "id_currency", required = false)
    protected Long idCurrency;
    
    @XmlElement(name = "product_supplier_reference", required = false)
    protected Long productSupplierReference;
    
    @XmlElement(name = "product_supplier_price_te", required = false)
    protected String productSupplierPriceTe;
    
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
    
    public Long getIdProductAttribute() {
        return idProductAttribute;
    }
    
    public void setIdProductAttribute(Long idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }
    
    public Long getIdSupplier() {
        return idSupplier;
    }
    
    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Long getProductSupplierReference() {
        return productSupplierReference;
    }
    
    public void setProductSupplierReference(Long productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }
    
    public String getProductSupplierPriceTe() {
        return productSupplierPriceTe;
    }
    
    public void setProductSupplierPriceTe(String productSupplierPriceTe) {
        this.productSupplierPriceTe = productSupplierPriceTe;
    }
    
}
