package 어제복습;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		// 2. 
		final double PI = 3.14; //변경불가능한 값, 상수
//		PI = 3.15;
		double r = 2.2;
		double mul = PI * r * r ;
		System.out.println("원의 면적은 " + mul);
		
		// 1.
		int 체육 = 66;
		int 수학 = 77;
		int 영어 = 88;
		int 국어 = 99;
		
		int sum = 체육 + 수학 + 영어 + 국어;
		System.out.println("합계는 " + sum + "점");
		
		//자바는 int와 int계산은 결과가 항상 int!
//		int avg = sum / 4;
//		System.out.println(sum / 4);
		
		//자바는 하나라도 double이면 무조건 결과가 항상 double!
		double avg = (double)sum / 4;
		System.out.println("평균은 " + avg + "점");
		//데이터 타입을 내가 원하는 타입으로 변경해주는 것을 캐스팅!
		//ram에는 원래 타입이 그대로 있고,
		//cpu가 ram에 들어있던 데이터를 가져다가 강제캐스팅함.
		//(변경하고자하는 타입명)변수=> (double)sum
		

	}

}
