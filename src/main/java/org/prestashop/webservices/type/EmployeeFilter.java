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


public class EmployeeFilter {
    
    private String id;
    private String idLang;
    private String lastPasswdGen;
    private String statsDateFrom;
    private String statsDateTo;
    private String passwd;
    private String lastname;
    private String firstname;
    private String email;
    private String active;
    private String idProfile;
    private String boColor;
    private String defaultTab;
    private String boTheme;
    private String boWidth;
    private String boShowScreencast;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_lang]")
    public String getIdLang() {
        return idLang;
    }

    public void setIdLang(String filter) {
        this.idLang = filter;
    }
    
    @QueryParam(value="filter[last_passwd_gen]")
    public String getLastPasswdGen() {
        return lastPasswdGen;
    }

    public void setLastPasswdGen(String filter) {
        this.lastPasswdGen = filter;
    }
    
    @QueryParam(value="filter[stats_date_from]")
    public String getStatsDateFrom() {
        return statsDateFrom;
    }

    public void setStatsDateFrom(String filter) {
        this.statsDateFrom = filter;
    }
    
    @QueryParam(value="filter[stats_date_to]")
    public String getStatsDateTo() {
        return statsDateTo;
    }

    public void setStatsDateTo(String filter) {
        this.statsDateTo = filter;
    }
    
    @QueryParam(value="filter[passwd]")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String filter) {
        this.passwd = filter;
    }
    
    @QueryParam(value="filter[lastname]")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String filter) {
        this.lastname = filter;
    }
    
    @QueryParam(value="filter[firstname]")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String filter) {
        this.firstname = filter;
    }
    
    @QueryParam(value="filter[email]")
    public String getEmail() {
        return email;
    }

    public void setEmail(String filter) {
        this.email = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[id_profile]")
    public String getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(String filter) {
        this.idProfile = filter;
    }
    
    @QueryParam(value="filter[bo_color]")
    public String getBoColor() {
        return boColor;
    }

    public void setBoColor(String filter) {
        this.boColor = filter;
    }
    
    @QueryParam(value="filter[default_tab]")
    public String getDefaultTab() {
        return defaultTab;
    }

    public void setDefaultTab(String filter) {
        this.defaultTab = filter;
    }
    
    @QueryParam(value="filter[bo_theme]")
    public String getBoTheme() {
        return boTheme;
    }

    public void setBoTheme(String filter) {
        this.boTheme = filter;
    }
    
    @QueryParam(value="filter[bo_width]")
    public String getBoWidth() {
        return boWidth;
    }

    public void setBoWidth(String filter) {
        this.boWidth = filter;
    }
    
    @QueryParam(value="filter[bo_show_screencast]")
    public String getBoShowScreencast() {
        return boShowScreencast;
    }

    public void setBoShowScreencast(String filter) {
        this.boShowScreencast = filter;
    }
    
}
