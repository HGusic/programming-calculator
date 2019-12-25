import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import java.util.Stack;
import java.util.*;

import javax.swing.event.*;
import java.awt.event.*;


//ADDS BUTTON PANEL AND ALL THE BUTTONS TO FRAME
public class ButtonPanel extends JPanel implements KeyListener, DocumentListener, ActionListener {
	
	//BUTTON PROPERTIES, BORDER AND FONTS
	Border emptyBorder = BorderFactory.createEmptyBorder();
	Font buttonFont = new Font("Segoe UI", Font.PLAIN, 20);
	Font letterFont = new Font("Segoe UI", Font.PLAIN, 12);
	
	static JButton leftparenthesis = new JButton();
	static JButton rightparenthesis = new JButton();
	static JButton plusorminus = new JButton();
	static JButton numberzero = new JButton();
	static JButton dot = new JButton();
	static JButton equals = new JButton();
	
	static JButton letterE = new JButton();
	static JButton letterF = new JButton();
	static JButton numberone = new JButton();
	static JButton numbertwo = new JButton();
	static JButton numberthree = new JButton();
	static JButton plus = new JButton();
	
	static JButton letterC = new JButton();
	static JButton letterD = new JButton();
	static JButton numberfour = new JButton();
	static JButton numberfive = new JButton();
	static JButton numbersix = new JButton();
	static JButton minus = new JButton();
	
	static JButton letterA = new JButton();
	static JButton letterB = new JButton();
	static JButton numberseven = new JButton();
	static JButton numbereight = new JButton();
	static JButton numbernine = new JButton();
	static JButton multiply = new JButton();
	
	static JButton second = new JButton();
	static JButton modbutton = new JButton();
	static JButton CEButton = new JButton();
	static JButton CButton = new JButton();
	static JButton DELButton = new JButton();
	static JButton DivButton = new JButton();
	
