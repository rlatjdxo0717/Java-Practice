package �迭�⺻;

public class �迭����� {

	public static void main(String[] args) {
		//�迭: �þ���ٶ�� �ǹ�
		//     array(���)
		int[] num = new int[1000];
		System.out.println(num);
		
		int[] num2 = new int[5];
		//1. �׸��� �׷�������.
		//2. ��ü ������ �� �� ���峪��? 7��
		//3. �� �������� ������ ����������? 
		//   num2: �����͵��� ����ִ� �ּ�
		//   int[5] : �ڵ��ʱ�ȭ�� ��, 0���� �ʱ�ȭ
		//   length : �б� ����, �迭�� �� ��������� ����
		//            �迭�� ũ�⸦ ���� �Ұ���.
		//4. ù��°�� ����ų ���� num2[0]
		//   �󸶰� ����������? �ڵ��ʱ�ȭ�� 0�� �������.
		System.out.println(num2[0]);
		//5. �ι�° num2[1]��ġ�� ��Ÿ��. 300�� �־, ����Ʈ
		num2[1] = 300;
		System.out.println(num2[1]);
		//6. num2 ���� �ȿ��� ���� ����������?
		System.out.println(num2);
	}
}
