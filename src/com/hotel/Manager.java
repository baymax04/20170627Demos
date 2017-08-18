package com.hotel;

import java.util.Scanner;

/**
 * �Ƶ������
 * 	���������ҿշ���
 *  	��ס
 *  	�˷�
 * @author Administrator
 *
 */
public class Manager {

	//ʵ����һ���Ƶ����
	private Hotel hotel=new Hotel(10, 10);  //¥�㣬ÿ�㷿����
	
	//ͨ������Ų��ҿշ���
	public void findRoomByRoomNum(int roomNum){
		Room room=hotel.rooms.get(roomNum);
		if (room==null) {
			System.out.println("���ҷ��䲻���ڣ����������뷿��ţ�");
		}else {  //���ڣ��Ƿ���ס
			if (room.isUse()) {
				System.out.println("���䣺"+roomNum+"��������ס����ס��ϢΪ��"+
									room.getCustomer());
			}else {
				System.out.println("���䣺"+roomNum+"��δ������ס��");
			}
		}
	}
	//�������пշ���
	
	public void findNullRoom(){
		int k=0;
		System.out.println("�շ���ţ�");
		for(Integer key:hotel.rooms.keySet()){ //�������з���
			Room room=hotel.rooms.get(key);
			
			
			if (room.isUse()==false) {
				
				System.out.print(key+"\t");
			}
			k++;
			if (k%10==0) {
				System.out.println();
			}
		}
		System.out.println("\n\n");
	}
	//��ס
	public void in(int roomNum,Customer customer){
		Room room=hotel.rooms.get(roomNum);//ͨ������ţ���ȡ������Ϣ
		
		room.setCustomer(customer);
		room.setUse(true);
		room.setNumber(roomNum);
		hotel.rooms.put(roomNum, room);
		System.out.println("���䣺"+roomNum+"������ס����ס��ϢΪ"+customer);
		
	}
	//�˷�
	public void out(int roomNum){
		Room room=hotel.rooms.get(roomNum);//ͨ������ţ���ȡ������Ϣ
		room.setCustomer(null);
		room.setUse(false);
		hotel.rooms.put(roomNum, room);
		System.out.println("���䣺"+roomNum+"�����˷�");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*********��ӭ��ס���Ƶ꣡*********");
		Manager m=new Manager();
		m.findNullRoom();
		
//		while(true){
			
			//��ס
			Customer customer=new Customer("lily", "20170627", "2017-06-27", 3);
			Scanner scanner=new Scanner(System.in);
			System.out.println("��������ס�����");
			int roomNo=scanner.nextInt();
			m.in(roomNo, customer);//����
			
			m.findNullRoom();
			//�˷�
			m.out(roomNo);//�˷�
			
			m.findRoomByRoomNum(roomNo);
			m.findNullRoom();
//		}
	}

}
