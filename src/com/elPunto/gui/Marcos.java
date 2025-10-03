package com.elPunto.gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marcos extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Marcos() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("elPunto");
		Image icono = pantalla.getImage("src/com/elPunto/gui/elPuntoImg.png");
		setIconImage(icono);

		Frame frame = new Frame();
		
		add(frame);

		setVisible(true);
	}

}

class Frame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Primer grafico", 100, 100);
	}
	
	
	
}