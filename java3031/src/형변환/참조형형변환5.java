package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동"); //0번 인덱스
		list.add(100); 
		//int(기본형)--- auto-boxing--> Integer(참조형)---upcasting -->  Object
		list.add(11.22);
		
		int num = (Integer)list.get(1);
		//int(기본형)<--- auto-unboxing-- Integer(참조형)<---downcasting --  Object
		
		System.out.println(list);
	
	}
}
