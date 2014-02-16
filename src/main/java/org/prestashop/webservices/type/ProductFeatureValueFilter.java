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


public class ProductFeatureValueFilter {
    
    private String id;
    private String idFeature;
    private String custom;
    private String value;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_feature]")
    public String getIdFeature() {
        return idFeature;
    }

    public void setIdFeature(String filter) {
        this.idFeature = filter;
    }
    
    @QueryParam(value="filter[custom]")
    public String getCustom() {
        return custom;
    }

    public void setCustom(String filter) {
        this.custom = filter;
    }
    
    @QueryParam(value="filter[value]")
    public String getValue() {
        return value;
    }

    public void setValue(String filter) {
        this.value = filter;
    }
    
}
