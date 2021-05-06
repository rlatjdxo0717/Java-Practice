package 순차문;

import javax.swing.JOptionPane;

public class 순차문기본 {

	public static void main(String[] args) {
		// 입력 -> 처리 -> 출력
		// 입력해주는 부분
		String food = JOptionPane.showInputDialog("먹고 싶은 점심 메뉴는 ");// "라면"

		// 처리해주는 부분
		// if~else if~else문은 true인 경우 실행하고, 거기서 break!
		String result = "";
		if (food.equals("짬뽕")) {
			result = "중국집으로";
		} else if (food.equals("우동")) {
			result = "일식집으로";
		} else if (food.equals("라면")) {
			result = "분식집으로";
		} else {
			result = "집으로";
		}

		// 출력해주는 부분
		JOptionPane.showMessageDialog(null, result);
		
		

	}

}
