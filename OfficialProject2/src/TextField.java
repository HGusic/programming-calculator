import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;

import java.awt.event.*;


//CLASS THAT WORKS WITH THE TEXTFIELD OF THE CALCULATOR
public class TextField extends JPanel implements KeyListener, DocumentListener {
	
	//VARIABLES
	static JTextField inputFieldPanel = new JTextField(12);
	private Font textAreaFont, menuFont, titleFont;
	private JLabel menu, title;
	

	//CONSTRUCTOR FOR TEXTFIELD
	public TextField() {
		
		//FRONT END DESING
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Create new title, fonts, and labels
		JLabel menu = new JLabel("\u2630");
		JLabel title = new JLabel("Programmer");
		
		Font titleFont = new Font("Verdana", Font.PLAIN, 20);
		Font menuFont = new Font("Baskerville", Font.PLAIN, 20);
		Font textAreaFont = new Font("Segoe UI", Font.BOLD, 50);
		
		//Set text field properties
		inputFieldPanel.setFont(textAreaFont);
		inputFieldPanel.setForeground(Color.black);
		inputFieldPanel.setHorizontalAlignment(SwingConstants.RIGHT);
		inputFieldPanel.setBounds(10,  70 , 315, 60);
		inputFieldPanel.addKeyListener(this);
		inputFieldPanel.getDocument().addDocumentListener(this);
		
		//Set menu item properties
		menu.setFont(menuFont);
		menu.setBounds(15, 15, 20, 20);
		menu.setForeground(Color.black);
		
		//Set title item properties
		title.setBounds(55, 5, 200, 40);
		title.setFont(titleFont);
		title.setForeground(Color.black);
		
		//Add them to the frame
		add(inputFieldPanel);
		add(menu);
		add(title);
		
		}
	
		//Function to return data in text field
		public static JTextField getInputField() {
			return inputFieldPanel;
		}
		
		//FUNCTIONS FOR ACTION AND DOCUMENT LISTENER
		//////////////////////////////////////////////////////////////////////////////
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
		//	System.out.println("Gang");
			
		}
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void keyTyped(KeyEvent e) {
			e.getSource();
			e.consume();			
		}
		
		

}
