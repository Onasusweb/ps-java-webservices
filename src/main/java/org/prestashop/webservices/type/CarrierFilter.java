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


public class CarrierFilter {
    
    private String id;
    private String deleted;
    private String isModule;
    private String idTaxRulesGroup;
    private String idReference;
    private String name;
    private String active;
    private String isFree;
    private String url;
    private String shippingHandling;
    private String shippingExternal;
    private String rangeBehavior;
    private String shippingMethod;
    private String maxWidth;
    private String maxHeight;
    private String maxDepth;
    private String maxWeight;
    private String grade;
    private String externalModuleName;
    private String needRange;
    private String position;
    private String delay;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[deleted]")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String filter) {
        this.deleted = filter;
    }
    
    @QueryParam(value="filter[is_module]")
    public String getIsModule() {
        return isModule;
    }

    public void setIsModule(String filter) {
        this.isModule = filter;
    }
    
    @QueryParam(value="filter[id_tax_rules_group]")
    public String getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(String filter) {
        this.idTaxRulesGroup = filter;
    }
    
    @QueryParam(value="filter[id_reference]")
    public String getIdReference() {
        return idReference;
    }

    public void setIdReference(String filter) {
        this.idReference = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[is_free]")
    public String getIsFree() {
        return isFree;
    }

    public void setIsFree(String filter) {
        this.isFree = filter;
    }
    
    @QueryParam(value="filter[url]")
    public String getUrl() {
        return url;
    }

    public void setUrl(String filter) {
        this.url = filter;
    }
    
    @QueryParam(value="filter[shipping_handling]")
    public String getShippingHandling() {
        return shippingHandling;
    }

    public void setShippingHandling(String filter) {
        this.shippingHandling = filter;
    }
    
    @QueryParam(value="filter[shipping_external]")
    public String getShippingExternal() {
        return shippingExternal;
    }

    public void setShippingExternal(String filter) {
        this.shippingExternal = filter;
    }
    
    @QueryParam(value="filter[range_behavior]")
    public String getRangeBehavior() {
        return rangeBehavior;
    }

    public void setRangeBehavior(String filter) {
        this.rangeBehavior = filter;
    }
    
    @QueryParam(value="filter[shipping_method]")
    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String filter) {
        this.shippingMethod = filter;
    }
    
    @QueryParam(value="filter[max_width]")
    public String getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(String filter) {
        this.maxWidth = filter;
    }
    
    @QueryParam(value="filter[max_height]")
    public String getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(String filter) {
        this.maxHeight = filter;
    }
    
    @QueryParam(value="filter[max_depth]")
    public String getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(String filter) {
        this.maxDepth = filter;
    }
    
    @QueryParam(value="filter[max_weight]")
    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String filter) {
        this.maxWeight = filter;
    }
    
    @QueryParam(value="filter[grade]")
    public String getGrade() {
        return grade;
    }

    public void setGrade(String filter) {
        this.grade = filter;
    }
    
    @QueryParam(value="filter[external_module_name]")
    public String getExternalModuleName() {
        return externalModuleName;
    }

    public void setExternalModuleName(String filter) {
        this.externalModuleName = filter;
    }
    
    @QueryParam(value="filter[need_range]")
    public String getNeedRange() {
        return needRange;
    }

    public void setNeedRange(String filter) {
        this.needRange = filter;
    }
    
    @QueryParam(value="filter[position]")
    public String getPosition() {
        return position;
    }

    public void setPosition(String filter) {
        this.position = filter;
    }
    
    @QueryParam(value="filter[delay]")
    public String getDelay() {
        return delay;
    }

    public void setDelay(String filter) {
        this.delay = filter;
    }
    
}
