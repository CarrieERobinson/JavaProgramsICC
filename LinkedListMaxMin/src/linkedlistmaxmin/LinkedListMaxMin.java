/**
*Program: Linked List Practice
*This: LinkedListMaxMin.java
*Author: Carrie Robinson
*Date: 5 March 2018
*Purpose: test driver
*/
package linkedlistmaxmin;
import java.util.*;

public class LinkedListMaxMin {

    public static Random rand = new Random();
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for(int i = 0; i < 10; i++)
        {
            list.addFirst(rand.nextInt(951) + 50);
        }
        
        list.print();
        
        System.out.println("Max: " + list.returnMax());
        list.returnMin();
        
        list.print();
        
        System.out.println("Sum: " + list.addMinMax());
        
        list.print();
    }
    
}
