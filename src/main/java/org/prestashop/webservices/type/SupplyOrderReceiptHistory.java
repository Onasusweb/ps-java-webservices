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
public class SupplyOrderReceiptHistory implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_supply_order_detail", required = true)
    protected Long idSupplyOrderDetail;
    
    @XmlElement(name = "id_employee", required = true)
    protected Long idEmployee;
    
    @XmlElement(name = "id_supply_order_state", required = true)
    protected Long idSupplyOrderState;
    
    @XmlElement(name = "employee_firstname", required = false)
    protected String employeeFirstname;
    
    @XmlElement(name = "employee_lastname", required = false)
    protected String employeeLastname;
    
    @XmlElement(name = "quantity", required = true)
    protected Integer quantity;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdSupplyOrderDetail() {
        return idSupplyOrderDetail;
    }
    
    public void setIdSupplyOrderDetail(Long idSupplyOrderDetail) {
        this.idSupplyOrderDetail = idSupplyOrderDetail;
    }
    
    public Long getIdEmployee() {
        return idEmployee;
    }
    
    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }
    
    public Long getIdSupplyOrderState() {
        return idSupplyOrderState;
    }
    
    public void setIdSupplyOrderState(Long idSupplyOrderState) {
        this.idSupplyOrderState = idSupplyOrderState;
    }
    
    public String getEmployeeFirstname() {
        return employeeFirstname;
    }
    
    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }
    
    public String getEmployeeLastname() {
        return employeeLastname;
    }
    
    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
}
