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


public class ProductOptionFilter {
    
    private String id;
    private String isColorGroup;
    private String groupType;
    private String position;
    private String name;
    private String publicName;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[is_color_group]")
    public String getIsColorGroup() {
        return isColorGroup;
    }

    public void setIsColorGroup(String filter) {
        this.isColorGroup = filter;
    }
    
    @QueryParam(value="filter[group_type]")
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String filter) {
        this.groupType = filter;
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
    
    @QueryParam(value="filter[public_name]")
    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String filter) {
        this.publicName = filter;
    }
    
}
