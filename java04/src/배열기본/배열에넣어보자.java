package �迭�⺻;

public class �迭���־�� {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 100;
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]  + "\t");
		}

	}

}
