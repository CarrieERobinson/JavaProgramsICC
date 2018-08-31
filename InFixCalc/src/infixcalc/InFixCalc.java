/**
*Program: InFixCalc
*This: InFixCalc.java
*Author: Carrie Robinson
*Date: 29-Nov-2017
*Purpose: This program takes in an infix equation then solves it
*/
package infixcalc;
import java.util.*;

public class InFixCalc {
    public static Scanner userIn = new Scanner(System.in);
    public static Stack<Double> operandStack = new Stack<>();
    public static Stack<Character> operatorStack = new Stack<>();
    public static void main(String[] args) 
    {
        System.out.println("Please enter a formula: ");
        String formula = userIn.nextLine(); //get formula
        scanFormula(formula); //run everything
    }
    
    //=============================methods======================================
    //==========================scanFormula()===================================
    public static void scanFormula(String formula)
    {
        //iterate through chars to find needed chars
        for(int i = 0; i < formula.length(); i++)
        {
            //current char in formula
            char current = formula.charAt(i);
            
            //if the character is a number add to operand stack
            if(Character.isDigit(current))
            {
                Boolean lastNum = false; //flag if last digit is reached during loop
                String num = ""; //keeps track of digits
                //get digits and add to operand stack
                while(!lastNum)
                {
                    //update current character
                    current = formula.charAt(i);
                    
                    //check if digit is the last element in the array or if the
                    //next element is not a digit
                    if(i+1 == formula.length() || !Character.isDigit(formula.charAt(i + 1)))
                        lastNum = true; //flag as last number
                    
                    //if the next element exists AND is a digit
                    else
                        i++; //increment i
      
                    //System.out.println("FOUND: " + current);
                    num += current; //add current digit to string
                    
                }
                if(num.length() > 0)
                {
                    double number = Double.parseDouble(num); //convert number string to an int
                    operandStack.push(number);//push number to the operandStack
                    
                    //System.out.println("PUSH: " + number);
                }
            } 
            
            //if current is an operator, but not closing paranthesis, add to operator stack
            else if(current == '(' || current == '+' || current == '-' ||
                        current == '*' || current == '/')
            {
                //make sure order of operations is valid
                if((!operatorStack.isEmpty()) &&
                        (operatorStack.peek() == '*' || operatorStack.peek() == '/')
                        && (current == '+' || current == '-'))
                {
                    //will process if previous operator is a divide or mult
                    //and new operator is a + or -
                    while((!operatorStack.isEmpty()) && (operatorStack.peek() != '+' || operatorStack.peek() != '-'
                            || operatorStack.peek() != '('))
                        process();
                    
                }
                operatorStack.push(current);
                //System.out.println("PUSH: " + current);
            }
            //if current is closing parenth. process everything up to previous parenth.
            else if(current == ')')
            {
                try
                {
                    while(operatorStack.peek() != '(')
                        process();
                    operatorStack.pop(); //remove last '('
                }catch(EmptyStackException ex)
                {
                    System.out.println("No '(' found! ')' will be ignored!");
                    break;
                }
                
            }
            //if invalid char is entered, exclude it and inform user
            else if(current != ' ')
                System.out.println("Excluding invalid entry: " + current);
        }
        
        //after parenthesis have all been processed
        while(!operatorStack.isEmpty() && operatorStack.peek() != '(')
        {
            //finish processing equations outside of parenthesis
            process();
        }
        
        //display answer
        System.out.printf("%.2f\n",operandStack.pop());
    }
    
    //==============================process()===================================
    public static void process()
    {
        char operator = operatorStack.pop();
        //System.out.println(operator);
        double operand1 = operandStack.pop();
        //System.out.println("Op 1: " + operand1);
        double operand2 = operandStack.pop();
        //System.out.println("Op 2: " + operand2);
        
        //checks operation to be performed on 2 operands then performs it and
        //pushes the answer to the top of the operand stack. This keeps a running
        //total to use as more calculations are made
        switch(operator)
        {
            case '+':
                operandStack.push(operand2 + operand1);
                break;
            case '-':
                operandStack.push(operand2 - operand1);
                break;
            case '*':
                operandStack.push(operand2 * operand1);
                break;
            case '/':
                operandStack.push(operand2 / operand1);
                break;
            default: System.out.println("Good job, you broke it!");
        }
    }   
}