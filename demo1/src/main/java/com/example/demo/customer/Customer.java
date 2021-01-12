package com.example.demo.customer;

public class Customer {
	private int customerid;
	private String  Customername; 
	private String phonenumber;
	private String shiptoaddress;
	private String shiptozip;
	private String shiptocity;
	private String shiptostate;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return Customername;
	}
	public void setCustomername(String Customername) {
		this.Customername = Customername;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getShiptoaddress() {
		return shiptoaddress;
	}
	public void setShiptoaddress(String shiptoaddress) {
		this.shiptoaddress = shiptoaddress;
	}
	public String getShiptozip() {
		return shiptozip;
	}
	public void setShiptozip(String shiptozip) {
		this.shiptozip = shiptozip;
	}
	public String getShiptocity() {
		return shiptocity;
	}
	public void setShiptocity(String shiptocity) {
		this.shiptocity = shiptocity;
	}
	public String getShiptostate() {
		return shiptostate;
	}
	public void setShiptostate(String shiptostate) {
		this.shiptostate = shiptostate;
	}
	

}
