/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork1;

/**
 *
 * @author Carrie
 */
public class ClassWork1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer intArray[] = {34, 2, 46, 7, 5};
        String stringArray[] = {"Hi", "I", "Am", "Carrie", "Robinson"};

        sort(intArray);
        sort(stringArray);
    }
    
    public static <E> void print(E[] stArray)
    {
        for(int i = 0; i < stArray.length; i++)
        {
            System.out.println(stArray[i]);
        }
    }

    public static <E extends Comparable> void sort(E[] stArray)
    {
        int lowestIndex;
        E min;
        for(int i = 0; i < stArray.length - 1; i++)
        {
            lowestIndex = i;
            min = stArray[i];
            for(int j = i + 1; j < stArray.length; j++)
            {
                if(min.compareTo(stArray[j]) > 0)
                {
                    min = stArray[j];
                    lowestIndex = j;
                }
            }
            if(lowestIndex != i)
            {
                stArray[lowestIndex] = stArray[i];
                stArray[i] = min;
            }
        }
        print(stArray);
    }
}
