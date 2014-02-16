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
public class Address implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_customer", required = false)
    protected Long idCustomer;
    
    @XmlElement(name = "id_manufacturer", required = false)
    protected Long idManufacturer;
    
    @XmlElement(name = "id_supplier", required = false)
    protected Long idSupplier;
    
    @XmlElement(name = "id_warehouse", required = false)
    protected Long idWarehouse;
    
    @XmlElement(name = "id_country", required = true)
    protected Long idCountry;
    
    @XmlElement(name = "id_state", required = false)
    protected Long idState;
    
    @XmlElement(name = "alias", required = true)
    protected String alias;
    
    @XmlElement(name = "company", required = false)
    protected String company;
    
    @XmlElement(name = "lastname", required = true)
    protected String lastname;
    
    @XmlElement(name = "firstname", required = true)
    protected String firstname;
    
    @XmlElement(name = "vat_number", required = false)
    protected String vatNumber;
    
    @XmlElement(name = "address1", required = true)
    protected String address1;
    
    @XmlElement(name = "address2", required = false)
    protected String address2;
    
    @XmlElement(name = "postcode", required = false)
    protected String postcode;
    
    @XmlElement(name = "city", required = true)
    protected String city;
    
    @XmlElement(name = "other", required = false)
    protected String other;
    
    @XmlElement(name = "phone", required = false)
    protected String phone;
    
    @XmlElement(name = "phone_mobile", required = false)
    protected String phoneMobile;
    
    @XmlElement(name = "dni", required = false)
    protected String dni;
    
    @XmlElement(name = "deleted", required = false)
    protected Integer deleted;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdCustomer() {
        return idCustomer;
    }
    
    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    public Long getIdManufacturer() {
        return idManufacturer;
    }
    
    public void setIdManufacturer(Long idManufacturer) {
        this.idManufacturer = idManufacturer;
    }
    
    public Long getIdSupplier() {
        return idSupplier;
    }
    
    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    public Long getIdWarehouse() {
        return idWarehouse;
    }
    
    public void setIdWarehouse(Long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    public Long getIdCountry() {
        return idCountry;
    }
    
    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }
    
    public Long getIdState() {
        return idState;
    }
    
    public void setIdState(Long idState) {
        this.idState = idState;
    }
    
    public String getAlias() {
        return alias;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public String getVatNumber() {
        return vatNumber;
    }
    
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }
    
    public String getAddress1() {
        return address1;
    }
    
    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    public String getAddress2() {
        return address2;
    }
    
    public void setAddress2(String address2) {
        this.address2 = address2;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getOther() {
        return other;
    }
    
    public void setOther(String other) {
        this.other = other;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhoneMobile() {
        return phoneMobile;
    }
    
    public void setPhoneMobile(String phoneMobile) {
        this.phoneMobile = phoneMobile;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public Integer getDeleted() {
        return deleted;
    }
    
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public String getDateUpd() {
        return dateUpd;
    }
    
    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }
    
}
