package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController
public class Demo1 {
	@RequestMapping("/add")
	String Add(int a,int b,String d) {
		if(d.equals("+"))
			return("sum"+(a+b));
		if(d.equals("-"))
			return("sub"+(a-b));
		if(d.equals("/"))
			return("product"+(a/b));
		if(d.equals("*"))
			return("multiply"+(a*b));
		return ("could not match your operation \t"+d);
	}
	@RequestMapping("/mul")
	int mul(int a,int b,String d) {
		if(d=="*")
		return((a+b));
		return (a+b);
	}

}
