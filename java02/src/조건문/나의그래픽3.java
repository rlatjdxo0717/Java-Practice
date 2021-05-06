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

public class 나의그래픽3 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
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
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. 입력한 t1,t2값을 가지고 와야한다.
				//외부에서 입력한 데이터의 타입은 모두 String!!
				String s1 = t1.getText(); //"root"
				String s2 = t2.getText(); //"1234"
				//2. 내가 지정한 id/pw와 동일한지 확인!
				//3. 결과를 출력!
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공");
				} else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton.setBounds(76, 269, 452, 84);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC544 \uC774 \uB514:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(61, 62, 143, 44);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(61, 146, 143, 44);
		f.getContentPane().add(lblNewLabel_1);
		f.setSize(600, 600);
		f.setVisible(true);

	}
}
