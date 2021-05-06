package 배열심화;

public class 스트링을배열로3 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		//1. String[]로 바꾸어보세요.
		String[] s1 = all.split(",");
		//2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시
		//   배열에 넣으세요.
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s1[i].trim();
		}
		
		//3. 과목수는?
		System.out.println("과목수는 " + s1.length + "과목");
		
		//4. 컴퓨터의 위치는?
		//5. 과목명이 3글자 미만인 과목수는?
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치는 인덱스>> " + i);
			}
			if (s1[i].length() < 3) {
				count++;
			}
		}
		System.out.println("3글자 미만 과목수는>> " + count );
		
		

	}

}
