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
public class Guest implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_customer", required = false)
    protected Long idCustomer;
    
    @XmlElement(name = "id_operating_system", required = false)
    protected Long idOperatingSystem;
    
    @XmlElement(name = "id_web_browser", required = false)
    protected Long idWebBrowser;
    
    @XmlElement(name = "javascript", required = false)
    protected Integer javascript;
    
    @XmlElement(name = "screen_resolution_x", required = false)
    protected Integer screenResolutionX;
    
    @XmlElement(name = "screen_resolution_y", required = false)
    protected Integer screenResolutionY;
    
    @XmlElement(name = "screen_color", required = false)
    protected Integer screenColor;
    
    @XmlElement(name = "sun_java", required = false)
    protected Integer sunJava;
    
    @XmlElement(name = "adobe_flash", required = false)
    protected Integer adobeFlash;
    
    @XmlElement(name = "adobe_director", required = false)
    protected Integer adobeDirector;
    
    @XmlElement(name = "apple_quicktime", required = false)
    protected Integer appleQuicktime;
    
    @XmlElement(name = "real_player", required = false)
    protected Integer realPlayer;
    
    @XmlElement(name = "windows_media", required = false)
    protected Integer windowsMedia;
    
    @XmlElement(name = "accept_language", required = false)
    protected String acceptLanguage;
    
    @XmlElement(name = "mobile_theme", required = false)
    protected Integer mobileTheme;
    
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
    
    public Long getIdOperatingSystem() {
        return idOperatingSystem;
    }
    
    public void setIdOperatingSystem(Long idOperatingSystem) {
        this.idOperatingSystem = idOperatingSystem;
    }
    
    public Long getIdWebBrowser() {
        return idWebBrowser;
    }
    
    public void setIdWebBrowser(Long idWebBrowser) {
        this.idWebBrowser = idWebBrowser;
    }
    
    public Integer getJavascript() {
        return javascript;
    }
    
    public void setJavascript(Integer javascript) {
        this.javascript = javascript;
    }
    
    public Integer getScreenResolutionX() {
        return screenResolutionX;
    }
    
    public void setScreenResolutionX(Integer screenResolutionX) {
        this.screenResolutionX = screenResolutionX;
    }
    
    public Integer getScreenResolutionY() {
        return screenResolutionY;
    }
    
    public void setScreenResolutionY(Integer screenResolutionY) {
        this.screenResolutionY = screenResolutionY;
    }
    
    public Integer getScreenColor() {
        return screenColor;
    }
    
    public void setScreenColor(Integer screenColor) {
        this.screenColor = screenColor;
    }
    
    public Integer getSunJava() {
        return sunJava;
    }
    
    public void setSunJava(Integer sunJava) {
        this.sunJava = sunJava;
    }
    
    public Integer getAdobeFlash() {
        return adobeFlash;
    }
    
    public void setAdobeFlash(Integer adobeFlash) {
        this.adobeFlash = adobeFlash;
    }
    
    public Integer getAdobeDirector() {
        return adobeDirector;
    }
    
    public void setAdobeDirector(Integer adobeDirector) {
        this.adobeDirector = adobeDirector;
    }
    
    public Integer getAppleQuicktime() {
        return appleQuicktime;
    }
    
    public void setAppleQuicktime(Integer appleQuicktime) {
        this.appleQuicktime = appleQuicktime;
    }
    
    public Integer getRealPlayer() {
        return realPlayer;
    }
    
    public void setRealPlayer(Integer realPlayer) {
        this.realPlayer = realPlayer;
    }
    
    public Integer getWindowsMedia() {
        return windowsMedia;
    }
    
    public void setWindowsMedia(Integer windowsMedia) {
        this.windowsMedia = windowsMedia;
    }
    
    public String getAcceptLanguage() {
        return acceptLanguage;
    }
    
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }
    
    public Integer getMobileTheme() {
        return mobileTheme;
    }
    
    public void setMobileTheme(Integer mobileTheme) {
        this.mobileTheme = mobileTheme;
    }
    
}
