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


public class PriceRangeFilter {
    
    private String id;
    private String idCarrier;
    private String delimiter1;
    private String delimiter2;
    
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
    
    @QueryParam(value="filter[delimiter1]")
    public String getDelimiter1() {
        return delimiter1;
    }

    public void setDelimiter1(String filter) {
        this.delimiter1 = filter;
    }
    
    @QueryParam(value="filter[delimiter2]")
    public String getDelimiter2() {
        return delimiter2;
    }

    public void setDelimiter2(String filter) {
        this.delimiter2 = filter;
    }
    
}
