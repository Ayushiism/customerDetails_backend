package com.example.customerdetails.repository;

import com.example.customerdetails.model.Customer_details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_repository extends JpaRepository<Customer_details, Long> {
}
