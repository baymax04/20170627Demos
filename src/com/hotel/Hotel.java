package com.hotel;
/**
 * 酒店类  Hotel
 * int floorNum  楼层数
 * int roomNum 每层房间数
 * @author Administrator
 *
 */
import java.util.*;
public class Hotel {

	private int floorNum;
	private int roomNum;
	
	//key： 房间号 ，value： 房间信息
	public static Map<Integer, Room> rooms=new HashMap<Integer, Room>();
	public Hotel(int floorNum,int roomNum) {
		// TODO Auto-generated constructor stub
		this.floorNum=floorNum;
		this.roomNum=roomNum;
		init();
	}
	/**
	 * 初始化，把每个房间信息装入奥map中
	 */
	private void init() { 
		// TODO Auto-generated method stub
		for(int i=1;i<=this.floorNum;i++){
			for(int j=1;j<=this.roomNum;j++){
				String roomNumber=i+""+j;
				if (j<10) {
					roomNumber=i+"0"+j;
				}
				//把房间信息装入到map中
				rooms.put(Integer.valueOf(roomNumber), new Room());
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
