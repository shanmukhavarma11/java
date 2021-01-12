package com.example.demo.arthematic;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.Customer;
import com.example.demo.customer.CustomerServices;

@RestController
public class Controller {
@Autowired
public Services s;
@Autowired 
public CustomerServices customerservices;
/*@PostMapping(value="/testing/api/")
private String name(@RequestBody GetterAndSetterMethods gsm) {
	return s.add(gsm);
}*/

@PostMapping(value="/createCustommer")
public Map AddToTable(@RequestBody GetterAndSetterMethods gsm) {
return s.AddToDatabaseTable(gsm);	
}
@GetMapping("/getPersonDetails")
public List GetPersonDetails(@RequestBody GetterAndSetterMethods gsm) {
	return s.GetPersonDetails(gsm.getCustomerID1());
}
@PostMapping(value="/createCustommer1")
private Map AddToTable1(@RequestBody GetterAndSetterMethods2 gsm) {
return s.AddToDatabaseTable1(gsm);	
}
@GetMapping("/getPersonDetails1")
public List GetPersonDetails1(@RequestBody GetterAndSetterMethods2 gsm) {
	return s.GetPersonDetails1(gsm.getCustomerID11());
}

}
