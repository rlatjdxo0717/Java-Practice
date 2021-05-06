package 배열심화;

public class 최대값찾기 {

	public static void main(String[] args) {
		// 타입이 동일한 많은 양의 데이터가 있으면 배열에 넣으세요.
		// 반복을 통해서 많은 양의 데이터를 효율적으로 다룰 수 있음.
		int[] num = {11, 33, 55, 22, 44};
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);

	}

}
