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
public class Product implements Serializable {
    
    private final static long serialVersionUID = 1L;
    
    @XmlElement(name = "id", required = false)
    protected Long id;
    
    @XmlElement(name = "id_manufacturer", required = false)
    protected Long idManufacturer;
    
    @XmlElement(name = "id_supplier", required = false)
    protected Long idSupplier;
    
    @XmlElement(name = "id_category_default", required = false)
    protected Long idCategoryDefault;
    
    @XmlElement(name = "new", required = false)
    protected String new_;
    
    @XmlElement(name = "cache_default_attribute", required = false)
    protected String cacheDefaultAttribute;
    
    @XmlElement(name = "id_default_image", required = false)
    protected String idDefaultImage;
    
    @XmlElement(name = "id_default_combination", required = false)
    protected String idDefaultCombination;
    
    @XmlElement(name = "id_tax_rules_group", required = false)
    protected Long idTaxRulesGroup;
    
    @XmlElement(name = "position_in_category", required = false)
    protected String positionInCategory;
    
    @XmlElement(name = "manufacturer_name", required = false)
    protected String manufacturerName;
    
    @XmlElement(name = "quantity", required = false)
    protected String quantity;
    
    @XmlElement(name = "type", required = false)
    protected String type;
    
    @XmlElement(name = "id_shop_default", required = false)
    protected Long idShopDefault;
    
    @XmlElement(name = "reference", required = false)
    protected Long reference;
    
    @XmlElement(name = "supplier_reference", required = false)
    protected Long supplierReference;
    
    @XmlElement(name = "location", required = false)
    protected Long location;
    
    @XmlElement(name = "width", required = false)
    protected BigDecimal width;
    
    @XmlElement(name = "height", required = false)
    protected BigDecimal height;
    
    @XmlElement(name = "depth", required = false)
    protected BigDecimal depth;
    
    @XmlElement(name = "weight", required = false)
    protected BigDecimal weight;
    
    @XmlElement(name = "quantity_discount", required = false)
    protected Integer quantityDiscount;
    
    @XmlElement(name = "ean13", required = false)
    protected String ean13;
    
    @XmlElement(name = "upc", required = false)
    protected String upc;
    
    @XmlElement(name = "cache_is_pack", required = false)
    protected Integer cacheIsPack;
    
    @XmlElement(name = "cache_has_attachments", required = false)
    protected Integer cacheHasAttachments;
    
    @XmlElement(name = "is_virtual", required = false)
    protected Integer isVirtual;
    
    @XmlElement(name = "on_sale", required = false)
    protected Integer onSale;
    
    @XmlElement(name = "online_only", required = false)
    protected Integer onlineOnly;
    
    @XmlElement(name = "ecotax", required = false)
    protected String ecotax;
    
    @XmlElement(name = "minimal_quantity", required = false)
    protected Integer minimalQuantity;
    
    @XmlElement(name = "price", required = true)
    protected String price;
    
    @XmlElement(name = "wholesale_price", required = false)
    protected String wholesalePrice;
    
    @XmlElement(name = "unity", required = false)
    protected String unity;
    
    @XmlElement(name = "unit_price_ratio", required = false)
    protected String unitPriceRatio;
    
    @XmlElement(name = "additional_shipping_cost", required = false)
    protected String additionalShippingCost;
    
    @XmlElement(name = "customizable", required = false)
    protected Integer customizable;
    
    @XmlElement(name = "text_fields", required = false)
    protected Integer textFields;
    
    @XmlElement(name = "uploadable_files", required = false)
    protected Integer uploadableFiles;
    
    @XmlElement(name = "active", required = false)
    protected Integer active;
    
    @XmlElement(name = "redirect_type", required = false)
    protected String redirectType;
    
    @XmlElement(name = "id_product_redirected", required = false)
    protected Long idProductRedirected;
    
    @XmlElement(name = "available_for_order", required = false)
    protected Integer availableForOrder;
    
    @XmlElement(name = "available_date", required = false)
    protected String availableDate;
    
    @XmlElement(name = "condition", required = false)
    protected String condition;
    
    @XmlElement(name = "show_price", required = false)
    protected Integer showPrice;
    
    @XmlElement(name = "indexed", required = false)
    protected Integer indexed;
    
    @XmlElement(name = "visibility", required = false)
    protected String visibility;
    
    @XmlElement(name = "advanced_stock_management", required = false)
    protected Integer advancedStockManagement;
    
    @XmlElement(name = "date_add", required = false)
    protected String dateAdd;
    
    @XmlElement(name = "date_upd", required = false)
    protected String dateUpd;
    
    @XmlElement(name = "meta_description", required = false)
    protected String metaDescription;
    
    @XmlElement(name = "meta_keywords", required = false)
    protected String metaKeywords;
    
