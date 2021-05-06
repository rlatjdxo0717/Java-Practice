package 클래스연습;

public class 우리가족계좌사용 {

	public static void main(String[] args) {
		계좌 d = new 계좌();
		계좌 d2 = new 계좌();
		d.name = "홍길동";
		d.aName = "튼튼적금";
		d.money = 1000;
		d.입금하다(5000);
		
		d2.name = "홍기사";
		d2.aName = "다음적금";
		d2.money = 3000;
		d2.출금하다(1000);
	}
}
