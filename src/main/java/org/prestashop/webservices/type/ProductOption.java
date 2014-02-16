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
public class ProductOption implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "is_color_group", required = false)
    protected Integer isColorGroup;
    
    @XmlElement(name = "group_type", required = true)
    protected String groupType;
    
    @XmlElement(name = "position", required = false)
    protected Integer position;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "public_name", required = true)
    protected String publicName;
    
    @XmlElement(name = "associations", required = false)
    protected ProductOptionAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getIsColorGroup() {
        return isColorGroup;
    }
    
    public void setIsColorGroup(Integer isColorGroup) {
        this.isColorGroup = isColorGroup;
    }
    
    public String getGroupType() {
        return groupType;
    }
    
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }
    
    public Integer getPosition() {
        return position;
    }
    
    public void setPosition(Integer position) {
        this.position = position;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPublicName() {
        return publicName;
    }
    
    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }
    
    public ProductOptionAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(ProductOptionAssociations associations) {
        this.associations = associations;
    }
    
}
