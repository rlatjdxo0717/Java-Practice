package �迭�⺻;

import java.util.Random;
import �迭����.�ٸ���Ű��Ŭ����;

//���� ���� �ڵ�import: ��Ʈ��+����Ʈ+o(����), f2�� ������ import����!
public class �ζǸ���� {

	public static void main(String[] args) {
		int[] lotto = new int[1000];
		Random r = new Random(42);//����(seed)
		for (int i = 0; i < lotto.length; i++) { //6��
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
