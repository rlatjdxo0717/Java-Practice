package �迭Ȯ�ι���;

public class ��������Ȯ�� {

	public static void main(String[] args) {
		String[] title = {"����","����","����","����","��ǻ��"};
		int[] term1 = {100, 90, 70, 30, 50};
		//1�б�, 2�б� ���� ����� ������ �־�� �ϱ� ������ ���� ����!�ʿ�
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : term2) {
			System.out.print(x + " ");
		}
		int count = 0;
		System.out.println();
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				//System.out.println("����.");
				count++;
			}
		}
		System.out.println("���� ������ ������ " + count);
		
		
		
	}

}
