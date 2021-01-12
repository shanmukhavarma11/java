package com.example.demo.arthematic;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
@Service
public class Services {
@Autowired
private JdbcTemplate jdbcTemplate;
@Autowired
public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
public Map<String,String> AddToDatabaseTable(GetterAndSetterMethods gsm) {
	Map<String,String> hashmap=new HashMap<String,String>();
	int status=0;
	String insert="insert into Customer1(customername,phonenumber,shiptoaddress,shiptozip,shiptocity,shiptostate) values(:CustomerName1,:PhoneNumber1,:ShipToAddress1,:ShipToZip1,:ShipToCity1,:ShipToState1)";
try 
{
	SqlParameterSource sps = new MapSqlParameterSource()
			.addValue("CustomerName1",gsm.getCustomerName1()).addValue("PhoneNumber1",gsm.getPhoneNumber1()).addValue("ShipToAddress1", gsm.getShipToAddress1()).addValue("ShipToZip1", gsm.getShipToZip1()).addValue("ShipToCity1",gsm.getShipToCity1()).addValue("ShipToState1",gsm.getShipToState1());
    System.out.println("Testing ****************************");
    System.out.println(gsm.getCustomerName1());
	status=namedParameterJdbcTemplate.update(insert,sps);
    if(status>0) {
    	hashmap.put("sucess","insertiondone");
    }
    else {
    	hashmap.put("failed","no row effected");
    }
    return hashmap;
}
catch(Exception e) {
	hashmap.put("failed",e.getMessage());
}
return hashmap;
}
public List GetPersonDetails(int gsm){

	Map map = new HashMap();
	List list = new ArrayList();
	List<Map<String, Object>> nested = new ArrayList<Map<String, Object>>();
	String select = "select * from Customer1 where id = ?";
	try {
		nested = jdbcTemplate.queryForList(select, gsm);
		for (Map<String, Object> row : nested) {
			map.put("customerid", row.get("customerid"));
			map.put("customername", row.get("customername"));
			map.put("phoneNumber", row.get("phonenumber"));
			list.add(nested);
		}

	} catch (Exception e) {
		map.put("error", "Error occured");
	}
	
	return list;
}
public Map<String,String> AddToDatabaseTable1(GetterAndSetterMethods2 gsm) {
	Map<String,String> hashmap=new HashMap<String,String>();
	int status=0;
	String insert="insert into Customer11(CustomerID,CustomerName,PhoneNumber,ShipToAddress,ShipToZip,ShipToCity,ShipToState) values(:CustomerID11,:CustomerName11,:PhoneNumber11,:ShipToAddress11,:ShipToZip11,:ShipToCity11,:ShipToState11)";
try 
{
	SqlParameterSource sps = new MapSqlParameterSource()
			.addValue("CustomerID11",gsm.getCustomerID11())
			.addValue("CustomerName11",gsm.getCustomerName11()).addValue("PhoneNumber11",gsm.getPhoneNumber11()).addValue("ShipToAddress11", gsm.getShipToAddress11()).addValue("ShipToZip11", gsm.getShipToZip11()).addValue("ShipToCity11",gsm.getShipToCity11()).addValue("ShipToState11",gsm.getShipToState11());
    System.out.println("Testing ****************************");
	status=namedParameterJdbcTemplate.update(insert,sps);
    if(status>0) {
    	hashmap.put("sucess","insertiondone");
    }
    else {
    	hashmap.put("failed","no row effected");
    }
    return hashmap;
}
catch(Exception e) {
	hashmap.put("failed",e.getMessage());
}
return hashmap;
}
public List GetPersonDetails1(int gsm){

	Map map = new HashMap();
	List list = new ArrayList();
	List<Map<String, Object>> nested = new ArrayList<Map<String, Object>>();
	String select = "select * from Customer1 where id = ?";
	try {
		nested = jdbcTemplate.queryForList(select, gsm);
		for (Map<String, Object> row : nested) {
			map.put("customerid", row.get("CustomerID11"));
			map.put("customername", row.get("CustomerName11"));
			map.put("phoneNumber", row.get("PhoneNumber11"));
			list.add(nested);
		}

	} catch (Exception e) {
		map.put("error", "Error occured");
	}
	
	return list;
}
}

