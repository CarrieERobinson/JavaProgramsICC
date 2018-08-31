/**
*Program: Stack Program
*This: StackArray.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 18-Jan-2018
*Purpose: This class will define a stack object using regular arrays. It implements
* our custom interface "StackIn".
*/
package makeastack;

import java.util.Arrays;

//============================StackArray========================================
public class StackArray<T> implements StackIn<T>{
    private T[] array; //This will store the objects in the stack as an array
    
//================================constructor===================================
    public StackArray()
    {
        //This initiates array as having 1 element, null
        this.array = (T[]) new Object[1];
        array[0] = null;
    }

//=================================pop()========================================
    //This will pop off the last element of the array
    @Override
    public T pop() {
        if(array.length > 1)
        {
            T last = array[array.length - 1];
            
            //this copys the array into a new array with one less element
            this.array = Arrays.copyOf(this.array, this.array.length - 1);
            //tell user that item has been removed
            System.out.println(last + " has been removed from the stack.");
            
            //returns popped item
            return last;
            
        }else //if stack is empty
        {
            System.out.println("The Stack is empty! You can't remove any more!");
            return null;
        }
        
    }

//================================peek()========================================
    //This will simply return the value of the last object in the stack
    @Override
    public T peek() {
//        System.out.println("PEEK");
        if(array.length == 1)
        {
            //If the stack is empty:
            System.out.println("There's nothing here!");
            return null;
        }
        else //Stack is not empty, return last element
            return array[array.length - 1];
    }

//=================================push()=======================================
    //This will add a new object to the end of the stack
    @Override
    public void push(T obj) {
        //this copys the array into a new array with an extra null element
        this.array = Arrays.copyOf(this.array, this.array.length + 1);
        //this assigns an object to that null element
        this.array[this.array.length - 1] = obj;
        System.out.println(obj + " has been added to the stack.");
//        System.out.println("ADDED");
    }
    
//=================================print()======================================
    //Simple print method
    public void print()
    {
        System.out.println("STACK:");
        for(int i = 1; i < array.length; i++)
            System.out.println(array[i]);
    }
}