    @XmlElement(name = "meta_title", required = false)
    protected String metaTitle;
    
    @XmlElement(name = "link_rewrite", required = true)
    protected String linkRewrite;
    
    @XmlElement(name = "name", required = true)
    protected String name;
    
    @XmlElement(name = "description", required = false)
    protected String description;
    
    @XmlElement(name = "description_short", required = false)
    protected String descriptionShort;
    
    @XmlElement(name = "available_now", required = false)
    protected String availableNow;
    
    @XmlElement(name = "available_later", required = false)
    protected String availableLater;
    
    @XmlElement(name = "associations", required = false)
    protected ProductAssociations associations;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Long getIdManufacturer() {
        return idManufacturer;
    }
    
    public void setIdManufacturer(Long idManufacturer) {
        this.idManufacturer = idManufacturer;
    }
    
    public Long getIdSupplier() {
        return idSupplier;
    }
    
    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }
    
    public Long getIdCategoryDefault() {
        return idCategoryDefault;
    }
    
    public void setIdCategoryDefault(Long idCategoryDefault) {
        this.idCategoryDefault = idCategoryDefault;
    }
    
    public String getNew() {
        return new_;
    }
    
    public void setNew(String new_) {
        this.new_ = new_;
    }
    
    public String getCacheDefaultAttribute() {
        return cacheDefaultAttribute;
    }
    
    public void setCacheDefaultAttribute(String cacheDefaultAttribute) {
        this.cacheDefaultAttribute = cacheDefaultAttribute;
    }
    
    public String getIdDefaultImage() {
        return idDefaultImage;
    }
    
    public void setIdDefaultImage(String idDefaultImage) {
        this.idDefaultImage = idDefaultImage;
    }
    
    public String getIdDefaultCombination() {
        return idDefaultCombination;
    }
    
    public void setIdDefaultCombination(String idDefaultCombination) {
        this.idDefaultCombination = idDefaultCombination;
    }
    
    public Long getIdTaxRulesGroup() {
        return idTaxRulesGroup;
    }
    
    public void setIdTaxRulesGroup(Long idTaxRulesGroup) {
        this.idTaxRulesGroup = idTaxRulesGroup;
    }
    
    public String getPositionInCategory() {
        return positionInCategory;
    }
    
    public void setPositionInCategory(String positionInCategory) {
        this.positionInCategory = positionInCategory;
    }
    
    public String getManufacturerName() {
        return manufacturerName;
    }
    
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
    
    public String getQuantity() {
        return quantity;
    }
    
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public Long getIdShopDefault() {
        return idShopDefault;
    }
    
    public void setIdShopDefault(Long idShopDefault) {
        this.idShopDefault = idShopDefault;
    }
    
    public Long getReference() {
        return reference;
    }
    
    public void setReference(Long reference) {
        this.reference = reference;
    }
    
    public Long getSupplierReference() {
        return supplierReference;
    }
    
    public void setSupplierReference(Long supplierReference) {
        this.supplierReference = supplierReference;
    }
    
    public Long getLocation() {
        return location;
    }
    
    public void setLocation(Long location) {
        this.location = location;
    }
    
    public BigDecimal getWidth() {
        return width;
    }
    
    public void setWidth(BigDecimal width) {
        this.width = width;
    }
    
    public BigDecimal getHeight() {
        return height;
    }
    
    public void setHeight(BigDecimal height) {
        this.height = height;
    }
    
    public BigDecimal getDepth() {
        return depth;
    }
    
    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }
    
    public BigDecimal getWeight() {
        return weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    
    public Integer getQuantityDiscount() {
        return quantityDiscount;
    }
    
    public void setQuantityDiscount(Integer quantityDiscount) {
        this.quantityDiscount = quantityDiscount;
    }
    
    public String getEan13() {
        return ean13;
    }
    
    public void setEan13(String ean13) {
        this.ean13 = ean13;
    }
    
    public String getUpc() {
        return upc;
    }
    
    public void setUpc(String upc) {
        this.upc = upc;
    }
    
    public Integer getCacheIsPack() {
        return cacheIsPack;
    }
    
    public void setCacheIsPack(Integer cacheIsPack) {
        this.cacheIsPack = cacheIsPack;
    }
    
    public Integer getCacheHasAttachments() {
        return cacheHasAttachments;
    }
    
    public void setCacheHasAttachments(Integer cacheHasAttachments) {
        this.cacheHasAttachments = cacheHasAttachments;
    }
    
    public Integer getIsVirtual() {
        return isVirtual;
    }
    
    public void setIsVirtual(Integer isVirtual) {
        this.isVirtual = isVirtual;
    }
    
    public Integer getOnSale() {
        return onSale;
    }
    
    public void setOnSale(Integer onSale) {
        this.onSale = onSale;
    }
    
    public Integer getOnlineOnly() {
        return onlineOnly;
    }
    
    public void setOnlineOnly(Integer onlineOnly) {
        this.onlineOnly = onlineOnly;
    }
    
    public String getEcotax() {
        return ecotax;
    }
    
    public void setEcotax(String ecotax) {
        this.ecotax = ecotax;
    }
    
    public Integer getMinimalQuantity() {
        return minimalQuantity;
    }
    
    public void setMinimalQuantity(Integer minimalQuantity) {
        this.minimalQuantity = minimalQuantity;
    }
    
    public String getPrice() {
        return price;
    }
    
    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getWholesalePrice() {
        return wholesalePrice;
    }
    
    public void setWholesalePrice(String wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }
    
    public String getUnity() {
        return unity;
    }
    
    public void setUnity(String unity) {
        this.unity = unity;
    }
    
    public String getUnitPriceRatio() {
        return unitPriceRatio;
    }
    
    public void setUnitPriceRatio(String unitPriceRatio) {
        this.unitPriceRatio = unitPriceRatio;
    }
    
    public String getAdditionalShippingCost() {
        return additionalShippingCost;
    }
    
    public void setAdditionalShippingCost(String additionalShippingCost) {
        this.additionalShippingCost = additionalShippingCost;
    }
    
    public Integer getCustomizable() {
        return customizable;
    }
    
    public void setCustomizable(Integer customizable) {
        this.customizable = customizable;
    }
    
    public Integer getTextFields() {
        return textFields;
    }
    
    public void setTextFields(Integer textFields) {
        this.textFields = textFields;
    }
    
    public Integer getUploadableFiles() {
        return uploadableFiles;
    }
    
    public void setUploadableFiles(Integer uploadableFiles) {
        this.uploadableFiles = uploadableFiles;
    }
    
    public Integer getActive() {
        return active;
    }
    
    public void setActive(Integer active) {
        this.active = active;
    }
    
    public String getRedirectType() {
        return redirectType;
    }
    
    public void setRedirectType(String redirectType) {
        this.redirectType = redirectType;
    }
    
    public Long getIdProductRedirected() {
        return idProductRedirected;
    }
    
    public void setIdProductRedirected(Long idProductRedirected) {
        this.idProductRedirected = idProductRedirected;
    }
    
    public Integer getAvailableForOrder() {
        return availableForOrder;
    }
    
    public void setAvailableForOrder(Integer availableForOrder) {
        this.availableForOrder = availableForOrder;
    }
    
    public String getAvailableDate() {
        return availableDate;
    }
    
    public void setAvailableDate(String availableDate) {
        this.availableDate = availableDate;
    }
    
    public String getCondition() {
        return condition;
    }
    
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
    public Integer getShowPrice() {
        return showPrice;
    }
    
    public void setShowPrice(Integer showPrice) {
        this.showPrice = showPrice;
    }
    
    public Integer getIndexed() {
        return indexed;
    }
    
    public void setIndexed(Integer indexed) {
        this.indexed = indexed;
    }
    
    public String getVisibility() {
        return visibility;
    }
    
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
    
    public Integer getAdvancedStockManagement() {
        return advancedStockManagement;
    }
    
    public void setAdvancedStockManagement(Integer advancedStockManagement) {
        this.advancedStockManagement = advancedStockManagement;
    }
    
    public String getDateAdd() {
        return dateAdd;
    }
    
    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public String getDateUpd() {
        return dateUpd;
    }
    
    public void setDateUpd(String dateUpd) {
        this.dateUpd = dateUpd;
    }
    
    public String getMetaDescription() {
        return metaDescription;
    }
    
    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }
    
    public String getMetaKeywords() {
        return metaKeywords;
    }
    
    public void setMetaKeywords(String metaKeywords) {
        this.metaKeywords = metaKeywords;
    }
    
    public String getMetaTitle() {
        return metaTitle;
    }
    
    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }
    
    public String getLinkRewrite() {
        return linkRewrite;
    }
    
    public void setLinkRewrite(String linkRewrite) {
        this.linkRewrite = linkRewrite;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDescriptionShort() {
        return descriptionShort;
    }
    
    public void setDescriptionShort(String descriptionShort) {
        this.descriptionShort = descriptionShort;
    }
    
    public String getAvailableNow() {
        return availableNow;
    }
    
    public void setAvailableNow(String availableNow) {
        this.availableNow = availableNow;
    }
    
    public String getAvailableLater() {
        return availableLater;
    }
    
    public void setAvailableLater(String availableLater) {
        this.availableLater = availableLater;
    }
    
    public ProductAssociations getAssociations() {
        return associations;
    }
    
    public void setAssociations(ProductAssociations associations) {
        this.associations = associations;
    }
    
}
