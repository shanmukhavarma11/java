package com.example.demo.amazon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
import com.example.demo.customer.OrderGetterSetter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Service
public class AmazonServices {
@Autowired
public JdbcTemplate jdbc_template;
@Autowired
public NamedParameterJdbcTemplate named_parameter_jdbc_template;

public Map<String,String> insetDataItem1(ItemsData items_data) {	
		
	Map<String,String> hashmap_data=new HashMap<String,String>();
	String sql_query="insert into item(itemsname,description,itemcost) values(:itemsname,:itemsdescription,:itemcost)";

		try
			{
		 		SqlParameterSource sps=new MapSqlParameterSource()
	           .addValue("itemsname",items_data.getItemsname())
		       .addValue("itemsdescription",items_data.getItemsdescription())
			   .addValue("itemcost",items_data.getItemcost());
				int status=named_parameter_jdbc_template.update(sql_query,sps);
				
	if(status>0) {
		hashmap_data.put("sucess","data inserted");
	}
	else {
		hashmap_data.put("failure","not inserted");
	}
    }
		catch(Exception e) {
			hashmap_data.put("some error",e.getMessage());
			}
	return hashmap_data;
		}
	
public Map<String,String> createCustomerAccount(CustomerGetterAndSetterMethod cgs) {
	
			Map<String,String> hashmap_data=new HashMap<String,String>();
		
			String sql_query="insert into customerdetails(customername,cutomerpassword,loggedinornot) values(:customername,:cutomerpassword,:loggedinornot)";
			
			try
			{
				System.out.println(cgs.getCustomername());
				System.out.println(cgs.getCustomername());
				SqlParameterSource sps=new MapSqlParameterSource()
			           .addValue("customername",cgs.getCustomername())
			           .addValue("cutomerpassword",cgs.getCutomerpassword())
			           .addValue("loggedinornot",cgs.getLoggedinornot());
				int status=named_parameter_jdbc_template.update(sql_query,sps);
				
				if(status>0) {
					hashmap_data.put("sucess","data inserted");
				}
				else {
					hashmap_data.put("failure","not inserted");
				}	
		  }
		catch(Exception e) {
				hashmap_data.put("some error",e.getMessage());
			}	
	return hashmap_data;
}

public Map<String,String> customerLoginTrue(CustomerGetterAndSetterMethod cgs) {
	
	Map<String,String> hashmap_data=new HashMap<String,String>();
	String s=(String)cgs.getCustomername();
	
	String sql_query="select * from customerdetails where customername=?";
	List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
	
	try {
		nested_data=jdbc_template.queryForList(sql_query,cgs.getCustomername());
		
		if((cgs.getCustomername().equals((String)nested_data.get(0).get("customername")))&&((cgs.getCutomerpassword().equals((String)nested_data.get(0).get("cutomerpassword"))))){
			String update="update customerdetails set loggedinornot=true where customername=?";
			
			int result = jdbc_template.update(update,cgs.getCustomername());
			
			if(result>0) {
				hashmap_data.put("sucess", "loggedin successfully");
			}
			else {
				hashmap_data.put("failure", "pls enter valid data");
			}
		}
	}
	catch(Exception w) {
		hashmap_data.put("failure", w.getMessage());
	}
	return hashmap_data;
}

public Map customerLogoutTrue(CustomerGetterAndSetterMethod cgs) {
	
	Map<String,String> hashmap_data=new HashMap<String,String>();
	String s=(String)cgs.getCustomername();
	
	String sql_query="select * from customerdetails where customername=?";
	
	List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
	
	try {
		nested_data=jdbc_template.queryForList(sql_query,cgs.getCustomername());
		
		if((cgs.getCustomername().equals((String)nested_data.get(0).get("customername")))&&((cgs.getCutomerpassword().equals((String)nested_data.get(0).get("cutomerpassword")))&&("true".equals((String)nested_data.get(0).get("loggedinornot"))))){
			String update="update customerdetails set loggedinornot=false where customername=?";
		
			int result = jdbc_template.update(update,cgs.getCustomername());
			
			if(result>0) {
				hashmap_data.put("sucess", "loggedout successfully");
			}
			else {
				hashmap_data.put("failure", "pls enter valid data");
			}
		}
		
		else {
			hashmap_data.put("failed", "fishing");
		}
		
	}
	
	catch(Exception w) {
		hashmap_data.put("failure", w.getMessage());
	}
	return hashmap_data;
}

public List orderedThing(OrderGetterSetter ogs) {
	
	Map hashmap_data=null;
	List data1=new ArrayList();
	List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
	List<Map<String,Object>> nested_data1=new ArrayList<Map<String,Object>>();
	
	String sql_items_query="select * from item where itemid=?";
	try {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
		LocalDateTime now = LocalDateTime.now(); 
		      
		String sql_customer_query="select * from customerdetails where cutomerid=?";
		String sql_insert_query="insert into ordertable(itemid,cutomerid,dateoforder,orderitemname,numberofproductsorder,toalcost)"
				+ "values(:itemid,:cutomerid,:dateoforder,:orderitemname,:numberofproductsorder,:toalcost)";
		
		for(Map<String,Object> ad:jdbc_template.queryForList(sql_customer_query,ogs.getCutomerid())) {
			nested_data1.add(ad);
		}
		
		for(Map<String,Object> name:jdbc_template.queryForList(sql_items_query,ogs.getItemid())) {
			nested_data1.add(name);
		}
		//System.out.println(nested_data1);
		/*System.out.println("!!!!!!!!!!!"+ogs.getCutomerid());
		System.out.println(ogs.getNumberofproductsorder());
		System.out.println(nested_data1.get(nested_data1.size()-1).get("itemsname"));
		System.out.println((ogs.getNumberofproductsorder()));
	*/
//System.out.println("$$$$$$$$$$");
		String j="";
		j=(String)nested_data1.get(nested_data1.size()-1).get("itemcost");
		int k=Integer.parseInt(j);
		SimpleDateFormat ff=new SimpleDateFormat("yyyy/MM/dd");
		Date date22=ff.parse(dtf.format(now));
		System.out.println("@@@@@@@@@@");
		if(("true".equals((String)nested_data1.get(0).get("loggedinornot")))&&((int)nested_data1.get(nested_data1.size()-1).get("itemid")==((int)ogs.getItemid()))) {
			SqlParameterSource sps=new MapSqlParameterSource()
				.addValue("itemid",ogs.getItemid())
			    .addValue("cutomerid",ogs.getCutomerid())
			    .addValue("dateoforder",date22)
			    .addValue("orderitemname", (String)nested_data1.get(nested_data1.size()-1).get("itemsname"))
			    .addValue("numberofproductsorder", (ogs.getNumberofproductsorder()))
			    .addValue("toalcost",((int)ogs.getNumberofproductsorder()*k));
			
			int status=named_parameter_jdbc_template.update(sql_insert_query,sps);
			System.out.println(status);
			if(status>0) {
				String sql_query="select * from ordertable where cutomerid=?";
				nested_data=jdbc_template.queryForList(sql_query,ogs.getCutomerid());
				Integer i=0;
				System.out.println(nested_data);
				for(Map data:nested_data) {
					
						hashmap_data=new HashMap();
						i=(int)data.get("itemid");
						hashmap_data.put("itemid",i.toString());
						i=(int)data.get("cutomerid");
						hashmap_data.put("cutomerid",i.toString());
						DateFormat ff1=new SimpleDateFormat("yyyy/MM/dd");
						String test=ff1.format(data.get("dateoforder"));
						hashmap_data.put("dateoforder", test);
						i=(int)data.get("cutomerid");
						hashmap_data.put("numberofproductsorder",data.get("numberofproductsorder"));
						hashmap_data.put("toalcost",data.get("toalcost"));
						data1.add(hashmap_data);	
				}
				hashmap_data.put("sucess","you have ordered");
			}
			
			else {
				hashmap_data.put("failed","your ordered failed");
			}
		}
		else {
			 hashmap_data.put("failed", "pls login to order");
		}
	}
	catch(Exception e1) {
		hashmap_data.put("failed",e1.getMessage());
		data1.add(hashmap_data);
	}
	return data1;
   }
}