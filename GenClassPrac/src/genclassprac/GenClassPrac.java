/**
*Program: Generic Class Practice Assignment
*This: GenClassPrac.java
*Author: Carrie Robinson, Colin Sexton
*Date: 1-Nov-2017
*Purpose: Create Cuboid classes and print their information
*/
package genclassprac;

public class GenClassPrac {

    public static void main(String[] args) {
        Cuboid<Integer> cube = new Cuboid();
        cube.setHeight(10);
        cube.setLength(10);
        cube.setBreadth(10);
        
        Cuboid<Double> cube2 = new Cuboid();
        cube2.setHeight(12.3);
        cube2.setLength(15.4);
        cube2.setBreadth(9.0);
        
        System.out.printf("Cube 1: \n%s\n\nCube 2: \n%s\n", cube.toString(), 
                cube2.toString());  
    }
    
}
