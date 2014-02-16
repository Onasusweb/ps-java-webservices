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
public class StockAvailable implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "id_product_attribute", required = true)
    protected Long idProductAttribute;
    
    @XmlElement(name = "id_shop", required = false)
    protected Long idShop;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "quantity", required = true)
    protected Integer quantity;
    
    @XmlElement(name = "depends_on_stock", required = true)
    protected Integer dependsOnStock;
    
    @XmlElement(name = "out_of_stock", required = true)
    protected Integer outOfStock;
    
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
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public Long getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public Integer getDependsOnStock() {
        return dependsOnStock;
    }
    
    public void setDependsOnStock(Integer dependsOnStock) {
        this.dependsOnStock = dependsOnStock;
    }
    
    public Integer getOutOfStock() {
        return outOfStock;
    }
    
    public void setOutOfStock(Integer outOfStock) {
        this.outOfStock = outOfStock;
    }
    
}
