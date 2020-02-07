package com.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {

	private static final long serialVersionUID = -8785141224106085224L;
	private double total = 0;
	private double firstValue;
	private double secondValue;
	double plusclick = 0;
	double minusclick = 0;

	public Calculator() {

		JPanel screenPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel captionPanel = new JPanel();


		BorderLayout bl = new BorderLayout();

		JTextArea calcScreen = new JTextArea(3, 30);
		calcScreen.setBackground(Color.gray);

		JLabel caption = new JLabel("This is a simple calculator");
		captionPanel.add(caption);

		JButton oneButton = new JButton("1");
		JButton twoButton = new JButton("2");
		JButton threeButton = new JButton("3");
		JButton fourButton = new JButton("4");
		JButton fiveButton = new JButton("5");
		JButton sixButton = new JButton("6");
		JButton sevenButton = new JButton("7");
		JButton eightButton = new JButton("8");
		JButton nineButton = new JButton("9");
		JButton zeroButton = new JButton("0");
		
		JButton addButton = new JButton("+");
		JButton minusButton = new JButton("-");
		JButton multiplyButton = new JButton("*");
		JButton divideButton = new JButton("/");
		JButton equalsButton = new JButton("=");
		JButton clearButton = new JButton("C");
		
		screenPanel.add(calcScreen);
		
		oneButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + oneButton.getText());
			}
		});
		buttonPanel.add(oneButton);
		
		twoButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + twoButton.getText());
			}
		});
		buttonPanel.add(twoButton);
		
		threeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + threeButton.getText());
			}
		});
		buttonPanel.add(threeButton);
		
		fourButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + fourButton.getText());
			}
		});
		buttonPanel.add(fourButton);
		
		fiveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + fiveButton.getText());
			}
		});
		buttonPanel.add(fiveButton);
		
		sixButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + sixButton.getText());
			}
		});
		buttonPanel.add(sixButton);
		
		sevenButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + sevenButton.getText());
			}
		});
		buttonPanel.add(sevenButton);
		
		eightButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + eightButton.getText());
			}
		});
		buttonPanel.add(eightButton);
		
		nineButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + nineButton.getText());
			}
		});
		buttonPanel.add(nineButton);
		
		zeroButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText(calcScreen.getText() + zeroButton.getText());
			}
		});
		buttonPanel.add(zeroButton);
		
		/**
		 * Buttons
		 */
		
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				//TODO
				firstValue = Double.parseDouble(calcScreen.getText());

				calcScreen.setText("");
				plusclick = 1;

			}
		});
		buttonPanel.add(addButton);
		
		minusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				//TODO

				firstValue = Double.parseDouble(calcScreen.getText());

				calcScreen.setText("");
				minusclick = 1;
			}
		});
		buttonPanel.add(minusButton);
		
		multiplyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				//TODO
			}
		});
		buttonPanel.add(multiplyButton);
		
		divideButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				//TODO
			}
		});
		buttonPanel.add(divideButton);
		
		equalsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {


				secondValue = Double.parseDouble(calcScreen.getText());
				if (plusclick > 0) {
					total = add(firstValue, secondValue);
					calcScreen.setText(String.valueOf(total));

					secondValue = 0;
					firstValue = 0;
					plusclick = 0;
				} else if (minusclick > 0) {

					total = subtract(firstValue, secondValue);
					calcScreen.setText(String.valueOf(total));

					secondValue = 0;
					firstValue = 0;
					minusclick = 0;
				}


			}
		});
		buttonPanel.add(equalsButton);
		
		clearButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				calcScreen.setText("");
			}
		});
		buttonPanel.add(clearButton);
		
		
		add(screenPanel, bl.NORTH);
		add(buttonPanel, bl.CENTER);
		add(captionPanel, bl.SOUTH);
		setSize(400, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	private double add(double x, double y){
		return x + y;
	}
	
	private double subtract (double x, double y){
		return x -y;
	}
	
	private double multiply(double x, double y){
		return x * y;
	}
	
}
