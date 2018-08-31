/**
*Program: Name Ranking
*This: NameRanking.java
*Author: Carrie Robinson
*Date: 19 February 2018
*Purpose: Asks user for gender, year, and name then searches a file for the name
* and its popularity ranking then returns the ranking
*/
package nameranking;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class NameRanking {
    
    public static ArrayList<Map> nameMapsG = new ArrayList<>();
    public static ArrayList<Map> nameMapsB = new ArrayList<>(); //will store each map for
        //each year
    
    public static void main(String[] args) {
        
        setMaps(); //creates a map for each year then stores them in the arraylists
        
        boolean quit = false;
        do{
            //scanners for input, you can never have too many! Right?
            Scanner userIn1 = new Scanner(System.in);
            Scanner userIn2 = new Scanner(System.in);
            Scanner userIn3 = new Scanner(System.in);

            System.out.print("What year would you like to search?"
                    + " Enter '0' to quit:   ");
            //get year entry
            while(!userIn1.hasNextInt())
            {
                System.out.println("Invalid Entry!");
                System.out.print("What year would you like to search?  ");
                userIn1.next();
            }
            int year = userIn1.nextInt(); //store year

            //check for valid year
            if(year > 2000 && year < 2011)
            {
                String gen = "NULL"; //stores gender
                System.out.print("Would you like to search for a boy or"
                        + " girl name?  "); //prompt for gender
                gen = userIn2.nextLine(); //get input
                
                //get name to search for
                System.out.print("What name would you like to search?  ");
                String name = userIn3.nextLine(); //store name
                name = name.toLowerCase();//make sure case is ignored
            
                printResult(year, gen, name); //prints results

            }else if(year == 0) //ques to quit loop
                quit = true;
            else
                System.out.println("Invalid year!"); //re-loop if year is invalid

        }while(!quit);
        
        System.out.println("Good-bye!");
    }

    //will add all of the names and ranks to their own maps
    public static void setMaps()
    {
        String[] fileNames = {"2001.txt", "2002.txt", "2003.txt", "2004.txt", 
            "2005.txt", "2006.txt", "2007.txt", "2008.txt", "2009.txt", 
            "2010.txt"};
        
        //this will create a map with each rank being the value and each name being
        //the key, they will be stored in each array list(girl or boy).
        //each spot in the arraylist is a subsequent year.
        for(int i = 0; i < 10; i++)
        {
            try{
                File file = new File(fileNames[i]);
                Map<String, Integer> nMapG = new TreeMap<String, Integer>();
                Map<String, Integer> nMapB = new TreeMap<String, Integer>();
                Scanner fileIn = new Scanner(file);
                
                //read through file and grab each line
                while(fileIn.hasNextLine())
                {
                    //store line
                    String line = fileIn.nextLine();
                    //seperate lines by tabs
                    String[] strArr = line.trim().split("\t");
                    
                    //store rank number
                    int rank = Integer.parseInt(strArr[0]);
                    
                    //store each name respectively to use as values
                    String bName = strArr[1];
                    String gName = strArr[2];
                    
                    //set value and key of boy and girl name
                    nMapG.put(gName.toLowerCase(), rank);
                    nMapB.put(bName.toLowerCase(), rank);
                }
                
                //add the map for that year to each arraylist
                nameMapsB.add(nMapB);
                nameMapsG.add(nMapG);
                
                //catch exception just in case
            }catch(FileNotFoundException ex)
            {
                //default error msg
                System.out.println(ex);
            }
        }
    }
    
    //Checks apropriate map if name is in it, then returns the rank if it is
    public static void printResult(int year, String gen, String name)
    {
        //search boy list
        if(gen.charAt(0) == 'b' || gen.charAt(0) == 'B')
        {
            //get map at apropriate year
            Map<String, Integer> nMap = nameMapsB.get(year - 2001);
            if(nMap.containsKey(name)) //check if name is in list
                System.out.println("That name was ranked at " + 
                        nMap.get(name)); //print rank
            //if name is not on list
            else System.out.println("That name is not on the list.");

            //search girl list
        }else if(gen.charAt(0) == 'g' || gen.charAt(0) == 'G')
        {
            //get map at apropriate year
            Map<String, Integer> nMap = nameMapsG.get(year - 2001);
            if(nMap.containsKey(name)) //check if name is in list
                System.out.println("That name was ranked at " + 
                        nMap.get(name)); //print rank
            //if name is not on list
            else System.out.println("That name is not on the list.");

        }else System.out.println("Invalid input!");//if invalid gender
    }
}
