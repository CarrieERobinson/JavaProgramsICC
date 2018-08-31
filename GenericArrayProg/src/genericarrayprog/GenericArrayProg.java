
package genericarrayprog;
import java.util.*;
public class GenericArrayProg
{

    public static void main(String[] args) 
    {
        int size = 10;
        GenArray<Integer> gArray = new GenArray(size);
        
        Integer[] addArray = {34, 2, 38, 34, 16, 65, 16,
        42, 7, 37};
        
        Object[] nArray = (Object[]) new Integer[size];
        
        System.out.println("\n\nYour Array:");
        gArray.setArray(addArray);
        gArray.print();
        
        System.out.println("\n\nREVERSE:");
        gArray.reverse(0, size - 1);
        gArray.printRev();
        
        System.out.println("\n\nSORTED:");
        gArray.sort();

    }
}
