package �迭��ȭ;

import java.util.Random;

public class �ִ밪ã��2 {

	public static void main(String[] args) {
		// Ÿ���� ������ ���� ���� �����Ͱ� ������ �迭�� ��������.
		// �ݺ��� ���ؼ� ���� ���� �����͸� ȿ�������� �ٷ� �� ����.
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
		//�ִ밪�� �������� ���� ã�ƾ� �Ѵ�.
		//�� �ִ밪�� �迭���� ��� ����ִ����� ã�ƾ��Ѵ�.
		//��� => index, i
		int count = 0;
		String sum = "";
		for (int i = 0; i < num.length; i++) {
			if (max == num[i]) {
				//System.out.println("�ִ밪�� ��ġ: " + i);
				sum = sum + i + " ";
				count++;
			}
		}
		System.out.println("�ִ밪�� ����: " + count);
		System.out.println("�ִ밪�� ��ġ: " + sum);
		String[] s = sum.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);

	}

}
