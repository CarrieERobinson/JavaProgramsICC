/**
*Program: Set Practice Dem
*This: SetPracticeDem.java
*Author: Carrie Robinson
*Date: 12 February 2018
*Purpose: Lets the user add and remove words from a dictionary
*/
package setpracticedem;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SetPracticeDem {
//===========================main===============================================
    public static void main(String[] args) {
        //create tree set to store words
        Set<String> wordSet = new TreeSet<>();
        //open file with words in it
        File file = new File("Dictionary.txt");
        if(!file.exists()) //if the file does not exist
        {
            //creates the file
            System.out.println("Doesn't exist ma man");
            try{file.createNewFile();}
            catch(IOException e){};
        }
        
        try{
            //make scanner to read in file
            Scanner fileIn = new Scanner(file);
            //cycle through file and store each word in treeset
            while(fileIn.hasNextLine())
            {
                String line = fileIn.nextLine();
//                System.out.println(line);
                wordSet.add(line); //add word to tree
            }
            
            boolean quit = false; //tells loop when to stahp
            do{
                Scanner userIn = new Scanner(System.in); //scanner for user input
                int selection = menu(); //print menu and get choice from user
                
                switch(selection) //determine course of action using user choice
                {
                    case 1: //add a word
                    {
                        System.out.print("Enter a word to add: ");
                        wordSet.add(userIn.next().toUpperCase());
                        System.out.println("Added!");
                        break;
                    }
                    case 2: //print dictionary
                    {
                        System.out.println(wordSet);
                        break;
                    }
                    case 3: //delete a word of the user's choice
                    {
                        System.out.print("What word would you like to delete? ");
                        String word = userIn.next().toUpperCase();
                        if(wordSet.contains(word))
                        {
                            wordSet.remove(word);
                        }else
                            System.out.println(word + " was not found in your"
                                    + " dictionary :(");
                        break;
                    }
                    case 0: //saves words and quits program
                    {
                        System.out.println("Saving your new dictionary...");
                        //PrintWriter to write to file
                        PrintWriter pw = new PrintWriter(file);
                        for(String word: wordSet) //iterate through treeset
                        {
                            pw.println(word); //add each word to dictionary
                        }
                        
                        pw.close(); //close pw
                        System.out.println("Good-Bye!");
                        quit = true; //flag to quit
                        break;
                    }
                    default://if another int is entered
                        System.out.println("Invalid choice");                    
                }
            }while(!quit);//end loop when quit == true
            }catch(FileNotFoundException ex) //catch exception just in case
            {
                System.out.println(ex);
            }
    }
    
    public static int menu() //prints menu and returns choice
    {
        Scanner userIn = new Scanner(System.in);
        System.out.println("What would you like to do?");//MENU
        System.out.println("1. Add a word"
                + "\n2. View Dictionary"
                + "\n3. Delete a word"
                + "\n0. Save and Quit");
        while(!userIn.hasNextInt()) //check for valid input
        {
            System.out.println("Invalid choice!"); //input not valid
            userIn.next();
        }
        int choice = userIn.nextInt(); //store valid input
        return choice;//return input
    }
    
}
