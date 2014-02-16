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


public class ProductFilter {
    
    private String id;
    private String idManufacturer;
    private String idSupplier;
    private String idCategoryDefault;
    private String new_;
    private String cacheDefaultAttribute;
    private String idDefaultImage;
    private String idDefaultCombination;
    private String idTaxRulesGroup;
    private String positionInCategory;
    private String manufacturerName;
    private String quantity;
    private String type;
    private String idShopDefault;
    private String reference;
    private String supplierReference;
    private String location;
    private String width;
    private String height;
    private String depth;
    private String weight;
    private String quantityDiscount;
    private String ean13;
    private String upc;
    private String cacheIsPack;
    private String cacheHasAttachments;
    private String isVirtual;
    private String onSale;
    private String onlineOnly;
    private String ecotax;
    private String minimalQuantity;
    private String price;
    private String wholesalePrice;
    private String unity;
    private String unitPriceRatio;
    private String additionalShippingCost;
    private String customizable;
    private String textFields;
    private String uploadableFiles;
    private String active;
    private String redirectType;
    private String idProductRedirected;
    private String availableForOrder;
    private String availableDate;
    private String condition;
    private String showPrice;
    private String indexed;
    private String visibility;
    private String advancedStockManagement;
    private String dateAdd;
    private String dateUpd;
    private String metaDescription;
    private String metaKeywords;
    private String metaTitle;
    private String linkRewrite;
    private String name;
    private String description;
    private String descriptionShort;
    private String availableNow;
    private String availableLater;
    
    @QueryParam(value="filter[id]")
    public String getId() {
        return id;
    }

    public void setId(String filter) {
        this.id = filter;
    }
    
    @QueryParam(value="filter[id_manufacturer]")
    public String getIdManufacturer() {
        return idManufacturer;
    }

    public void setIdManufacturer(String filter) {
        this.idManufacturer = filter;
    }
    
