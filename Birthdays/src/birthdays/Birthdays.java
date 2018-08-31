/**
*Program: Birthdays
*This: Birthdays.java
*Author: Carrie Robinson, Colin Sexton
*Date: 6-Dec-2017
*Purpose: This program takes in a birthday in MM/DD/YYYY format, checks for validity,
* then outputs a list of the birthdays
*/
package birthdays;
import java.util.*;

public class Birthdays {

    public static Scanner userIn = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean quit = false; //bool to break loop
        //stores Dates for birthdays
        ArrayList<Date> birthdays = new ArrayList<>();
        while(!quit) //lets user decide when to quit
        {
            //call function that returns Date object to store in birthdays
            birthdays.add(addBirthday());
            
            //prompt to continue
            System.out.println("Add? 1/0");
            int choice = userIn.nextInt();
            if(choice == 0) //if user wants to quit
                quit = true;
        }     
        
        //print b-days
        System.out.println("BIRTHDAYS:");
        for(int i = 0; i < birthdays.size(); i ++)
        {
            System.out.println(birthdays.get(i));
        }
    }

//============================addBirthday()=====================================    
    public static Date addBirthday()
    {
        //Scanner for bday input
        Scanner bdayIn = new Scanner(System.in);
        Boolean valid = false; //bool to break loop (when input is valid)
        Date date = new Date("00","00","0000"); //placeholder for date object
        do
        {
            //prompt for bday
            System.out.println("Enter birthday in MM/DD/YYYY notation: ");
            String birthday = bdayIn.nextLine(); //get bday string
            if(birthday.matches("\\d{2}/\\d{2}/\\d{4}")) //check for match
            {
                String[] mdy = birthday.split("/"); //split date via /
                String day = mdy[1]; //day will be at element 1
                String month = mdy[0]; //month at 0
                String year = mdy[2]; //year at 2
                 
                //re-create date with new parameters
                date = new Date(day, month, year);
                //update validity to true
                valid = true;
            }
        }while(!valid);//if not valid, re-loops
        return date; //return date object
    }
    
}
