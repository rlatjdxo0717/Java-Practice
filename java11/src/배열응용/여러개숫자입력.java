package �迭����;

import javax.swing.JOptionPane;

public class �����������Է� {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0,0,0}
		//For_input fi =  new For_input();
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է�"); //"100"
			//int<--String: Integer
			int data2 = Integer.parseInt(data); //100<--"100"
			//double d = Double.parseDouble(data);
			num[i] = data2;
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		//�ʱ�ȭ���� ���� ������ ����: �����Ⱚ�� ����ִ� ����!
		//=> �����ν� �� �� ���� ����!
		int sum = 0; //�������� ó������ �־��ִ� ��=>�ʱ�ȭ!
		//�������� �� �ʱ�ȭ�� �� ���־�� �Ѵ�.
		
		for (int x : num) {
			sum = x + sum;
		}
		
		System.out.print(String.format("%.2f", sum / (double)num.length));
	}

}
