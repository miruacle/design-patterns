package com.rua.observable;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Caculator {

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

	private JFrame frameCaculator;
	private JEditorPane editAddend1;
	private JEditorPane editAddend2;
	private JEditorPane editResult;
	private JLabel labelPlus;
	private JButton btEqual;

	public Caculator() {
		frameCaculator = new JFrame();
	}

	public void lanchFrame() {
		frameCaculator.setSize(WIDTH, HEIGHT);
		frameCaculator.setLocationRelativeTo(null);
		frameCaculator.setTitle("加法");

		Container container = frameCaculator.getContentPane();
		container.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		editAddend1 = new JEditorPane();
		editAddend1.setBorder(new BevelBorder(BevelBorder.LOWERED));
		editAddend2 = new JEditorPane();
		editAddend2.setBorder(new BevelBorder(BevelBorder.LOWERED));
		labelPlus = new JLabel("+");
		btEqual = new JButton("=");
		editResult = new JEditorPane();
		editResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
		editResult.setEditable(false);
		container.add(editAddend1);
		container.add(labelPlus);
		container.add(editAddend2);
		container.add(btEqual);
		container.add(editResult);
		frameCaculator.setVisible(true);

		class AdditionCaculate implements ActionListener {

			public void actionPerformed(ActionEvent arg0) {
				int add1 = Integer.parseInt(editAddend1.getText());
				int add2 = Integer.parseInt(editAddend2.getText());
				int result = add1 + add2;
				editResult.setText(result + "");
			}

		}
		
		AdditionCaculate additionCaculate = new AdditionCaculate();
		btEqual.addActionListener(additionCaculate);
		
	}
	
	public static void main(String[] args){
		Caculator caculator = new Caculator();
		caculator.lanchFrame();
	}
}
