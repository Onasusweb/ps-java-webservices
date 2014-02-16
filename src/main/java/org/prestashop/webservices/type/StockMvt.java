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
public class StockMvt implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_product", required = false)
    protected String idProduct;
    
    @XmlElement(name = "id_product_attribute", required = false)
    protected String idProductAttribute;
    
    @XmlElement(name = "id_warehouse", required = false)
    protected String idWarehouse;
    
    @XmlElement(name = "id_currency", required = false)
    protected String idCurrency;
    
    @XmlElement(name = "management_type", required = false)
    protected String managementType;
    
    @XmlElement(name = "id_employee", required = true)
    protected Long idEmployee;
    
    @XmlElement(name = "id_stock", required = true)
    protected Long idStock;
    
    @XmlElement(name = "id_stock_mvt_reason", required = true)
    protected Long idStockMvtReason;
    
    @XmlElement(name = "id_order", required = false)
    protected Long idOrder;
    
    @XmlElement(name = "id_supply_order", required = false)
    protected Long idSupplyOrder;
    
    @XmlElement(name = "product_name", required = false)
    protected String productName;
    
    @XmlElement(name = "ean13", required = false)
    protected String ean13;
    
    @XmlElement(name = "upc", required = false)
    protected String upc;
    
    @XmlElement(name = "reference", required = false)
    protected String reference;
    
    @XmlElement(name = "physical_quantity", required = true)
    protected Integer physicalQuantity;
    
    @XmlElement(name = "sign", required = true)
    protected Integer sign;
    
    @XmlElement(name = "last_wa", required = false)
    protected String lastWa;
    
    @XmlElement(name = "current_wa", required = false)
    protected String currentWa;
    
    @XmlElement(name = "price_te", required = true)
    protected String priceTe;
    
    @XmlElement(name = "date_add", required = true)
    protected String dateAdd;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getIdProductAttribute() {
        return idProductAttribute;
    }
    
    public void setIdProductAttribute(String idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }
    
    public String getIdWarehouse() {
        return idWarehouse;
    }
    
    public void setIdWarehouse(String idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    public String getIdCurrency() {
        return idCurrency;
    }
    
    public void setIdCurrency(String idCurrency) {
        this.idCurrency = idCurrency;
    }
    
    public String getManagementType() {
        return managementType;
    }
    
    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }
    
    public Long getIdEmployee() {
        return idEmployee;
    }
    
    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }
    
    public Long getIdStock() {
        return idStock;
    }
    
    public void setIdStock(Long idStock) {
        this.idStock = idStock;
    }
    
    public Long getIdStockMvtReason() {
        return idStockMvtReason;
    }
    
    public void setIdStockMvtReason(Long idStockMvtReason) {
        this.idStockMvtReason = idStockMvtReason;
    }
    
    public Long getIdOrder() {
        return idOrder;
    }
    
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }
    
    public Long getIdSupplyOrder() {
        return idSupplyOrder;
    }
    
    public void setIdSupplyOrder(Long idSupplyOrder) {
        this.idSupplyOrder = idSupplyOrder;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
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
    
    public String getReference() {
        return reference;
    }
    
    public void setReference(String reference) {
        this.reference = reference;
    }
    
    public Integer getPhysicalQuantity() {
        return physicalQuantity;
    }
    
    public void setPhysicalQuantity(Integer physicalQuantity) {
        this.physicalQuantity = physicalQuantity;
    }
    
    public Integer getSign() {
        return sign;
    }
    
    public void setSign(Integer sign) {
        this.sign = sign;
    }
    
    public String getLastWa() {
        return lastWa;
    }
    
    public void setLastWa(String lastWa) {
        this.lastWa = lastWa;
    }
    
    public String getCurrentWa() {
        return currentWa;
    }
    
    public void setCurrentWa(String currentWa) {
        this.currentWa = currentWa;
    }
    
    public String getPriceTe() {
        return priceTe;
    }
    
    public void setPriceTe(String priceTe) {
        this.priceTe = priceTe;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
}
