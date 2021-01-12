package com.example.demo.po;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
@Service
public class PoServices {
@Autowired
public JdbcTemplate jdbc_template;
@Autowired
public NamedParameterJdbcTemplate named_parameter_jdbc_template;
	public String insertData(Po p) {
		String status=null;
		int nested_data=0;
		String sql_query="insert into potable(podate,total,"
				+ "poshiptoaddress,poshiptozip,poshiptocity,"
				+ "poshiptostate,pobilltoaddress,pobilltozip,"
				+ "pobbilltocity,pobilltostate,postatus) values(:podate,:total,:poshiptoaddress,:poshiptozip,:poshiptocity,"
				+ ":poshiptostate,:pobilltoaddress,:pobilltozip,:pobbilltocity,:pobilltostate,:postatus)";
		Map<String,String> hashmap_data=new HashMap<String,String>();
		try {
			System.out.println("**************");
			String date=p.getPodate();
			Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
			System.out.println(p.getPodate()+p.getTotal()+p.getPoshiptoaddress()+p.getPostatus());
			SqlParameterSource sql_parameter_source=new MapSqlParameterSource()
					.addValue("podate",date1)
					.addValue("total",p.getTotal())
					.addValue("poshiptoaddress",p.getPoshiptoaddress() )
					.addValue("poshiptozip",p.getPoshiptozip())
					.addValue("poshiptocity", p.getPoshiptocity())
					.addValue("poshiptostate", p.getPoshiptostate())
					.addValue("pobilltoaddress", p.getPobilltoaddress())
					.addValue("pobilltozip", p.getPobilltozip())
					.addValue("pobbilltocity",p.getPobbilltocity())
					.addValue("pobilltostate",p.getPobilltostate())
					.addValue("postatus", p.getPostatus());
			System.out.println(p.getPodate()+p.getTotal()+p.getPoshiptoaddress()+p.getPostatus());
			 nested_data=named_parameter_jdbc_template.update(sql_query,sql_parameter_source);
			 
			if (nested_data==0) {
				status="failed to insert the data";
			}
			else {
				status="Success data inserted";
			}
		}
		catch(Exception e) {
			status=e.getMessage();
		}
		return status;
	}
	public Map<String,String> getPosSingleRecord(Integer poid) {
		String sql_query="Select * from potable where customerid=?";
		Map<String,String> hashmap_data=new HashMap<String,String>();
		List<Map<String,Object>> list_data=new ArrayList<Map<String,Object>>();
		try {
			list_data=jdbc_template.queryForList(sql_query,poid);
			Integer i=0;
			i=(int)list_data.get(0).get("customerid");
			hashmap_data.put("CustomerId",i.toString());
			hashmap_data.put("total",(String)list_data.get(0).get("total"));
			hashmap_data.put("poshiptoaddress",(String)list_data.get(0).get("poshiptoaddress"));
			hashmap_data.put("poshiptozip", (String)list_data.get(0).get("poshiptozip"));
			hashmap_data.put("poshiptocity", (String)list_data.get(0).get("poshiptocity"));
			hashmap_data.put("poshiptostate", (String)list_data.get(0).get("poshiptostate"));
			hashmap_data.put("pobilltoaddress", (String)list_data.get(0).get("pobilltoaddress"));
			hashmap_data.put("pobilltozip",(String)list_data.get(0).get("pobilltozip"));
			hashmap_data.put("pobbilltocity", (String)list_data.get(0).get("pobbilltocity"));
			hashmap_data.put("pobilltostate", (String)list_data.get(0).get("pobilltostate"));
			hashmap_data.put("postatus", (String)list_data.get(0).get("postatus"));
		}
		catch(Exception e) {
			hashmap_data.put("failed", e.getMessage());
		}
		return hashmap_data;
	}
	
	public List<String> getAllPoRecords() {
	List list_data=new ArrayList();
	String sql_query="select * from potable";
	List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
	try {
		nested_data=jdbc_template.queryForList(sql_query);
		for(int i=0;i<nested_data.size();i++) {
			Map<String,Object> hashmap_data=new HashMap<String,Object>();
			Integer x=0;
			x=(int)nested_data.get(i).get("customerid");
			hashmap_data.put("CustomerId",x.toString());
			hashmap_data.put("total",(String)nested_data.get(i).get("total"));
			hashmap_data.put("poshiptoaddress",(String)nested_data.get(i).get("poshiptoaddress"));
			hashmap_data.put("poshiptozip", (String)nested_data.get(i).get("poshiptozip"));
			hashmap_data.put("poshiptocity", (String)nested_data.get(i).get("poshiptocity"));
			hashmap_data.put("poshiptostate", (String)nested_data.get(i).get("poshiptostate"));
			hashmap_data.put("pobilltoaddress", (String)nested_data.get(i).get("pobilltoaddress"));
			hashmap_data.put("pobilltozip",(String)nested_data.get(i).get("pobilltozip"));
			hashmap_data.put("pobbilltocity", (String)nested_data.get(i).get("pobbilltocity"));
			hashmap_data.put("pobilltostate", (String)nested_data.get(i).get("pobilltostate"));
			hashmap_data.put("postatus", (String)nested_data.get(i).get("postatus"));
		    list_data.add(hashmap_data);
		}
	}
	catch(Exception e){
		list_data.add("error"+e.getMessage());
	}
		return list_data;
	}

}
