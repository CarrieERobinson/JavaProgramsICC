/**
*Program:KeyWords
*This: KeyWords.java
*Author: Jacob Ferneau,Colin Sexton, Carrie Robinson
*Date: 1/18/18
*Purpose: To be able to use basic Stack properties using an ArrayList
*/
package makeastack;

import java.util.*;
//============================ StackArrayList ==============================
public class StackArrayList implements StackIn {
    
    //create an ArrayList and a default constructor to add 2 Strings and an Integer
    ArrayList AL = new ArrayList();
    public StackArrayList()
    {
        AL.add("hello");
        AL.add("world");
        AL.add(2);
    }
    
    //Override for pop
    @Override
    //=================== pop ============================================
    public Object pop() {
        if(AL.isEmpty())
        {
            System.out.println("This stack is empty!");
            return null;
        }
        Object last = AL.get(AL.size() - 1);
        AL.remove(AL.size() - 1);
        return last;
    }
    //Ovveride for push
    @Override
    //================ push ===========================
    public void push(Object obj) {
        //add the given Object to the ArrayList
        AL.add(obj);
    }

    //Override for peek
    @Override
    //=============== peek ===========================
    public Object peek() {
        //create an object called last and set it to null
        Object last = null;
        
        //If the arraylist is empty print that it is so.
        if(AL.isEmpty())
        {
            System.out.println("The arrayList is empty");        
        }
        
        //if hte arraylist isn't empty set the last Object in the AL to 
        //the object last
        else{
            last = AL.get(AL.size() - 1);
        }
        //return last
        return last;
    }
    
}
