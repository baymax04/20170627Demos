package com.hotel;

import java.util.Scanner;

/**
 * 酒店管理类
 * 	方法：查找空房间
 *  	入住
 *  	退房
 * @author Administrator
 *
 */
public class Manager2 {

	//实例化一个酒店对象
	private Hotel hotel=new Hotel(10,10);  //楼层，每层房间数
	
	//通过房间号查找空房间
	public void findRoomByRoomNum(int roomNum){
		Room room=hotel.rooms.get(roomNum);
		if (room==null) {
			System.out.println("查找房间不存在，请重新输入房间号！");
		}else {  //存在，是否入住
			if (room.isUse()) {
				System.out.println("房间："+roomNum+"已有人入住，入住信息为："+
									room.getCustomer());
			}else {
				System.out.println("房间："+roomNum+"还未有人入住！");
			}
		}
	}
	//查找所有空房间
	
	public void findNullRoom(){
		int k=0;
		
		System.out.println("空房间为：");
		for(Integer key:hotel.rooms.keySet()){ //查找所有房间
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
	//入住
	public void in(int roomNum,Customer customer){
		Room room=hotel.rooms.get(roomNum);//通过房间号，获取房间信息
		
		room.setCustomer(customer);
		room.setUse(true);
		room.setNumber(roomNum);
		hotel.rooms.put(roomNum, room);
		System.out.println("房间："+roomNum+"办理入住，入住信息为"+customer);
		
	}
	//退房
	public void out(int roomNum){
		Room room=hotel.rooms.get(roomNum);//通过房间号，获取房间信息
		room.setCustomer(null);
		room.setUse(false);
		hotel.rooms.put(roomNum, room);
		System.out.println("房间："+roomNum+"办理退房");
	}
	
	
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*********欢迎入住本酒店！*********");
		System.out.println("查询请输入search,入住请输入in,退房请输入out!");
		
		Manager2 m=new Manager2();
		m.findNullRoom();//是否有空房间
		
		Customer customer=new Customer("lily", "20170627", "2017-06-27", 3);
		System.out.println("输入房间号");
		int roomNo=scanner.nextInt();
		
		while(true){
			String command=scanner.next();

			if("search".equalsIgnoreCase(command)) {
				m.findRoomByRoomNum(roomNo);;
			}else if ("in".equalsIgnoreCase(command)) {
//				int roomNo=scanner.nextInt();
				m.in(roomNo, customer);
			}else if ("out".equalsIgnoreCase(command)) {
				m.out(roomNo);
			}else {
				return;
			}
		}
		
//		//查询所有空房间
//		m.findNullRoom();
//		//入住
//		Customer customer=new Customer("lily", "1671580", "2017-06-27", 3);
//		Scanner scanner=new Scanner(System.in);
//		System.out.println();
//		System.out.println("------------请输入入住房间号--------------");
//		int roomNo=scanner.nextInt();
//		m.in(roomNo, customer);//开房
//		
//		m.findNullRoom();
//		//退房
//		m.out(roomNo);//退房
//		
//		m.findRoomByRoomNum(roomNo);
//		m.findNullRoom();
		
		
		
	}

}
