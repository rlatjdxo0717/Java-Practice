package �迭����;

public class ������������ {

	public static void main(String[] args) {
		String[] name = {"ȫ�浿","��浿","�۱浿","�ڱ浿","���浿"};
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2 = {99, 100, 88, 80, 70};
		
		//1. ������ 2�б⿡ ���� �л��� ��
		int count = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				System.out.println("2�б� ����.");
				count++;
			}
		}
		System.out.println("���� �л� �� " + count + "��");
		
		System.out.println();
		
		//2. ������ ������ �л���
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				System.out.println("������." + i);
				count2++;
			}
		}
		System.out.println("������ �л� �� " + count2 + "��");
		System.out.println();
		
		//3. �Բ� üũ�غ���.
		int count3 = 0; //���
		int count4 = 0; //����
		for (int i = 0; i < term2.length; i++) {
			if (term1[i]  == term2[i]) {
				count4++;
			}else if (term1[i]  < term2[i]) {
				count3++;
			}
		}
		System.out.println("��� " + count3 + "��");
		System.out.println("���� " + count4 + "��");

	}

}
