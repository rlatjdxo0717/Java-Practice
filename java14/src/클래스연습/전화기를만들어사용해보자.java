package 클래스연습;

public class 전화기를만들어사용해보자 {

	public static void main(String[] args) {
		Phone p = new Phone();
		//p: 참조형 변수
		//size, color: 멤버변수가 복사됨.
		//size: 기본형 변수
		//color: 참조형 변수
		p.color = "검정색";
		p.size = 11;
		System.out.println("전화기 색: " + p.color);
		System.out.println("전화기 크기: " + p.size);
		p.text("철수", "굿모닝", 10);
		p.text("길동", "굿애프터눈", 15);
	}

}
