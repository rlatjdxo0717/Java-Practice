package 예외처리;

public class 문제발생클래스2 {

	public static void main(String[] args) {
		System.out.println("1. 나는 프린트가 잘 될 예정.");
		
		try {
			//문제가 발생할 것은 코드를 넣어주는 부분.
			System.out.println("2. 문제발생 코드 " + 10/0);
		} catch (Exception e) {
			//예외상황이 발생하면, 잡아서 어떻게 처리할 지 코드를 넣어주는 부분.
			System.out.println("에러 발생함.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("3. 나는 과연 프린트가 될까요??");
	}

}
