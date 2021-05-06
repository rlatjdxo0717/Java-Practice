package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class 로또번호만들기6자리로 {

	public static void main(String[] args) {
		Random r = new Random();
		//중복체크해서 넣어주는 클래스 사용: HashSet
		HashSet lotto = new HashSet();
		while(lotto.size() < 6) {
			int num= r.nextInt(45) + 1;
			System.out.println("랜덤값: " + num);
			lotto.add(num);
		}
		System.out.println(lotto);
		
		
		
		
	}

}
