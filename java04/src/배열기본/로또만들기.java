package 배열기본;

import java.util.Random;
import 배열응용.다른패키지클래스;

//많은 양의 자동import: 컨트롤+쉬프트+o(영문), f2번 눌러서 import선택!
public class 로또만들기 {

	public static void main(String[] args) {
		int[] lotto = new int[1000];
		Random r = new Random(42);//씨앗(seed)
		for (int i = 0; i < lotto.length; i++) { //6번
			lotto[i] = r.nextInt(45) + 1;
		}
		for (int x : lotto) {
			System.out.print(x + " ");
		}
		System.out.println();
		int count = 0;
		for (int x : lotto) {
			if(x >= 30) {
				count++;
			}
		}
		System.out.println(count);
	}

}
