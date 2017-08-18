package com.hotel;
/**
 * �Ƶ���  Hotel
 * int floorNum  ¥����
 * int roomNum ÿ�㷿����
 * @author Administrator
 *
 */
import java.util.*;
public class Hotel {

	private int floorNum;
	private int roomNum;
	
	//key�� ����� ��value�� ������Ϣ
	public static Map<Integer, Room> rooms=new HashMap<Integer, Room>();
	public Hotel(int floorNum,int roomNum) {
		// TODO Auto-generated constructor stub
		this.floorNum=floorNum;
		this.roomNum=roomNum;
		init();
	}
	/**
	 * ��ʼ������ÿ��������Ϣװ���map��
	 */
	private void init() { 
		// TODO Auto-generated method stub
		for(int i=1;i<=this.floorNum;i++){
			for(int j=1;j<=this.roomNum;j++){
				String roomNumber=i+""+j;
				if (j<10) {
					roomNumber=i+"0"+j;
				}
				//�ѷ�����Ϣװ�뵽map��
				rooms.put(Integer.valueOf(roomNumber), new Room());
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
