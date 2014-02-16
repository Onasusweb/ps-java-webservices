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


public class OrderDetailFilter {
    
    private String id;
    private String idOrder;
    private String productId;
    private String productAttributeId;
    private String productQuantityReinjected;
    private String groupReduction;
    private String discountQuantityApplied;
    private String downloadHash;
    private String downloadDeadline;
    private String idOrderInvoice;
    private String idWarehouse;
    private String idShop;
    private String productName;
    private String productQuantity;
    private String productQuantityInStock;
    private String productQuantityReturn;
    private String productQuantityRefunded;
    private String productPrice;
    private String reductionPercent;
    private String reductionAmount;
    private String reductionAmountTaxIncl;
    private String reductionAmountTaxExcl;
    private String productQuantityDiscount;
    private String productEan13;
    private String productUpc;
    private String productReference;
    private String productSupplierReference;
    private String productWeight;
    private String taxComputationMethod;
    private String ecotax;
    private String ecotaxTaxRate;
    private String downloadNb;
    private String unitPriceTaxIncl;
    private String unitPriceTaxExcl;
    private String totalPriceTaxIncl;
    private String totalPriceTaxExcl;
    private String purchaseSupplierPrice;
    private String originalProductPrice;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_order]")
    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String filter) {
        this.idOrder = filter;
    }
    
    @QueryParam(value="filter[product_id]")
    public String getProductId() {
        return productId;
    }

    public void setProductId(String filter) {
        this.productId = filter;
    }
    
    @QueryParam(value="filter[product_attribute_id]")
    public String getProductAttributeId() {
        return productAttributeId;
    }

    public void setProductAttributeId(String filter) {
        this.productAttributeId = filter;
    }
    
    @QueryParam(value="filter[product_quantity_reinjected]")
    public String getProductQuantityReinjected() {
        return productQuantityReinjected;
    }

    public void setProductQuantityReinjected(String filter) {
        this.productQuantityReinjected = filter;
    }
    
    @QueryParam(value="filter[group_reduction]")
    public String getGroupReduction() {
        return groupReduction;
    }

    public void setGroupReduction(String filter) {
        this.groupReduction = filter;
    }
    
    @QueryParam(value="filter[discount_quantity_applied]")
    public String getDiscountQuantityApplied() {
        return discountQuantityApplied;
    }

    public void setDiscountQuantityApplied(String filter) {
        this.discountQuantityApplied = filter;
    }
    
    @QueryParam(value="filter[download_hash]")
    public String getDownloadHash() {
        return downloadHash;
    }

    public void setDownloadHash(String filter) {
        this.downloadHash = filter;
    }
    
    @QueryParam(value="filter[download_deadline]")
    public String getDownloadDeadline() {
        return downloadDeadline;
    }

    public void setDownloadDeadline(String filter) {
        this.downloadDeadline = filter;
    }
    
    @QueryParam(value="filter[id_order_invoice]")
    public String getIdOrderInvoice() {
        return idOrderInvoice;
    }

    public void setIdOrderInvoice(String filter) {
        this.idOrderInvoice = filter;
    }
    
    @QueryParam(value="filter[id_warehouse]")
    public String getIdWarehouse() {
        return idWarehouse;
    }

    public void setIdWarehouse(String filter) {
        this.idWarehouse = filter;
    }
    
    @QueryParam(value="filter[id_shop]")
    public String getIdShop() {
        return idShop;
    }

    public void setIdShop(String filter) {
        this.idShop = filter;
    }
    
    @QueryParam(value="filter[product_name]")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String filter) {
        this.productName = filter;
    }
    
    @QueryParam(value="filter[product_quantity]")
    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String filter) {
        this.productQuantity = filter;
    }
    
    @QueryParam(value="filter[product_quantity_in_stock]")
    public String getProductQuantityInStock() {
        return productQuantityInStock;
    }

    public void setProductQuantityInStock(String filter) {
        this.productQuantityInStock = filter;
    }
    
    @QueryParam(value="filter[product_quantity_return]")
    public String getProductQuantityReturn() {
        return productQuantityReturn;
    }

    public void setProductQuantityReturn(String filter) {
        this.productQuantityReturn = filter;
    }
    
    @QueryParam(value="filter[product_quantity_refunded]")
    public String getProductQuantityRefunded() {
        return productQuantityRefunded;
    }

    public void setProductQuantityRefunded(String filter) {
        this.productQuantityRefunded = filter;
    }
    
    @QueryParam(value="filter[product_price]")
    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String filter) {
        this.productPrice = filter;
    }
    
    @QueryParam(value="filter[reduction_percent]")
    public String getReductionPercent() {
        return reductionPercent;
    }

    public void setReductionPercent(String filter) {
        this.reductionPercent = filter;
    }
    
    @QueryParam(value="filter[reduction_amount]")
    public String getReductionAmount() {
        return reductionAmount;
    }

    public void setReductionAmount(String filter) {
        this.reductionAmount = filter;
    }
    
    @QueryParam(value="filter[reduction_amount_tax_incl]")
    public String getReductionAmountTaxIncl() {
        return reductionAmountTaxIncl;
    }

    public void setReductionAmountTaxIncl(String filter) {
        this.reductionAmountTaxIncl = filter;
    }
    
    @QueryParam(value="filter[reduction_amount_tax_excl]")
    public String getReductionAmountTaxExcl() {
        return reductionAmountTaxExcl;
    }

    public void setReductionAmountTaxExcl(String filter) {
        this.reductionAmountTaxExcl = filter;
    }
    
    @QueryParam(value="filter[product_quantity_discount]")
    public String getProductQuantityDiscount() {
        return productQuantityDiscount;
    }

    public void setProductQuantityDiscount(String filter) {
        this.productQuantityDiscount = filter;
    }
    
    @QueryParam(value="filter[product_ean13]")
    public String getProductEan13() {
        return productEan13;
    }

    public void setProductEan13(String filter) {
        this.productEan13 = filter;
    }
    
    @QueryParam(value="filter[product_upc]")
    public String getProductUpc() {
        return productUpc;
    }

    public void setProductUpc(String filter) {
        this.productUpc = filter;
    }
    
    @QueryParam(value="filter[product_reference]")
    public String getProductReference() {
        return productReference;
    }

    public void setProductReference(String filter) {
        this.productReference = filter;
    }
    
    @QueryParam(value="filter[product_supplier_reference]")
    public String getProductSupplierReference() {
        return productSupplierReference;
    }

    public void setProductSupplierReference(String filter) {
        this.productSupplierReference = filter;
    }
    
    @QueryParam(value="filter[product_weight]")
    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String filter) {
        this.productWeight = filter;
    }
    
    @QueryParam(value="filter[tax_computation_method]")
    public String getTaxComputationMethod() {
        return taxComputationMethod;
    }

    public void setTaxComputationMethod(String filter) {
        this.taxComputationMethod = filter;
    }
    
    @QueryParam(value="filter[ecotax]")
    public String getEcotax() {
        return ecotax;
    }

    public void setEcotax(String filter) {
        this.ecotax = filter;
    }
    
    @QueryParam(value="filter[ecotax_tax_rate]")
    public String getEcotaxTaxRate() {
        return ecotaxTaxRate;
    }

    public void setEcotaxTaxRate(String filter) {
        this.ecotaxTaxRate = filter;
    }
    
    @QueryParam(value="filter[download_nb]")
    public String getDownloadNb() {
        return downloadNb;
    }

    public void setDownloadNb(String filter) {
        this.downloadNb = filter;
    }
    
    @QueryParam(value="filter[unit_price_tax_incl]")
    public String getUnitPriceTaxIncl() {
        return unitPriceTaxIncl;
    }

    public void setUnitPriceTaxIncl(String filter) {
        this.unitPriceTaxIncl = filter;
    }
    
    @QueryParam(value="filter[unit_price_tax_excl]")
    public String getUnitPriceTaxExcl() {
        return unitPriceTaxExcl;
    }

    public void setUnitPriceTaxExcl(String filter) {
        this.unitPriceTaxExcl = filter;
    }
    
    @QueryParam(value="filter[total_price_tax_incl]")
    public String getTotalPriceTaxIncl() {
        return totalPriceTaxIncl;
    }

    public void setTotalPriceTaxIncl(String filter) {
        this.totalPriceTaxIncl = filter;
    }
    
    @QueryParam(value="filter[total_price_tax_excl]")
    public String getTotalPriceTaxExcl() {
        return totalPriceTaxExcl;
    }

    public void setTotalPriceTaxExcl(String filter) {
        this.totalPriceTaxExcl = filter;
    }
    
    @QueryParam(value="filter[purchase_supplier_price]")
    public String getPurchaseSupplierPrice() {
        return purchaseSupplierPrice;
    }

    public void setPurchaseSupplierPrice(String filter) {
        this.purchaseSupplierPrice = filter;
    }
    
    @QueryParam(value="filter[original_product_price]")
    public String getOriginalProductPrice() {
        return originalProductPrice;
    }

    public void setOriginalProductPrice(String filter) {
        this.originalProductPrice = filter;
    }
    
}
