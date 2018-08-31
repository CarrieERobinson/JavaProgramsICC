/*Program: CuboidMain
*This: Cuboid.java
*Author: Jake Ferneau Carrie Robinson Colin Sexton
*Date: 1/31/18
*Purpose: To call a generic Cuboid class with Integer and String and entering
*in the dimmensions, then returning the values in a toString
*/

package cuboidmain;


public class CuboidMain {

    //=================== main ================================================
    public static void main(String[] args) {
        //Create a Cuboid Integer and String Class
        Cuboid<Integer> cube = new Cuboid();
        Cuboid<String> cube2 = new Cuboid();
        
        //Set the Breadth, Length, and Height of the first Cuboid
        cube.setBreadth(13);
        cube.setLength(12);
        cube.setHeight(4);
        //Print out the dimmensions
        System.out.println("The First Cube's dimmensions are: ");
        System.out.println(cube.toString());
        
        //Set the Breadth, Length, and Height of the second Cuboid
        cube2.setBreadth("17");
        cube2.setLength("38.5");
        cube2.setHeight("22");
        
        //Print out the dimmensions of the second cube
        System.out.println("The Second Cube's dimmensions are: "); 
        System.out.println(cube2.toString());
    }
    
}
