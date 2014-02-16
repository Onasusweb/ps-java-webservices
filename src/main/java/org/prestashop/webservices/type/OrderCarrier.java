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
public class OrderCarrier implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_order", required = true)
    protected Long idOrder;
    
    @XmlElement(name = "id_carrier", required = true)
    protected Long idCarrier;
    
    @XmlElement(name = "id_order_invoice", required = false)
    protected Long idOrderInvoice;
    
    @XmlElement(name = "weight", required = false)
    protected BigDecimal weight;
    
    @XmlElement(name = "shipping_cost_tax_excl", required = false)
    protected BigDecimal shippingCostTaxExcl;
    
    @XmlElement(name = "shipping_cost_tax_incl", required = false)
    protected BigDecimal shippingCostTaxIncl;
    
    @XmlElement(name = "tracking_number", required = false)
    protected String trackingNumber;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
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
    
    public Long getIdCarrier() {
        return idCarrier;
    }
    
    public void setIdCarrier(Long idCarrier) {
        this.idCarrier = idCarrier;
    }
    
    public Long getIdOrderInvoice() {
        return idOrderInvoice;
    }
    
    public void setIdOrderInvoice(Long idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }
    
    public BigDecimal getWeight() {
        return weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    
    public BigDecimal getShippingCostTaxExcl() {
        return shippingCostTaxExcl;
    }
    
    public void setShippingCostTaxExcl(BigDecimal shippingCostTaxExcl) {
        this.shippingCostTaxExcl = shippingCostTaxExcl;
    }
    
    public BigDecimal getShippingCostTaxIncl() {
        return shippingCostTaxIncl;
    }
    
    public void setShippingCostTaxIncl(BigDecimal shippingCostTaxIncl) {
        this.shippingCostTaxIncl = shippingCostTaxIncl;
    }
    
    public String getTrackingNumber() {
        return trackingNumber;
    }
    
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
}
