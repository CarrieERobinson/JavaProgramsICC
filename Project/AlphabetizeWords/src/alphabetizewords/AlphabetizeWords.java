/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabetizewords;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;
import java.io.File;
import java.io.FileNotFoundException;

public class AlphabetizeWords 
{
    public static void main(String[] args) throws FileNotFoundException // Throws exception is file DNE
    {
        File file = new File("dictionary.txt"); // Declares file to read from
        Scanner file_in = new Scanner(file); // Scanner to read in file data
        LinkedList<String> list = new LinkedList<>(); // LinkedList to store file data into for sorting
        
        // Read until there are no more lines to read
        while(file_in.hasNextLine())
        {
            String word = file_in.next(); // Set word to the next value
            Collections.addAll(list, word); // Adds word to LinkedList list
        }
        
        System.out.print(list + "\n"); // Prints out words in text document order
        
        Collections.sort(list); // Puts documented words in alphabetical order
        
        System.out.print(list + "\n"); // Prints out words in alphabetical order
    }
    
}
