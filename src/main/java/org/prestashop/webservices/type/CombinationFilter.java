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


public class CombinationFilter {
    
    private String id;
    private String idProduct;
    private String location;
    private String ean13;
    private String upc;
    private String quantity;
    private String reference;
    private String supplierReference;
    private String wholesalePrice;
    private String price;
    private String ecotax;
    private String weight;
    private String unitPriceImpact;
    private String minimalQuantity;
    private String defaultOn;
    private String availableDate;
    
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
    
    @QueryParam(value="filter[location]")
    public String getLocation() {
        return location;
    }

    public void setLocation(String filter) {
        this.location = filter;
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
    
    @QueryParam(value="filter[quantity]")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String filter) {
        this.quantity = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[supplier_reference]")
    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String filter) {
        this.supplierReference = filter;
    }
    
    @QueryParam(value="filter[wholesale_price]")
    public String getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(String filter) {
        this.wholesalePrice = filter;
    }
    
    @QueryParam(value="filter[price]")
    public String getPrice() {
        return price;
    }

    public void setPrice(String filter) {
        this.price = filter;
    }
    
    @QueryParam(value="filter[ecotax]")
    public String getEcotax() {
        return ecotax;
    }

    public void setEcotax(String filter) {
        this.ecotax = filter;
    }
    
    @QueryParam(value="filter[weight]")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String filter) {
        this.weight = filter;
    }
    
    @QueryParam(value="filter[unit_price_impact]")
    public String getUnitPriceImpact() {
        return unitPriceImpact;
    }

    public void setUnitPriceImpact(String filter) {
        this.unitPriceImpact = filter;
    }
    
    @QueryParam(value="filter[minimal_quantity]")
    public String getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(String filter) {
        this.minimalQuantity = filter;
    }
    
    @QueryParam(value="filter[default_on]")
    public String getDefaultOn() {
        return defaultOn;
    }

    public void setDefaultOn(String filter) {
        this.defaultOn = filter;
    }
    
    @QueryParam(value="filter[available_date]")
    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String filter) {
        this.availableDate = filter;
    }
    
}
