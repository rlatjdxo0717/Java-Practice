package �迭����;

import java.util.Random;

//import �ڵ��ϼ�: ��Ʈ��+����Ʈ+o(����)
public class �迭���1 {

	public static void main(String[] args) {
		// �迭�� ����ϴ� ���
		// 1. �迭�� ����� ���� �����͸� �𸣴� ���
		//    ������ �����ξ��ٰ� ���߿� �ִ´�.
		int[] num = new int[5];
		Random r = new Random(42);
		System.out.println(r);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100); //0~99
		}
		
		// 2. �迭�� ����� ���� �����͸� �ƴ� ���
		//    �迭������ �� �ٷ� �����͸� �ִ´�.
		int[] num2 = {10, 20, 30, 40, 50};
		
		

	}

}
