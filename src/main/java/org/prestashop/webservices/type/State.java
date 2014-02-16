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
public class State implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_zone", required = true)
    protected Long idZone;
    
    @XmlElement(name = "id_country", required = true)
    protected Long idCountry;
    
    @XmlElement(name = "iso_code", required = true)
    protected String isoCode;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdZone() {
        return idZone;
    }
    
    public void setIdZone(Long idZone) {
        this.idZone = idZone;
    }
    
    public Long getIdCountry() {
        return idCountry;
    }
    
    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    public String getIsoCode() {
        return isoCode;
    }
    
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
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
    
}
