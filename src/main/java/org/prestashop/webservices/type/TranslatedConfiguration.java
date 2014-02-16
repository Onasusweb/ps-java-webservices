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
public class TranslatedConfiguration implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "value", required = false)
    protected String value;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected Long idShopGroup;
    
    @XmlElement(name = "id_shop", required = false)
    protected Long idShop;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
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
    
    public Long getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(Long idShopGroup) {
        this.idShopGroup = idShopGroup;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
}
