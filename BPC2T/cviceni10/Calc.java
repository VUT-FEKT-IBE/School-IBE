package com.vutbr.feec8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;

// no need to extend frame!
//public class Calculator extends JFrame {
public class Calc {

	public Calc() {
		initComponents();
	}

	private void initComponents() {
		JPanel gui = new JPanel(new BorderLayout(800, 5));
		JTextArea screen = new JTextArea(1, 25);
		gui.add(screen, BorderLayout.NORTH);

		JFrame frame = new JFrame("CALC");
		frame.setContentPane(gui);
		frame.setSize(1000, 800);

		JPanel panel = new JPanel(new GridLayout(5, 3, 3, 3));

		JButton oneButton = new JButton("1");
		oneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "1");
			}
		});
		panel.add(oneButton);

		JButton twoButton = new JButton("2");
		twoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "2");
			}
		});
		panel.add(twoButton);

		JButton threeButton = new JButton("3");
		threeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "3");
			}
		});
		panel.add(threeButton);

		JButton fourButton = new JButton("4");
		fourButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "4");
			}
		});
		panel.add(fourButton);

		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "5");
			}
		});
		panel.add(fiveButton);

		JButton sixButton = new JButton("6");
		sixButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "6");
			}
		});
		panel.add(sixButton);

		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "7");
			}
		});
		panel.add(sevenButton);

		JButton eightButton = new JButton("8");
		eightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "8");
			}
		});
		panel.add(eightButton);

		JButton nineButton = new JButton("9");
		nineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "9");
			}
		});
		panel.add(nineButton);

		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "0");
			}
		});
		panel.add(zeroButton);

		JButton addButton = new JButton("*");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "*");
			}
		});
		panel.add(addButton);

		JButton plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "+");
			}
		});
		panel.add(plusButton);
		JButton minusButton = new JButton("-");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "-");
			}
		});
		panel.add(minusButton);
		JButton delButton = new JButton("/");
		delButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				screen.setText(help + "/");
			}
		});
		panel.add(delButton);

		JButton eqvButton = new JButton("=");
		eqvButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String help = screen.getText();
				ScriptEngineManager manager = new ScriptEngineManager();
				ScriptEngine engine = manager.getEngineByName("JavaScript");
				int result;
				try {
					result = (int) engine.eval(help);
					screen.setText(String.valueOf(result));
				} catch (ScriptException e1) {
					e1.printStackTrace();
				}

				// int returnedValue = result.getValue();

			}
		});
		panel.add(eqvButton);

		gui.add(panel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Calc();
			}
		});
	}
}
