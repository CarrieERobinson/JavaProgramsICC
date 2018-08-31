/**
*Program: Recursion With Arrays
*This: RecursionWithArrays.java
*Author: Carrie Robinson
*Date: 29-Jan-2018
*Purpose: This program will use recursion to find the sum and minimum of arrays
*/
package recursionwitharrays;

public class RecursionWithArrays 
{
    
    public static void main(String[] args) 
    {
        //Array for testing
        int[] matrix = {5, 7, 8, 45, 3, 4, 8, 1, 5, 23, 12};
        
        //run recursions and print answers
        System.out.print("Sum of matrix:  ");
        System.out.println(addMatrix(0, matrix));
        System.out.print("Min of matrix:  ");
        System.out.println(findMin(0, 0, matrix));
    }
    
    //recursive function to add elements of a 1d matrix
    public static int addMatrix(int index, int matrix[])
    {
        //base case
        if(index == matrix.length)
            return 0;
        else //add the current element to the return values of the rest
            return addMatrix(index + 1, matrix) + matrix[index];
    }
    
    //recursive function to find the minimum value of an array
    public static int findMin(int index, int min, int matrix[])
    {
        if(index == 0) //set minumum to first element
            min = matrix[index];
        //base case
        if(index == matrix.length) //stops recursion when last element is reached
            return min;
        if(min > matrix[index]) //if a new min is found, pass it into next recursion
            return findMin(index+1, matrix[index], matrix);
        else //if no new min is found, increment index and continue
            return findMin(index+1, min, matrix);
    }
    
}
