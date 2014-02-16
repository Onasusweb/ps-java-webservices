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


public class ProductSupplierFilter {
    
    private String id;
    private String idProduct;
    private String idProductAttribute;
    private String idSupplier;
    private String idCurrency;
    private String productSupplierReference;
    private String productSupplierPriceTe;
    
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
    
    @QueryParam(value="filter[id_supplier]")
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String filter) {
        this.idSupplier = filter;
    }
    
    @QueryParam(value="filter[id_currency]")
    public String getIdCurrency() {
        return idCurrency;
    }

    public void setIdCurrency(String filter) {
        this.idCurrency = filter;
    }
    
    @QueryParam(value="filter[product_supplier_reference]")
    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String filter) {
        this.productSupplierReference = filter;
    }
    
    @QueryParam(value="filter[product_supplier_price_te]")
    public String getProductSupplierPriceTe() {
        return productSupplierPriceTe;
    }

    public void setProductSupplierPriceTe(String filter) {
        this.productSupplierPriceTe = filter;
    }
    
}
