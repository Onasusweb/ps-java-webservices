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


public class CustomerMessageFilter {
    
    private String id;
    private String idEmployee;
    private String idCustomerThread;
    private String ipAddress;
    private String message;
    private String fileName;
    private String userAgent;
    private String private_;
    private String dateAdd;
    private String read;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_employee]")
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String filter) {
        this.idEmployee = filter;
    }
    
    @QueryParam(value="filter[id_customer_thread]")
    public String getIdCustomerThread() {
        return idCustomerThread;
    }

    public void setIdCustomerThread(String filter) {
        this.idCustomerThread = filter;
    }
    
    @QueryParam(value="filter[ip_address]")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String filter) {
        this.ipAddress = filter;
    }
    
    @QueryParam(value="filter[message]")
    public String getMessage() {
        return message;
    }

    public void setMessage(String filter) {
        this.message = filter;
    }
    
    @QueryParam(value="filter[file_name]")
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String filter) {
        this.fileName = filter;
    }
    
    @QueryParam(value="filter[user_agent]")
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String filter) {
        this.userAgent = filter;
    }
    
    @QueryParam(value="filter[private]")
    public String getPrivate() {
        return private_;
    }

    public void setPrivate(String filter) {
        this.private_ = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
    @QueryParam(value="filter[read]")
    public String getRead() {
        return read;
    }

    public void setRead(String filter) {
        this.read = filter;
    }
    
}
