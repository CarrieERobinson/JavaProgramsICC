/**
*Program: Word Sorter
*This: WordSorter.java
*Author: Carrie Robinson
*Date: 15 Nov 2017
*Purpose: Scan file and alphabetize contents, leaving out words that start with
* numbers
*/
package wordsorter;
import java.util.*;
import java.io.*;

public class WordSorter {

    public static Scanner userIn = new Scanner(System.in);
    public static File file = new File("words.txt");
    public static File outFile = new File("sortedWords.txt");
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        try
        {
            //Take text from file
            Scanner fileIn = new Scanner(file);
            
            //Seperate words without beginning w/ nums
            while(fileIn.hasNext())
            {
                StringTokenizer st = new StringTokenizer(fileIn.nextLine());
                while(st.hasMoreTokens())
                {
                    String tk = st.nextToken();
                    if(Character.isAlphabetic(tk.charAt(0)))
                    {
                        wordList.add(tk.toLowerCase());
                    }
                        
                }
                    
            }
            
            
//            //print unsorted
//            for(int i = 0; i < wordList.size(); i++)
//                System.out.println(wordList.get(i));            
            
            //Alphabetize words
            Collections.sort(wordList);
            
            //create output file if it doesn't exist
            if(!outFile.exists())
                outFile.createNewFile();
            
            //printWriter to print to outFile
            PrintWriter pw = new PrintWriter(outFile);
            
            //print and export to outFile sorted
            for(int i = 0; i < wordList.size(); i++)
            {
                System.out.println(wordList.get(i));
                pw.println(wordList.get(i));
            }
            
            //close pw
            pw.close();
            
        }catch(FileNotFoundException ex)
        {
            System.out.println("No file found!");
        }catch(IOException e)
        {
            System.out.println("IO exception occurred while creating output file!");
        }
            
    }
    
}
