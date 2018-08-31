/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicebst;
import java.util.Scanner;

public class PracticeBST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Okay! Today, we're gonna get RECURSIVE!
        //Woot! Aren't you excited?!
        //Let's begin!
        //First, what is our goal?
        //We have an array of integers (in numerical order) and we need to find
        //an integer that the user enters in the array!
        //Then we want to return its location, so we know it's not just bull
        //shitting us here.
        //We're gonna use a BST to do this today, because those are fast I guess!
        
        //Let's start with a scanner to grab input from the user!
        Scanner userIn = new Scanner(System.in);
        
        //Great! Now we need a variable to store the user's input in for later.
        int searchNum = 0;
        
        //Now let's make an array to search through!
        int[] arr = {1, 2, 5, 28, 49, 50, 100, 239, 432, 467, 503, 666, 736,
        2983, 8237};
        
        //hmmm... let's add in an int called cont, then we can use it to end
        //a do while loop that we can encase the code in for simple testing.
        int cont = 0;
        
        //Cool! It's time to start the do-while...
        do
        {
            //When the loop begins, we want to get the info we need from the user,
            //let's prompt them to enter a number to search!
            System.out.print("Enter the number you would like to search for:  ");
            //Now we're gonna store the number!
            //"But Carrie," you ask, "what if the user is a smart ass and types
            //in a non integer number??"
            //Fear not! We have a solution to this problem!
            
            //Start with a while loop which will keep initiating until the user
            //gives up on being cute and types in an int:
            while(!userIn.hasNextInt())
            {
                //This will initiate if the input is not valid!
                //Re-prompt the user
                System.out.print("Real cute. Enter an INTEGER you would like to "
                        + "search for:  ");
                //That'll teach 'em!
                //Now we throw out their disgusting, invalid input!
                userIn.next(); //We do that with this command <<--
                //Then, they enter more input and the loop will check for validity
                //again, if the input is valid we will carry on!
            }
            
            //Now that we know our input is valid, we can store it!
            searchNum = userIn.nextInt();
            
            //Next, we'll need a few things for our recursion.
            //We need the user input, the first element, last element, and the
            //array we want to search.
            int low = 0;
            int high = arr.length - 1;
            //Boom! Now we're ready to write the recursive method so skip to that!
            
            int index = searchArray(arr, searchNum, low, high);
            
            if(index > 0)
            {
                System.out.println("Number found at " + index);
            }else
               System.out.println("Number not found!");
            
            System.out.print("Enter 0 to quit:  ");
            cont = userIn.nextInt();
            
        }while(cont!=0);
    }
    
    public static int searchArray(int[] arr, int searchNum, int low, int high)
    {
        //Base case comes first!
        if(low > high)
            return -1;
        
        //Then, we need to find the middle:
        int mid = (low + high)/2;
        //actually, I'm tired of writing comments so fuck off.
        if(searchNum < arr[mid])
            return searchArray(arr, searchNum, low, mid - 1);
        else if(searchNum == arr[mid])
            return mid;
        else
            return searchArray(arr, searchNum, mid + 1, high);
    }
    
}
