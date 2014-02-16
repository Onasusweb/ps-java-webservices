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
public class CustomerMessage implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_employee", required = false)
    protected Long idEmployee;
    
    @XmlElement(name = "id_customer_thread", required = false)
    protected String idCustomerThread;
    
    @XmlElement(name = "ip_address", required = false)
    protected String ipAddress;
    
    @XmlElement(name = "message", required = true)
    protected String message;
    
    @XmlElement(name = "file_name", required = false)
    protected String fileName;
    
    @XmlElement(name = "user_agent", required = false)
    protected String userAgent;
    
    @XmlElement(name = "private", required = false)
    protected String private_;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "read", required = false)
    protected Integer read;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdEmployee() {
        return idEmployee;
    }
    
    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }
    
    public String getIdCustomerThread() {
        return idCustomerThread;
    }
    
    public void setIdCustomerThread(String idCustomerThread) {
        this.idCustomerThread = idCustomerThread;
    }
    
    public String getIpAddress() {
        return ipAddress;
    }
    
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getFileName() {
        return fileName;
    }
    
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    public String getUserAgent() {
        return userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    
    public String getPrivate() {
        return private_;
    }
    
    public void setPrivate(String private_) {
        this.private_ = private_;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public Integer getRead() {
        return read;
    }
    
    public void setRead(Integer read) {
        this.read = read;
    }
    
}
