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
public class WarehouseAssociations implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElementWrapper(name="stocks", required = false)
    @XmlElement(name = "stock", required = true)
    protected List<Stock> stocks ;
    
    @XmlElementWrapper(name="carriers", required = false)
    @XmlElement(name = "carrier", required = true)
    protected List<Carrier> carriers ;
    
    @XmlElementWrapper(name="shops", required = false)
    @XmlElement(name = "shop", required = true)
    protected List<Shop> shops ;
    
    public List<Stock> getStocks() {
        return stocks;
    }
    
    public void setStocks(List<Stock> stocks) {
        this.stocks = stocks;
    }
    
    public List<Carrier> getCarriers() {
        return carriers;
    }
    
    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }
    
    public List<Shop> getShops() {
        return shops;
    }
    
    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }
    
}
