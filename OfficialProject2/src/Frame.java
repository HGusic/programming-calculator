import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.KeyListener;
import java.awt.event.*;


//CLASS TO ADD FRAME AND PANELS TO CALCULATOR
public class Frame extends JFrame {
	
	private JPanel backgroundPanel;
	private JLabel subject;
	
		
	public Frame() {
		
		//BASIC FRAME SETUP
		////////////////////////////////////////////////////////////////////////////////////////////
		//Sets Absolute Layout for the frame
		setLayout(null);
		//Set the size of the frame
		setSize(342, 684);
		//Operation for Closing Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Title of Frame
		setTitle("Calculator");
		//Does not Allow Resizing
		setResizable(false);
		//Set to Visible
		
		//CREATE BACKGROUND PANEL TO ADD TO
		////////////////////////////////////////////////////////////////////////////////////////////
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setLocation(0,0);
		backgroundPanel.setSize(340,695);
		backgroundPanel.setBackground(Color.decode("#E6E6E6"));
		add(backgroundPanel);
		
		//CREATE PANEL FOR TEXTFIELD OBJECT
		////////////////////////////////////////////////////////////////////////////////////////////
		TextField textArea = new TextField();
		textArea.setLayout(null);
		//textArea.setBounds(0, 65, 310, 60);
		textArea.setBounds(0,0,340,150);
		textArea.setBackground(Color.decode("#E6E6E6"));
		backgroundPanel.add(textArea);
		
		//CREATE PANEL FOR BUTTONS OBJECT
		//////////////////////////////////////////////////////////////////////////////////////////
		ButtonPanel buttonpanel = new ButtonPanel();
		buttonpanel.setLayout(null);
		buttonpanel.setBounds(0,287,342,660);
		buttonpanel.setBackground(Color.decode("#E6E6E6"));
		backgroundPanel.add(buttonpanel);
		
		
		//CREATE PANEL FOR CONVERSION BUTTONS OBJECT
		//////////////////////////////////////////////////////////////////////////////////////////
		ConversionPanel conversionpanel = new ConversionPanel();
		conversionpanel.setLayout(null);
		conversionpanel.setBounds(0,0,342,270);
		conversionpanel.setBackground(Color.decode("#E6E6E6"));
		backgroundPanel.add(conversionpanel);
		
		//Set Frame To Be Visible
		setVisible(true);
		
		
		
		 	
	
		
		
	}

}
