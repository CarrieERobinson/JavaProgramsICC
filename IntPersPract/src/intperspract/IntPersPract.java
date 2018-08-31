//TODO
/*
*Option to delete contact
*Check for duplicate contacts
*Display already-made contacts on request
*Fix Sorting system
*Add documentation cuz this shit is hard to read
*Option to see names then enter name of person to see their contact info
*
**/
package intperspract;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

public class IntPersPract {
    public static Scanner userIn = new Scanner(System.in);
    public static Scanner userIn2 = new Scanner(System.in);
    public static File file = new File("Contact.txt");
    public static void main(String[] args) 
    {
        ArrayList<Contacts> contactBook = new ArrayList<Contacts>();
        
        contactBook.addAll(importContacts());
        
        int choice = 0;
        do{
            choice = menu();
            
            switch(choice)
            {
                case 1: 
                {
                    Collections.<Contacts>sort(contactBook);
                    printContacts(contactBook); 
                    break;
                }
                case 2:
                {
                    contactBook.add(getContacts());
                    break;
                }
                case 3:
                {
                    int delEl = deleteContact(contactBook);
                    if(delEl >= 0)
                    {
                        contactBook.remove(delEl);
                        System.out.println("Deleted Contact");
                    }
                    
                    break;
                }
                case 4:
                {
                    searchContactBook(contactBook);
                    break;
                }
                case 0:
                {
                    Collections.<Contacts>sort(contactBook);
                    exportContacts(contactBook);
                    break;
                }
                default: System.out.println("Invalid input!");
            }
            
        }while(choice != 0);
        
    }

//===================================MENU=======================================
    public static int menu()
    {
        System.out.print("*******MENU********\n"
                + "\t1. View Contacts\n"
                + "\t2. Add Contact\n"
                + "\t3. Delete Contact\n"
                + "\t4. Search Contacts\n"
                + "\t0. Quit\n\n");
        System.out.print("Enter your choice:  ");
        while(!userIn2.hasNextInt())
        {
            System.out.println("Invalid input! Please enter a valid choice!");
            System.out.print("*******MENU********\n"
                + "\t1. View Contacts\n"
                + "\t2. Add Contact\n"
                + "\t3. Delete Contact\n"
                + "\t4. Search Contacts\n"
                + "\t0. Quit\n\n");
            System.out.print("Enter your choice:  ");
            userIn2.next();
        }
        int choice = userIn2.nextInt();
        return choice;
    }
    
//=============================importContacts()=================================    
    public static ArrayList importContacts()
    {
        ArrayList<Contacts> contactBook = new ArrayList<Contacts>();
        String fName, lName, email, address, number;
        String temp;
        try
        {
            Scanner fileIn = new Scanner(file);
            if(fileIn.hasNext())
            {
                while(fileIn.hasNextLine())
                {
                    temp = fileIn.nextLine().substring(6);
                    String[] fullName = temp.split(", ");
                    fName = fullName[1];
                    lName = fullName[0];
                    email = fileIn.nextLine();
                    address = fileIn.nextLine();
                    number = fileIn.nextLine();

                    email = email.substring(8);
                    address = address.substring(9);
                    number = number.substring(14);

                    contactBook.add(new Contacts(fName, lName, email, address, number));
                    System.out.println("CONTACT INFO IMPORTED\n");
                }
            }

        }catch(FileNotFoundException ex)
        {
            System.out.println("Error: File Not Found");
        }
        
        return contactBook;
    }
    
//=============================exportContacts()=================================    
    public static void exportContacts(ArrayList contactBook)
    {
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            
        PrintWriter pr = new PrintWriter(file);
        for(int i = 0; i < contactBook.size(); i++)
        {
            pr.print(contactBook.get(i));
        }
        pr.close();
        }catch(FileNotFoundException ex)
        {
            System.out.println("File not found.");
        }catch(IOException ex)
        {
            System.out.println("File could not be created.");
        }
        System.out.println("Your contacts for this session have been saved!");
    }

