package com.hotel;

/**
 * 房间类Room
 * 
 * int number  //房间号
 * Customer customer  //顾客对象
 * boolean isUse  //房间默认为空
 * @author Administrator
 *
 */
public class Room {

	private int number;
	private Customer customer;
	private boolean isUse=false;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	
	
}
