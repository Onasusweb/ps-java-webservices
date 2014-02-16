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
public class OrderDetail implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_order", required = true)
    protected Long idOrder;
    
    @XmlElement(name = "product_id", required = false)
    protected Long productId;
    
    @XmlElement(name = "product_attribute_id", required = false)
    protected Long productAttributeId;
    
    @XmlElement(name = "product_quantity_reinjected", required = false)
    protected Integer productQuantityReinjected;
    
    @XmlElement(name = "group_reduction", required = false)
    protected BigDecimal groupReduction;
    
    @XmlElement(name = "discount_quantity_applied", required = false)
    protected Integer discountQuantityApplied;
    
    @XmlElement(name = "download_hash", required = false)
    protected String downloadHash;
    
    @XmlElement(name = "download_deadline", required = false)
    protected String downloadDeadline;
    
    @XmlElement(name = "id_order_invoice", required = false)
    protected Long idOrderInvoice;
    
    @XmlElement(name = "id_warehouse", required = true)
    protected Long idWarehouse;
    
    @XmlElement(name = "id_shop", required = true)
    protected Long idShop;
    
    @XmlElement(name = "product_name", required = true)
    protected String productName;
    
    @XmlElement(name = "product_quantity", required = true)
    protected Integer productQuantity;
    
    @XmlElement(name = "product_quantity_in_stock", required = false)
    protected Integer productQuantityInStock;
    
    @XmlElement(name = "product_quantity_return", required = false)
    protected Integer productQuantityReturn;
    
    @XmlElement(name = "product_quantity_refunded", required = false)
    protected Integer productQuantityRefunded;
    
    @XmlElement(name = "product_price", required = true)
    protected String productPrice;
    
    @XmlElement(name = "reduction_percent", required = false)
    protected BigDecimal reductionPercent;
    
    @XmlElement(name = "reduction_amount", required = false)
    protected String reductionAmount;
    
    @XmlElement(name = "reduction_amount_tax_incl", required = false)
    protected String reductionAmountTaxIncl;
    
    @XmlElement(name = "reduction_amount_tax_excl", required = false)
    protected String reductionAmountTaxExcl;
    
    @XmlElement(name = "product_quantity_discount", required = false)
    protected BigDecimal productQuantityDiscount;
    
    @XmlElement(name = "product_ean13", required = false)
    protected String productEan13;
    
    @XmlElement(name = "product_upc", required = false)
    protected String productUpc;
    
    @XmlElement(name = "product_reference", required = false)
    protected Long productReference;
    
    @XmlElement(name = "product_supplier_reference", required = false)
    protected Long productSupplierReference;
    
    @XmlElement(name = "product_weight", required = false)
    protected BigDecimal productWeight;
    
    @XmlElement(name = "tax_computation_method", required = false)
    protected Long taxComputationMethod;
    
    @XmlElement(name = "ecotax", required = false)
    protected BigDecimal ecotax;
    
    @XmlElement(name = "ecotax_tax_rate", required = false)
    protected BigDecimal ecotaxTaxRate;
    
    @XmlElement(name = "download_nb", required = false)
    protected Integer downloadNb;
    
    @XmlElement(name = "unit_price_tax_incl", required = false)
    protected String unitPriceTaxIncl;
    
    @XmlElement(name = "unit_price_tax_excl", required = false)
    protected String unitPriceTaxExcl;
    
    @XmlElement(name = "total_price_tax_incl", required = false)
    protected String totalPriceTaxIncl;
    
    @XmlElement(name = "total_price_tax_excl", required = false)
    protected String totalPriceTaxExcl;
    
    @XmlElement(name = "purchase_supplier_price", required = false)
    protected String purchaseSupplierPrice;
    
    @XmlElement(name = "original_product_price", required = false)
    protected String originalProductPrice;
    
    @XmlElement(name = "associations", required = false)
    protected OrderDetailAssociations associations;
    
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
    
    public Long getProductId() {
        return productId;
    }
    
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    
    public Long getProductAttributeId() {
        return productAttributeId;
    }
    
    public void setProductAttributeId(Long productAttributeId) {
        this.productAttributeId = productAttributeId;
    }
    
    public Integer getProductQuantityReinjected() {
        return productQuantityReinjected;
    }
    
    public void setProductQuantityReinjected(Integer productQuantityReinjected) {
        this.productQuantityReinjected = productQuantityReinjected;
    }
    
    public BigDecimal getGroupReduction() {
        return groupReduction;
    }
    
    public void setGroupReduction(BigDecimal groupReduction) {
        this.groupReduction = groupReduction;
    }
    
    public Integer getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }
    
    public void setDiscountQuantityApplied(Integer discountQuantityApplied) {
        this.discountQuantityApplied = discountQuantityApplied;
    }
    
    public String getDownloadHash() {
        return downloadHash;
    }
    
    public void setDownloadHash(String downloadHash) {
        this.downloadHash = downloadHash;
    }
    
    public String getDownloadDeadline() {
        return downloadDeadline;
    }
    
    public void setDownloadDeadline(String downloadDeadline) {
        this.downloadDeadline = downloadDeadline;
    }
    
    public Long getIdOrderInvoice() {
        return idOrderInvoice;
    }
    
    public void setIdOrderInvoice(Long idOrderInvoice) {
        this.idOrderInvoice = idOrderInvoice;
    }
    
    public Long getIdWarehouse() {
        return idWarehouse;
    }
    
    public void setIdWarehouse(Long idWarehouse) {
        this.idWarehouse = idWarehouse;
    }
    
    public Long getIdShop() {
        return idShop;
    }
    
    public void setIdShop(Long idShop) {
        this.idShop = idShop;
    }
    
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public Integer getProductQuantity() {
        return productQuantity;
    }
    
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
    
    public Integer getProductQuantityInStock() {
        return productQuantityInStock;
    }
    
    public void setProductQuantityInStock(Integer productQuantityInStock) {
        this.productQuantityInStock = productQuantityInStock;
    }
    
    public Integer getProductQuantityReturn() {
        return productQuantityReturn;
    }
    
    public void setProductQuantityReturn(Integer productQuantityReturn) {
        this.productQuantityReturn = productQuantityReturn;
    }
    
    public Integer getProductQuantityRefunded() {
        return productQuantityRefunded;
    }
    
    public void setProductQuantityRefunded(Integer productQuantityRefunded) {
        this.productQuantityRefunded = productQuantityRefunded;
    }
    
    public String getProductPrice() {
        return productPrice;
    }
    
    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
    
    public BigDecimal getReductionPercent() {
        return reductionPercent;
    }
    
    public void setReductionPercent(BigDecimal reductionPercent) {
        this.reductionPercent = reductionPercent;
    }
    
    public String getReductionAmount() {
        return reductionAmount;
    }
    
    public void setReductionAmount(String reductionAmount) {
        this.reductionAmount = reductionAmount;
    }
    
    public String getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }
    
    public void setReductionAmountTaxIncl(String reductionAmountTaxIncl) {
        this.reductionAmountTaxIncl = reductionAmountTaxIncl;
    }
    
    public String getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }
    
    public void setReductionAmountTaxExcl(String reductionAmountTaxExcl) {
        this.reductionAmountTaxExcl = reductionAmountTaxExcl;
    }
    
    public BigDecimal getProductQuantityDiscount() {
        return productQuantityDiscount;
    }
    
    public void setProductQuantityDiscount(BigDecimal productQuantityDiscount) {
        this.productQuantityDiscount = productQuantityDiscount;
    }
    
    public String getProductEan13() {
        return productEan13;
    }
    
    public void setProductEan13(String productEan13) {
        this.productEan13 = productEan13;
    }
    
    public String getProductUpc() {
        return productUpc;
    }
    
    public void setProductUpc(String productUpc) {
        this.productUpc = productUpc;
    }
    
    public Long getProductReference() {
        return productReference;
    }
    
    public void setProductReference(Long productReference) {
        this.productReference = productReference;
    }
    
    public Long getProductSupplierReference() {
        return productSupplierReference;
    }
    
    public void setProductSupplierReference(Long productSupplierReference) {
        this.productSupplierReference = productSupplierReference;
    }
    
    public BigDecimal getProductWeight() {
        return productWeight;
    }
    
    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }
    
    public Long getTaxComputationMethod() {
        return taxComputationMethod;
    }
    
    public void setTaxComputationMethod(Long taxComputationMethod) {
        this.taxComputationMethod = taxComputationMethod;
    }
    
    public BigDecimal getEcotax() {
        return ecotax;
    }
    
    public void setEcotax(BigDecimal ecotax) {
        this.ecotax = ecotax;
    }
    
    public BigDecimal getEcotaxTaxRate() {
        return ecotaxTaxRate;
    }
    
    public void setEcotaxTaxRate(BigDecimal ecotaxTaxRate) {
        this.ecotaxTaxRate = ecotaxTaxRate;
    }
    
    public Integer getDownloadNb() {
        return downloadNb;
    }
    
    public void setDownloadNb(Integer downloadNb) {
        this.downloadNb = downloadNb;
    }
    
    public String getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }
    
    public void setUnitPriceTaxIncl(String unitPriceTaxIncl) {
        this.unitPriceTaxIncl = unitPriceTaxIncl;
    }
    
    public String getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }
    
    public void setUnitPriceTaxExcl(String unitPriceTaxExcl) {
        this.unitPriceTaxExcl = unitPriceTaxExcl;
    }
    
    public String getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }
    
    public void setTotalPriceTaxIncl(String totalPriceTaxIncl) {
        this.totalPriceTaxIncl = totalPriceTaxIncl;
    }
    
    public String getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }
    
    public void setTotalPriceTaxExcl(String totalPriceTaxExcl) {
        this.totalPriceTaxExcl = totalPriceTaxExcl;
    }
    
    public String getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }
    
    public void setPurchaseSupplierPrice(String purchaseSupplierPrice) {
        this.purchaseSupplierPrice = purchaseSupplierPrice;
    }
    
    public String getOriginalProductPrice() {
        return originalProductPrice;
    }
    
    public void setOriginalProductPrice(String originalProductPrice) {
        this.originalProductPrice = originalProductPrice;
    }
    
    public OrderDetailAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(OrderDetailAssociations associations) {
        this.associations = associations;
    }
    
}
