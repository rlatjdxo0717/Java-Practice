package ��������;

public class �����Ѱ����Ǻ� {

	public static void main(String[] args) {
		double change = 2.2;
		if (change > 2) { //true
			System.out.println("���̾�Ʈ ����.!");
		}
		
		//�ѱ����̸� char�� ����ϴ� ���� ����.
		char pw1 = 'p';
		char pw2 = 'q';
		//�񱳿����ڴ� �⺻���� �� �� ����.
		if (pw1 == pw2) {//true
			System.out.println("PASS");
		} else { //false
			System.out.println("���Է�");
		}
		
		if (pw1 == pw2 && change > 2) {
			System.out.println("������ ����!");
		} else {
			System.out.println("���� �ٽ� ����!");

		}//else end
	}//main end
}//class end
