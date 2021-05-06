package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		//배열: 늘어놓다라는 의미
		//     array(어레이)
		int[] num = new int[1000];
		System.out.println(num);
		
		int[] num2 = new int[5];
		//1. 그림을 그려보세요.
		//2. 전체 변수가 몇 개 생겼나요? 7개
		//3. 각 변수에는 무엇이 들어있을까요? 
		//   num2: 데이터들이 들어있는 주소
		//   int[5] : 자동초기화된 값, 0으로 초기화
		//   length : 읽기 전용, 배열에 들어간 저장공간의 개수
		//            배열은 크기를 변경 불가능.
		//4. 첫번째를 가르킬 때는 num2[0]
		//   얼마가 들어있을까요? 자동초기화된 0이 들어있음.
		System.out.println(num2[0]);
		//5. 두번째 num2[1]위치를 나타냄. 300을 넣어서, 프린트
		num2[1] = 300;
		System.out.println(num2[1]);
		//6. num2 변수 안에는 뭐가 들어있을까요?
		System.out.println(num2);
	}
}
