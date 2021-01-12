package com.example.demo.items;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class ItemsServices {
	@Autowired
	public JdbcTemplate jdbc_template;
	@Autowired
	public NamedParameterJdbcTemplate named_parameter_jdbc_template;
	
	public Map<String,String> addItems(Items items){
		Map<String,String> data=new HashMap<String,String>();
		String insert_data="insert into items(name,description,price) values(:name,:description,:price)";
		int query_result=0;
		try {
			SqlParameterSource sql_parameter_source=new MapSqlParameterSource()
					.addValue("name", items.getName())
					.addValue("description",items.getDescription())
					.addValue("price", items.getPrice());
			query_result=named_parameter_jdbc_template.update(insert_data,sql_parameter_source);
			if(query_result==0) {
				data.put("failed","data cannot be inserted");
			}
			else {
				data.put("sucess","data is inserted in items table");
			}
			
		}
		catch(Exception e) {
			data.put("failed",e.getMessage());
		}
		System.out.println("printing data ***********************");
		System.out.println(data+items.getName()+" "+items.getDescription()+" "+items.getPrice());
		return data;
	}
	
	public Map<String,String> getSingleRecord(Integer id){
		Map<String,String> data_map=new HashMap<String,String>();
		List<Map<String,Object>> nested_data=new ArrayList<Map<String,Object>>();
		String sql_data="select * from items where id=?";
		try {
			nested_data=jdbc_template.queryForList(sql_data,id);
			System.out.println(nested_data);
			for(Map<String,Object> data:nested_data) {
				data_map.put("id",id.toString());
				data_map.put("name", (String) data.get("name"));
				data_map.put("description", (String) data.get("description"));
				data_map.put("price",  (String) data.get("price"));
			}
		}
		catch(Exception e) {
			data_map.put("record_status",e.getMessage());
		}
		return data_map;
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

}
