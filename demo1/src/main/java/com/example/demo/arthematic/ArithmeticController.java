package com.example.demo.arthematic;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class ArithmeticController {
@Autowired
public ArithmeticServices as;
@PostMapping(value="/addition")
public String addition(@RequestBody Arthimetaic a ) {
	return as.addition(a);
}
@PostMapping(value="/multiplication")
public String mul1(@RequestBody Arthimetaic2 ad) {
	return as.mul1(ad);
}
@PostMapping(value="/subtraction")
public String subtraction(@RequestBody Arthimetic3 arthi) {
	return as.subtraction(arthi);
}
@PostMapping(value="/division")
public String production(@RequestBody Arthimetic4 arthi) {
	return as.production(arthi);
}
}
