package 배열확인문제;

public class 성적변동확인 {

	public static void main(String[] args) {
		String[] title = {"국어","수학","영어","과학","컴퓨터"};
		int[] term1 = {100, 90, 70, 30, 50};
		//1학기, 2학기 점수 목록이 별도로 있어야 하기 때문에 깊은 복사!필요
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		for (int x : term1) {
			System.out.print(x + " ");
		}
		System.out.println();
		for (int x : term2) {
			System.out.print(x + " ");
		}
		int count = 0;
		System.out.println();
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				//System.out.println("향상됨.");
				count++;
			}
		}
		System.out.println("향상된 과목의 개수는 " + count);
		
		
		
	}

}
