package com.example.customerdetails.service;

import com.example.customerdetails.model.Customer_details;

import java.util.List;

public interface Customer_service {
    List<Customer_details> getAllCustomers();
    Customer_details createCustomer( Customer_details user);
    Customer_details getCustomerByID(long id);
    Customer_details updateCustomerByID(long id , Customer_details user);
    Customer_details deleteCustomerByID( long id);
}
