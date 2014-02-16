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


public class ProductOptionValueFilter {
    
    private String id;
    private String idAttributeGroup;
    private String color;
    private String position;
    private String name;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_attribute_group]")
    public String getIdAttributeGroup() {
        return idAttributeGroup;
    }

    public void setIdAttributeGroup(String filter) {
        this.idAttributeGroup = filter;
    }
    
    @QueryParam(value="filter[color]")
    public String getColor() {
        return color;
    }

    public void setColor(String filter) {
        this.color = filter;
    }
    
    @QueryParam(value="filter[position]")
    public String getPosition() {
        return position;
    }

    public void setPosition(String filter) {
        this.position = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
}
