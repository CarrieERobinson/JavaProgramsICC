/**
*Program: Recursive
*This: RecursiveBST.java
*Author: Carrie Robinson, Colin Sexton
*Date: 24-Jan-2018
*Purpose: This program uses a recursive function to search through a 1D array
* like a binary search tree
*/
package recursivebst;
import java.util.Scanner;

public class RecursiveBST 
{

    public static void main(String[] args) 
    {
        //variable to store the user's input in for later
        int searchNum = 0;      
        
        //make an array to search through
        int[] arr = {1, 2, 5, 28, 49, 50, 100, 239, 432, 467, 503, 666, 736,
        2983, 8237};
        
        int cont = 0;//will end do-while
        
        //do-while to encapsulate stuff
        do
        {
            Scanner userIn = new Scanner(System.in);   
            //Prompt
            System.out.print("Enter the number you would like to search for:  ");
            
            //check input
            while(!userIn.hasNextInt())
            {
                System.out.print("Enter an INTEGER you would like to search for:  ");
                userIn.next(); 
            }
            
            //set searchNum to userIn
            searchNum = userIn.nextInt();
            
            //assign first and last
            int first = 0;
            int last = arr.length - 1;
            
            //stores result in a var
            Boolean found = BSearch(arr, searchNum, first, last);
            
            //if the element was found
            if(found)
                System.out.println("Found!");
            else
               System.out.println("Number not found!");
            
            //prompt to quit
            System.out.print("Enter 0 to quit:  ");
            //if !int
            if(!userIn.hasNextInt())
            {
                cont = 1;
            }else
            cont = userIn.nextInt();
            
        }while(cont!=0);
    }
    
    public static Boolean BSearch(int[] arr, int target, int first, int last)
    {
        if(first > last)
            return false;
        
        int mid = (first + last)/2;
        if(target < arr[mid])
            return BSearch(arr, target, first, mid - 1);
        else if(target == arr[mid])
            return true;
        else
            return BSearch(arr, target, mid + 1, last);
    }
    
}
