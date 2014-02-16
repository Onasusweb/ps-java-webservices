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


public class StockAvailableFilter {
    
    private String id;
    private String idProduct;
    private String idProductAttribute;
    private String idShop;
    private String idShopGroup;
    private String quantity;
    private String dependsOnStock;
    private String outOfStock;
    
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
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[id_shop_group]")
    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String filter) {
        this.idShopGroup = filter;
    }
    
    @QueryParam(value="filter[quantity]")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String filter) {
        this.quantity = filter;
    }
    
    @QueryParam(value="filter[depends_on_stock]")
    public String getDependsOnStock() {
        return dependsOnStock;
    }

    public void setDependsOnStock(String filter) {
        this.dependsOnStock = filter;
    }
    
    @QueryParam(value="filter[out_of_stock]")
    public String getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(String filter) {
        this.outOfStock = filter;
    }
    
}
