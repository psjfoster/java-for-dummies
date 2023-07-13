package com.example.graphical;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class SimpleFrame extends JFrame {
	
	public SimpleFrame() {
		setTitle("Don't click the button!");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JButton("Panic"));
		setSize(300, 100);
		setVisible(true);
	}

}
