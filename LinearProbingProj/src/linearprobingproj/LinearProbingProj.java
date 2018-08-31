/**
*Program: Linear Probing Project
*This: LinearProbingProj.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 21-Feb-2018
*Purpose:This program will test out the linear probing technique
*/
package linearprobingproj;
import java.util.*;

public class LinearProbingProj {

    public static void main(String[] args) {
        
        Hashing myHashing = new Hashing();
        myHashing.insert(3);
        myHashing.insert(13);
        myHashing.insert(6);
        myHashing.insert(4);
        myHashing.insert(6);
        myHashing.insert(13);
        myHashing.insert(23);
        myHashing.insert(67);
        myHashing.insert(30);
        myHashing.insert(23);
        myHashing.insert(3);
        myHashing.insert(32);
        myHashing.insert(43);
        myHashing.insert(93);
        myHashing.insert(2);
        myHashing.insert(5);
        myHashing.insert(23);
        
        
        System.out.println( "3 at " + myHashing.getLinear(3));
        System.out.println("13 at " + myHashing.getLinear(13));
        System.out.println("32 at " + myHashing.getLinear(32));
        System.out.println("43 at " + myHashing.getLinear(43));
        System.out.println("5 at " + myHashing.getLinear(5));
        System.out.println("6 at " + myHashing.getLinear(6));
    }
    
}
