/**
*Program: Map Program
*This: MapProgram.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 31-Jan-2018
*Purpose: Test driver for map class, prints toStrings of each object
*/
package mapprogram;

public class MapProgram {

    public static void main(String[] args) 
    {
        //instantiate Map objects
        Map m1 = new Map(1989, "GT-R");
        Map m2 = new Map(1969, "Capri");
        Map m3 = new Map(1953, "Corvette C1");
        
        //print toStrings
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
    }
    
}
