package java28;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3 extends JFrame {
	// JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남.
	// ThreadGraphic3에서 JFrame의 것을 다 쓸 수 있음.
	JLabel count, image, day;

	public void open() {
		setSize(800, 300);
		
		count = new JLabel("counter들어갈 부분");
		image = new JLabel("이미지 들어가는 라벨 부분");
		day = new JLabel("타이머 들어가는 라벨 부분");
		
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);
		
		Font font = new Font("궁서", Font.BOLD, 50);
		count.setFont(font);
		day.setFont(font);
		
		
		
		
		setVisible(true);
	}
	// 파라메터 생성자, 생성자 오버로딩

}
