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
public class Category implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_parent", required = false)
    protected Integer idParent;
    
    @XmlElement(name = "level_depth", required = false)
    protected Integer levelDepth;
    
    @XmlElement(name = "nb_products_recursive", required = false)
    protected String nbProductsRecursive;
    
    @XmlElement(name = "active", required = true)
    protected Integer active;
    
    @XmlElement(name = "id_shop_default", required = false)
    protected Long idShopDefault;
    
    @XmlElement(name = "is_root_category", required = false)
    protected Integer isRootCategory;
    
    @XmlElement(name = "position", required = false)
    protected String position;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "link_rewrite", required = true)
    protected String linkRewrite;
    
    @XmlElement(name = "description", required = false)
    protected String description;
    
    @XmlElement(name = "meta_title", required = false)
    protected String metaTitle;
    
    @XmlElement(name = "meta_description", required = false)
    protected String metaDescription;
    
    @XmlElement(name = "meta_keywords", required = false)
    protected String metaKeywords;
    
    @XmlElement(name = "associations", required = false)
    protected CategoryAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getIdParent() {
        return idParent;
    }
    
    public void setIdParent(Integer idParent) {
        this.idParent = idParent;
    }
    
    public Integer getLevelDepth() {
        return levelDepth;
    }
    
    public void setLevelDepth(Integer levelDepth) {
        this.levelDepth = levelDepth;
    }
    
    public String getNbProductsRecursive() {
        return nbProductsRecursive;
    }
    
    public void setNbProductsRecursive(String nbProductsRecursive) {
        this.nbProductsRecursive = nbProductsRecursive;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public Long getIdShopDefault() {
        return idShopDefault;
    }
    
    public void setIdShopDefault(Long idShopDefault) {
        this.idShopDefault = idShopDefault;
    }
    
    public Integer getIsRootCategory() {
        return isRootCategory;
    }
    
    public void setIsRootCategory(Integer isRootCategory) {
        this.isRootCategory = isRootCategory;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
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
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLinkRewrite() {
        return linkRewrite;
    }
    
    public void setLinkRewrite(String linkRewrite) {
        this.linkRewrite = linkRewrite;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getMetaTitle() {
        return metaTitle;
    }
    
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }
    
    public String getMetaDescription() {
        return metaDescription;
    }
    
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }
    
    public String getMetaKeywords() {
        return metaKeywords;
    }
    
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }
    
    public CategoryAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(CategoryAssociations associations) {
        this.associations = associations;
    }
    
}
