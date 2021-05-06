package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class 리스트형중복제거 {

	public static void main(String[] a) {
		Random r = new Random();
		ArrayList list = new ArrayList();
		for (int i = 0; i < 5000; i++) {
			//5000개의 랜덤한 값을 넣어서
			list.add(r.nextInt(5000));
		}
		
		//중복제거해서 프린트
		HashSet set = new HashSet();
		for (int j = 0; j < list.size(); j++) {
			set.add(list.get(j));
		}
		//개수가 몇 개인지 세어보세요.
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		

	}

}
