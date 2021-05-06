package 클래스연습;

public class Phone {
	int size;
	String color;
	
	public void text(String x, String y, int z) {
		//x, y, z가 파라메터, 매개변수
		//매개변수는 개수, 타입, 순서가 모두 맞아야 인식!
		System.out.println(x + "에게 " + y + "이라고 " + z + "시에 전화기로 문자하다.");
	}
	public void internet() {
		System.out.println("전화기로 인터넷하다.");
	}
}
