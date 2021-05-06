package 배열기본;

public class 배열확인문제 {

	public static void main(String[] args) {
//		1. 정수 5개 크기의 배열을 만들어서
		int[] num = new int[5];
//		  10, 20, 30,  40, 50을 순서대로 넣는다.
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		//i = i + 1 => i++
		//i = i + 2
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
//		  첫번째값과 세번째값을 더해서 프린트
		System.out.println(num[0] + num[2]);
//
//		2. 스트링 3개 크기의 배열을 만들어서
		String[] s = new String[3];
//		  자바, 스프링, JSP를 순서대로 넣는다.
		s[0] = "자바";
		s[1] = "스프링";
		s[2] = "JSP";
//		  =>"자바 보다는 스프링"로 출력
		System.out.println(s[0] + "보다는 "  + s[1]);
		
		//
		String total = "자바,스프링,JSP";
		String[] result = total.split(","); //
		for (int i = 0; i < result.length; i++) {
			s[i] = result[i];
		}
	}
}
