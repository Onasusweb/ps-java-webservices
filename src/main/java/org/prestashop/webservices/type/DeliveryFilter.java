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


public class DeliveryFilter {
    
    private String id;
    private String idCarrier;
    private String idRangePrice;
    private String idRangeWeight;
    private String idZone;
    private String idShop;
    private String idShopGroup;
    private String price;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_carrier]")
    public String getIdCarrier() {
        return idCarrier;
    }

    public void setIdCarrier(String filter) {
        this.idCarrier = filter;
    }
    
    @QueryParam(value="filter[id_range_price]")
    public String getIdRangePrice() {
        return idRangePrice;
    }

    public void setIdRangePrice(String filter) {
        this.idRangePrice = filter;
    }
    
    @QueryParam(value="filter[id_range_weight]")
    public String getIdRangeWeight() {
        return idRangeWeight;
    }

    public void setIdRangeWeight(String filter) {
        this.idRangeWeight = filter;
    }
    
    @QueryParam(value="filter[id_zone]")
    public String getIdZone() {
        return idZone;
    }

    public void setIdZone(String filter) {
        this.idZone = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[id_shop_group]")
    public String getIdShopGroup() {
        return idShopGroup;
    }

    public void setIdShopGroup(String filter) {
        this.idShopGroup = filter;
    }
    
    @QueryParam(value="filter[price]")
    public String getPrice() {
        return price;
    }

    public void setPrice(String filter) {
        this.price = filter;
    }
    
}