	static JButton LshButton = new JButton();
	static JButton RshButton = new JButton();
	static JButton OrButton = new JButton();
	static JButton XorButton = new JButton();
	static JButton NotButton = new JButton();
	static JButton AndButton = new JButton();
	
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JButton wordbutton = new JButton();
	static JButton button4 = new JButton();
	static JButton button5 = new JButton();
	
	
	//BUTTON PANEL CONSTRUCTOR
	public ButtonPanel() {
		//1ST ROW OF BUTTONS
		/////////////////////////////////////////////////////////////////////	
		add(leftparenthesis);
		leftparenthesis.setBounds(4, 312, 53, 53);
		leftparenthesis.setBackground(Color.decode("#131313"));
		leftparenthesis.setBorder(emptyBorder);
		leftparenthesis.setText("(");
		leftparenthesis.setFont(buttonFont);
		leftparenthesis.setForeground(Color.LIGHT_GRAY);
		leftparenthesis.addActionListener(this);
	
		add(rightparenthesis);
		rightparenthesis.setBounds(59, 312, 53, 53);
		rightparenthesis.setBackground(Color.decode("#131313"));
		rightparenthesis.setBorder(emptyBorder);
		rightparenthesis.setText(")");
		rightparenthesis.setFont(buttonFont);
		rightparenthesis.setForeground(Color.LIGHT_GRAY);
		rightparenthesis.addActionListener(this);
		
		add(plusorminus);
		plusorminus.setBounds(114, 312, 53, 53);
		plusorminus.setBackground(Color.decode("#131313"));
		plusorminus.setBorder(emptyBorder);
		plusorminus.setText("+/-");
		plusorminus.setFont(buttonFont);
		plusorminus.setForeground(Color.LIGHT_GRAY);

		add(numberzero);
		numberzero.setBounds(169, 312, 53, 53);
		numberzero.setBackground(Color.decode("#060606"));
		numberzero.setBorder(emptyBorder);
		numberzero.setText("0");
		numberzero.setFont(buttonFont);
		numberzero.setForeground(Color.LIGHT_GRAY);
		numberzero.addActionListener(this);
		
		add(dot);
		dot.setBounds(224, 312, 53, 53);
		dot.setBackground(Color.decode("#131313"));
		dot.setBorder(emptyBorder);
		dot.setText(".");
		dot.setFont(buttonFont);
		dot.setForeground(Color.LIGHT_GRAY);
		dot.addActionListener(this);
		
		add(equals);
		equals.setBounds(279, 312, 53, 53);
		equals.setBackground(Color.decode("#131313"));
		equals.setBorder(emptyBorder);
		equals.setText("=");
		equals.setFont(buttonFont);
		equals.setForeground(Color.LIGHT_GRAY);
		equals.addActionListener(this);
		
		//2ND ROW OF BUTTONS
		//////////////////////////////////////////////////////////////////
		add(letterE);
		letterE.setBounds(4, 257, 53, 53);
		letterE.setBackground(Color.decode("#060606"));
		letterE.setBorder(emptyBorder);
		letterE.setText("E");
		letterE.setFont(letterFont);
		letterE.setForeground(Color.LIGHT_GRAY);
		letterE.addActionListener(this);
		
		add(letterF);
		letterF.setBounds(59, 257, 53, 53);
		letterF.setBackground(Color.decode("#060606"));
		letterF.setBorder(emptyBorder);
		letterF.setText("F");
		letterF.setFont(letterFont);
		letterF.setForeground(Color.LIGHT_GRAY);
		letterF.addActionListener(this);
		
		add(numberone);
		numberone.setBounds(114, 257, 53, 53);
		numberone.setBackground(Color.decode("#060606"));
		numberone.setBorder(emptyBorder);
		numberone.setText("1");
		numberone.setFont(buttonFont);
		numberone.setForeground(Color.LIGHT_GRAY);
	    numberone.addActionListener(this);
		
		add(numbertwo);
		numbertwo.setBounds(169, 257, 53, 53);
		numbertwo.setBackground(Color.decode("#060606"));
		numbertwo.setBorder(emptyBorder);
		numbertwo.setText("2");
		numbertwo.setFont(buttonFont);
		numbertwo.setForeground(Color.LIGHT_GRAY);
		numbertwo.addActionListener(this);
		
		add(numberthree);
		numberthree.setBounds(224, 257, 53, 53);
		numberthree.setBackground(Color.decode("#060606"));
		numberthree.setBorder(emptyBorder);
		numberthree.setText("3");
		numberthree.setFont(buttonFont);
		numberthree.setForeground(Color.LIGHT_GRAY);
		numberthree.addActionListener(this);
		
		add(plus);
		plus.setBounds(279, 257, 53, 53);
		plus.setBackground(Color.decode("#131313"));
		plus.setBorder(emptyBorder);
		plus.setText("+");
		plus.setFont(buttonFont);
		plus.setForeground(Color.LIGHT_GRAY);
		plus.addActionListener(this);
		
		//3RD ROW OF BUTTONS
		//////////////////////////////////////////////////////////////////
		add(letterC);
		letterC.setBounds(4, 202, 53, 53);
		letterC.setBackground(Color.decode("#060606"));
		letterC.setBorder(emptyBorder);
		letterC.setText("C");
		letterC.setFont(letterFont);
		letterC.setForeground(Color.LIGHT_GRAY);
		letterC.addActionListener(this);
		
		add(letterD);
		letterD.setBounds(59, 202, 53, 53);
		letterD.setBackground(Color.decode("#060606"));
		letterD.setBorder(emptyBorder);
		letterD.setText("D");
		letterD.setFont(letterFont);
		letterD.setForeground(Color.LIGHT_GRAY);
		letterD.addActionListener(this);
		
		add(numberfour);
		numberfour.setBounds(114, 202, 53, 53);
		numberfour.setBackground(Color.decode("#060606"));
		numberfour.setBorder(emptyBorder);
		numberfour.setText("4");
		numberfour.setFont(buttonFont);
		numberfour.setForeground(Color.LIGHT_GRAY);
		numberfour.addActionListener(this);
		
		add(numberfive);
		numberfive.setBounds(169, 202, 53, 53);
		numberfive.setBackground(Color.decode("#060606"));
		numberfive.setBorder(emptyBorder);
		numberfive.setText("5");
		numberfive.setFont(buttonFont);
		numberfive.setForeground(Color.LIGHT_GRAY);
		numberfive.addActionListener(this);
		
		add(numbersix);
		numbersix.setBounds(224, 202, 53, 53);
		numbersix.setBackground(Color.decode("#060606"));
		numbersix.setBorder(emptyBorder);
		numbersix.setText("6");
		numbersix.setFont(buttonFont);
		numbersix.setForeground(Color.LIGHT_GRAY);
		numbersix.addActionListener(this);
		
		add(minus);
		minus.setBounds(279, 202, 53, 53);
		minus.setBackground(Color.decode("#131313"));
		minus.setBorder(emptyBorder);
		minus.setText("-");
		minus.setFont(buttonFont);
		minus.setForeground(Color.LIGHT_GRAY);
		minus.addActionListener(this);
		
		
		//4TH ROW OF BUTTONS	
		//////////////////////////////////////////////////////////////////	
		add(letterA);
		letterA.setBounds(4, 147, 53, 53);
		letterA.setBackground(Color.decode("#060606"));
		letterA.setBorder(emptyBorder);
		letterA.setText("A");
		letterA.setFont(letterFont);
		letterA.setForeground(Color.LIGHT_GRAY);
		letterA.addActionListener(this);
				
		add(letterB);
		letterB.setBounds(59, 147, 53, 53);
		letterB.setBackground(Color.decode("#060606"));
		letterB.setBorder(emptyBorder);
		letterB.setText("B");
		letterB.setFont(letterFont);
		letterB.setForeground(Color.LIGHT_GRAY);
		letterB.addActionListener(this);
				
		add(numberseven);
		numberseven.setBounds(114, 147, 53, 53);
		numberseven.setBackground(Color.decode("#060606"));
		numberseven.setBorder(emptyBorder);
		numberseven.setText("7");
		numberseven.setFont(buttonFont);
		numberseven.setForeground(Color.LIGHT_GRAY);
		numberseven.addActionListener(this);
			
		add(numbereight);
		numbereight.setBounds(169, 147, 53, 53);
		numbereight.setBackground(Color.decode("#060606"));
		numbereight.setBorder(emptyBorder);
		numbereight.setText("8");
		numbereight.setFont(buttonFont);
		numbereight.setForeground(Color.LIGHT_GRAY);
		numbereight.addActionListener(this);
				
		add(numbernine);
		numbernine.setBounds(224, 147, 53, 53);
		numbernine.setBackground(Color.decode("#060606"));
		numbernine.setBorder(emptyBorder);
		numbernine.setText("9");
		numbernine.setFont(buttonFont);
		numbernine.setForeground(Color.LIGHT_GRAY);
		numbernine.addActionListener(this);
				
		add(multiply);
		multiply.setBounds(279, 147, 53, 53);
		multiply.setBackground(Color.decode("#131313"));
		multiply.setBorder(emptyBorder);
		multiply.setText("x");
		multiply.setFont(buttonFont);
		multiply.setForeground(Color.LIGHT_GRAY);
		multiply.addActionListener(this);
		

		//5TH ROW OF BUTTONS	
		//////////////////////////////////////////////////////////////////			
		add(second);
		second.setBounds(4, 92, 53, 53);
		second.setBackground(Color.decode("#131313"));
		second.setBorder(emptyBorder);
		second.setText("2nd");
		second.setFont(letterFont);
		second.setForeground(Color.LIGHT_GRAY);
		second.addActionListener(this);
						
		add(modbutton);
		modbutton.setBounds(59, 92, 53, 53);
		modbutton.setBackground(Color.decode("#131313"));
		modbutton.setBorder(emptyBorder);
		modbutton.setText("Mod");
		modbutton.setFont(letterFont);
		modbutton.setForeground(Color.LIGHT_GRAY);
		modbutton.addActionListener(this);
						
		add(CEButton);
		CEButton.setBounds(114, 92, 53, 53);
		CEButton.setBackground(Color.decode("#131313"));
		CEButton.setBorder(emptyBorder);
		CEButton.setText("CE");
		CEButton.setFont(letterFont);
		CEButton.setForeground(Color.LIGHT_GRAY);
		CEButton.addActionListener(this);
					
		add(CButton);
		CButton.setBounds(169, 92, 53, 53);
		CButton.setBackground(Color.decode("#131313"));
		CButton.setBorder(emptyBorder);
		CButton.setText("C");
		CButton.setFont(letterFont);
		CButton.setForeground(Color.LIGHT_GRAY);
		CButton.addActionListener(this);
						
		add(DELButton);
		DELButton.setBounds(224, 92, 53, 53);
		DELButton.setBackground(Color.decode("#131313"));
		DELButton.setBorder(emptyBorder);
		DELButton.setText("DEL");
		DELButton.setFont(letterFont);
		DELButton.setForeground(Color.LIGHT_GRAY);
		DELButton.addActionListener(this);
		
		add(DivButton);
		DivButton.setBounds(279, 92, 53, 53);
		DivButton.setBackground(Color.decode("#131313"));
		DivButton.setBorder(emptyBorder);
		DivButton.setText("/");
		DivButton.setFont(buttonFont);
		DivButton.setForeground(Color.LIGHT_GRAY);
		DivButton.addActionListener(this);
	
		//6TH ROW OF BUTTONS
		//////////////////////////////////////////////////////////
		add(LshButton);
		LshButton.setBounds(4, 37, 53, 53);
		LshButton.setBackground(Color.decode("#131313"));
		LshButton.setBorder(emptyBorder);
		LshButton.setText("Lsh");
		LshButton.setFont(letterFont);
		LshButton.setForeground(Color.LIGHT_GRAY);
		
						
		add(RshButton);
		RshButton.setBounds(59, 37, 53, 53);
		RshButton.setBackground(Color.decode("#131313"));
		RshButton.setBorder(emptyBorder);
		RshButton.setText("Rsh");
		RshButton.setFont(letterFont);
		RshButton.setForeground(Color.LIGHT_GRAY);
						
		add(OrButton);
		OrButton.setBounds(114, 37, 53, 53);
		OrButton.setBackground(Color.decode("#131313"));
		OrButton.setBorder(emptyBorder);
		OrButton.setText("Or");
		OrButton.setFont(letterFont);
		OrButton.setForeground(Color.LIGHT_GRAY);
					
		add(XorButton);
		XorButton.setBounds(169, 37, 53, 53);
		XorButton.setBackground(Color.decode("#131313"));
		XorButton.setBorder(emptyBorder);
		XorButton.setText("Xor");
		XorButton.setFont(letterFont);
		XorButton.setForeground(Color.LIGHT_GRAY);
						
		add(NotButton);
		NotButton.setBounds(224, 37, 53, 53);
		NotButton.setBackground(Color.decode("#131313"));
		NotButton.setBorder(emptyBorder);
		NotButton.setText("Not");
		NotButton.setFont(letterFont);
		NotButton.setForeground(Color.LIGHT_GRAY);
						
		add(AndButton);
		AndButton.setBounds(279, 37, 53, 53);
		AndButton.setBackground(Color.decode("#131313"));
		AndButton.setBorder(emptyBorder);
		AndButton.setText("And");
		AndButton.setFont(letterFont);
		AndButton.setForeground(Color.LIGHT_GRAY);
		
		//7TH ROW OF BUTTONS
		/////////////////////////////////////////////////////////////
		add(button1);
		button1.setBounds(4, 0, 53, 35);
		button1.setBackground(Color.decode("#131313"));
		button1.setBorder(emptyBorder);
		button1.setText("numpad");
		button1.setFont(letterFont);
		button1.setForeground(Color.LIGHT_GRAY);
		
		
		add(button2);
		button2.setBounds(59, 0, 53, 35);
		button2.setBackground(Color.decode("#131313"));
		button2.setBorder(emptyBorder);
		button2.setText("bitpad");
		button2.setFont(letterFont);
		button2.setForeground(Color.LIGHT_GRAY);
		
		add(wordbutton);
		wordbutton.setBounds(114, 0, 108, 35);
		wordbutton.setBackground(Color.decode("#131313"));
		wordbutton.setBorder(emptyBorder);
		wordbutton.setText("WORD");
		wordbutton.setFont(letterFont);
		wordbutton.setForeground(Color.LIGHT_GRAY);
		wordbutton.addActionListener(this);
		
		
		add(button4);
		button4.setBounds(224, 0, 53, 35);
		button4.setBackground(Color.decode("#131313"));
		button4.setBorder(emptyBorder);
		button4.setText("MS");
		button4.setFont(letterFont);
		button4.setForeground(Color.LIGHT_GRAY);
		
		add(button5);
		button5.setBounds(279, 0, 53, 35);
		button5.setBackground(Color.decode("#131313"));
		button5.setBorder(emptyBorder);
		button5.setText("M");
		button5.setFont(letterFont);
		button5.setForeground(Color.LIGHT_GRAY);	
		
	}

