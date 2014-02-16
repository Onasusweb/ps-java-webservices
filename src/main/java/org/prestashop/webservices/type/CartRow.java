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
public class CartRow implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id_product", required = true)
    protected String idProduct;
    
    @XmlElement(name = "id_product_attribute", required = true)
    protected String idProductAttribute;
    
    @XmlElement(name = "id_address_delivery", required = true)
    protected String idAddressDelivery;
    
    @XmlElement(name = "quantity", required = true)
    protected String quantity;
    
    public String getIdProduct() {
        return idProduct;
    }
    
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }
    
    public String getIdProductAttribute() {
        return idProductAttribute;
    }
    
    public void setIdProductAttribute(String idProductAttribute) {
        this.idProductAttribute = idProductAttribute;
    }
    
    public String getIdAddressDelivery() {
        return idAddressDelivery;
    }
    
    public void setIdAddressDelivery(String idAddressDelivery) {
        this.idAddressDelivery = idAddressDelivery;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
}
