package �迭�⺻;

public class ���͹���ä�� {

	public static void main(String[] args) {
//		int[] ���� = new int[999];
//		int[] ���� = new int[999];
		
		int[] num = new int[5];
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println(num[3]);
//		System.out.println(num[4]);
		//i: index
		//�迭�� �����͸� �ְų�, �����ų�, ��ġ���� �˰� �Ͱų� ���
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		//0, 0, 0, 0, 0
		//�˾Ƽ� �ε��� 0���� �����ؼ� ������ 1�� �����ϸ鼭 
		//�ϳ��� ��������.for-each
		//�迭���� ������� ������ Ư���� ó��
		for (int x : num) {
			System.out.println(x);
		}

	}

}
