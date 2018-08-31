/**
*Program: Linked List Practice
*This: LinkedListPractice.java
*Author: Carrie Robinson, David Anguiano
*Date: 28 February 2018
*Purpose: test driver
*/
package linkedlistpractice;
import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList();
        
        Scanner userIn = new Scanner(System.in); //scanner
        System.out.print("How many nodes would you like to enter?  "); //prompt for size
        while(!userIn.hasNextInt())//check for valid input
        {
            System.out.println("Invalid input!!!");
            userIn.next();
        }
        int numNodes = userIn.nextInt(); //store number of nodes
        
        for(int i = 0; i < numNodes; i++) //loop through all nodes
        {
            Scanner userIn2 = new Scanner(System.in); //scanner
            System.out.print("Enter a number:  "); //prompt for a value
            while(!userIn2.hasNextInt()) //check for error
            {
                System.out.println("Invalid input!!!");
                userIn2.next();
            }
            int value = userIn2.nextInt(); //store value
            
            //ask for where to put number
            System.out.print("What index would you like to place this number?:  ");
            while(!userIn2.hasNextInt())//check input
            {
                System.out.println("Invalid input!!!");
                userIn2.next();
            }
            int index = userIn2.nextInt(); //store index
            
            list.add(index, value); //add nodes
        }
        
        //handling menu choices (this is not really optimized for readability, sorry
        
        int menuChoice = 0;
        do{
            menuChoice = menu();
            switch(menuChoice)
            {
                case 1: //Add nodes
                {
                    int addChoice = addMenu();
                    switch(addChoice)
                    {
                        case 1:
                        {
                            System.out.println("What would you like to add to the"
                                    + " head?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int addInt = userIn.nextInt();
                            list.addFirst(addInt);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("What would you like to add to the"
                                    + " tail?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int addInt = userIn.nextInt();
                            list.addLast(addInt);
                            break;
                        }
                        case 3:
                        {
                            //get element
                            System.out.println("What would you like to add to the"
                                    + " list?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int addInt = userIn.nextInt();
                            
                            //get index
                            System.out.println("Where would you like to add it?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int addIndex = userIn.nextInt();
                            
                            list.add(addIndex, addInt);
                            break;
                        }
                        default: System.out.println("Invalid input");
                    }
                }
                case 2: //Print nodes
                {
                    list.print();
                    break;
                }
                case 3: //Remove nodes
                {
                    int remChoice = removeMenu();
                    switch(remChoice)
                    {
                        case 1:
                        {
                            System.out.println("What element would you like to"
                                    + " remove?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int remInt = userIn.nextInt();
                            list.removeElement(remInt);
                            break;
                        }
                        case 2:
                        {
                            System.out.println("What index would you like to"
                                    + " remove?");
                            while(!userIn.hasNextInt())//check for valid input
                            {
                                System.out.println("Invalid input!!!");
                                userIn.next();
                            }
                            int remInt = userIn.nextInt();
                            list.remove(remInt);
                            break;
                        }
                        case 3:
                        {
                            list.removeLast();
                            break;
                        }
                        case 4:
                        {
                            list.remove(0);
                            break;
                        }
                        default: System.out.println("Invalid input");
                        
                    }
                    break;
                }
                case 0: 
                {
                    System.out.println("Good-bye");
                    break;
                }
                
                default: System.out.println("Invalid input!");
            }
        }while(menuChoice != 0);
        
    }
    
    //Gets what the user wants to do
    public static int menu()
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("1. Add nodes\n"
                + "2. Print nodes\n"
                + "3. Remove nodes\n"
                + "0. Quit");
        while(!userIn.hasNextInt())
        {
            System.out.println("Invalid input!");
            userIn.next();
        }
        return userIn.nextInt();
    }
    
    //Gets where the user wants to add a node
    public static int addMenu()
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("1. Add node to beginning of list\n"
                + "2. Add node to end of list\n"
                + "3. Add node by index");
        while(!userIn.hasNextInt())
        {
            System.out.println("Invalid input!");
            userIn.next();
        }
        return userIn.nextInt();
    }
    
    //Gets where a user wants to remove a node
    public static int removeMenu()
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("1. Remove node by element\n"
                + "2. Remove node by index\n"
                + "3. Remove last node\n"
                + "4. Remove first node");
        while(!userIn.hasNextInt())
        {
            System.out.println("Invalid input!");
            userIn.next();
        }
        return userIn.nextInt();
    }
}
