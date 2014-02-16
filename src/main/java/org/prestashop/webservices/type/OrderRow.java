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
public class OrderRow implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected String id;
    
    @XmlElement(name = "product_id", required = true)
    protected String productId;
    
    @XmlElement(name = "product_attribute_id", required = true)
    protected String productAttributeId;
    
    @XmlElement(name = "product_quantity", required = true)
    protected String productQuantity;
    
    @XmlElement(name = "product_name", required = false)
    protected String productName;
    
    @XmlElement(name = "product_price", required = false)
    protected String productPrice;
    
    @XmlElement(name = "unit_price_tax_incl", required = false)
    protected String unitPriceTaxIncl;
    
    @XmlElement(name = "unit_price_tax_excl", required = false)
    protected String unitPriceTaxExcl;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getProductId() {
        return productId;
    }
    
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public String getProductAttributeId() {
        return productAttributeId;
    }
    
    public void setProductAttributeId(String productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
    
    public String getProductQuantity() {
        return productQuantity;
    }
    
    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public String getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    
    public String getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }
    
    public void setUnitPriceTaxIncl(String unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }
    
    public String getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }
    
    public void setUnitPriceTaxExcl(String unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }
    
}
