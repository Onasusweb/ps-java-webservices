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
public class OrderInvoice implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_order", required = true)
    protected Long idOrder;
    
    @XmlElement(name = "number", required = true)
    protected Long number;
    
    @XmlElement(name = "delivery_number", required = false)
    protected Long deliveryNumber;
    
    @XmlElement(name = "delivery_date", required = false)
    protected String deliveryDate;
    
    @XmlElement(name = "total_discount_tax_excl", required = false)
    protected String totalDiscountTaxExcl;
    
    @XmlElement(name = "total_discount_tax_incl", required = false)
    protected String totalDiscountTaxIncl;
    
    @XmlElement(name = "total_paid_tax_excl", required = false)
    protected String totalPaidTaxExcl;
    
    @XmlElement(name = "total_paid_tax_incl", required = false)
    protected String totalPaidTaxIncl;
    
    @XmlElement(name = "total_products", required = false)
    protected String totalProducts;
    
    @XmlElement(name = "total_products_wt", required = false)
    protected String totalProductsWt;
    
    @XmlElement(name = "total_shipping_tax_excl", required = false)
    protected String totalShippingTaxExcl;
    
    @XmlElement(name = "total_shipping_tax_incl", required = false)
    protected String totalShippingTaxIncl;
    
    @XmlElement(name = "shipping_tax_computation_method", required = false)
    protected String shippingTaxComputationMethod;
    
    @XmlElement(name = "total_wrapping_tax_excl", required = false)
    protected String totalWrappingTaxExcl;
    
    @XmlElement(name = "total_wrapping_tax_incl", required = false)
    protected String totalWrappingTaxIncl;
    
    @XmlElement(name = "note", required = false)
    protected String note;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdOrder() {
        return idOrder;
    }
    
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }
    
    public Long getNumber() {
        return number;
    }
    
    public void setNumber(Long number) {
        this.number = number;
    }
    
    public Long getDeliveryNumber() {
        return deliveryNumber;
    }
    
    public void setDeliveryNumber(Long deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
    
    public String getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public String getTotalDiscountTaxExcl() {
        return totalDiscountTaxExcl;
    }
    
    public void setTotalDiscountTaxExcl(String totalDiscountTaxExcl) {
        this.totalDiscountTaxExcl = totalDiscountTaxExcl;
    }
    
    public String getTotalDiscountTaxIncl() {
        return totalDiscountTaxIncl;
    }
    
    public void setTotalDiscountTaxIncl(String totalDiscountTaxIncl) {
        this.totalDiscountTaxIncl = totalDiscountTaxIncl;
    }
    
    public String getTotalPaidTaxExcl() {
        return totalPaidTaxExcl;
    }
    
    public void setTotalPaidTaxExcl(String totalPaidTaxExcl) {
        this.totalPaidTaxExcl = totalPaidTaxExcl;
    }
    
    public String getTotalPaidTaxIncl() {
        return totalPaidTaxIncl;
    }
    
    public void setTotalPaidTaxIncl(String totalPaidTaxIncl) {
        this.totalPaidTaxIncl = totalPaidTaxIncl;
    }
    
    public String getTotalProducts() {
        return totalProducts;
    }
    
    public void setTotalProducts(String totalProducts) {
        this.totalProducts = totalProducts;
    }
    
    public String getTotalProductsWt() {
        return totalProductsWt;
    }
    
    public void setTotalProductsWt(String totalProductsWt) {
        this.totalProductsWt = totalProductsWt;
    }
    
    public String getTotalShippingTaxExcl() {
        return totalShippingTaxExcl;
    }
    
    public void setTotalShippingTaxExcl(String totalShippingTaxExcl) {
        this.totalShippingTaxExcl = totalShippingTaxExcl;
    }
    
    public String getTotalShippingTaxIncl() {
        return totalShippingTaxIncl;
    }
    
    public void setTotalShippingTaxIncl(String totalShippingTaxIncl) {
        this.totalShippingTaxIncl = totalShippingTaxIncl;
    }
    
    public String getShippingTaxComputationMethod() {
        return shippingTaxComputationMethod;
    }
    
    public void setShippingTaxComputationMethod(String shippingTaxComputationMethod) {
        this.shippingTaxComputationMethod = shippingTaxComputationMethod;
    }
    
    public String getTotalWrappingTaxExcl() {
        return totalWrappingTaxExcl;
    }
    
    public void setTotalWrappingTaxExcl(String totalWrappingTaxExcl) {
        this.totalWrappingTaxExcl = totalWrappingTaxExcl;
    }
    
    public String getTotalWrappingTaxIncl() {
        return totalWrappingTaxIncl;
    }
    
    public void setTotalWrappingTaxIncl(String totalWrappingTaxIncl) {
        this.totalWrappingTaxIncl = totalWrappingTaxIncl;
    }
    
    public String getNote() {
        return note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
}
