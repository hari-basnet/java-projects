package com.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class Calculator extends JFrame {
	
	private double total = 0;
	private String firstValue;
	private String secondValue;
	
	public Calculator(){
		
		JPanel screenPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		JPanel captionPanel = new JPanel();
		
		
		BorderLayout bl = new BorderLayout();
		
		JTextArea calcScreen = new JTextArea(3,30);
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
				 calcScreen.setText("");
			}
		});
		buttonPanel.add(addButton);
		
		minusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				//TODO
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
		
		
		firstValue = calcScreen.getText();
		secondValue = calcScreen.getText();
		
		equalsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(final ActionEvent e) {
				
				
				total = add(Double.parseDouble(firstValue), Double.parseDouble(secondValue));
				calcScreen.setText(String.valueOf(total));
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
