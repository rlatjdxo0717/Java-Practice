package 컬렉션;

import java.util.LinkedList;

public class FIFO큐형 {

	public static void main(String[] args) {
		// First Input First Oupput: 선입선출
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println(test);
		for (int i = 0; i <= test.size(); i++) {
			System.out.print("사이즈: " + test.size() + ">>");
			test.remove();
			System.out.println(test);
		}
		
		
		

	}

}
