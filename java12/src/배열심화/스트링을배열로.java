package �迭��ȭ;

public class ��Ʈ�����迭�� {

	public static void main(String[] args) {
		String s = "����,����,����";
		String[] s2 = s.split(",");
		//������ ������ ��ϱ��?
		System.out.println(s2.length);
		
		String s3 = "    ȫ�浿";
		String s4 = s3.trim(); //�����ڸ���
		System.out.println(s4.length());
		
		String s5 = s3.replace("    ", "");
		System.out.println(s5);
		String s6 = "ȫ�浿";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
		
		
	}

}
