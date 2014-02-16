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


public class ImageTypeFilter {
    
    private String id;
    private String name;
    private String width;
    private String height;
    private String categories;
    private String products;
    private String manufacturers;
    private String suppliers;
    private String scenes;
    private String stores;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[width]")
    public String getWidth() {
        return width;
    }

    public void setWidth(String filter) {
        this.width = filter;
    }
    
    @QueryParam(value="filter[height]")
    public String getHeight() {
        return height;
    }

    public void setHeight(String filter) {
        this.height = filter;
    }
    
    @QueryParam(value="filter[categories]")
    public String getCategories() {
        return categories;
    }

    public void setCategories(String filter) {
        this.categories = filter;
    }
    
    @QueryParam(value="filter[products]")
    public String getProducts() {
        return products;
    }

    public void setProducts(String filter) {
        this.products = filter;
    }
    
    @QueryParam(value="filter[manufacturers]")
    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String filter) {
        this.manufacturers = filter;
    }
    
    @QueryParam(value="filter[suppliers]")
    public String getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(String filter) {
        this.suppliers = filter;
    }
    
    @QueryParam(value="filter[scenes]")
    public String getScenes() {
        return scenes;
    }

    public void setScenes(String filter) {
        this.scenes = filter;
    }
    
    @QueryParam(value="filter[stores]")
    public String getStores() {
        return stores;
    }

    public void setStores(String filter) {
        this.stores = filter;
    }
    
}
