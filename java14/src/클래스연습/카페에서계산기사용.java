package 클래스연습;

public class 카페에서계산기사용 {

	public static void main(String[] args) {
		int coffeePrice = 4600; 
		int juicePrice = 4000; 
		
		int coffeeCount = 5; //커피 주문수
		int juiceCount = 3; //주스 주문수
		
		//전체 몇 잔을 주문했을까요?
		계산기 cal = new 계산기();
		cal.add(coffeeCount, juiceCount);
		//메서드를 사용할 때=> 메서드 호출(call, 콜)할 때!
		//그 처리결과값을 가지고 와서
		//다시 사용해야 하는경우가 있음.
		//리턴을 받아온다.!라고 함.return!
		
		//커피값은 얼마일까요?
		int coffee = cal.mul(coffeeCount, coffeePrice); //23000
		//주스값은 얼마일까요?
		int juice = cal.mul(juiceCount, juicePrice); //12000
		//전체 합은 얼마일까요?
		cal.add(coffee, juice); 
		//계산기에 커피값과 주스값을 입력값으로 주면서 더해달라고 함.
		
		int hour = cal.getHour();
		System.out.println("현재 시각은 " + hour);
		
		
		
		
	}

}
