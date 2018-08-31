/*Program: CuboidMain
*This: Cuboid.java
*Author: Jake Ferneau Carrie Robinson Colin Sexton
*Date: 1/31/18
*Purpose: To make a Generic method that can accept a values for height, breadth,
*and length and put it all to a toString to return it.
*/
package cuboidmain;


public class Cuboid <T>{
    private T height;
    private T breadth;
    private T length;

    //=================== getHeight ================================================
    public T getHeight() {
        return height;
    }

    //=================== setHeight ================================================
    public void setHeight(T height) {
        this.height = height;
    }

    //=================== getBreadth ================================================
    public T getBreadth() {
        return breadth;
    }

    //=================== setBreadth ================================================
    public void setBreadth(T breadth) {
        this.breadth = breadth;
    }

    //=================== getLength ================================================
    public T getLength() {
        return length;
    }

    //=================== setLength ================================================
    public void setLength(T length) {
        this.length = length;
    }
    
    //=================== toString ================================================
    public String toString()
    {
        return "The height is: " + height + " The breadth is: " + breadth
                + " The length is: " + length;
    }
}
