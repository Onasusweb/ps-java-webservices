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
public class SupplyOrderDetail implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_supply_order", required = true)
    protected Long idSupplyOrder;
    
    @XmlElement(name = "id_product", required = true)
    protected Long idProduct;
    
    @XmlElement(name = "id_product_attribute", required = true)
    protected Long idProductAttribute;
    
    @XmlElement(name = "reference", required = false)
    protected Long reference;
    
    @XmlElement(name = "supplier_reference", required = false)
    protected Long supplierReference;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "ean13", required = false)
    protected String ean13;
    
    @XmlElement(name = "upc", required = false)
    protected String upc;
    
    @XmlElement(name = "exchange_rate", required = true)
    protected BigDecimal exchangeRate;
    
    @XmlElement(name = "unit_price_te", required = true)
    protected String unitPriceTe;
    
    @XmlElement(name = "quantity_expected", required = true)
    protected Integer quantityExpected;
    
    @XmlElement(name = "quantity_received", required = false)
    protected Integer quantityReceived;
    
    @XmlElement(name = "price_te", required = true)
    protected String priceTe;
    
    @XmlElement(name = "discount_rate", required = true)
    protected BigDecimal discountRate;
    
    @XmlElement(name = "discount_value_te", required = true)
    protected String discountValueTe;
    
    @XmlElement(name = "price_with_discount_te", required = true)
    protected String priceWithDiscountTe;
    
    @XmlElement(name = "tax_rate", required = true)
    protected BigDecimal taxRate;
    
    @XmlElement(name = "tax_value", required = true)
    protected String taxValue;
    
    @XmlElement(name = "price_ti", required = true)
    protected String priceTi;
    
    @XmlElement(name = "tax_value_with_order_discount", required = true)
    protected BigDecimal taxValueWithOrderDiscount;
    
    @XmlElement(name = "price_with_order_discount_te", required = true)
    protected String priceWithOrderDiscountTe;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdSupplyOrder() {
        return idSupplyOrder;
    }
    
    public void setIdSupplyOrder(Long idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
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
    
    public Long getReference() {
        return reference;
    }
    
    public void setReference(Long reference) {
        this.reference = reference;
    }
    
    public Long getSupplierReference() {
        return supplierReference;
    }
    
    public void setSupplierReference(Long supplierReference) {
        this.supplierReference = supplierReference;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
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
    
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }
    
    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
    public String getUnitPriceTe() {
        return unitPriceTe;
    }
    
    public void setUnitPriceTe(String unitPriceTe) {
        this.unitPriceTe = unitPriceTe;
    }
    
    public Integer getQuantityExpected() {
        return quantityExpected;
    }
    
    public void setQuantityExpected(Integer quantityExpected) {
        this.quantityExpected = quantityExpected;
    }
    
    public Integer getQuantityReceived() {
        return quantityReceived;
    }
    
    public void setQuantityReceived(Integer quantityReceived) {
        this.quantityReceived = quantityReceived;
    }
    
    public String getPriceTe() {
        return priceTe;
    }
    
    public void setPriceTe(String priceTe) {
        this.priceTe = priceTe;
    }
    
    public BigDecimal getDiscountRate() {
        return discountRate;
    }
    
    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }
    
    public String getDiscountValueTe() {
        return discountValueTe;
    }
    
    public void setDiscountValueTe(String discountValueTe) {
        this.discountValueTe = discountValueTe;
    }
    
    public String getPriceWithDiscountTe() {
        return priceWithDiscountTe;
    }
    
    public void setPriceWithDiscountTe(String priceWithDiscountTe) {
        this.priceWithDiscountTe = priceWithDiscountTe;
    }
    
    public BigDecimal getTaxRate() {
        return taxRate;
    }
    
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
    
    public String getTaxValue() {
        return taxValue;
    }
    
    public void setTaxValue(String taxValue) {
        this.taxValue = taxValue;
    }
    
    public String getPriceTi() {
        return priceTi;
    }
    
    public void setPriceTi(String priceTi) {
        this.priceTi = priceTi;
    }
    
    public BigDecimal getTaxValueWithOrderDiscount() {
        return taxValueWithOrderDiscount;
    }
    
    public void setTaxValueWithOrderDiscount(BigDecimal taxValueWithOrderDiscount) {
        this.taxValueWithOrderDiscount = taxValueWithOrderDiscount;
    }
    
    public String getPriceWithOrderDiscountTe() {
        return priceWithOrderDiscountTe;
    }
    
    public void setPriceWithOrderDiscountTe(String priceWithOrderDiscountTe) {
        this.priceWithOrderDiscountTe = priceWithOrderDiscountTe;
    }
    
}
