import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import java.math.BigInteger;

import javax.swing.event.*;
import java.awt.event.*;


//CLASS THAT WORKS ON CONVERTING NUMBERS AND THE CONVERSION PANEL
public class ConversionPanel extends JPanel implements ActionListener {
	
	
	//VARIABLES
	///////////////////////////////////////////////////////////////////////
	//Radio Buttons
	static JRadioButton hex = new JRadioButton("Hex");
	static JRadioButton dec = new JRadioButton("Dec");
	static JRadioButton oct = new JRadioButton("Oct");
	static JRadioButton bin = new JRadioButton("Bin");
	
	//Groups the Radio Buttons
	ButtonGroup group = new ButtonGroup();
	
	//String for data in textfeidl
	String stringToConvert;
	
	public ConversionPanel() {
		//Buttons to Switch from bin/hex/dec/oct
		group.add(hex);
		group.add(dec);
		group.add(oct);
		group.add(bin);
		
		//Automatically select decimal by defualt
		dec.setSelected(true);
		
		//Set letters to be disabled at start
		ButtonPanel.letterA.setEnabled(false); ButtonPanel.letterB.setEnabled(false); 
		ButtonPanel.letterC.setEnabled(false); ButtonPanel.letterD.setEnabled(false); 
		ButtonPanel.letterE.setEnabled(false); ButtonPanel.letterF.setEnabled(false);
		ButtonPanel.dot.setEnabled(false);
		
		//Adds action listeners to radio buttons
		hex.addActionListener(this);
		dec.addActionListener(this);
		oct.addActionListener(this);
		bin.addActionListener(this);
		
		//Add actual buttons to frame with their respective properties
		add(hex);
		hex.setBounds(4,180, 100, 10);
		hex.setBackground(Color.decode("#1f1f1f"));
		hex.setForeground(Color.white);
		add(dec);
		dec.setBounds(4,200, 100, 10);
		dec.setBackground(Color.decode("#1f1f1f"));
		dec.setForeground(Color.white);
		add(oct);
		oct.setBounds(4,220, 100, 10);
		oct.setBackground(Color.decode("#1f1f1f"));
		oct.setForeground(Color.white);
		add(bin);
		bin.setBounds(4,240, 100, 10);
		bin.setBackground(Color.decode("#1f1f1f"));
		bin.setForeground(Color.white);
		
		
	}
	
	//Functions to Return Buttons
	public static JRadioButton getHexRadButton()
	{ return hex; }
	public static JRadioButton getDecRadButton()
	{ return dec; }
	public static JRadioButton getOctRadButton() 
	{ return oct; }
	public static JRadioButton getBinRadButton() 
	{ return bin; }
	
	//Variables to keep track of which score
	int previousSource = 2;
	int numberToConvert = 0;
	
