package �迭����;

import java.util.Random;

public class ����ä�� {

	public static void main(String[] args) {
		// ����990 ���, ����
		// �ڵ� ����: ��Ʈ��+����Ʈ+f
		Random r = new Random();

		int[] ��� = new int[9900];
		int[] ���� = new int[9900];
		// 1~4������ ���� �� �迭�� �־����.
		for (int i = 0; i < ����.length; i++) {
			���[i] = r.nextInt(4) + 1;// 1~4
			����[i] = r.nextInt(4) + 1;
		}

		// ����Ʈ
		System.out.println("��ȣ  :   ���        ����");
		for (int i = 0; i < ����.length; i++) {
			System.out.println(i + "   :   " + ���[i] + "  <->  " + ����[i]);
		}

		int count = 0;
		for (int i = 0; i < ����.length; i++) {
			if (���[i] == ����[i]) {
				count++;
			}
		}
		System.out.println("������ " + count + "��");

	}

}
