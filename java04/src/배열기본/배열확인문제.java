package �迭�⺻;

public class �迭Ȯ�ι��� {

	public static void main(String[] args) {
//		1. ���� 5�� ũ���� �迭�� ����
		int[] num = new int[5];
//		  10, 20, 30,  40, 50�� ������� �ִ´�.
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;
//		num[4] = 50;
		//i = i + 1 => i++
		//i = i + 2
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
//		  ù��°���� ����°���� ���ؼ� ����Ʈ
		System.out.println(num[0] + num[2]);
//
//		2. ��Ʈ�� 3�� ũ���� �迭�� ����
		String[] s = new String[3];
//		  �ڹ�, ������, JSP�� ������� �ִ´�.
		s[0] = "�ڹ�";
		s[1] = "������";
		s[2] = "JSP";
//		  =>"�ڹ� ���ٴ� ������"�� ���
		System.out.println(s[0] + "���ٴ� "  + s[1]);
		
		//
		String total = "�ڹ�,������,JSP";
		String[] result = total.split(","); //
		for (int i = 0; i < result.length; i++) {
			s[i] = result[i];
		}
	}
}
