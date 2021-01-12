package com.example.demo.po;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PoController {
@Autowired
public PoServices poservices;
@PostMapping(value="/insertPoData")
public String poInsertData(@RequestBody Po p) {
	return poservices.insertData(p);
}
@GetMapping(value="/getPoSingleRecord")
public Map getRecord(@RequestBody Po p){
	return poservices.getPosSingleRecord(p.getCustomerid());
}
@GetMapping(value="/getAllPoRecords")
public List getAllPoData() {
	return poservices.getAllPoRecords();
}
}
