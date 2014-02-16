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
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="prestashop")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrestashopContentManagementSystem implements Serializable {
    
    @XmlElementWrapper(name="content_management_system", required = false)
    @XmlElement(name = "content", required = false)
    private List<Content> contentManagementSystem;

    public List<Content> getContentManagementSystem() {
        return contentManagementSystem;
    }

    public void setContentManagementSystem(List<Content> contentManagementSystem) {
        this.contentManagementSystem = contentManagementSystem;
    }
    
}
