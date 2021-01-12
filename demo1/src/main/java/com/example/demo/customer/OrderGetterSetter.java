package com.example.demo.customer;

public class OrderGetterSetter {
	private int itemid;
	private int cutomerid;
	private String dateoforder;
	private String orderitemname;
	private int numberofproductsorder;
	private int toalcost;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getCutomerid() {
		return cutomerid;
	}
	public void setCutomerid(int cutomerid) {
		this.cutomerid = cutomerid;
	}
	public String getDateoforder() {
		return dateoforder;
	}
	public void setDateoforder(String dateoforder) {
		this.dateoforder = dateoforder;
	}
	public String getOrderitemname() {
		return orderitemname;
	}
	public void setOrderitemname(String orderitemname) {
		this.orderitemname = orderitemname;
	}
	public int getNumberofproductsorder() {
		return numberofproductsorder;
	}
	public void setNumberofproductsorder(int numberofproductsorder) {
		this.numberofproductsorder = numberofproductsorder;
	}
	public int getToalcost() {
		return toalcost;
	}
	public void setToalcost(int toalcost) {
		this.toalcost = toalcost;
	}

}
