package �迭��ȭ;

public class ��Ʈ�����迭��3 {

	public static void main(String[] args) {
		String all = "����, ����, ����, ��ǻ��";
		//1. String[]�� �ٲپ����.
		String[] s1 = all.split(",");
		//2. �ٲپ����� ������ ���ԵǾ��ִٸ�, ������ ��� ���� ��, �ٽ�
		//   �迭�� ��������.
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s1[i].trim();
		}
		
		//3. �������?
		System.out.println("������� " + s1.length + "����");
		
		//4. ��ǻ���� ��ġ��?
		//5. ������� 3���� �̸��� �������?
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].equals("��ǻ��")) {
				System.out.println("��ǻ���� ��ġ�� �ε���>> " + i);
			}
			if (s1[i].length() < 3) {
				count++;
			}
		}
		System.out.println("3���� �̸� �������>> " + count );
		
		

	}

}
