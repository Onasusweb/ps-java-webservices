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
public class ProductAssociations implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElementWrapper(name="categories", required = false)
    @XmlElement(name = "category", required = true)
    protected List<Category> categories ;
    
    @XmlElementWrapper(name="images", required = false)
    @XmlElement(name = "image", required = true)
    protected List<Image> images ;
    
    @XmlElementWrapper(name="combinations", required = false)
    @XmlElement(name = "combinations", required = true)
    protected List<Combinations> combinations ;
    
    @XmlElementWrapper(name="product_option_values", required = false)
    @XmlElement(name = "product_options_values", required = true)
    protected List<ProductOptionsValues> productOptionValues ;
    
    @XmlElementWrapper(name="product_features", required = false)
    @XmlElement(name = "product_feature", required = true)
    protected List<ProductFeature> productFeatures ;
    
    @XmlElementWrapper(name="tags", required = false)
    @XmlElement(name = "tag", required = true)
    protected List<Tag> tags ;
    
    @XmlElementWrapper(name="stock_availables", required = false)
    @XmlElement(name = "stock_available", required = true)
    protected List<StockAvailable> stockAvailables ;
    
    @XmlElementWrapper(name="accessories", required = false)
    @XmlElement(name = "product", required = true)
    protected List<Product> accessories ;
    
    @XmlElementWrapper(name="product_bundle", required = false)
    @XmlElement(name = "products", required = true)
    protected List<Products> productBundle ;
    
    public List<Category> getCategories() {
        return categories;
    }
    
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
    
    public List<Image> getImages() {
        return images;
    }
    
    public void setImages(List<Image> images) {
        this.images = images;
    }
    
    public List<Combinations> getCombinations() {
        return combinations;
    }
    
    public void setCombinations(List<Combinations> combinations) {
        this.combinations = combinations;
    }
    
    public List<ProductOptionsValues> getProductOptionValues() {
        return productOptionValues;
    }
    
    public void setProductOptionValues(List<ProductOptionsValues> productOptionValues) {
        this.productOptionValues = productOptionValues;
    }
    
    public List<ProductFeature> getProductFeatures() {
        return productFeatures;
    }
    
    public void setProductFeatures(List<ProductFeature> productFeatures) {
        this.productFeatures = productFeatures;
    }
    
    public List<Tag> getTags() {
        return tags;
    }
    
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
    
    public List<StockAvailable> getStockAvailables() {
        return stockAvailables;
    }
    
    public void setStockAvailables(List<StockAvailable> stockAvailables) {
        this.stockAvailables = stockAvailables;
    }
    
    public List<Product> getAccessories() {
        return accessories;
    }
    
    public void setAccessories(List<Product> accessories) {
        this.accessories = accessories;
    }
    
    public List<Products> getProductBundle() {
        return productBundle;
    }
    
    public void setProductBundle(List<Products> productBundle) {
        this.productBundle = productBundle;
    }
    
}
