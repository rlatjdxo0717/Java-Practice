package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import 클래스연습.계산기;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 계산기프로그램 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setBounds(42, 47, 151, 47);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 35));
		t1.setBounds(221, 47, 213, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel_1.setBounds(42, 134, 151, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("굴림", Font.BOLD, 35));
		t2.setColumns(10);
		t2.setBounds(221, 134, 213, 47);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("더하기 버튼 클릭됨.");
				//t1, t2에 입력한 값을 가지고 와야함.
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				System.out.println(s1);
				//String을  int로 변환해주어야 함.
				//반환값이 있어야지만 변수에 결과값을 넣을 수 있음.
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				//int result = cal.add(i1, i2);
				int result = cal.add(i1, i2);
				t3.setText("더한 값은 " + result);
				//반환값이 있어야 프린트도 가능하고
				//변수에 결과값을 넣을 수 있다.
				
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(31, 247, 88, 192);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("뻬기");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨.");
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(142, 247, 88, 192);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("곱하기");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.mul(i1, i2); //50
				//f.setTitle("곱한 값은 " + result);
				t3.setText("곱한 값은 " + result);
			}
		});
		btnNewButton_1_1.setBackground(Color.MAGENTA);
		btnNewButton_1_1.setBounds(253, 247, 88, 192);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("나누기");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨.");
			}
		});
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(364, 247, 88, 192);
		f.getContentPane().add(btnNewButton_1_1_1);
		
		t3 = new JTextField();
		t3.setBackground(Color.RED);
		t3.setForeground(Color.WHITE);
		t3.setFont(new Font("굴림", Font.BOLD, 35));
		t3.setColumns(10);
		t3.setBounds(69, 191, 365, 47);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
