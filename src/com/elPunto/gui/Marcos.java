package com.elPunto.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Marcos extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Marcos() {
		Toolkit pantalla = Toolkit.getDefaultToolkit();
//		setExtendedState(MAXIMIZED_BOTH);
		Dimension size = pantalla.getScreenSize();
		int altura = size.height / 2;
		int ancho = size.width / 2;
		setBounds(ancho / 2 , altura / 2, ancho, altura);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("elPunto");
		Image icono = pantalla.getImage("src/com/elPunto/gui/elPuntoImg.png");
		setIconImage(icono);

		Frame frame = new Frame();
		
		add(frame);

		setVisible(true);
	}

}

class Frame extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public Frame() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	public void actionPerformed(ActionEvent	e) {
		Object botosPulsado = e.getSource();
		if (botosPulsado == botonAzul) setBackground(Color.BLUE);
		else if (botosPulsado == botonAmarillo) setBackground(Color.YELLOW);
		else setBackground(Color.RED);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("Primer grafico", 100, 100);
	}


	
	
	
}