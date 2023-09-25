package com.example.customerdetails.controller;

import com.example.customerdetails.model.Customer_details;
import com.example.customerdetails.repository.Customer_repository;
import com.example.customerdetails.service.Customer_service_Imple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private Customer_service_Imple customer_service_imple;

    @GetMapping("/getAllCustomers")
    public List<Customer_details> getAllUsers(){
        return customer_service_imple.getAllCustomers();
    }

    @PostMapping("/putCustomer")
    public Customer_details createUser(@RequestBody Customer_details customer_details) {
//        customer_details.setDob(new SimpleDateFormat("yyyy/MM/dd").parse(String.valueOf(customer_details.getDob())));

        return customer_service_imple.createCustomer(customer_details);
    }

    @GetMapping("/getByID/{id}")
    public ResponseEntity<Customer_details> getUserByID(@PathVariable long id){
        return ResponseEntity.ok(customer_service_imple.getCustomerByID(id));
    }

    @PutMapping("/updateByID/{id}")
    public ResponseEntity<Customer_details> updateUserByID(@PathVariable long id ,@RequestBody Customer_details customer){
        return ResponseEntity.ok(customer_service_imple.updateCustomerByID(id , customer));
    }


    @DeleteMapping("/deleteByID/{id}")
    public ResponseEntity<Customer_details> deleteUserByID(@PathVariable long id){
        return new ResponseEntity<>(customer_service_imple.deleteCustomerByID(id) , HttpStatus.NO_CONTENT);
    }
}
