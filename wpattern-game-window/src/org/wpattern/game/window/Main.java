package org.wpattern.game.window;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame("WPattern Game");
		DisplayImage display = new DisplayImage();
		frame.add(display);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setBackground(Color.BLACK);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
