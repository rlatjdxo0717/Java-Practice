package 배열심화;

public class 스트링을배열로 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		//음식의 개수는 몇개일까요?
		System.out.println(s2.length);
		
		String s3 = "    홍길동";
		String s4 = s3.trim(); //공백자르기
		System.out.println(s4.length());
		
		String s5 = s3.replace("    ", "");
		System.out.println(s5);
		String s6 = "홍길동";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
		
		
	}

}
