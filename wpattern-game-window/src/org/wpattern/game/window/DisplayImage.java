package org.wpattern.game.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class DisplayImage extends JPanel {

	private static final long serialVersionUID = 2450891364420591840L;
	private Image image;

	public DisplayImage() {
		try {
			this.image = ImageIO.read(new File("images\\simpsons.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.setPreferredSize(new Dimension(600, 400));
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(this.image, 0, 0, null);
		g2d.setColor(Color.WHITE);
		g2d.drawLine(50, 50, 150, 150);
	}

}
