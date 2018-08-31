/**
*Program: State Capitals
*This: StateCapitols.java
*Author: Carrie Robinson
*Date: 13-Nov-2017
*Purpose: To give a quiz on state capitals and print results and wrong answers
* in a file
*/

package statecapitols;
import java.util.*;
import java.io.*;
public class StateCapitols {
    
    public static File file = new File("Results.txt");
    public static Scanner userIn = new Scanner(System.in);
    public static Random myRand = new Random();
    public static void main(String[] args) {
        String[][] statesCaps = {{"Alabama","Alaska","Arizona","Arkansas","California",
            "Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii",
            "Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana",
            "Maine","Maryland","Massachusetts","Michigan","Minnesota",
            "Mississippi","Missouri","Montana","Nebraska","Nevada",
            "New Hampshire","New Jersey","New Mexico","New York","North Carolina",
            "North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island",
            "South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont",
            "Virginia","Washington","West Virginia","Wisconsin","Wyoming"},
            {"Montgomery","Juneau","Phoenix","Little Rock",
            "Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta",
            "Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka",
            "Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing",
            "St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City",
            "Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus",
            "Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre",
            "Nashville","Austin","Salt Lake City","Montpelier","Richmond",
            "Olympia","Charleston","Madison","Cheyenne"}};
        
        ArrayList<String> states = new ArrayList();
        ArrayList<String> capitals = new ArrayList();
        
        //store states an caps into arraylists
        for(int i = 0; i < 50; i++)
        {
            states.add(statesCaps[0][i]);
            capitals.add(statesCaps[1][i]);
//            System.out.println(statesCaps[0][i] + statesCaps[1][i]);
        }
        
        String userName; //store name
        System.out.println("Please enter your name:  ");
        userName = userIn.nextLine();
        
        System.out.println("Enter the capital of each state: ");
        Boolean finished = false; //will tell when to end loop
        
        //try will allow use of printwriter
        try{
            //make the file if it doesn't exist
            if(!file.exists()){
                file.createNewFile();
            }
            PrintWriter pr = new PrintWriter(file);
            pr.println("RESULTS:  " + userName);
            pr.println("WRONG ANSWERS:");
        
        int count = 0; //keep track of question number
        int numCorrect = 0; //keep track of correct answers
        do{
           
            //get number of state/cap in arraylist, reduce by 1 each time
            int question = myRand.nextInt(50 - (count));
            count++; //increment question number
//            System.out.println(question + " LEFT: " + capitals.size());
            //display question & get answer
            System.out.printf("%d. %s: ", count, states.get(question));
            String answer = userIn.nextLine();
            
            
            //check answer and either add 1 to correct count or print wrong answer
            if(checkAnswer(capitals.get(question), answer))
            {
                numCorrect++;
            }else
            {
                //print corrections to file
                pr.println("#" + count + ":\r\n\tYour answer: " + answer + 
                        "\r\n\tCorrect answer: " + capitals.get(question));
            }
            
            //remove question and answer as to not repeat it later
            states.remove(question);
            capitals.remove(question);
            
            //check if all questions have been answered
            if(states.isEmpty() && capitals.isEmpty())
                finished = true;
           
        }while(!finished);
        
        System.out.println("You got: " + numCorrect);
        //print final score to file
        pr.printf("You got %d out of 50 correct!\r\n%d",
                numCorrect, numCorrect*2);
        pr.print(".00%");
        pr.close();
        }catch(IOException ex){
            System.out.println("I dunno what, but something went wrong!");
        }
    }
    
//===============================checkAnswer()==================================
    public static Boolean checkAnswer(String correctAnswer, String userAnswer)
    {
        //Returns true if strings are the same (ignoring case) and false
        //otherwise
        if(correctAnswer.toLowerCase().equals(userAnswer.toLowerCase()))
        {
            return true;
        }else return false;
    }
    
}
