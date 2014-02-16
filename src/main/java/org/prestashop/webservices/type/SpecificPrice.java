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
public class SpecificPrice implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "id_shop", required = true)
    protected Long idShop;
    
    @XmlElement(name = "id_cart", required = true)
    protected Long idCart;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "id_product_attribute", required = false)
    protected Long idProductAttribute;
    
    @XmlElement(name = "id_currency", required = true)
    protected String idCurrency;
    
    @XmlElement(name = "id_country", required = true)
    protected Long idCountry;
    
    @XmlElement(name = "id_group", required = true)
    protected Long idGroup;
    
    @XmlElement(name = "id_customer", required = true)
    protected Long idCustomer;
    
    @XmlElement(name = "id_specific_price_rule", required = false)
    protected Long idSpecificPriceRule;
    
    @XmlElement(name = "price", required = true)
    protected BigDecimal price;
    
    @XmlElement(name = "from_quantity", required = true)
    protected Integer fromQuantity;
    
    @XmlElement(name = "reduction", required = true)
    protected String reduction;
    
    @XmlElement(name = "reduction_type", required = true)
    protected String reductionType;
    
    @XmlElement(name = "from", required = true)
    protected String from;
    
    @XmlElement(name = "to", required = true)
    protected String to;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public Long getIdCart() {
        return idCart;
    }
    
    public void setIdCart(Long idCart) {
        this.idCart = idCart;
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
    
    public String getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public Long getIdCountry() {
        return idCountry;
    }
    
    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    public Long getIdGroup() {
        return idGroup;
    }
    
    public void setIdGroup(Long idGroup) {
        this.idGroup = idGroup;
    }
    
    public Long getIdCustomer() {
        return idCustomer;
    }
    
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public Long getIdSpecificPriceRule() {
        return idSpecificPriceRule;
    }
    
    public void setIdSpecificPriceRule(Long idSpecificPriceRule) {
        this.idSpecificPriceRule = idSpecificPriceRule;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public Integer getFromQuantity() {
        return fromQuantity;
    }
    
    public void setFromQuantity(Integer fromQuantity) {
        this.fromQuantity = fromQuantity;
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
