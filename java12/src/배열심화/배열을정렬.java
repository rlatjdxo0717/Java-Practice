package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �迭������ {

	public static void main(String[] args) {
		int[] num = new int[1000];
		Random r = new Random();
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		Arrays.sort(num); //�������� ����
		//�ı��Լ�
		for (int x : num) {
			System.out.println(x);
		}
		System.out.println("���� ū �� >>> " + num[num.length-1]);
		System.out.println("���� ���� �� >>> " + num[0]);
	}

}
