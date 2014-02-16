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
public class ImageType implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "width", required = true)
    protected String width;
    
    @XmlElement(name = "height", required = true)
    protected String height;
    
    @XmlElement(name = "categories", required = false)
    protected Integer categories;
    
    @XmlElement(name = "products", required = false)
    protected Integer products;
    
    @XmlElement(name = "manufacturers", required = false)
    protected Integer manufacturers;
    
    @XmlElement(name = "suppliers", required = false)
    protected Integer suppliers;
    
    @XmlElement(name = "scenes", required = false)
    protected Integer scenes;
    
    @XmlElement(name = "stores", required = false)
    protected Integer stores;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getWidth() {
        return width;
    }
    
    public void setWidth(String width) {
        this.width = width;
    }
    
    public String getHeight() {
        return height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    
    public Integer getCategories() {
        return categories;
    }
    
    public void setCategories(Integer categories) {
        this.categories = categories;
    }
    
    public Integer getProducts() {
        return products;
    }
    
    public void setProducts(Integer products) {
        this.products = products;
    }
    
    public Integer getManufacturers() {
        return manufacturers;
    }
    
    public void setManufacturers(Integer manufacturers) {
        this.manufacturers = manufacturers;
    }
    
    public Integer getSuppliers() {
        return suppliers;
    }
    
    public void setSuppliers(Integer suppliers) {
        this.suppliers = suppliers;
    }
    
    public Integer getScenes() {
        return scenes;
    }
    
    public void setScenes(Integer scenes) {
        this.scenes = scenes;
    }
    
    public Integer getStores() {
        return stores;
    }
    
    public void setStores(Integer stores) {
        this.stores = stores;
    }
    
}
