package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ���Ǳ׷���3 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("����", Font.BOLD, 40));
		t1.setBounds(247, 42, 281, 64);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("����", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(247, 132, 281, 64);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. �Է��� t1,t2���� ������ �;��Ѵ�.
				//�ܺο��� �Է��� �������� Ÿ���� ��� String!!
				String s1 = t1.getText(); //"root"
				String s2 = t2.getText(); //"1234"
				//2. ���� ������ id/pw�� �������� Ȯ��!
				//3. ����� ���!
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "�α��� ����");
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("����", Font.BOLD, 50));
		btnNewButton.setBounds(76, 269, 452, 84);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514:");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel.setBounds(61, 62, 143, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 30));
		lblNewLabel_1.setBounds(61, 146, 143, 44);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
