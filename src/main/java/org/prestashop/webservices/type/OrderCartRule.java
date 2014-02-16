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
public class OrderCartRule implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_order", required = true)
    protected Long idOrder;
    
    @XmlElement(name = "id_cart_rule", required = true)
    protected Long idCartRule;
    
    @XmlElement(name = "id_order_invoice", required = false)
    protected Long idOrderInvoice;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "value", required = true)
    protected BigDecimal value;
    
    @XmlElement(name = "value_tax_excl", required = true)
    protected BigDecimal valueTaxExcl;
    
    @XmlElement(name = "free_shipping", required = false)
    protected Integer freeShipping;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdOrder() {
        return idOrder;
    }
    
    public void setIdOrder(Long idOrder) {
        this.idOrder = idOrder;
    }
    
    public Long getIdCartRule() {
        return idCartRule;
    }
    
    public void setIdCartRule(Long idCartRule) {
        this.idCartRule = idCartRule;
    }
    
    public Long getIdOrderInvoice() {
        return idOrderInvoice;
    }
    
    public void setIdOrderInvoice(Long idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getValue() {
        return value;
    }
    
    public void setValue(BigDecimal value) {
        this.value = value;
    }
    
    public BigDecimal getValueTaxExcl() {
        return valueTaxExcl;
    }
    
    public void setValueTaxExcl(BigDecimal valueTaxExcl) {
        this.valueTaxExcl = valueTaxExcl;
    }
    
    public Integer getFreeShipping() {
        return freeShipping;
    }
    
    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }
    
}
