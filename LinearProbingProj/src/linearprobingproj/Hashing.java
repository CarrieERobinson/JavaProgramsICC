/**
*Program: Linear Probing Project
*This: LinearProbingProj.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 21-Feb-2018
*Purpose:This program will test out the linear probing technique
*/
package linearprobingproj;

import java.util.HashMap;
import java.util.Map;

public class Hashing {
    private Integer[] hashTable;
    private double count;
    private double capacity = .75;
    private int size;
    

    public Hashing() {
        hashTable = new Integer[10];
        count = 0;
        size = 10;
    }
    
    //insert value with key algorith linearly
    public void insert(Integer value)
    {
        double dSize = size;
        if(count >= capacity * dSize)
        {
            System.out.println("Size doubled");
            Integer[] hashTable2 = new Integer[size*2];
            System.arraycopy(hashTable, 0, hashTable2, 0, hashTable.length);
            hashTable = hashTable2;
            size = size * 2;
            System.out.println(size);
        }
        int key = value % hashTable.length;
        while(hashTable[key] != null )
        {
            key = (key + 1) % size;
        }
        hashTable[key] = value;
        count++;
        System.out.println("Yeah, it's in there.");
        System.out.println("Yeah, it's in " + key);
    }
    
    //get value with key algorithm linearly
    public Integer getLinear(Integer value)
    {
        int key = value % hashTable.length;
        while(hashTable[key] != value)
        {
            key = (key + 1) % size;
        }
            return key;
    }
}