	//FUNCTIONS FOR ACTION LISTENER
	////////////////////////////////////////////////////////////
	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		

	}
	
	//Variables for manipulating string after button presses
	String v = "";
	int result;
	String previousEntry;
	int wordbuttoncounter = 0 ;
	
	//Function that does an action if a button is pressed
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String input = TextField.getInputField().getText();
	
		if(source == wordbutton) {
			if(wordbuttoncounter == 0)
			{
				wordbuttoncounter++;
				wordbutton.setText("Byte");
			}
			else if(wordbuttoncounter == 1)
			{
				wordbuttoncounter++;
				wordbutton.setText("QWord");
			}
			else if(wordbuttoncounter == 2)
			{
				wordbuttoncounter++;
				wordbutton.setText("DWord");
			}
			else if(wordbuttoncounter == 3)
			{
				wordbutton.setText("Word");
				wordbuttoncounter = 0;
			}
			
		}
		if(source == leftparenthesis)
		{
			TextField.getInputField().setText(input + "(");
			v += "(";
			
		}
		if(source == rightparenthesis)
		{
			TextField.getInputField().setText(input + ")");
			v += ")";
		}
		if(source == numberzero)
		{
			TextField.getInputField().setText(input + "0");	
			v += "0";
		}
		if(source == letterA)
		{
			TextField.getInputField().setText(input + "A");
		}
		if(source == letterB)
		{
			TextField.getInputField().setText(input + "B");
		}
		if(source == numberone)
		{
			TextField.getInputField().setText(input + "1");
			v += "1";
		}
		if(source == numbertwo)
		{
			TextField.getInputField().setText(input + "2");
			v += "2";
		}
		if(source == numberthree)
		{
			TextField.getInputField().setText(input + "3");
			v += "3";
		}
		if(source == plus)
		{
			TextField.getInputField().setText(input + "+");
			v += "+";
		}
		if(source == letterC)
		{
			TextField.getInputField().setText(input + "C");
			
		}
		if(source == letterD)
		{
			TextField.getInputField().setText(input + "D");
		}
		if(source == numberfour)
		{
			TextField.getInputField().setText(input + "4");
			v += "4";
		}
		if(source == numberfive)
		{
			TextField.getInputField().setText(input + "5");
			v += "5";
		}
		if(source == numbersix)
		{
			TextField.getInputField().setText(input + "6");
			v += "6";
		}
		if(source == minus)
		{
			TextField.getInputField().setText(input + "- ");
			v += "-";
		}
		if(source == letterA)
		{
			TextField.getInputField().setText(input + "A");
		}
		if(source == letterB)
		{
			TextField.getInputField().setText(input + "B");
		}
		if(source == numberseven)
		{
			TextField.getInputField().setText(input + "7");
			v += "7";
		}
		if(source == numbereight)
		{
			TextField.getInputField().setText(input + "8");
			v += "8";
		}
		if(source == numbernine)
		{
			TextField.getInputField().setText(input + "9");
			v += "9";
		}
		if(source == multiply)
		{
			TextField.getInputField().setText(input + "*");
			v += "*";
		}
		if(source == second)
		{
			
		}
		if(source == modbutton)
		{
			TextField.getInputField().setText(input + "%");
			v += "%";
		}
		if(source == CEButton)
		{
			TextField.getInputField().setText(previousEntry);
			v = previousEntry;
		}
		if(source == CButton)
		{
			TextField.getInputField().setText(input.substring(0, input.length() - input.length()));
			v = "";
		}
		if(source == DELButton)
		{
			TextField.getInputField().setText(input.substring(0, input.length() - 1));
			v = v.substring(0, v.length()-2);
		}
		if(source == DivButton)
		{
			TextField.getInputField().setText(input + "/");
			v += "/";
		}
		
		//Equals actually evaluates expression in calculator
		if(source == equals)
		{
				System.out.println(v);
				input = TextField.getInputField().getText();
				EvaluateDecimal test = new EvaluateDecimal(v);
				result = test.evaluate(v);
				TextField.getInputField().setText("" + result);
				previousEntry = TextField.getInputField().getText();
				v = previousEntry;
	
		}
		
		
	
	
	
	}
	

	
}

