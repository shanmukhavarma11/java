package com.example.demo.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CustomerController {
	@Autowired
	public CustomerServices customerservices;
	@PostMapping("/addcustomer")
	public Map addCustomerController(@RequestBody Customer customer) {
		return customerservices.addCustomer(customer);
	}
	@GetMapping("/getSingleCustomerRecord")
	public Map getSingleRecordDatabase(@RequestBody Customer customer) {
		return customerservices.getSingleCustomerRecord(customer.getCustomerid());
	}
	@GetMapping(value="/getAllCustomerRecord")
	public List getAllCustomerData() {
		return customerservices.getAllCustomerRecord();
	}
}
