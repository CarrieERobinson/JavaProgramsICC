/**
*Program: Stack Program
*This: MakeAStack.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 18-Jan-2018
*Purpose: This is the main test class that will demonstrate that each stack
* class works.
*/
package makeastack;

public class MakeAStack {

    public static void main(String[] args) {
        StackArray stackArray = new StackArray();
        StackArrayList stackArrayList = new StackArrayList();
        
        System.out.println("STACK USING ARRAYS:");
        
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push("Hi");
        stackArray.push(3.4);
        stackArray.push("Bye");
        System.out.println("\n\n");
        
        
        stackArray.print();
        System.out.println("\n\n");
        
        stackArray.pop();
        System.out.println("PEEK: " + stackArray.peek());
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        System.out.println("PEEK: " + stackArray.peek());
        stackArray.pop();
        stackArray.pop();
        
        System.out.println("\n\nSTACK USING ARRAY LIST:");
        
        //The ArrayList stack already contains 3 values which is why we don't
        //push them in here.
        stackArrayList.push(1);
        stackArrayList.push(7.7);
        
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());
        System.out.println("PEEK: " + stackArrayList.peek());
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());
        System.out.println(stackArrayList.pop());
    }
    
}