	//FUNCTIONS FOR EVERY RADIO BUTTON THAT IS SELECTED
	/////////////////////////////////////////////////////////////////////////////////////////////
	//Hex Button Selected
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == hex) {
			
			//Set which buttons are available
			ButtonPanel.leftparenthesis.setEnabled(true); ButtonPanel.rightparenthesis.setEnabled(true); ButtonPanel.numberzero.setEnabled(true);
			ButtonPanel.dot.setEnabled(false); ButtonPanel.equals.setEnabled(false); ButtonPanel.letterE.setEnabled(true);
			ButtonPanel.letterF.setEnabled(true); ButtonPanel.numberone.setEnabled(true);ButtonPanel.numbertwo.setEnabled(true);
			ButtonPanel.numberthree.setEnabled(true); ButtonPanel.plus.setEnabled(false); ButtonPanel.letterC.setEnabled(true);
			ButtonPanel.letterD.setEnabled(true); ButtonPanel.numberfour.setEnabled(true); ButtonPanel.numberfive.setEnabled(true);
			ButtonPanel.numbersix.setEnabled(true); ButtonPanel.minus.setEnabled(false); ButtonPanel.letterA.setEnabled(true);
			ButtonPanel.letterB.setEnabled(true); ButtonPanel.numberseven.setEnabled(true); ButtonPanel.numbereight.setEnabled(true);
			ButtonPanel.numbernine.setEnabled(true); ButtonPanel.multiply.setEnabled(false); ButtonPanel.second.setEnabled(true);
			ButtonPanel.modbutton.setEnabled(false); ButtonPanel.CEButton.setEnabled(true); ButtonPanel.CButton.setEnabled(true);
			ButtonPanel.DELButton.setEnabled(true); ButtonPanel.DivButton.setEnabled(false);
			ButtonPanel.dot.setEnabled(false);
			
			//Variables used for converting data
			stringToConvert = TextField.getInputField().getText();
			String data;
			int num;
			
			//If nothing to convert then do nothing
			if(stringToConvert.length() == 0)
			{
				
			}
			//Conversion from Dec to Hex
			else if(previousSource == 2) {
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					data = Integer.toHexString(numberToConvert);
					TextField.getInputField().setText(data);
				}
			}
			//Conversion from Oct to Hex
			else if(previousSource == 3) {
				if(stringToConvert != "")
				{
					num = Integer.parseInt(stringToConvert, 8);
			        data = Integer.toHexString(num);
			        TextField.getInputField().setText(data);
			     
				}
			}
			//Conversion from Bin to Hex
			else if(previousSource == 4)
			{
				if(stringToConvert != "")
				{
					num = Integer.parseInt(stringToConvert,2);
					data = Integer.toString(num,16);
					TextField.getInputField().setText(data);
	
				}
			}
			
			//Keeps track that hex was last converted to
			previousSource = 1;	
		}
		
		//Decimal button selected
		if(e.getSource() == dec) {
			//Set which buttons are available
			ButtonPanel.leftparenthesis.setEnabled(true); ButtonPanel.rightparenthesis.setEnabled(true); ButtonPanel.numberzero.setEnabled(true);
			ButtonPanel.dot.setEnabled(false); ButtonPanel.equals.setEnabled(true); ButtonPanel.letterE.setEnabled(true);
			ButtonPanel.letterF.setEnabled(true); ButtonPanel.numberone.setEnabled(true);ButtonPanel.numbertwo.setEnabled(true);
			ButtonPanel.numberthree.setEnabled(true); ButtonPanel.plus.setEnabled(true); ButtonPanel.letterC.setEnabled(true);
			ButtonPanel.letterD.setEnabled(true); ButtonPanel.numberfour.setEnabled(true); ButtonPanel.numberfive.setEnabled(true);
			ButtonPanel.numbersix.setEnabled(true); ButtonPanel.minus.setEnabled(true); ButtonPanel.letterA.setEnabled(true);
			ButtonPanel.letterB.setEnabled(true); ButtonPanel.numberseven.setEnabled(true); ButtonPanel.numbereight.setEnabled(true);
			ButtonPanel.numbernine.setEnabled(true); ButtonPanel.multiply.setEnabled(true); ButtonPanel.second.setEnabled(true);
			ButtonPanel.modbutton.setEnabled(true); ButtonPanel.CEButton.setEnabled(true); ButtonPanel.CButton.setEnabled(true);
			ButtonPanel.DELButton.setEnabled(true); ButtonPanel.DivButton.setEnabled(true);
			ButtonPanel.letterA.setEnabled(false); ButtonPanel.letterB.setEnabled(false); 
			ButtonPanel.letterC.setEnabled(false); ButtonPanel.letterD.setEnabled(false); 
			ButtonPanel.letterE.setEnabled(false); ButtonPanel.letterF.setEnabled(false);
			ButtonPanel.dot.setEnabled(false);
			
			//Variables used for converting data
			stringToConvert = TextField.getInputField().getText();
			String data;
			int num;
			//If empty data then do nothing
			if(stringToConvert.length() == 0)
			{
			
			}
			//Convert from hex to dec
			else if(previousSource == 1) {
				if(stringToConvert != "")
				{
					num = hex_to_decimal(stringToConvert);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
			//Convert from oct to dec
			else if(previousSource == 3) {
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					num = convertOctalToDecimal(numberToConvert);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
			//Convert from bin to dec
			else if(previousSource == 4)
			{
				if(stringToConvert != "")
				{
					num = Integer.parseInt(stringToConvert ,2);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
			
			//Keeps track that dec was last converted to
			previousSource = 2;
		}
		
		//Oct button selected
		if(e.getSource() == oct) {
			//Set which buttons are available
			ButtonPanel.leftparenthesis.setEnabled(true); ButtonPanel.rightparenthesis.setEnabled(true); ButtonPanel.numberzero.setEnabled(true);
			ButtonPanel.dot.setEnabled(false); ButtonPanel.equals.setEnabled(false); ButtonPanel.letterE.setEnabled(true);
			ButtonPanel.letterF.setEnabled(true); ButtonPanel.numberone.setEnabled(true);ButtonPanel.numbertwo.setEnabled(true);
			ButtonPanel.numberthree.setEnabled(true); ButtonPanel.plus.setEnabled(false); ButtonPanel.letterC.setEnabled(true);
			ButtonPanel.letterD.setEnabled(true); ButtonPanel.numberfour.setEnabled(true); ButtonPanel.numberfive.setEnabled(true);
			ButtonPanel.numbersix.setEnabled(true); ButtonPanel.minus.setEnabled(false); ButtonPanel.letterA.setEnabled(true);
			ButtonPanel.letterB.setEnabled(true); ButtonPanel.numberseven.setEnabled(true); ButtonPanel.numbereight.setEnabled(true);
			ButtonPanel.numbernine.setEnabled(true); ButtonPanel.multiply.setEnabled(false); ButtonPanel.second.setEnabled(true);
			ButtonPanel.modbutton.setEnabled(false); ButtonPanel.CEButton.setEnabled(true); ButtonPanel.CButton.setEnabled(true);
			ButtonPanel.DELButton.setEnabled(true); ButtonPanel.DivButton.setEnabled(false);
			ButtonPanel.letterA.setEnabled(false); ButtonPanel.letterB.setEnabled(false); 
			ButtonPanel.letterC.setEnabled(false); ButtonPanel.letterD.setEnabled(false); 
			ButtonPanel.letterE.setEnabled(false); ButtonPanel.letterF.setEnabled(false);
			ButtonPanel.numbereight.setEnabled(false); ButtonPanel.numbernine.setEnabled(false); 
			ButtonPanel.dot.setEnabled(false);
			
			//Variables used to convert data
			stringToConvert = TextField.getInputField().getText();
			String data;
			int num;
			
			//If textfield is empty do nothing
			if(stringToConvert.length() == 0)
			{
				
			}
			//Convert from hex to oct
			else if(previousSource == 1) {
				if(stringToConvert != "")
				{	
					num = Integer.parseInt(stringToConvert, 16);
					stringToConvert = Integer.toBinaryString(num);
					numberToConvert = Integer.parseInt(stringToConvert);
					num = (int) convertBinarytoOctal(numberToConvert);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
			//Convert from dec to oct
			else if(previousSource == 2) {
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					data = toOctal(numberToConvert);
					TextField.getInputField().setText(data);
				}
			}
			//Convert from bin to oct
			else if(previousSource == 4)
			{
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					num = (int) convertBinarytoOctal(numberToConvert);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
			
			//Keeps track that oct was last selected
			previousSource = 3;		
			
		}
		//Bin button is selected
		if(e.getSource() == bin) {
			//Set which buttons are available
			ButtonPanel.leftparenthesis.setEnabled(true); ButtonPanel.rightparenthesis.setEnabled(true); ButtonPanel.numberzero.setEnabled(true);
			ButtonPanel.dot.setEnabled(false); ButtonPanel.equals.setEnabled(false); ButtonPanel.letterE.setEnabled(true);
			ButtonPanel.letterF.setEnabled(true); ButtonPanel.numberone.setEnabled(true);ButtonPanel.numbertwo.setEnabled(true);
			ButtonPanel.numberthree.setEnabled(true); ButtonPanel.plus.setEnabled(false); ButtonPanel.letterC.setEnabled(true);
			ButtonPanel.letterD.setEnabled(true); ButtonPanel.numberfour.setEnabled(true); ButtonPanel.numberfive.setEnabled(true);
			ButtonPanel.numbersix.setEnabled(true); ButtonPanel.minus.setEnabled(false); ButtonPanel.letterA.setEnabled(true);
			ButtonPanel.letterB.setEnabled(true); ButtonPanel.numberseven.setEnabled(true); ButtonPanel.numbereight.setEnabled(true);
			ButtonPanel.numbernine.setEnabled(true); ButtonPanel.multiply.setEnabled(false); ButtonPanel.second.setEnabled(true);
			ButtonPanel.modbutton.setEnabled(false); ButtonPanel.CEButton.setEnabled(true); ButtonPanel.CButton.setEnabled(true);
			ButtonPanel.DELButton.setEnabled(true); ButtonPanel.DivButton.setEnabled(false);
			ButtonPanel.letterA.setEnabled(false); ButtonPanel.letterB.setEnabled(false); 
			ButtonPanel.letterC.setEnabled(false); ButtonPanel.letterD.setEnabled(false); 
			ButtonPanel.letterE.setEnabled(false); ButtonPanel.letterF.setEnabled(false);
			ButtonPanel.numbertwo.setEnabled(false); ButtonPanel.numberthree.setEnabled(false); 
			ButtonPanel.numberfour.setEnabled(false); ButtonPanel.numberfive.setEnabled(false); 
			ButtonPanel.numbersix.setEnabled(false); ButtonPanel.numberseven.setEnabled(false); 
			ButtonPanel.numbereight.setEnabled(false); ButtonPanel.numbernine.setEnabled(false); 
			ButtonPanel.dot.setEnabled(false);
		
			
			//Variables used to convert data
			stringToConvert = TextField.getInputField().getText();
			String data;
			int num;
			
			//If text field is empty do nothing
			if(stringToConvert.length() == 0)
			{
				
			}
			//Conversion from hex to bin
			else if(previousSource == 1) {
				if(stringToConvert != "")
				{
					num = Integer.parseInt(stringToConvert, 16);
					data = Integer.toBinaryString(num);
					TextField.getInputField().setText(data);
				}
			}
			//Conversion from dec to bin
			else if(previousSource == 2) {
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					data = Integer.toBinaryString(numberToConvert);
					TextField.getInputField().setText(data);
				}
			}
			//Conversion from oct to bin
			else if(previousSource == 3)
			{
				if(stringToConvert != "")
				{
					numberToConvert = Integer.parseInt(stringToConvert);
					num = (int) convertOctalToBinary(numberToConvert);
					data = Integer.toString(num);
					TextField.getInputField().setText(data);
				}
			}
				
			//Keeps track that bin was last selected option
			previousSource = 4;
		}
		
	}
	
	//FUNCTIONS TO CONVERT DATA
	//////////////////////////////////////////////////////////////////////////////////////////////////
	//hex to dec conversion
	public static int hex_to_decimal(String s)
    {
		String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
	
	
	//dec to oct conversion
	public static String toOctal(int decimal)
	  {    
	    int rem; 
	    String octal="";
	    char octalchars[]={'0','1','2','3','4','5','6','7'};  
	    while(decimal>0)  
	    {  
	       rem=decimal%8;   
	       octal=octalchars[rem]+octal;   
	       decimal=decimal/8;  
	    }  
	    return octal;  
	  }    
	
	//bin to oct conversion
	 public static int convertBinarytoOctal(long binaryNumber)
	    {
	        int octalNumber = 0, decimalNumber = 0, i = 0;
	        while(binaryNumber != 0)
	        {
	            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
	            ++i;
	            binaryNumber /= 10;
	        }
	        i = 1;
	        while (decimalNumber != 0)
	        {
	            octalNumber += (decimalNumber % 8) * i;
	            decimalNumber /= 8;
	            i *= 10;
	        }
	        return octalNumber;
	    }
	 
	 //oct to bin conversion
	 public static long convertOctalToBinary(int octalNumber)
	   {
	        int decimalNumber = 0, i = 0;
	        long binaryNumber = 0;
	        while(octalNumber != 0)
	        {
	            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
	            ++i;
	            octalNumber/=10;
	        }
	        i = 1;
	        while (decimalNumber != 0)
	        {
	            binaryNumber += (decimalNumber % 2) * i;
	            decimalNumber /= 2;
	            i *= 10;
	        }
	        return binaryNumber;
	    }
	 
	//hex to bin conversion
	static String hexToBin(String s) 
		{
		  return new BigInteger(s, 16).toString(2);
		}
	
	//oct to dec conversion
    public static int convertOctalToDecimal(int octal)
    	{
    		int decimalNumber = 0, i = 0;
    		while(octal != 0)
    		{
    			decimalNumber += (octal % 10) * Math.pow(8, i);
    			++i;
    			octal/=10;
    		}
    		return decimalNumber;
    	}
    
	    
}
