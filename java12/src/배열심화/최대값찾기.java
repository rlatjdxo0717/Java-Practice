package �迭��ȭ;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		// Ÿ���� ������ ���� ���� �����Ͱ� ������ �迭�� ��������.
		// �ݺ��� ���ؼ� ���� ���� �����͸� ȿ�������� �ٷ� �� ����.
		int[] num = {11, 33, 55, 22, 44};
		int max = num[0];
		
		for (int i = 1; i < num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		System.out.println(max);

	}

}
