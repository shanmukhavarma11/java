package com.example.demo.amazon;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.customer.OrderGetterSetter;


@RestController
public class AmazonController {
@Autowired
public AmazonServices amazon_services;

@PostMapping(value="/orderedThings")
public List orderedThings(@RequestBody OrderGetterSetter ogs) {
	return amazon_services.orderedThing(ogs);
}


@PostMapping(value="/insertDataAll")
public Map insertData(@RequestBody ItemsData items_data) {
	return amazon_services.insetDataItem1(items_data);
}


@PostMapping(value="/createAccount")
public Map createAccount(@RequestBody CustomerGetterAndSetterMethod cgs) {
	return amazon_services.createCustomerAccount(cgs);
}


@PutMapping(value="/customerLoggin")
public Map customerLogin(@RequestBody CustomerGetterAndSetterMethod cgs) {
return amazon_services.customerLoginTrue(cgs);
}


@PutMapping(value="/logout")
public Map customerLogout(@RequestBody CustomerGetterAndSetterMethod cgs ) {
	return amazon_services.customerLogoutTrue(cgs);
}


}
