package ������;

import javax.swing.JOptionPane;

public class �������⺻ {

	public static void main(String[] args) {
		// �Է� -> ó�� -> ���
		// �Է����ִ� �κ�
		String food = JOptionPane.showInputDialog("�԰� ���� ���� �޴��� ");// "���"

		// ó�����ִ� �κ�
		// if~else if~else���� true�� ��� �����ϰ�, �ű⼭ break!
		String result = "";
		if (food.equals("«��")) {
			result = "�߱�������";
		} else if (food.equals("�쵿")) {
			result = "�Ͻ�������";
		} else if (food.equals("���")) {
			result = "�н�������";
		} else {
			result = "������";
		}

		// ������ִ� �κ�
		JOptionPane.showMessageDialog(null, result);
		
		

	}

}
