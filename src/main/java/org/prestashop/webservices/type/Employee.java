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
public class Employee implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_lang", required = true)
    protected Integer idLang;
    
    @XmlElement(name = "last_passwd_gen", required = false)
    protected String lastPasswdGen;
    
    @XmlElement(name = "stats_date_from", required = false)
    protected String statsDateFrom;
    
    @XmlElement(name = "stats_date_to", required = false)
    protected String statsDateTo;
    
    @XmlElement(name = "passwd", required = true)
    protected String passwd;
    
    @XmlElement(name = "lastname", required = true)
    protected String lastname;
    
    @XmlElement(name = "firstname", required = true)
    protected String firstname;
    
    @XmlElement(name = "email", required = true)
    protected String email;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    @XmlElement(name = "id_profile", required = true)
    protected Integer idProfile;
    
    @XmlElement(name = "bo_color", required = false)
    protected String boColor;
    
    @XmlElement(name = "default_tab", required = false)
    protected Integer defaultTab;
    
    @XmlElement(name = "bo_theme", required = false)
    protected String boTheme;
    
    @XmlElement(name = "bo_width", required = false)
    protected Integer boWidth;
    
    @XmlElement(name = "bo_show_screencast", required = false)
    protected Integer boShowScreencast;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Integer getIdLang() {
        return idLang;
    }
    
    public void setIdLang(Integer idLang) {
        this.idLang = idLang;
    }
    
    public String getLastPasswdGen() {
        return lastPasswdGen;
    }
    
    public void setLastPasswdGen(String lastPasswdGen) {
        this.lastPasswdGen = lastPasswdGen;
    }
    
    public String getStatsDateFrom() {
        return statsDateFrom;
    }
    
    public void setStatsDateFrom(String statsDateFrom) {
        this.statsDateFrom = statsDateFrom;
    }
    
    public String getStatsDateTo() {
        return statsDateTo;
    }
    
    public void setStatsDateTo(String statsDateTo) {
        this.statsDateTo = statsDateTo;
    }
    
    public String getPasswd() {
        return passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public Integer getIdProfile() {
        return idProfile;
    }
    
    public void setIdProfile(Integer idProfile) {
        this.idProfile = idProfile;
    }
    
    public String getBoColor() {
        return boColor;
    }
    
    public void setBoColor(String boColor) {
        this.boColor = boColor;
    }
    
    public Integer getDefaultTab() {
        return defaultTab;
    }
    
    public void setDefaultTab(Integer defaultTab) {
        this.defaultTab = defaultTab;
    }
    
    public String getBoTheme() {
        return boTheme;
    }
    
    public void setBoTheme(String boTheme) {
        this.boTheme = boTheme;
    }
    
    public Integer getBoWidth() {
        return boWidth;
    }
    
    public void setBoWidth(Integer boWidth) {
        this.boWidth = boWidth;
    }
    
    public Integer getBoShowScreencast() {
        return boShowScreencast;
    }
    
    public void setBoShowScreencast(Integer boShowScreencast) {
        this.boShowScreencast = boShowScreencast;
    }
    
}
