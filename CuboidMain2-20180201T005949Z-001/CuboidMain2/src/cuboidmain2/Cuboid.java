/*Program: CuboidMain2
*This: Cuboid.java
*Author: Jake Ferneau Carrie Robinson Colin Sexton
*Date: 1/31/18
*Purpose: To be a generic class with a height, breadth, length, and volume of 
*a cube, accepting values for each and then computing the Volume using .doubleValue()
*/

package cuboidmain2;

//================= Cuboid =========================================================
public class Cuboid <T extends Number> {
    private T height;
    private T breadth;
    private T length;
    private double volume;

    //================= getVolume =========================================================
    public double getVolume() {
        //use the .doubleValue() to allow the return type to be double
        return height.doubleValue() * breadth.doubleValue() * length.doubleValue();
    }

    //================= getHeight =========================================================
    public T getHeight() {
        return height;
    }

    //================= setHeight =========================================================
    public void setHeight(T height) {
        this.height = height;
    }

    //================= getBreadth =========================================================
    public T getBreadth() {
        return breadth;
    }

    //================= setBreadth =========================================================
    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    //================= getLength =========================================================
    public T getLength() {
        return length;
    }

    //================= setLength =========================================================
    public void setLength(T length) {
        this.length = length;
    }
    
    //================= toString =========================================================
    public String toString()
    {
        return "The height is: " + height + " The breadth is: " + breadth
                + " The length is: " + length;
    }
}
