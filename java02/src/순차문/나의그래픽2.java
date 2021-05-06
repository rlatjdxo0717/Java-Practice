package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(600,800);
		
		t1 = new JTextField();
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("나를 눌러요");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "버튼을 누르셨군요.");
				t1.getText();//홍길
			}
		});
		btnNewButton.setBackground(Color.yellow);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);

	}

}