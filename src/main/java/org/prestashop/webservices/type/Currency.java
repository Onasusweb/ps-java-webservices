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
public class Currency implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "iso_code", required = true)
    protected String isoCode;
    
    @XmlElement(name = "iso_code_num", required = false)
    protected String isoCodeNum;
    
    @XmlElement(name = "blank", required = false)
    protected Integer blank;
    
    @XmlElement(name = "sign", required = true)
    protected String sign;
    
    @XmlElement(name = "format", required = true)
    protected Long format;
    
    @XmlElement(name = "decimals", required = true)
    protected Integer decimals;
    
    @XmlElement(name = "conversion_rate", required = true)
    protected BigDecimal conversionRate;
    
    @XmlElement(name = "deleted", required = false)
    protected Integer deleted;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
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
    
    public String getIsoCode() {
        return isoCode;
    }
    
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }
    
    public String getIsoCodeNum() {
        return isoCodeNum;
    }
    
    public void setIsoCodeNum(String isoCodeNum) {
        this.isoCodeNum = isoCodeNum;
    }
    
    public Integer getBlank() {
        return blank;
    }
    
    public void setBlank(Integer blank) {
        this.blank = blank;
    }
    
    public String getSign() {
        return sign;
    }
    
    public void setSign(String sign) {
        this.sign = sign;
    }
    
    public Long getFormat() {
        return format;
    }
    
    public void setFormat(Long format) {
        this.format = format;
    }
    
    public Integer getDecimals() {
        return decimals;
    }
    
    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }
    
    public BigDecimal getConversionRate() {
        return conversionRate;
    }
    
    public void setConversionRate(BigDecimal conversionRate) {
        this.conversionRate = conversionRate;
    }
    
    public Integer getDeleted() {
        return deleted;
    }
    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
}
