package com.example.demo.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
@Service
public class CustomerServices {
	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Autowired
	public JdbcTemplate jdbc_template;
	public Map<String,String> addCustomer(Customer customer) {
		
		Map<String,String> data=new HashMap<String,String>();
		int status=0;
		String insert="insert into Customer1(customername,phonenumber,shiptoaddress,shiptozip,shiptocity,shiptostate) values(:Customername,:phonenumber,:shiptoaddress,:shiptozip,:shiptocity,:shiptostate)";
	try 
	{
		SqlParameterSource sps = new MapSqlParameterSource()
				.addValue("Customername",customer.getCustomername()).
				addValue("phonenumber",customer.getPhonenumber()).
				addValue("shiptoaddress", customer.getShiptoaddress()).
				addValue("shiptozip", customer.getShiptozip()).
				addValue("shiptocity",customer.getShiptocity()).
				addValue("shiptostate",customer.getShiptostate());
		status=namedParameterJdbcTemplate.update(insert,sps);
	    if(status>0) {
	    	data.put("sucess","insertiondone");
	    }
	    else {
	    	data.put("failed","no row effected");
	    }
	    return data;
	}
	catch(Exception e) {
		data.put("failed",e.getMessage());
	}
	return data;
	}
	public Map<String,String> getSingleCustomerRecord(Integer id) {
		Map<String,String> hashmap_data=new HashMap<String,String>();
		String sql_query="select * from Customer1 where customerid=?";
		List<Map<String,Object>> nested_query=new ArrayList<Map<String,Object>>();
		try {
			nested_query=jdbc_template.queryForList(sql_query,id);
				hashmap_data.put("id",id.toString());
				hashmap_data.put("customername",(String)nested_query.get(0).get("customername"));
				hashmap_data.put("phonenumber",(String)nested_query.get(0).get("phonenumber"));
				hashmap_data.put("shiptoaddress",(String)nested_query.get(0).get("shiptoaddress"));
				hashmap_data.put("shiptozip",(String)nested_query.get(0).get("shiptozip"));
				hashmap_data.put("shiptocity",(String)nested_query.get(0).get("shiptocity"));
				hashmap_data.put("shiptostate",(String)nested_query.get(0).get("shiptostate"));
			
		}
		catch(Exception e) {
			hashmap_data.put("error", e.getMessage());
		}
		return hashmap_data;
	}
	public List getAllRecords(){
		Map<String,String> data_map=new HashMap<String,String>();
		ArrayList array_list=new ArrayList();
		List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
		String sql_data="select * from items";
		try {
			nested_data=jdbc_template.queryForList(sql_data);
			for(Map<String,Object> data:nested_data) {
				data_map=new HashMap<String,String>();
				Integer i=(int)data.get("id");
				data_map.put("id",i.toString());
				data_map.put("name", (String)data.get("name"));
				data_map.put("description", (String) data.get("description"));
				data_map.put("price",  (String) data.get("price"));
				array_list.add(data_map);
			}
		}
		catch(Exception e) {
			data_map.put("error_message",e.getMessage());
		}
		return array_list;
	}
	public List<String> getAllCustomerRecord() {
		Map<String,String> hashmap_data=null;
		String sql_query="select * from customer1";
		List list_data=new ArrayList();
		List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
		try {
			nested_data=jdbc_template.queryForList(sql_query);
			for(Map<String,Object> data:nested_data) {
				hashmap_data=new HashMap<String,String>();
				Integer i=(int)data.get("customerid");
				hashmap_data.put("id",i.toString());
				hashmap_data.put("customername",(String)data.get("Customername"));
				hashmap_data.put("phonenumber",(String)data.get("phonenumber"));
				hashmap_data.put("shiptoaddress",(String)data.get("shiptoaddress"));
				hashmap_data.put("shiptozip",(String)data.get("shiptozip"));
				hashmap_data.put("shiptocity",(String)data.get("shiptocity"));
				hashmap_data.put("shiptostate",(String)data.get("shiptostate"));
				list_data.add(hashmap_data);
				
			}
		}
		catch(Exception e) {
			
		hashmap_data.put("failed","error");
		}
		return list_data;
	}

}
