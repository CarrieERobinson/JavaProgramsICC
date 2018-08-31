/*Program: CuboidMain2
*This: Cuboid.java
*Author: Jake Ferneau Carrie Robinson Colin Sexton
*Date: 1/31/18
*Purpose: To call a generic cuboid class that must be a Number type. 
*Then to enter in a height, breadth, and length and having the Cuboid class
*Print out the sizes and the Volume
*/
package cuboidmain2;


public class CuboidMain2 {

    //=================== main ================================================
    public static void main(String[] args) {
        //Make a Cuboid Class of type Double
        Cuboid<Double> cube = new Cuboid();
        
        //Set the Breadth, Length, and Height of the Cuboid
        cube.setBreadth(13.0);
        cube.setLength(12.0);
        cube.setHeight(4.0);
        //Print the dimmensions and the Volume
        System.out.println("The Cube's dimmensions are: ");
        System.out.println(cube.toString());
        System.out.println("The Cube's Volume is: ");
        System.out.println(cube.getVolume());
        
    }
    
}
