/**
*Program: Java KeyWord Finder
*This: JavaKeywordFinder.java
*Author: Carrie Robinson, Colin Sexton
*Date: 8 November 2017
*Purpose: Scan file for library of keywords and display in reverse alphabetical
*/
package javakeywordfinder;
import java.util.*;
import java.io.*;

public class JavaKeywordFinder {
    public static File file = new File("Code.txt");

    public static void main(String[] args) {
        
        
        ArrayList<String> keyWords = new ArrayList();
        String[] listOfKeyWords = {"if", "for", "while", "int", "public", "private",
                "else", "char", "new", "Integer", "double", "File", "Scanner",
                "class", "static", "do"};
        
        for(int i = 0; i < listOfKeyWords.length; i++)
        {
            keyWords.add(listOfKeyWords[i]);
        }
        
        LinkedList<String> list = new LinkedList<>();
        list.addAll(searchFile(keyWords));
        
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
    
    public static LinkedList<String> searchFile(ArrayList keyWords)
    {
        LinkedList<String> list = new LinkedList<>();
        String line = "";
        
        
        try{
            Scanner fileIn = new Scanner(file);
            while(fileIn.hasNextLine())
            {
                ArrayList<String> words = new ArrayList();
                line = fileIn.nextLine();
                System.out.println(line);
                int startInd = 0;
                for(int i = 0; i < line.length(); i++)
                {
                    if(line.charAt(i) == ' ')
                    {
                        words.add(line.substring(startInd, i));
                        startInd = i;
                    }
                }
               for(int i = 0; i < keyWords.size(); i++)
                    for(int j = 0; j < words.size(); j++)
                    {
                        if((words.get(j).contains((String)keyWords.get(i))))
                        {
                           //add keyWord at i to linkedList in order
                            String lcString = keyWords.get(i).toString();
                            lcString = lcString.toLowerCase();
                            addToList(lcString, list);
                            //edit to find all keywords in line 
                        }
                        
                    }
                }
        } catch(FileNotFoundException ex)
        {
            System.out.println("File not found!");
        }
        return list;
    }
    
    public static <String extends Comparable<String>> LinkedList<String> addToList(String keyWord, LinkedList list)
    {
        
        for(int i = 0; i < list.size(); i++)
        {
            if(!(keyWord.compareTo((String) list.get(i)) < 0))
            {
                list.add(i, keyWord);
                return list;
            }
        }
        list.addLast(keyWord);
        return list;
    }
    
}
