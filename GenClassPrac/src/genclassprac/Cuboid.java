/**
*Program: Generic Class Practice Assignment
*This: Cuboid.java
*Author: Carrie Robinson, Colin Sexton
*Date: 1-Nov-2017
*Purpose: Create generic Cuboid class which accepts Numbers only
*/
package genclassprac;

public class Cuboid <E extends Number>{
    private E  length;
    private E breadth;
    private E height;

    public E getLength() {
        return length;
    }

    public void setLength(E length) {
        this.length = length;
    }

    public E getBreadth() {
        return breadth;
    }

    public void setBreadth(E width) {
        this.breadth = width;
    }

    public E getHeight() {
        return height;
    }

    public void setHeight(E height) {
        this.height = height;
    }
    
    public double getVolume()
    {
        return length.doubleValue()*breadth.doubleValue()*height.doubleValue();
    }
    
    public String toString()
    {
        String msg = "Height: " + height + "\nBreadth: " + breadth + "\nLength: "
                + length + "\nVolume: " + getVolume() + "\n";
        return msg;
    }
}
