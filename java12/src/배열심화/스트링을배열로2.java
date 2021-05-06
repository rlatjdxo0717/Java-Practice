package 배열심화;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		// 1. String[]로 바꾸어보세요.
		String[] s1 = all.split(","); // {"국어","영어","수학","컴퓨터"}
		// 2. 바꾸었더니 공백이 포함되어있다면, 공백을 모두 제거 후, 다시
		// 배열에 넣으세요.
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s1[i].trim();
		}
		// 3. 과목수는?
		System.out.println(s1.length);
		
		// 4. 컴퓨터의 위치는?
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("컴퓨터")) {
				System.out.println(i);
			}
			if(s1[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		// 5. 과목명이 3글자 미만인 과목수는?

		// http://www.naver.com/web01/memeber.html

		String s = "나는 프로그래머프야";
		String s2 = "진짜!!";
		System.out.println(s + s2); // 스트링 결합
		System.out.println(s.concat(s2)); // 스트링 결합
		System.out.println(s.charAt(3)); // 문자 1글자 추출
		System.out.println(s.endsWith("야")); // 특정한 문자로 끝나는 지 확인
		System.out.println(s.substring(3)); // 인덱스3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); // 인덱스 3~7까지 추출
		System.out.println(s.contains(s2)); // s에 s2가 포함되어있는지?
		System.out.println(s.lastIndexOf("프")); // s중 프글자 위치
		System.out.println(s.toUpperCase());// 대문자로
		System.out.println(s.toLowerCase());// 소문자로
		System.out.println(s.length()); // 글자수
		System.out.println(s.replace("나", "너"));
	}
}