    @QueryParam(value="filter[id_supplier]")
    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String filter) {
        this.idSupplier = filter;
    }
    
    @QueryParam(value="filter[id_category_default]")
    public String getIdCategoryDefault() {
        return idCategoryDefault;
    }

    public void setIdCategoryDefault(String filter) {
        this.idCategoryDefault = filter;
    }
    
    @QueryParam(value="filter[new]")
    public String getNew() {
        return new_;
    }

    public void setNew(String filter) {
        this.new_ = filter;
    }
    
    @QueryParam(value="filter[cache_default_attribute]")
    public String getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }

    public void setCacheDefaultAttribute(String filter) {
        this.cacheDefaultAttribute = filter;
    }
    
    @QueryParam(value="filter[id_default_image]")
    public String getIdDefaultImage() {
        return idDefaultImage;
    }

    public void setIdDefaultImage(String filter) {
        this.idDefaultImage = filter;
    }
    
    @QueryParam(value="filter[id_default_combination]")
    public String getIdDefaultCombination() {
        return idDefaultCombination;
    }

    public void setIdDefaultCombination(String filter) {
        this.idDefaultCombination = filter;
    }
    
    @QueryParam(value="filter[id_tax_rules_group]")
    public String getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }

    public void setIdTaxRulesGroup(String filter) {
        this.idTaxRulesGroup = filter;
    }
    
    @QueryParam(value="filter[position_in_category]")
    public String getPositionInCategory() {
        return positionInCategory;
    }

    public void setPositionInCategory(String filter) {
        this.positionInCategory = filter;
    }
    
    @QueryParam(value="filter[manufacturer_name]")
    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String filter) {
        this.manufacturerName = filter;
    }
    
    @QueryParam(value="filter[quantity]")
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String filter) {
        this.quantity = filter;
    }
    
    @QueryParam(value="filter[type]")
    public String getType() {
        return type;
    }

    public void setType(String filter) {
        this.type = filter;
    }
    
    @QueryParam(value="filter[id_shop_default]")
    public String getIdShopDefault() {
        return idShopDefault;
    }

    public void setIdShopDefault(String filter) {
        this.idShopDefault = filter;
    }
    
    @QueryParam(value="filter[reference]")
    public String getReference() {
        return reference;
    }

    public void setReference(String filter) {
        this.reference = filter;
    }
    
    @QueryParam(value="filter[supplier_reference]")
    public String getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(String filter) {
        this.supplierReference = filter;
    }
    
    @QueryParam(value="filter[location]")
    public String getLocation() {
        return location;
    }

    public void setLocation(String filter) {
        this.location = filter;
    }
    
    @QueryParam(value="filter[width]")
    public String getWidth() {
        return width;
    }

    public void setWidth(String filter) {
        this.width = filter;
    }
    
    @QueryParam(value="filter[height]")
    public String getHeight() {
        return height;
    }

    public void setHeight(String filter) {
        this.height = filter;
    }
    
    @QueryParam(value="filter[depth]")
    public String getDepth() {
        return depth;
    }

    public void setDepth(String filter) {
        this.depth = filter;
    }
    
    @QueryParam(value="filter[weight]")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String filter) {
        this.weight = filter;
    }
    
    @QueryParam(value="filter[quantity_discount]")
    public String getQuantityDiscount() {
        return quantityDiscount;
    }

    public void setQuantityDiscount(String filter) {
        this.quantityDiscount = filter;
    }
    
    @QueryParam(value="filter[ean13]")
    public String getEan13() {
        return ean13;
    }

    public void setEan13(String filter) {
        this.ean13 = filter;
    }
    
    @QueryParam(value="filter[upc]")
    public String getUpc() {
        return upc;
    }

    public void setUpc(String filter) {
        this.upc = filter;
    }
    
    @QueryParam(value="filter[cache_is_pack]")
    public String getCacheIsPack() {
        return cacheIsPack;
    }

    public void setCacheIsPack(String filter) {
        this.cacheIsPack = filter;
    }
    
    @QueryParam(value="filter[cache_has_attachments]")
    public String getCacheHasAttachments() {
        return cacheHasAttachments;
    }

    public void setCacheHasAttachments(String filter) {
        this.cacheHasAttachments = filter;
    }
    
    @QueryParam(value="filter[is_virtual]")
    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String filter) {
        this.isVirtual = filter;
    }
    
    @QueryParam(value="filter[on_sale]")
    public String getOnSale() {
        return onSale;
    }

    public void setOnSale(String filter) {
        this.onSale = filter;
    }
    
    @QueryParam(value="filter[online_only]")
    public String getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(String filter) {
        this.onlineOnly = filter;
    }
    
    @QueryParam(value="filter[ecotax]")
    public String getEcotax() {
        return ecotax;
    }

    public void setEcotax(String filter) {
        this.ecotax = filter;
    }
    
    @QueryParam(value="filter[minimal_quantity]")
    public String getMinimalQuantity() {
        return minimalQuantity;
    }

    public void setMinimalQuantity(String filter) {
        this.minimalQuantity = filter;
    }
    
    @QueryParam(value="filter[price]")
    public String getPrice() {
        return price;
    }

    public void setPrice(String filter) {
        this.price = filter;
    }
    
    @QueryParam(value="filter[wholesale_price]")
    public String getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(String filter) {
        this.wholesalePrice = filter;
    }
    
    @QueryParam(value="filter[unity]")
    public String getUnity() {
        return unity;
    }

    public void setUnity(String filter) {
        this.unity = filter;
    }
    
    @QueryParam(value="filter[unit_price_ratio]")
    public String getUnitPriceRatio() {
        return unitPriceRatio;
    }

    public void setUnitPriceRatio(String filter) {
        this.unitPriceRatio = filter;
    }
    
    @QueryParam(value="filter[additional_shipping_cost]")
    public String getAdditionalShippingCost() {
        return additionalShippingCost;
    }

    public void setAdditionalShippingCost(String filter) {
        this.additionalShippingCost = filter;
    }
    
    @QueryParam(value="filter[customizable]")
    public String getCustomizable() {
        return customizable;
    }

    public void setCustomizable(String filter) {
        this.customizable = filter;
    }
    
    @QueryParam(value="filter[text_fields]")
    public String getTextFields() {
        return textFields;
    }

    public void setTextFields(String filter) {
        this.textFields = filter;
    }
    
    @QueryParam(value="filter[uploadable_files]")
    public String getUploadableFiles() {
        return uploadableFiles;
    }

    public void setUploadableFiles(String filter) {
        this.uploadableFiles = filter;
    }
    
    @QueryParam(value="filter[active]")
    public String getActive() {
        return active;
    }

    public void setActive(String filter) {
        this.active = filter;
    }
    
    @QueryParam(value="filter[redirect_type]")
    public String getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(String filter) {
        this.redirectType = filter;
    }
    
    @QueryParam(value="filter[id_product_redirected]")
    public String getIdProductRedirected() {
        return idProductRedirected;
    }

    public void setIdProductRedirected(String filter) {
        this.idProductRedirected = filter;
    }
    
    @QueryParam(value="filter[available_for_order]")
    public String getAvailableForOrder() {
        return availableForOrder;
    }

    public void setAvailableForOrder(String filter) {
        this.availableForOrder = filter;
    }
    
    @QueryParam(value="filter[available_date]")
    public String getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(String filter) {
        this.availableDate = filter;
    }
    
    @QueryParam(value="filter[condition]")
    public String getCondition() {
        return condition;
    }

    public void setCondition(String filter) {
        this.condition = filter;
    }
    
    @QueryParam(value="filter[show_price]")
    public String getShowPrice() {
        return showPrice;
    }

    public void setShowPrice(String filter) {
        this.showPrice = filter;
    }
    
    @QueryParam(value="filter[indexed]")
    public String getIndexed() {
        return indexed;
    }

    public void setIndexed(String filter) {
        this.indexed = filter;
    }
    
    @QueryParam(value="filter[visibility]")
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String filter) {
        this.visibility = filter;
    }
    
    @QueryParam(value="filter[advanced_stock_management]")
    public String getAdvancedStockManagement() {
        return advancedStockManagement;
    }

    public void setAdvancedStockManagement(String filter) {
        this.advancedStockManagement = filter;
    }
    
    @QueryParam(value="filter[date_add]")
    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String filter) {
        this.dateAdd = filter;
    }
    
    @QueryParam(value="filter[date_upd]")
    public String getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(String filter) {
        this.dateUpd = filter;
    }
    
    @QueryParam(value="filter[meta_description]")
    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String filter) {
        this.metaDescription = filter;
    }
    
    @QueryParam(value="filter[meta_keywords]")
    public String getMetaKeywords() {
        return metaKeywords;
    }

    public void setMetaKeywords(String filter) {
        this.metaKeywords = filter;
    }
    
    @QueryParam(value="filter[meta_title]")
    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String filter) {
        this.metaTitle = filter;
    }
    
    @QueryParam(value="filter[link_rewrite]")
    public String getLinkRewrite() {
        return linkRewrite;
    }

    public void setLinkRewrite(String filter) {
        this.linkRewrite = filter;
    }
    
    @QueryParam(value="filter[name]")
    public String getName() {
        return name;
    }

    public void setName(String filter) {
        this.name = filter;
    }
    
    @QueryParam(value="filter[description]")
    public String getDescription() {
        return description;
    }

    public void setDescription(String filter) {
        this.description = filter;
    }
    
    @QueryParam(value="filter[description_short]")
    public String getDescriptionShort() {
        return descriptionShort;
    }

    public void setDescriptionShort(String filter) {
        this.descriptionShort = filter;
    }
    
    @QueryParam(value="filter[available_now]")
    public String getAvailableNow() {
        return availableNow;
    }

    public void setAvailableNow(String filter) {
        this.availableNow = filter;
    }
    
    @QueryParam(value="filter[available_later]")
    public String getAvailableLater() {
        return availableLater;
    }

    public void setAvailableLater(String filter) {
        this.availableLater = filter;
    }
    
}
