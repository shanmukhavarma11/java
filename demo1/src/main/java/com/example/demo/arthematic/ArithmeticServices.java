package com.example.demo.arthematic;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticServices {
public String addition(Arthimetaic arthi) {
	int a=arthi.getNumber1();
	int b=arthi.getNumber2();
	int c;
	c=a+b;
	return ("answer"+c);
}
public String mul1(Arthimetaic2 arthi) {
	int a=arthi.getNumber2Variable1();
	int b=arthi.getNumber2Variable2();
	int c=a*b;
	return ("mul"+c);
}
public String production(Arthimetic4 arthi) {
	int a=arthi.getNumber4Variable1();
	int b=arthi.getNumber4Variable2();
	if(b==0) {
		try {
			int b1=0;
			b1=a/b;
			
		}
		catch(Exception e){
			return ("some error"+e.getMessage());
		}
	}
	int c=a/b;
	return ("division"+c);
}
public String subtraction(Arthimetic3 arthi) {
	int a=arthi.getNumber3Variable1();
	int b=arthi.getNumber3Variable2();
	return("subraction"+(a-b));
}
}
