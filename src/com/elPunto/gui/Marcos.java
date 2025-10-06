package com.elPunto.gui;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

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

		setVisible(true);
	}

}