package �迭����;

public class �迭���2 {

	public static void main(String[] args) {
		//���� �˰� �ִ� ���
		String[] name = {"ȫ�浿", "�ڱ浿", "���浿", "�̱浿"};
		char[] gender = {'��','��','��','��'};
		boolean[] food = {true, false, true, true};
		double[] eye = {0.2, 0.5, 1.2, 2.0};
		int[] age = {100, 80, 30, 40};
		System.out.println("�̸�" + "  " + "����" + "  " + "��ħ" + "  " + "�÷�" + "  " + "����");
		System.out.println("-------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + gender[i] + " " + food[i] + " " + eye[i] + " " + age[i]);
		}
		
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (String s : name) { //for-each
			System.out.print(s + " ");
		}
		System.out.println();
		
		//char �����ְ�, ���
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
		for (char c : gender) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		//boolean ��ħ�Ծ����ְ�, ���
		for (int i = 0; i < food.length; i++) {
			System.out.print(food[i] + " ");
		}
		System.out.println();
		for (boolean b : food) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		//double �÷³ְ�, ���
		for (int i = 0; i < eye.length; i++) {
			System.out.print(eye[i] + " ");
		}
		System.out.println();
		for (double d : eye) {
			System.out.print(d + " ");
		}
		System.out.println();
		
		//int ���ְ̳�, ���
		
		for (int i = 0; i < age.length; i++) {
			System.out.print(age[i] + " ");
		}//��������
		//�� �����ȿ��� ��������� ������ �����ۿ����� �ν� �Ұ�
		//������ ��������� ��ġ �����ȿ����� ��� ����!
		//������ ������������°�? Ÿ�� ������;(����)
		//System.out.println(test);
		//1. ��Ÿ! �ش� ������ �����ϴ� Ȯ��
		//2. Ư���� �����ȿ��� �� �� �ִ� ���������� �ƴ��� Ȯ��
		//3. ����Ϸ��� �ϴ� ���κ��� �Ʒ����� ������� ���� �ƴ��� Ȯ��
		//test�� ���Ұ� 58���ο����� ���� test�� ���� ��������� ����.
		
		int test = 100; //59���ο��� ������
		System.out.println();
		for (int i : age) {
			System.out.print(i + " ");
			System.out.println(test);
		}
		
	}

}
