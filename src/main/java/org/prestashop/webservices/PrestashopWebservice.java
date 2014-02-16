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
package org.prestashop.webservices;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.prestashop.webservices.type.*;



@Path("/")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public interface PrestashopWebservice {

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public String api();

    @GET
    @Path("/addresses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopAddresses readAddresses(@QueryParam("display") String display, @BeanParam AddressFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/addresses/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopAddress readAddress(@PathParam("id") Long id);
    
    @POST
    @Path("/addresses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopAddress createAddress(PrestashopAddress address);
    
    @PUT
    @Path("/addresses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopAddress updateAddress(PrestashopAddress address);
    
    @DELETE
    @Path("/addresses/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteAddress(@PathParam("id") Long id);
    
    @GET
    @Path("/carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCarriers readCarriers(@QueryParam("display") String display, @BeanParam CarrierFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/carriers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCarrier readCarrier(@PathParam("id") Long id);
    
    @POST
    @Path("/carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCarrier createCarrier(PrestashopCarrier carrier);
    
    @PUT
    @Path("/carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCarrier updateCarrier(PrestashopCarrier carrier);
    
    @DELETE
    @Path("/carriers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCarrier(@PathParam("id") Long id);
    
    @GET
    @Path("/cart_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCartRules readCartRules(@QueryParam("display") String display, @BeanParam CartRuleFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/cart_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCartRule readCartRule(@PathParam("id") Long id);
    
    @POST
    @Path("/cart_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCartRule createCartRule(PrestashopCartRule cartRule);
    
    @PUT
    @Path("/cart_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCartRule updateCartRule(PrestashopCartRule cartRule);
    
    @DELETE
    @Path("/cart_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCartRule(@PathParam("id") Long id);
    
    @GET
    @Path("/carts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCarts readCarts(@QueryParam("display") String display, @BeanParam CartFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/carts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCart readCart(@PathParam("id") Long id);
    
    @POST
    @Path("/carts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCart createCart(PrestashopCart cart);
    
    @PUT
    @Path("/carts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCart updateCart(PrestashopCart cart);
    
    @DELETE
    @Path("/carts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCart(@PathParam("id") Long id);
    
    @GET
    @Path("/categories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCategories readCategories(@QueryParam("display") String display, @BeanParam CategoryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/categories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCategory readCategory(@PathParam("id") Long id);
    
    @POST
    @Path("/categories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCategory createCategory(PrestashopCategory category);
    
    @PUT
    @Path("/categories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCategory updateCategory(PrestashopCategory category);
    
    @DELETE
    @Path("/categories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCategory(@PathParam("id") Long id);
    
    @GET
    @Path("/combinations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCombinations readCombinations(@QueryParam("display") String display, @BeanParam CombinationFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/combinations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCombination readCombination(@PathParam("id") Long id);
    
    @POST
    @Path("/combinations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCombination createCombination(PrestashopCombination combination);
    
    @PUT
    @Path("/combinations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCombination updateCombination(PrestashopCombination combination);
    
    @DELETE
    @Path("/combinations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCombination(@PathParam("id") Long id);
    
    @GET
    @Path("/configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopConfigurations readConfigurations(@QueryParam("display") String display, @BeanParam ConfigurationFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/configurations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopConfiguration readConfiguration(@PathParam("id") Long id);
    
    @POST
    @Path("/configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopConfiguration createConfiguration(PrestashopConfiguration configuration);
    
    @PUT
    @Path("/configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopConfiguration updateConfiguration(PrestashopConfiguration configuration);
    
    @DELETE
    @Path("/configurations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteConfiguration(@PathParam("id") Long id);
    
    @GET
    @Path("/contacts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContacts readContacts(@QueryParam("display") String display, @BeanParam ContactFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/contacts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContact readContact(@PathParam("id") Long id);
    
    @POST
    @Path("/contacts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContact createContact(PrestashopContact contact);
    
    @PUT
    @Path("/contacts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContact updateContact(PrestashopContact contact);
    
    @DELETE
    @Path("/contacts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteContact(@PathParam("id") Long id);
    
    @GET
    @Path("/content_management_system")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContentManagementSystem readContentManagementSystem(@QueryParam("display") String display, @BeanParam ContentFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/content_management_system/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContent readContent(@PathParam("id") Long id);
    
    @POST
    @Path("/content_management_system")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContent createContent(PrestashopContent content);
    
    @PUT
    @Path("/content_management_system")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopContent updateContent(PrestashopContent content);
    
    @DELETE
    @Path("/content_management_system/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteContent(@PathParam("id") Long id);
    
    @GET
    @Path("/countries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCountries readCountries(@QueryParam("display") String display, @BeanParam CountryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/countries/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCountry readCountry(@PathParam("id") Long id);
    
    @POST
    @Path("/countries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCountry createCountry(PrestashopCountry country);
    
    @PUT
    @Path("/countries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCountry updateCountry(PrestashopCountry country);
    
    @DELETE
    @Path("/countries/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCountry(@PathParam("id") Long id);
    
    @GET
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCurrencies readCurrencies(@QueryParam("display") String display, @BeanParam CurrencyFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/currencies/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCurrency readCurrency(@PathParam("id") Long id);
    
    @POST
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCurrency createCurrency(PrestashopCurrency currency);
    
    @PUT
    @Path("/currencies")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCurrency updateCurrency(PrestashopCurrency currency);
    
    @DELETE
    @Path("/currencies/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCurrency(@PathParam("id") Long id);
    
    @GET
    @Path("/customer_messages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerMessages readCustomerMessages(@QueryParam("display") String display, @BeanParam CustomerMessageFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/customer_messages/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerMessage readCustomerMessage(@PathParam("id") Long id);
    
    @POST
    @Path("/customer_messages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerMessage createCustomerMessage(PrestashopCustomerMessage customerMessage);
    
    @PUT
    @Path("/customer_messages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerMessage updateCustomerMessage(PrestashopCustomerMessage customerMessage);
    
    @DELETE
    @Path("/customer_messages/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCustomerMessage(@PathParam("id") Long id);
    
    @GET
    @Path("/customer_threads")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerThreads readCustomerThreads(@QueryParam("display") String display, @BeanParam CustomerThreadFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/customer_threads/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerThread readCustomerThread(@PathParam("id") Long id);
    
    @POST
    @Path("/customer_threads")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerThread createCustomerThread(PrestashopCustomerThread customerThread);
    
    @PUT
    @Path("/customer_threads")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomerThread updateCustomerThread(PrestashopCustomerThread customerThread);
    
    @DELETE
    @Path("/customer_threads/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCustomerThread(@PathParam("id") Long id);
    
    @GET
    @Path("/customers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomers readCustomers(@QueryParam("display") String display, @BeanParam CustomerFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/customers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomer readCustomer(@PathParam("id") Long id);
    
    @POST
    @Path("/customers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomer createCustomer(PrestashopCustomer customer);
    
    @PUT
    @Path("/customers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopCustomer updateCustomer(PrestashopCustomer customer);
    
    @DELETE
    @Path("/customers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteCustomer(@PathParam("id") Long id);
    
    @GET
    @Path("/deliveries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopDeliveries readDeliveries(@QueryParam("display") String display, @BeanParam DeliveryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/deliveries/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopDelivery readDelivery(@PathParam("id") Long id);
    
    @POST
    @Path("/deliveries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopDelivery createDelivery(PrestashopDelivery delivery);
    
    @PUT
    @Path("/deliveries")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopDelivery updateDelivery(PrestashopDelivery delivery);
    
    @DELETE
    @Path("/deliveries/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteDelivery(@PathParam("id") Long id);
    
    @GET
    @Path("/employees")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopEmployees readEmployees(@QueryParam("display") String display, @BeanParam EmployeeFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/employees/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopEmployee readEmployee(@PathParam("id") Long id);
    
    @POST
    @Path("/employees")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopEmployee createEmployee(PrestashopEmployee employee);
    
    @PUT
    @Path("/employees")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopEmployee updateEmployee(PrestashopEmployee employee);
    
    @DELETE
    @Path("/employees/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteEmployee(@PathParam("id") Long id);
    
    @GET
    @Path("/groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGroups readGroups(@QueryParam("display") String display, @BeanParam GroupFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGroup readGroup(@PathParam("id") Long id);
    
    @POST
    @Path("/groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGroup createGroup(PrestashopGroup group);
    
    @PUT
    @Path("/groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGroup updateGroup(PrestashopGroup group);
    
    @DELETE
    @Path("/groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteGroup(@PathParam("id") Long id);
    
    @GET
    @Path("/guests")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGuests readGuests(@QueryParam("display") String display, @BeanParam GuestFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/guests/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGuest readGuest(@PathParam("id") Long id);
    
    @POST
    @Path("/guests")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGuest createGuest(PrestashopGuest guest);
    
    @PUT
    @Path("/guests")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopGuest updateGuest(PrestashopGuest guest);
    
    @DELETE
    @Path("/guests/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteGuest(@PathParam("id") Long id);
    
    @GET
    @Path("/image_types")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopImageTypes readImageTypes(@QueryParam("display") String display, @BeanParam ImageTypeFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/image_types/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopImageType readImageType(@PathParam("id") Long id);
    
    @POST
    @Path("/image_types")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopImageType createImageType(PrestashopImageType imageType);
    
    @PUT
    @Path("/image_types")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopImageType updateImageType(PrestashopImageType imageType);
    
    @DELETE
    @Path("/image_types/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteImageType(@PathParam("id") Long id);
    
    @GET
    @Path("/languages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopLanguages readLanguages(@QueryParam("display") String display, @BeanParam LanguageFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/languages/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopLanguage readLanguage(@PathParam("id") Long id);
    
    @POST
    @Path("/languages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopLanguage createLanguage(PrestashopLanguage language);
    
    @PUT
    @Path("/languages")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopLanguage updateLanguage(PrestashopLanguage language);
    
    @DELETE
    @Path("/languages/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteLanguage(@PathParam("id") Long id);
    
    @GET
    @Path("/manufacturers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopManufacturers readManufacturers(@QueryParam("display") String display, @BeanParam ManufacturerFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/manufacturers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopManufacturer readManufacturer(@PathParam("id") Long id);
    
    @POST
    @Path("/manufacturers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopManufacturer createManufacturer(PrestashopManufacturer manufacturer);
    
    @PUT
    @Path("/manufacturers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopManufacturer updateManufacturer(PrestashopManufacturer manufacturer);
    
    @DELETE
    @Path("/manufacturers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteManufacturer(@PathParam("id") Long id);
    
    @GET
    @Path("/order_carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCarriers readOrderCarriers(@QueryParam("display") String display, @BeanParam OrderCarrierFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_carriers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCarrier readOrderCarrier(@PathParam("id") Long id);
    
    @POST
    @Path("/order_carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCarrier createOrderCarrier(PrestashopOrderCarrier orderCarrier);
    
    @PUT
    @Path("/order_carriers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCarrier updateOrderCarrier(PrestashopOrderCarrier orderCarrier);
    
    @DELETE
    @Path("/order_carriers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderCarrier(@PathParam("id") Long id);
    
    @GET
    @Path("/order_details")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderDetails readOrderDetails(@QueryParam("display") String display, @BeanParam OrderDetailFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_details/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderDetail readOrderDetail(@PathParam("id") Long id);
    
    @POST
    @Path("/order_details")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderDetail createOrderDetail(PrestashopOrderDetail orderDetail);
    
    @PUT
    @Path("/order_details")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderDetail updateOrderDetail(PrestashopOrderDetail orderDetail);
    
    @DELETE
    @Path("/order_details/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderDetail(@PathParam("id") Long id);
    
    @GET
    @Path("/order_discounts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderDiscounts readOrderDiscounts(@QueryParam("display") String display, @BeanParam OrderCartRuleFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_discounts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCartRule readOrderCartRule(@PathParam("id") Long id);
    
    @POST
    @Path("/order_discounts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCartRule createOrderCartRule(PrestashopOrderCartRule orderCartRule);
    
    @PUT
    @Path("/order_discounts")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderCartRule updateOrderCartRule(PrestashopOrderCartRule orderCartRule);
    
    @DELETE
    @Path("/order_discounts/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderCartRule(@PathParam("id") Long id);
    
    @GET
    @Path("/order_histories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderHistories readOrderHistories(@QueryParam("display") String display, @BeanParam OrderHistoryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_histories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderHistory readOrderHistory(@PathParam("id") Long id);
    
    @POST
    @Path("/order_histories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderHistory createOrderHistory(PrestashopOrderHistory orderHistory);
    
    @PUT
    @Path("/order_histories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderHistory updateOrderHistory(PrestashopOrderHistory orderHistory);
    
    @DELETE
    @Path("/order_histories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderHistory(@PathParam("id") Long id);
    
    @GET
    @Path("/order_invoices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderInvoices readOrderInvoices(@QueryParam("display") String display, @BeanParam OrderInvoiceFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_invoices/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderInvoice readOrderInvoice(@PathParam("id") Long id);
    
    @POST
    @Path("/order_invoices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderInvoice createOrderInvoice(PrestashopOrderInvoice orderInvoice);
    
    @PUT
    @Path("/order_invoices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderInvoice updateOrderInvoice(PrestashopOrderInvoice orderInvoice);
    
    @DELETE
    @Path("/order_invoices/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderInvoice(@PathParam("id") Long id);
    
    @GET
    @Path("/order_payments")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderPayments readOrderPayments(@QueryParam("display") String display, @BeanParam OrderPaymentFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_payments/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderPayment readOrderPayment(@PathParam("id") Long id);
    
    @POST
    @Path("/order_payments")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderPayment createOrderPayment(PrestashopOrderPayment orderPayment);
    
    @PUT
    @Path("/order_payments")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderPayment updateOrderPayment(PrestashopOrderPayment orderPayment);
    
    @DELETE
    @Path("/order_payments/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderPayment(@PathParam("id") Long id);
    
    @GET
    @Path("/order_states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderStates readOrderStates(@QueryParam("display") String display, @BeanParam OrderStateFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/order_states/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderState readOrderState(@PathParam("id") Long id);
    
    @POST
    @Path("/order_states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderState createOrderState(PrestashopOrderState orderState);
    
    @PUT
    @Path("/order_states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrderState updateOrderState(PrestashopOrderState orderState);
    
    @DELETE
    @Path("/order_states/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrderState(@PathParam("id") Long id);
    
    @GET
    @Path("/orders")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrders readOrders(@QueryParam("display") String display, @BeanParam OrderFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/orders/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrder readOrder(@PathParam("id") Long id);
    
    @POST
    @Path("/orders")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrder createOrder(PrestashopOrder order);
    
    @PUT
    @Path("/orders")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopOrder updateOrder(PrestashopOrder order);
    
    @DELETE
    @Path("/orders/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteOrder(@PathParam("id") Long id);
    
    @GET
    @Path("/price_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopPriceRanges readPriceRanges(@QueryParam("display") String display, @BeanParam PriceRangeFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/price_ranges/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopPriceRange readPriceRange(@PathParam("id") Long id);
    
    @POST
    @Path("/price_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopPriceRange createPriceRange(PrestashopPriceRange priceRange);
    
    @PUT
    @Path("/price_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopPriceRange updatePriceRange(PrestashopPriceRange priceRange);
    
    @DELETE
    @Path("/price_ranges/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deletePriceRange(@PathParam("id") Long id);
    
    @GET
    @Path("/product_feature_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeatureValues readProductFeatureValues(@QueryParam("display") String display, @BeanParam ProductFeatureValueFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/product_feature_values/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeatureValue readProductFeatureValue(@PathParam("id") Long id);
    
    @POST
    @Path("/product_feature_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeatureValue createProductFeatureValue(PrestashopProductFeatureValue productFeatureValue);
    
    @PUT
    @Path("/product_feature_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeatureValue updateProductFeatureValue(PrestashopProductFeatureValue productFeatureValue);
    
    @DELETE
    @Path("/product_feature_values/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteProductFeatureValue(@PathParam("id") Long id);
    
    @GET
    @Path("/product_features")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeatures readProductFeatures(@QueryParam("display") String display, @BeanParam ProductFeatureFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/product_features/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeature readProductFeature(@PathParam("id") Long id);
    
    @POST
    @Path("/product_features")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeature createProductFeature(PrestashopProductFeature productFeature);
    
    @PUT
    @Path("/product_features")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductFeature updateProductFeature(PrestashopProductFeature productFeature);
    
    @DELETE
    @Path("/product_features/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteProductFeature(@PathParam("id") Long id);
    
    @GET
    @Path("/product_option_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOptionValues readProductOptionValues(@QueryParam("display") String display, @BeanParam ProductOptionValueFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/product_option_values/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOptionValue readProductOptionValue(@PathParam("id") Long id);
    
    @POST
    @Path("/product_option_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOptionValue createProductOptionValue(PrestashopProductOptionValue productOptionValue);
    
    @PUT
    @Path("/product_option_values")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOptionValue updateProductOptionValue(PrestashopProductOptionValue productOptionValue);
    
    @DELETE
    @Path("/product_option_values/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteProductOptionValue(@PathParam("id") Long id);
    
    @GET
    @Path("/product_options")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOptions readProductOptions(@QueryParam("display") String display, @BeanParam ProductOptionFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/product_options/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOption readProductOption(@PathParam("id") Long id);
    
    @POST
    @Path("/product_options")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOption createProductOption(PrestashopProductOption productOption);
    
    @PUT
    @Path("/product_options")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductOption updateProductOption(PrestashopProductOption productOption);
    
    @DELETE
    @Path("/product_options/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteProductOption(@PathParam("id") Long id);
    
    @GET
    @Path("/product_suppliers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductSuppliers readProductSuppliers(@QueryParam("display") String display, @BeanParam ProductSupplierFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/product_suppliers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProductSupplier readProductSupplier(@PathParam("id") Long id);
    
    @GET
    @Path("/products")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProducts readProducts(@QueryParam("display") String display, @BeanParam ProductFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/products/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProduct readProduct(@PathParam("id") Long id);
    
    @POST
    @Path("/products")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProduct createProduct(PrestashopProduct product);
    
    @PUT
    @Path("/products")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopProduct updateProduct(PrestashopProduct product);
    
    @DELETE
    @Path("/products/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteProduct(@PathParam("id") Long id);
    
    @GET
    @Path("/shop_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShopGroups readShopGroups(@QueryParam("display") String display, @BeanParam ShopGroupFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/shop_groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShopGroup readShopGroup(@PathParam("id") Long id);
    
    @POST
    @Path("/shop_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShopGroup createShopGroup(PrestashopShopGroup shopGroup);
    
    @PUT
    @Path("/shop_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShopGroup updateShopGroup(PrestashopShopGroup shopGroup);
    
    @DELETE
    @Path("/shop_groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteShopGroup(@PathParam("id") Long id);
    
    @GET
    @Path("/shops")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShops readShops(@QueryParam("display") String display, @BeanParam ShopFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/shops/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShop readShop(@PathParam("id") Long id);
    
    @POST
    @Path("/shops")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShop createShop(PrestashopShop shop);
    
    @PUT
    @Path("/shops")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopShop updateShop(PrestashopShop shop);
    
    @DELETE
    @Path("/shops/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteShop(@PathParam("id") Long id);
    
    @GET
    @Path("/specific_price_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPriceRules readSpecificPriceRules(@QueryParam("display") String display, @BeanParam SpecificPriceRuleFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/specific_price_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPriceRule readSpecificPriceRule(@PathParam("id") Long id);
    
    @POST
    @Path("/specific_price_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPriceRule createSpecificPriceRule(PrestashopSpecificPriceRule specificPriceRule);
    
    @PUT
    @Path("/specific_price_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPriceRule updateSpecificPriceRule(PrestashopSpecificPriceRule specificPriceRule);
    
    @DELETE
    @Path("/specific_price_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteSpecificPriceRule(@PathParam("id") Long id);
    
    @GET
    @Path("/specific_prices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPrices readSpecificPrices(@QueryParam("display") String display, @BeanParam SpecificPriceFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/specific_prices/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPrice readSpecificPrice(@PathParam("id") Long id);
    
    @POST
    @Path("/specific_prices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPrice createSpecificPrice(PrestashopSpecificPrice specificPrice);
    
    @PUT
    @Path("/specific_prices")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSpecificPrice updateSpecificPrice(PrestashopSpecificPrice specificPrice);
    
    @DELETE
    @Path("/specific_prices/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteSpecificPrice(@PathParam("id") Long id);
    
    @GET
    @Path("/states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStates readStates(@QueryParam("display") String display, @BeanParam StateFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/states/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopState readState(@PathParam("id") Long id);
    
    @POST
    @Path("/states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopState createState(PrestashopState state);
    
    @PUT
    @Path("/states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopState updateState(PrestashopState state);
    
    @DELETE
    @Path("/states/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteState(@PathParam("id") Long id);
    
    @GET
    @Path("/stock_availables")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockAvailables readStockAvailables(@QueryParam("display") String display, @BeanParam StockAvailableFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/stock_availables/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockAvailable readStockAvailable(@PathParam("id") Long id);
    
    @PUT
    @Path("/stock_availables")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockAvailable updateStockAvailable(PrestashopStockAvailable stockAvailable);
    
    @GET
    @Path("/stock_movement_reasons")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMovementReasons readStockMovementReasons(@QueryParam("display") String display, @BeanParam StockMovementReasonFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/stock_movement_reasons/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMovementReason readStockMovementReason(@PathParam("id") Long id);
    
    @POST
    @Path("/stock_movement_reasons")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMovementReason createStockMovementReason(PrestashopStockMovementReason stockMovementReason);
    
    @PUT
    @Path("/stock_movement_reasons")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMovementReason updateStockMovementReason(PrestashopStockMovementReason stockMovementReason);
    
    @DELETE
    @Path("/stock_movement_reasons/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteStockMovementReason(@PathParam("id") Long id);
    
    @GET
    @Path("/stock_movements")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMovements readStockMovements(@QueryParam("display") String display, @BeanParam StockMvtFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/stock_movements/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStockMvt readStockMvt(@PathParam("id") Long id);
    
    @GET
    @Path("/stocks")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStocks readStocks(@QueryParam("display") String display, @BeanParam StockFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/stocks/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStock readStock(@PathParam("id") Long id);
    
    @GET
    @Path("/stores")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStores readStores(@QueryParam("display") String display, @BeanParam StoreFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/stores/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStore readStore(@PathParam("id") Long id);
    
    @POST
    @Path("/stores")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStore createStore(PrestashopStore store);
    
    @PUT
    @Path("/stores")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopStore updateStore(PrestashopStore store);
    
    @DELETE
    @Path("/stores/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteStore(@PathParam("id") Long id);
    
    @GET
    @Path("/suppliers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSuppliers readSuppliers(@QueryParam("display") String display, @BeanParam SupplierFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/suppliers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplier readSupplier(@PathParam("id") Long id);
    
    @POST
    @Path("/suppliers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplier createSupplier(PrestashopSupplier supplier);
    
    @PUT
    @Path("/suppliers")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplier updateSupplier(PrestashopSupplier supplier);
    
    @DELETE
    @Path("/suppliers/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteSupplier(@PathParam("id") Long id);
    
    @GET
    @Path("/supply_order_details")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderDetails readSupplyOrderDetails(@QueryParam("display") String display, @BeanParam SupplyOrderDetailFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/supply_order_details/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderDetail readSupplyOrderDetail(@PathParam("id") Long id);
    
    @GET
    @Path("/supply_order_histories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderHistories readSupplyOrderHistories(@QueryParam("display") String display, @BeanParam SupplyOrderHistoryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/supply_order_histories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderHistory readSupplyOrderHistory(@PathParam("id") Long id);
    
    @GET
    @Path("/supply_order_receipt_histories")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderReceiptHistories readSupplyOrderReceiptHistories(@QueryParam("display") String display, @BeanParam SupplyOrderReceiptHistoryFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/supply_order_receipt_histories/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderReceiptHistory readSupplyOrderReceiptHistory(@PathParam("id") Long id);
    
    @GET
    @Path("/supply_order_states")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderStates readSupplyOrderStates(@QueryParam("display") String display, @BeanParam SupplyOrderStateFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/supply_order_states/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrderState readSupplyOrderState(@PathParam("id") Long id);
    
    @GET
    @Path("/supply_orders")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrders readSupplyOrders(@QueryParam("display") String display, @BeanParam SupplyOrderFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/supply_orders/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopSupplyOrder readSupplyOrder(@PathParam("id") Long id);
    
    @GET
    @Path("/tags")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTags readTags(@QueryParam("display") String display, @BeanParam TagFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/tags/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTag readTag(@PathParam("id") Long id);
    
    @POST
    @Path("/tags")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTag createTag(PrestashopTag tag);
    
    @PUT
    @Path("/tags")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTag updateTag(PrestashopTag tag);
    
    @DELETE
    @Path("/tags/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteTag(@PathParam("id") Long id);
    
    @GET
    @Path("/tax_rule_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRuleGroups readTaxRuleGroups(@QueryParam("display") String display, @BeanParam TaxRuleGroupFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/tax_rule_groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRuleGroup readTaxRuleGroup(@PathParam("id") Long id);
    
    @POST
    @Path("/tax_rule_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRuleGroup createTaxRuleGroup(PrestashopTaxRuleGroup taxRuleGroup);
    
    @PUT
    @Path("/tax_rule_groups")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRuleGroup updateTaxRuleGroup(PrestashopTaxRuleGroup taxRuleGroup);
    
    @DELETE
    @Path("/tax_rule_groups/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteTaxRuleGroup(@PathParam("id") Long id);
    
    @GET
    @Path("/tax_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRules readTaxRules(@QueryParam("display") String display, @BeanParam TaxRuleFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/tax_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRule readTaxRule(@PathParam("id") Long id);
    
    @POST
    @Path("/tax_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRule createTaxRule(PrestashopTaxRule taxRule);
    
    @PUT
    @Path("/tax_rules")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxRule updateTaxRule(PrestashopTaxRule taxRule);
    
    @DELETE
    @Path("/tax_rules/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteTaxRule(@PathParam("id") Long id);
    
    @GET
    @Path("/taxes")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTaxes readTaxes(@QueryParam("display") String display, @BeanParam TaxFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/taxes/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTax readTax(@PathParam("id") Long id);
    
    @POST
    @Path("/taxes")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTax createTax(PrestashopTax tax);
    
    @PUT
    @Path("/taxes")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTax updateTax(PrestashopTax tax);
    
    @DELETE
    @Path("/taxes/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteTax(@PathParam("id") Long id);
    
    @GET
    @Path("/translated_configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTranslatedConfigurations readTranslatedConfigurations(@QueryParam("display") String display, @BeanParam TranslatedConfigurationFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/translated_configurations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTranslatedConfiguration readTranslatedConfiguration(@PathParam("id") Long id);
    
    @POST
    @Path("/translated_configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTranslatedConfiguration createTranslatedConfiguration(PrestashopTranslatedConfiguration translatedConfiguration);
    
    @PUT
    @Path("/translated_configurations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopTranslatedConfiguration updateTranslatedConfiguration(PrestashopTranslatedConfiguration translatedConfiguration);
    
    @DELETE
    @Path("/translated_configurations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteTranslatedConfiguration(@PathParam("id") Long id);
    
    @GET
    @Path("/warehouse_product_locations")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouseProductLocations readWarehouseProductLocations(@QueryParam("display") String display, @BeanParam WarehouseProductLocationFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/warehouse_product_locations/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouseProductLocation readWarehouseProductLocation(@PathParam("id") Long id);
    
    @GET
    @Path("/warehouses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouses readWarehouses(@QueryParam("display") String display, @BeanParam WarehouseFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/warehouses/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouse readWarehouse(@PathParam("id") Long id);
    
    @POST
    @Path("/warehouses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouse createWarehouse(PrestashopWarehouse warehouse);
    
    @PUT
    @Path("/warehouses")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWarehouse updateWarehouse(PrestashopWarehouse warehouse);
    
    @GET
    @Path("/weight_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWeightRanges readWeightRanges(@QueryParam("display") String display, @BeanParam WeightRangeFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/weight_ranges/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWeightRange readWeightRange(@PathParam("id") Long id);
    
    @POST
    @Path("/weight_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWeightRange createWeightRange(PrestashopWeightRange weightRange);
    
    @PUT
    @Path("/weight_ranges")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopWeightRange updateWeightRange(PrestashopWeightRange weightRange);
    
    @DELETE
    @Path("/weight_ranges/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteWeightRange(@PathParam("id") Long id);
    
    @GET
    @Path("/zones")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopZones readZones(@QueryParam("display") String display, @BeanParam ZoneFilter filter, @QueryParam("sort") String sort, @QueryParam("limit") String limit);
    
    @GET
    @Path("/zones/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopZone readZone(@PathParam("id") Long id);
    
    @POST
    @Path("/zones")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopZone createZone(PrestashopZone zone);
    
    @PUT
    @Path("/zones")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public PrestashopZone updateZone(PrestashopZone zone);
    
    @DELETE
    @Path("/zones/{id}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public void deleteZone(@PathParam("id") Long id);
    
}
