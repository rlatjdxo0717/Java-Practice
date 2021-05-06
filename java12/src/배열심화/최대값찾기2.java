package 배열심화;

import java.util.Random;

public class 최대값찾기2 {

	public static void main(String[] args) {
		// 타입이 동일한 많은 양의 데이터가 있으면 배열에 넣으세요.
		// 반복을 통해서 많은 양의 데이터를 효율적으로 다룰 수 있음.
		int[] num = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		int max = num[0];

		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);
		//최대값이 얼마인지를 먼저 찾아야 한다.
		//그 최대값이 배열에서 어디에 들어있는지를 찾아야한다.
		//어디에 => index, i
		int count = 0;
		String sum = "";
		for (int i = 0; i < num.length; i++) {
			if (max == num[i]) {
				//System.out.println("최대값의 위치: " + i);
				sum = sum + i + " ";
				count++;
			}
		}
		System.out.println("최대값의 개수: " + count);
		System.out.println("최대값의 위치: " + sum);
		String[] s = sum.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);

	}

}
