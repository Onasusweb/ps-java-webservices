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


public class StockFilter {
    
    private String id;
    private String idWarehouse;
    private String idProduct;
    private String idProductAttribute;
    private String realQuantity;
    private String reference;
    private String ean13;
    private String upc;
    private String physicalQuantity;
    private String usableQuantity;
    private String priceTe;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_warehouse]")
    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String filter) {
        this.idWarehouse = filter;
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
    
    @QueryParam(value="filter[real_quantity]")
    public String getRealQuantity() {
        return realQuantity;
    }

    public void setRealQuantity(String filter) {
        this.realQuantity = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
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
    
    @QueryParam(value="filter[physical_quantity]")
    public String getPhysicalQuantity() {
        return physicalQuantity;
    }

    public void setPhysicalQuantity(String filter) {
        this.physicalQuantity = filter;
    }
    
    @QueryParam(value="filter[usable_quantity]")
    public String getUsableQuantity() {
        return usableQuantity;
    }

    public void setUsableQuantity(String filter) {
        this.usableQuantity = filter;
    }
    
    @QueryParam(value="filter[price_te]")
    public String getPriceTe() {
        return priceTe;
    }

    public void setPriceTe(String filter) {
        this.priceTe = filter;
    }
    
}
