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
public class SupplyOrder implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_supplier", required = true)
    protected Long idSupplier;
    
    @XmlElement(name = "id_lang", required = true)
    protected Long idLang;
    
    @XmlElement(name = "id_warehouse", required = true)
    protected Long idWarehouse;
    
    @XmlElement(name = "id_supply_order_state", required = true)
    protected Long idSupplyOrderState;
    
    @XmlElement(name = "id_currency", required = true)
    protected Long idCurrency;
    
    @XmlElement(name = "supplier_name", required = false)
    protected String supplierName;
    
    @XmlElement(name = "reference", required = true)
    protected String reference;
    
    @XmlElement(name = "date_delivery_expected", required = true)
    protected String dateDeliveryExpected;
    
    @XmlElement(name = "total_te", required = false)
    protected String totalTe;
    
    @XmlElement(name = "total_with_discount_te", required = false)
    protected String totalWithDiscountTe;
    
    @XmlElement(name = "total_ti", required = false)
    protected String totalTi;
    
    @XmlElement(name = "total_tax", required = false)
    protected String totalTax;
    
    @XmlElement(name = "discount_rate", required = false)
    protected BigDecimal discountRate;
    
    @XmlElement(name = "discount_value_te", required = false)
    protected String discountValueTe;
    
    @XmlElement(name = "is_template", required = false)
    protected Integer isTemplate;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "associations", required = false)
    protected SupplyOrderAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdSupplier() {
        return idSupplier;
    }
    
    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    public Long getIdLang() {
        return idLang;
    }
    
    public void setIdLang(Long idLang) {
        this.idLang = idLang;
    }
    
    public Long getIdWarehouse() {
        return idWarehouse;
    }
    
    public void setIdWarehouse(Long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    public Long getIdSupplyOrderState() {
        return idSupplyOrderState;
    }
    
    public void setIdSupplyOrderState(Long idSupplyOrderState) {
        this.idSupplyOrderState = idSupplyOrderState;
    }
    
    public Long getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(Long idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public String getSupplierName() {
        return supplierName;
    }
    
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public String getDateDeliveryExpected() {
        return dateDeliveryExpected;
    }
    
    public void setDateDeliveryExpected(String dateDeliveryExpected) {
        this.dateDeliveryExpected = dateDeliveryExpected;
    }
    
    public String getTotalTe() {
        return totalTe;
    }
    
    public void setTotalTe(String totalTe) {
        this.totalTe = totalTe;
    }
    
    public String getTotalWithDiscountTe() {
        return totalWithDiscountTe;
    }
    
    public void setTotalWithDiscountTe(String totalWithDiscountTe) {
        this.totalWithDiscountTe = totalWithDiscountTe;
    }
    
    public String getTotalTi() {
        return totalTi;
    }
    
    public void setTotalTi(String totalTi) {
        this.totalTi = totalTi;
    }
    
    public String getTotalTax() {
        return totalTax;
    }
    
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
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
    
    public Integer getIsTemplate() {
        return isTemplate;
    }
    
    public void setIsTemplate(Integer isTemplate) {
        this.isTemplate = isTemplate;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public String getDateUpd() {
        return dateUpd;
    }
    
    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }
    
    public SupplyOrderAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(SupplyOrderAssociations associations) {
        this.associations = associations;
    }
    
}
