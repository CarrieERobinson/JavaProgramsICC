/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysum;
import java.util.*;
/**
 *
 * @author carri
 */
public class ArraySum {

    public static void main(String[] args) 
    
    {
        int array[] = new int[5];
        array[0] = 1;
        array[1] = 4;
        array[2] = 2;
        array[3] = 6;
        array[4] = 11;
        System.out.println(sum(array, 0));
    }
   
    public static int sum(int[] n, int index)
    {
        if(index == n.length)
            return 0;
        else
        {
            return n[index] + sum(n, index + 1);
        }
    }
    
}
