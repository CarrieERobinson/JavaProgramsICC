/**
*Program: Linked List Queue and Stack
*This: LLStack.java
*Author: Carrie Robinson
*Date: 26-Mar-2018
*Purpose: Define methods for a linkedlist based stack
*/
package linkedlistqueuestack;

public class LLStack<E> {
    private LinkedList<E> Stack = new LinkedList<>();
    //FILO, add to front, take from front
    
    //================================push()====================================
    public void push(E e)
    {
        Stack.addFirst(e);
    }
    
    //============================pop()=========================================
    public void pop()
    {
        Stack.removeFirst();
    }
    
    //============================print()=======================================
    public void print()
    {
        System.out.println("\nSTACK:");
        Stack.print();
    }
}
