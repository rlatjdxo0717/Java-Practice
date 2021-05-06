package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 40));
		t1.setBounds(247, 42, 281, 64);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 40));
		t2.setColumns(10);
		t2.setBounds(247, 132, 281, 64);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. 입력한 t1,t2값을 가지고 와야한다.
				//외부에서 입력한 데이터의 타입은 모두 String!!
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				//String s3 = JOptionPane.showInputDialog("숫자입력1");
				
				System.out.println(s1 + s2);
				//자바에서는 +연산자 사용시 하나라도 String이면 결합의 의미!
				//String->int로 바꾸어주어야 함.
				//부품         기본형 간에 cpu가 하는 캐스팅은 불가능!
				//바꾸어주는 부품을 써야한다.
				int n1 = Integer.parseInt(s1);//"200"->200
				int n2 = Integer.parseInt(s2);//"100"->100
				System.out.println(n1 + n2);
				
				//System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
				
				
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.setBounds(76, 269, 452, 84);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7901:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(61, 62, 143, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(61, 146, 143, 44);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