//================================getContacts()=================================
    //gets user inputs and adds them to an arraylist, ends on request
    public static Contacts getContacts()
    {
        //variables for the program
        String fName, lName, email, address, number;
        //get input for each field
        System.out.println("Please enter the appropiate information in each"
                + " field:");
        System.out.print("First Name:  ");
        fName = userIn.nextLine();
        System.out.print("Last Name:  ");
        lName = userIn.nextLine();
        System.out.print("Email:  ");
        email = userIn.nextLine();
        System.out.print("Address:  ");
        address = userIn.nextLine();
        System.out.print("Phone Number:  ");
        number = userIn.nextLine();
        //get input for each field
            
        //instantiate contact
        Contacts contact = new Contacts(fName, lName, email, address, number);

        return contact;
    }
    
//==============================printContacts()=================================
    //simple print method for contacts
    public static void printContacts(ArrayList<Contacts> contactBook)
    { 
        System.out.print("\n****************\n"
                         + "**CONTACT BOOK**\n"
                         + "****************\n");
        for(int i = 0; i < contactBook.size(); i++)
            System.out.println(contactBook.get(i));
    }
    
//===============================sortContacts()=================================
    //combines and sorts ArrayLists
    public static ArrayList<Contacts> sortContacts(ArrayList<Contacts> contactBook)
    {
        Collections.sort(contactBook);
        return contactBook;
    }
    
//===============================searchContactBook()============================
   public static Contacts searchContactBook(ArrayList<Contacts> contactBook)
   {
       Scanner searchIn = new Scanner(System.in);
       System.out.print("Enter part or all of the name you wish to search:  ");
       String searchString = searchIn.nextLine();
       searchString = searchString.toUpperCase();
       Contacts nullContact = new Contacts("Null", "Null", "Null", "Null", "Null");
       
       ArrayList<Contacts> results = new ArrayList<Contacts>();
       int nameNumbers = 0;
       int nameIndex = 0;
       for(int i = 0; i < contactBook.size(); i++)
       {
           String curName1 = contactBook.get(i).getfName() + " " +
                   contactBook.get(i).getlName();
           String curName2 = contactBook.get(i).getlName() + " " +
                   contactBook.get(i).getfName();
           
           curName1 = curName1.toUpperCase();
           curName2 = curName2.toUpperCase();
           
           if(curName1.startsWith(searchString) || curName2.startsWith(searchString))
           {
               nameNumbers++;
               System.out.println(nameNumbers + ". " + curName1);
               results.add(contactBook.get(i));
           }
       }
       if(nameNumbers == 0)
       {
           System.out.println("No results found :( Get some friends maybe?");
       }
       else
       {
           boolean flag = true;
           do
           {
                System.out.print("Please enter the number next to the name"
                        + " of desired contact: ");
                while(!userIn.hasNextInt())
                {
                    System.out.println("Invalid Input!");
                    System.out.print("Please enter the number next to the name"
                        + " of desired contact: ");
                     userIn.next();
                }
           nameIndex = userIn.nextInt();
           if(nameIndex > 0 && nameIndex <= nameNumbers)
           {
               flag = false;
           }
           }while(flag);
           
           System.out.println("\n\n" + results.get(nameIndex - 1) + "\n\n"); 
           return(results.get(nameIndex - 1));
       }
       return nullContact;
   }
   
//===============================searchContactBook()============================
   public static int deleteContact(ArrayList contactBook)
   {
       Scanner delScanner = new Scanner(System.in);
       Contacts delContact = searchContactBook(contactBook);
       for(int i = 0; i < contactBook.size(); i++)
       {
           if(delContact == contactBook.get(i))
           {
               System.out.println("Deleting Contact: " + contactBook.get(i));
               System.out.println("Enter 'N' to cancel, enter anything else to confirm...");
               char choice = delScanner.nextLine().charAt(0);
               switch(choice)
               {
                   case 'N': System.out.println("Delete Cancelled");
                       break;
                   case 'n': System.out.println("Delete Cancelled");
                       break;
                   default: 
                   {
                       System.out.println("Delete Confirmed...");
                       return i;
                   }
               }
           }
       }
       return -1;
   }
    
}
