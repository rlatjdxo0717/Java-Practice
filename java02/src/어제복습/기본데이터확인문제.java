package ��������;

public class �⺻������Ȯ�ι��� {

	public static void main(String[] args) {
		// 2. 
		final double PI = 3.14; //����Ұ����� ��, ���
//		PI = 3.15;
		double r = 2.2;
		double mul = PI * r * r ;
		System.out.println("���� ������ " + mul);
		
		// 1.
		int ü�� = 66;
		int ���� = 77;
		int ���� = 88;
		int ���� = 99;
		
		int sum = ü�� + ���� + ���� + ����;
		System.out.println("�հ�� " + sum + "��");
		
		//�ڹٴ� int�� int����� ����� �׻� int!
//		int avg = sum / 4;
//		System.out.println(sum / 4);
		
		//�ڹٴ� �ϳ��� double�̸� ������ ����� �׻� double!
		double avg = (double)sum / 4;
		System.out.println("����� " + avg + "��");
		//������ Ÿ���� ���� ���ϴ� Ÿ������ �������ִ� ���� ĳ����!
		//ram���� ���� Ÿ���� �״�� �ְ�,
		//cpu�� ram�� ����ִ� �����͸� �����ٰ� ����ĳ������.
		//(�����ϰ����ϴ� Ÿ�Ը�)����=> (double)sum
		

	}

}
