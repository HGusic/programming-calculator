import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.image.*;
import java.io.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Stack;

//WORKS TO SOLVE EXPRESSION USING PEMDAS
public class EvaluateDecimal{
	String expression;
	
	//Constructor to Evaluate Decimal Expression
	public EvaluateDecimal(String expression) {
		
		this.expression = expression;
		
	}
	//Function to Evaluate Expression
	public static int evaluate(String expression) 
	{
	//Create numStack to store operands
    Stack<Integer> numStack = new Stack<>();
  
    //Create opsStack to store operators
    Stack<Character> opsStack = new Stack<>();
  
    //Insert blanks around (, ), +, -, /, and *
    expression = insertBlanks(expression);

    //Extract operands and operators
    String[] tokens = expression.split(" ");

    //Scan Tokens
    for (String token: tokens) {
    	//If Blank Space
    	if (token.length() == 0) 
    		//Back to work on next token
    		continue; 
      else if (token.charAt(0) == '+' || token.charAt(0) == '-') 
      {
    	  // Process all ops on top stack
    	  while (!opsStack.isEmpty() && (opsStack.peek() == '+' || opsStack.peek() == '-' || opsStack.peek() == '*' || opsStack.peek() == '/' ||opsStack.peek() == '%')) 
    	  {
    		  processAnOperator(numStack, opsStack);
    	  }

    	  //Push plus or minus onto stack
    	  opsStack.push(token.charAt(0));
      }
      else if (token.charAt(0) == '*' || token.charAt(0) == '/' || token.charAt(0) == '%')
      {
    	  //Process all mult or div or mod in stack
    	  while (!opsStack.isEmpty() && (opsStack.peek() == '*' || opsStack.peek() == '/')) 
    	  {
    		  processAnOperator(numStack, opsStack);
    	  }

    	  //Push mult or div or mod into ops stack
    	  opsStack.push(token.charAt(0));
      }
      else if (token.trim().charAt(0) == '(')
      {
    	  //Push left parenthesis to stack
    	  opsStack.push('(');
      }
      else if (token.trim().charAt(0) == ')') 
      {
    	  //Process all ops till parenthesis
    	  while (opsStack.peek() != '(') 
    	  {
    		  processAnOperator(numStack, opsStack);
    	  }
    	  // Pop right parenthesis
    	  opsStack.pop();
      }
      else
      { 
    	  //Push num to stack
    	  numStack.push(new Integer(token));
      }
    }

    //Process remaining operators in stack
    while (!opsStack.isEmpty())
    {
    	processAnOperator(numStack, opsStack);
    }

    //result return
    return numStack.pop();
  }

  //FUNCTION THAT PROCESSES OPERATORS
  public static void processAnOperator(Stack<Integer> numStack, Stack<Character> opsStack)
  {
	  char op = opsStack.pop();
	  int op1 = numStack.pop();
	  int op2 = numStack.pop();
	  if (op == '+') 
		  numStack.push(op2 + op1);
	  else if (op == '-') 
		  numStack.push(op2 - op1);
	  else if (op == '*') 
		  numStack.push(op2 * op1);
	  else if (op == '/') 
		  numStack.push(op2 / op1);
	  else if(op == '%')
		  numStack.push(op2 % op1);
  }
  
  //FUNCTION TO ADD SPACES FOR EASIER PROCESSING
  public static String insertBlanks(String s) {
    String result = "";
    
    for (int i = 0; i < s.length(); i++)
    {
    	if (s.charAt(i) == '(' || s.charAt(i) == ')' ||  s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/' || s.charAt(i) == '%')
    		result += " " + s.charAt(i) + " ";
    	else
    		result += s.charAt(i);
    }
    
    return result;
  }

	

}
