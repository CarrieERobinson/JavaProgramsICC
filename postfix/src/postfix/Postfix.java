/**
*Program: Postfix
*This: Postfix.java
*Author: Carrie Robinson
*Date: 4-Dec-2017
*Purpose: This program takes in a postfix equation then solves it
*/
package postfix;
import java.util.*;
public class Postfix 
{
    public static void main(String[] args) 
    {
        Scanner userIn = new Scanner(System.in); //scanner for user input
        //prompt for formula
        System.out.print("Enter a formula in postfix notation with only 1 digit"
                + " operands:  ");
        //get input
        String formula = userIn.nextLine();
        //will solve and print answer with method magic
        System.out.println(solve(formula));
    }
    
    //These will hold operators and operands
    public static Stack<Character> operatorStack = new Stack<>();
    public static Stack<Double> operandStack = new Stack<>();
    
//==============================solve()=========================================
    public static double solve(String formula)
    {
        //run scan, this will solve everything
        scan(formula);
        //pop and return final answer
        return operandStack.pop();
    }
    
//==============================scan()=========================================
    public static void scan(String formula)
    {
        //iterate through formula string
        for(int i = 0; i < formula.length(); i++)
        {
            char current = formula.charAt(i); //keeps track of current character
            //check is current char is a digit
            if(Character.isDigit(current))
            {
                //parse character into a double
                double number = Character.getNumericValue(current);
                operandStack.push(number); //push into operandStack
            }
            //check if char is an operator
            else if(current == '+' || current == '-' || current == '*'
                    || current == '/')
            {
                //push operator to operatorStack
                operatorStack.push(current);
                process(); //process operation
            }
            else
            {
                //check for invalid, non-space chars
                if(current != ' ')
                {
                    //print out that user has messed up and to not do that again
                    //please
                    System.out.println("Invalid input!!! Didn't you read the rules?"
                            + " Postfix, no. invalid. characters.");
                    break;
                }
            }
        }
        
    }
    
//==============================process()=======================================    
    public static void process()
    {
        //get operator for processing
        char operator = operatorStack.pop();
        //get top 2 operands to perform operation on
        double op1 = operandStack.pop();
        double op2 = operandStack.pop();
        
        //check operator, perform operation, then push answer to operandStack
        switch(operator)
        {
            case '+':
                operandStack.push(op2 + op1);
                break;
            case '-':
                operandStack.push(op2 - op1);
                break;
            case '*':
                operandStack.push(op2 * op1);
                break;
            case '/':
                operandStack.push(op2 / op1);
                break;
            default: System.out.println("Something done broke!");
        }
    }
}
