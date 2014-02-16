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

import javax.ws.rs.QueryParam;


public class StockMvtFilter {
    
    private String id;
    private String idProduct;
    private String idProductAttribute;
    private String idWarehouse;
    private String idCurrency;
    private String managementType;
    private String idEmployee;
    private String idStock;
    private String idStockMvtReason;
    private String idOrder;
    private String idSupplyOrder;
    private String productName;
    private String ean13;
    private String upc;
    private String reference;
    private String physicalQuantity;
    private String sign;
    private String lastWa;
    private String currentWa;
    private String priceTe;
    private String dateAdd;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_product]")
    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String filter) {
        this.idProduct = filter;
    }
    
    @QueryParam(value="filter[id_product_attribute]")
    public String getIdProductAttribute() {
        return idProductAttribute;
    }

    public void setIdProductAttribute(String filter) {
        this.idProductAttribute = filter;
    }
    
    @QueryParam(value="filter[id_warehouse]")
    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String filter) {
        this.idWarehouse = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[management_type]")
    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String filter) {
        this.managementType = filter;
    }
    
    @QueryParam(value="filter[id_employee]")
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String filter) {
        this.idEmployee = filter;
    }
    
    @QueryParam(value="filter[id_stock]")
    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String filter) {
        this.idStock = filter;
    }
    
    @QueryParam(value="filter[id_stock_mvt_reason]")
    public String getIdStockMvtReason() {
        return idStockMvtReason;
    }

    public void setIdStockMvtReason(String filter) {
        this.idStockMvtReason = filter;
    }
    
    @QueryParam(value="filter[id_order]")
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String filter) {
        this.idOrder = filter;
    }
    
    @QueryParam(value="filter[id_supply_order]")
    public String getIdSupplyOrder() {
        return idSupplyOrder;
    }

    public void setIdSupplyOrder(String filter) {
        this.idSupplyOrder = filter;
    }
    
    @QueryParam(value="filter[product_name]")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String filter) {
        this.productName = filter;
    }
    
    @QueryParam(value="filter[ean13]")
    public String getEan13() {
        return ean13;
    }

    public void setEan13(String filter) {
        this.ean13 = filter;
    }
    
    @QueryParam(value="filter[upc]")
    public String getUpc() {
        return upc;
    }

    public void setUpc(String filter) {
        this.upc = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[physical_quantity]")
    public String getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(String filter) {
        this.physicalQuantity = filter;
    }
    
    @QueryParam(value="filter[sign]")
    public String getSign() {
        return sign;
    }

    public void setSign(String filter) {
        this.sign = filter;
    }
    
    @QueryParam(value="filter[last_wa]")
    public String getLastWa() {
        return lastWa;
    }

    public void setLastWa(String filter) {
        this.lastWa = filter;
    }
    
    @QueryParam(value="filter[current_wa]")
    public String getCurrentWa() {
        return currentWa;
    }

    public void setCurrentWa(String filter) {
        this.currentWa = filter;
    }
    
    @QueryParam(value="filter[price_te]")
    public String getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(String filter) {
        this.priceTe = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
}
