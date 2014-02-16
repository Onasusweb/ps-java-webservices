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


public class GuestFilter {
    
    private String id;
    private String idCustomer;
    private String idOperatingSystem;
    private String idWebBrowser;
    private String javascript;
    private String screenResolutionX;
    private String screenResolutionY;
    private String screenColor;
    private String sunJava;
    private String adobeFlash;
    private String adobeDirector;
    private String appleQuicktime;
    private String realPlayer;
    private String windowsMedia;
    private String acceptLanguage;
    private String mobileTheme;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_customer]")
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String filter) {
        this.idCustomer = filter;
    }
    
    @QueryParam(value="filter[id_operating_system]")
    public String getIdOperatingSystem() {
        return idOperatingSystem;
    }

    public void setIdOperatingSystem(String filter) {
        this.idOperatingSystem = filter;
    }
    
    @QueryParam(value="filter[id_web_browser]")
    public String getIdWebBrowser() {
        return idWebBrowser;
    }

    public void setIdWebBrowser(String filter) {
        this.idWebBrowser = filter;
    }
    
    @QueryParam(value="filter[javascript]")
    public String getJavascript() {
        return javascript;
    }

    public void setJavascript(String filter) {
        this.javascript = filter;
    }
    
    @QueryParam(value="filter[screen_resolution_x]")
    public String getScreenResolutionX() {
        return screenResolutionX;
    }

    public void setScreenResolutionX(String filter) {
        this.screenResolutionX = filter;
    }
    
    @QueryParam(value="filter[screen_resolution_y]")
    public String getScreenResolutionY() {
        return screenResolutionY;
    }

    public void setScreenResolutionY(String filter) {
        this.screenResolutionY = filter;
    }
    
    @QueryParam(value="filter[screen_color]")
    public String getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(String filter) {
        this.screenColor = filter;
    }
    
    @QueryParam(value="filter[sun_java]")
    public String getSunJava() {
        return sunJava;
    }

    public void setSunJava(String filter) {
        this.sunJava = filter;
    }
    
    @QueryParam(value="filter[adobe_flash]")
    public String getAdobeFlash() {
        return adobeFlash;
    }

    public void setAdobeFlash(String filter) {
        this.adobeFlash = filter;
    }
    
    @QueryParam(value="filter[adobe_director]")
    public String getAdobeDirector() {
        return adobeDirector;
    }

    public void setAdobeDirector(String filter) {
        this.adobeDirector = filter;
    }
    
    @QueryParam(value="filter[apple_quicktime]")
    public String getAppleQuicktime() {
        return appleQuicktime;
    }

    public void setAppleQuicktime(String filter) {
        this.appleQuicktime = filter;
    }
    
    @QueryParam(value="filter[real_player]")
    public String getRealPlayer() {
        return realPlayer;
    }

    public void setRealPlayer(String filter) {
        this.realPlayer = filter;
    }
    
    @QueryParam(value="filter[windows_media]")
    public String getWindowsMedia() {
        return windowsMedia;
    }

    public void setWindowsMedia(String filter) {
        this.windowsMedia = filter;
    }
    
    @QueryParam(value="filter[accept_language]")
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String filter) {
        this.acceptLanguage = filter;
    }
    
    @QueryParam(value="filter[mobile_theme]")
    public String getMobileTheme() {
        return mobileTheme;
    }

    public void setMobileTheme(String filter) {
        this.mobileTheme = filter;
    }
    
}
