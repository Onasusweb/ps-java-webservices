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
public class Delivery implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_carrier", required = true)
    protected Long idCarrier;
    
    @XmlElement(name = "id_range_price", required = true)
    protected Long idRangePrice;
    
    @XmlElement(name = "id_range_weight", required = true)
    protected Long idRangeWeight;
    
    @XmlElement(name = "id_zone", required = true)
    protected Long idZone;
    
    @XmlElement(name = "id_shop", required = false)
    protected String idShop;
    
    @XmlElement(name = "id_shop_group", required = false)
    protected String idShopGroup;
    
    @XmlElement(name = "price", required = true)
    protected String price;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdCarrier() {
        return idCarrier;
    }
    
    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
    }
    
    public Long getIdRangePrice() {
        return idRangePrice;
    }
    
    public void setIdRangePrice(Long idRangePrice) {
        this.idRangePrice = idRangePrice;
    }
    
    public Long getIdRangeWeight() {
        return idRangeWeight;
    }
    
    public void setIdRangeWeight(Long idRangeWeight) {
        this.idRangeWeight = idRangeWeight;
    }
    
    public Long getIdZone() {
        return idZone;
    }
    
    public void setIdZone(Long idZone) {
        this.idZone = idZone;
    }
    
    public String getIdShop() {
        return idShop;
    }
    
    public void setIdShop(String idShop) {
        this.idShop = idShop;
    }
    
    public String getIdShopGroup() {
        return idShopGroup;
    }
    
    public void setIdShopGroup(String idShopGroup) {
        this.idShopGroup = idShopGroup;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
}
