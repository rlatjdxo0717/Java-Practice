package 배열기본;

public class 토익문제채점 {

	public static void main(String[] args) {
//		int[] 정답 = new int[999];
//		int[] 내답 = new int[999];
		
		int[] num = new int[5];
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		//i: index
		//배열에 데이터를 넣거나, 꺼내거나, 위치값을 알고 싶거나 등등
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		//0, 0, 0, 0, 0
		//알아서 인덱스 0부터 시작해서 끝까지 1씩 증가하면서 
		//하나씩 꺼내오렴.for-each
		//배열에서 순서대로 꺼내어 특정한 처리
		for (int x : num) {
			System.out.println(x);
		}

	}

}
