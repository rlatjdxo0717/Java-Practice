package ������;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(600,800);
		
		t1 = new JTextField();
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("���� ������");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "��ư�� �����̱���.");
				t1.getText();//ȫ��
			}
		});
		btnNewButton.setBackground(Color.yellow);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);

	}

}