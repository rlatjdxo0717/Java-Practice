package �迭����;

import javax.swing.JOptionPane;

public class �Է��Ͽ��迭������ {

	public static void main(String[] args) {
		String[] s = new String[3]; //{null, null, null}
		
		//�Է¹޾� ����
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("���� ���� ��� �Է�");
		}
		//���� �� �ϳ��� ������ ���
		for (String x : s) {
			System.out.print(x + " ");
		}
		//�迭�ȿ� ���ֵ��� �ִ��� Ȯ���ϰ� ����
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("���ֵ�")) {
				System.out.println("���ֵ��� ����.");
				System.out.println("��ġ�� " + i);
			}
		}
		
	}

}
