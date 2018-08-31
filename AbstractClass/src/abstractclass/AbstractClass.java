/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;
import java.util.*;

/**
 *
 * @author Carrie
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();

        Rectangle[] rectArray = {rect1, rect2};
        rect1.setHeight(11);
        rect1.setWidth(12);
        rect2.setHeight(12);
        rect2.setWidth(5);
        System.out.println(rectArray[0].getArea() + " " + rectArray[1].getArea());
        Arrays.sort(rectArray);
        System.out.println(rectArray[0].getArea() + " " + rectArray[1].getArea());
    }
    
}
