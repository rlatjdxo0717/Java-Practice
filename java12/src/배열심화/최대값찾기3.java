package �迭��ȭ;

import java.util.Random;

public class �ִ밪ã��3 {

	public static void main(String[] args) {
		// Ÿ���� ������ ���� ���� �����Ͱ� ������ �迭�� ��������.
		// �ݺ��� ���ؼ� ���� ���� �����͸� ȿ�������� �ٷ� �� ����.
		int[] num = {-22, -33, -11, -9};
		int max = 0;

		for (int i = 1; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);

	}

}
