package ���ǹ�;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton b1 = new JButton("\uBD81\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b2 = new JButton("\uC11C\uCABD\uBC84\uD2BC");
		f.getContentPane().add(b2, BorderLayout.WEST);
		
		JButton b3 = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		b3.setForeground(Color.YELLOW);
		b3.setBackground(Color.RED);
		b3.setFont(new Font("����", Font.BOLD, 50));
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("New button");
		f.getContentPane().add(b4, BorderLayout.EAST);
		
		JButton b5 = new JButton("New button");
		f.getContentPane().add(b5, BorderLayout.SOUTH);
		f.setVisible(true);
		
		
	}

}
