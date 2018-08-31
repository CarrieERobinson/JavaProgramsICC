/**
*Program: Generic Array
*This: ArrayClass.java
*Author: Carrie Robinson
*Date: 5-Feb-2018
*Purpose: Defines ArrayClass class
*/
package genericarray;

import java.util.Arrays;

//=========================ArrayClass()=========================================
public class ArrayClass <E extends Comparable>{
    E[] genArray; //Holds the array
    E[] revArray;//holds the reversed array

//=========================Constructors=========================================
    public ArrayClass(E[] genArray) {
        this.genArray = genArray;
    }
    
//=========================Getters n Setters====================================
    public void setGenArray(E[] genArray) {
        this.genArray = genArray;
    }

//=========================sortArray()==========================================
    //hopefully this will sort the array
    public void sortArray ()
    {
        System.out.print("SortedArray:   ");
        Arrays.sort(genArray);
    }

//===========================toString()=========================================    
    //returns a string that lists the array
    @Override
    public String toString()
    {
        //loop through array and add each element to a String
        String msg = "";
        for(int i = 0; i < genArray.length; i++)
        {
            msg += genArray[i];
            if(i < genArray.length - 1)
                msg+=", ";
        }
        return msg;
    }
    
//=========================printRevArray()======================================
    //gets reverse array and prints it
    public void printRevArray(int start, int end,  E[] revArr)
    {
        //Call reverseArray and store return value
        this.revArray = reverseArray(start, end, revArr);
        
        //print the reversed array
        System.out.print("Reverse Array:  ");
        for(int i = 0; i < revArray.length; i++)
        {
            System.out.print(revArray[i]);
            if(i < revArray.length  - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
    
//=========================reverseArray()=======================================
    //uses recursion to reverse array
    public E[] reverseArray(int start, int end,  E[] revArr)
    {
        if(start >= end) //base case, end when indexes invert
            return revArr;
        else //switch elements at indexes
        {
            E temp = revArr[start];
            revArr[start] = revArr[end];
            revArr[end] = temp;
            return reverseArray(start + 1, end - 1, revArr);
        }
        
    }
}
