package 순차문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class 그래픽화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBackground(Color.RED);
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(Color.YELLOW);
		f.getContentPane().add(btnNewButton_2, BorderLayout.WEST);
		f.setVisible(true);
		

	}

}
