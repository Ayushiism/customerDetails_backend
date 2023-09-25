package com.example.customerdetails;

import com.example.customerdetails.model.Customer_details;
import com.example.customerdetails.repository.Customer_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class CustomerdetailsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerdetailsApplication.class, args);
	}


	@Autowired
	private Customer_repository customer_repository;

	@Override
	public void run(String... args) throws Exception {
//		Customer_details customer_details = new Customer_details();
//		customer_details.setFirst_name("Ayush");
//		customer_details.setLast_name("Tripathi");
//		customer_details.setGender("male");
//		customer_details.setDob("1999-10-04");
//		customer_details.setId_type(0);
//		customer_details.setId_number("012355466575");
//		customer_repository.save(customer_details);

	}
}
