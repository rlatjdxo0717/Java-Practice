package �迭��ȭ;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		String all = "����, ����, ����, ��ǻ��";
		// 1. String[]�� �ٲپ����.
		String[] s1 = all.split(","); // {"����","����","����","��ǻ��"}
		// 2. �ٲپ����� ������ ���ԵǾ��ִٸ�, ������ ��� ���� ��, �ٽ�
		// �迭�� ��������.
		for (int i = 0; i < s1.length; i++) {
			s1[i] = s1[i].trim();
		}
		// 3. �������?
		System.out.println(s1.length);
		
		// 4. ��ǻ���� ��ġ��?
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("��ǻ��")) {
				System.out.println(i);
			}
			if(s1[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);
		// 5. ������� 3���� �̸��� �������?

		// http://www.naver.com/web01/memeber.html

		String s = "���� ���α׷�������";
		String s2 = "��¥!!";
		System.out.println(s + s2); // ��Ʈ�� ����
		System.out.println(s.concat(s2)); // ��Ʈ�� ����
		System.out.println(s.charAt(3)); // ���� 1���� ����
		System.out.println(s.endsWith("��")); // Ư���� ���ڷ� ������ �� Ȯ��
		System.out.println(s.substring(3)); // �ε���3���� ���ڵ� ��� ����
		System.out.println(s.substring(3, 8)); // �ε��� 3~7���� ����
		System.out.println(s.contains(s2)); // s�� s2�� ���ԵǾ��ִ���?
		System.out.println(s.lastIndexOf("��")); // s�� ������ ��ġ
		System.out.println(s.toUpperCase());// �빮�ڷ�
		System.out.println(s.toLowerCase());// �ҹ��ڷ�
		System.out.println(s.length()); // ���ڼ�
		System.out.println(s.replace("��", "��"));
	}
}
