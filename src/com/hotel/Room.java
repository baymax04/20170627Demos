package com.hotel;

/**
 * ������Room
 * 
 * int number  //�����
 * Customer customer  //�˿Ͷ���
 * boolean isUse  //����Ĭ��Ϊ��
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
