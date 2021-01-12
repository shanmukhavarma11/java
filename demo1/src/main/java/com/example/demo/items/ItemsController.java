package com.example.demo.items;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsController {
	@Autowired
	public ItemsServices itemsServices;
	@PostMapping(value="/addItems")
	public Map addItems(@RequestBody Items items) {
 return itemsServices.addItems(items);
}
	@GetMapping(value="/getSingleRecord")
	public Map getRecordFromDatabase(@RequestBody Items items) {
		return itemsServices.getSingleRecord(items.getId());
	}
	@GetMapping(value="/getAllRecord")
	public List getALLRecordDatabase() {
		return itemsServices.getAllRecords();
	} 
}
