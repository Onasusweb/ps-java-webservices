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
public class Content implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_cms_category", required = false)
    protected Integer idCmsCategory;
    
    @XmlElement(name = "position", required = false)
    protected String position;
    
    @XmlElement(name = "indexation", required = false)
    protected String indexation;
    
    @XmlElement(name = "active", required = false)
    protected String active;
    
    @XmlElement(name = "meta_description", required = false)
    protected String metaDescription;
    
    @XmlElement(name = "meta_keywords", required = false)
    protected String metaKeywords;
    
    @XmlElement(name = "meta_title", required = true)
    protected String metaTitle;
    
    @XmlElement(name = "link_rewrite", required = true)
    protected String linkRewrite;
    
    @XmlElement(name = "content", required = false)
    protected String content;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getIdCmsCategory() {
        return idCmsCategory;
    }
    
    public void setIdCmsCategory(Integer idCmsCategory) {
        this.idCmsCategory = idCmsCategory;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getIndexation() {
        return indexation;
    }
    
    public void setIndexation(String indexation) {
        this.indexation = indexation;
    }
    
    public String getActive() {
        return active;
    }
    
    public void setActive(String active) {
        this.active = active;
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
    
    public String getMetaTitle() {
        return metaTitle;
    }
    
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }
    
    public String getLinkRewrite() {
        return linkRewrite;
    }
    
    public void setLinkRewrite(String linkRewrite) {
        this.linkRewrite = linkRewrite;
    }
    
    public String getContent() {
        return content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    
}
