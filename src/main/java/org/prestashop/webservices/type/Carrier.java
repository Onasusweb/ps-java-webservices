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
public class Carrier implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "deleted", required = false)
    protected Integer deleted;
    
    @XmlElement(name = "is_module", required = false)
    protected Integer isModule;
    
    @XmlElement(name = "id_tax_rules_group", required = false)
    protected String idTaxRulesGroup;
    
    @XmlElement(name = "id_reference", required = false)
    protected String idReference;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "active", required = true)
    protected Integer active;
    
    @XmlElement(name = "is_free", required = false)
    protected Integer isFree;
    
    @XmlElement(name = "url", required = false)
    protected String url;
    
    @XmlElement(name = "shipping_handling", required = false)
    protected Integer shippingHandling;
    
    @XmlElement(name = "shipping_external", required = false)
    protected String shippingExternal;
    
    @XmlElement(name = "range_behavior", required = false)
    protected Integer rangeBehavior;
    
    @XmlElement(name = "shipping_method", required = false)
    protected Integer shippingMethod;
    
    @XmlElement(name = "max_width", required = false)
    protected Integer maxWidth;
    
    @XmlElement(name = "max_height", required = false)
    protected Integer maxHeight;
    
    @XmlElement(name = "max_depth", required = false)
    protected Integer maxDepth;
    
    @XmlElement(name = "max_weight", required = false)
    protected BigDecimal maxWeight;
    
    @XmlElement(name = "grade", required = false)
    protected Integer grade;
    
    @XmlElement(name = "external_module_name", required = false)
    protected String externalModuleName;
    
    @XmlElement(name = "need_range", required = false)
    protected String needRange;
    
    @XmlElement(name = "position", required = false)
    protected String position;
    
    @XmlElement(name = "delay", required = true)
    protected String delay;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getDeleted() {
        return deleted;
    }
    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    
    public Integer getIsModule() {
        return isModule;
    }
    
    public void setIsModule(Integer isModule) {
        this.isModule = isModule;
    }
    
    public String getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }
    
    public void setIdTaxRulesGroup(String idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }
    
    public String getIdReference() {
        return idReference;
    }
    
    public void setIdReference(String idReference) {
        this.idReference = idReference;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public Integer getIsFree() {
        return isFree;
    }
    
    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Integer getShippingHandling() {
        return shippingHandling;
    }
    
    public void setShippingHandling(Integer shippingHandling) {
        this.shippingHandling = shippingHandling;
    }
    
    public String getShippingExternal() {
        return shippingExternal;
    }
    
    public void setShippingExternal(String shippingExternal) {
        this.shippingExternal = shippingExternal;
    }
    
    public Integer getRangeBehavior() {
        return rangeBehavior;
    }
    
    public void setRangeBehavior(Integer rangeBehavior) {
        this.rangeBehavior = rangeBehavior;
    }
    
    public Integer getShippingMethod() {
        return shippingMethod;
    }
    
    public void setShippingMethod(Integer shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
    
    public Integer getMaxWidth() {
        return maxWidth;
    }
    
    public void setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
    }
    
    public Integer getMaxHeight() {
        return maxHeight;
    }
    
    public void setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
    }
    
    public Integer getMaxDepth() {
        return maxDepth;
    }
    
    public void setMaxDepth(Integer maxDepth) {
        this.maxDepth = maxDepth;
    }
    
    public BigDecimal getMaxWeight() {
        return maxWeight;
    }
    
    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public Integer getGrade() {
        return grade;
    }
    
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
    
    public String getExternalModuleName() {
        return externalModuleName;
    }
    
    public void setExternalModuleName(String externalModuleName) {
        this.externalModuleName = externalModuleName;
    }
    
    public String getNeedRange() {
        return needRange;
    }
    
    public void setNeedRange(String needRange) {
        this.needRange = needRange;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getDelay() {
        return delay;
    }
    
    public void setDelay(String delay) {
        this.delay = delay;
    }
    
}
