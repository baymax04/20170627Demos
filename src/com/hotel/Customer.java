package com.hotel;
/**
 * 顾客类 Customer
 * string name  顾客姓名
 * string id   顾客身份id
 * string date  入住日期
 * int days    入住天数
 * @author Administrator
 *
 */
public class Customer {

	private String name;
	private String id;
	private String date;
	private int days;
	public Customer(String name,String id,String date,int days) {
		// TODO Auto-generated constructor stub
		
		super();
		this.name=name;
		this.id=id;
		this.date=date;
		this.days=days;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer:\t"+"[name="+name+",id="+id+","
				+ "date="+date+",days="+days+"]";
	}
}
