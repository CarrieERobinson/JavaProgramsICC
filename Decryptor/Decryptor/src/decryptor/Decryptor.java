/**
*Program: Decrypter
*This: Decrypter.java
*Author: Colin Sexton
*Date: Oct. 4, 2017
*Purpose:
          * Decrypts a program using a brute force method
**/

package decryptor;

/* -- Java Imports -- */
import java.util.*;
import java.io.*;

public class Decryptor
{
    // Static all-access Scanner that can be used in any method
    public static Scanner USER_IN = new Scanner(System.in);
    
    /* ---------- Main Method ---------- */
    public static void main(String[] args) throws IOException // Throws IO Exception
    {
        // User prompt to enter in a file that will be decrpyted
        System.out.println("Enter in the file name: ");
        String fileName = USER_IN.next();
        
        // New file to read into the program
        File file = new File(fileName);
        
        // New scanner to read from file
        Scanner file_in = new Scanner(file);
        
        // Reads until the end of the file
        while(file_in.hasNext())
        {
            String fileString = file_in.nextLine(); // Reads file into fileString variable
            decrypt(fileString); // Calls decrypt method and send fileString
        }
        
        file_in.close(); // Closes file input
    }
    
    /* ---------- Decryption Method ---------- */
    public static void decrypt(String fileString)
    {
        int asciiCode = 0; // Holds ASCII
        String decryptedString = ""; // Decrypted message
        
        // Checks each letter of encrypted file
        for(int character = 0; character < fileString.length(); character++)
        {
            asciiCode = (int) fileString.charAt(character); // Turns character into ASCII value - (int) means integer of character
            asciiCode -= 5; // Shifts ASCII value five back
            decryptedString += (char) asciiCode; // Turns ASCII value into new character
        }
        
        System.out.print(decryptedString); // Prints out decrypted file
        
        writeDecryption(decryptedString); // Calls the write to file method
    }
    
    public static void writeDecryption(String decryptedString)
    {
        // New file to read to the program
        File file = new File("Decryption.txt");
        
        // Checks if file exists and proceeds
        if(file.exists())
        {
            System.out.println("File already exists..."); // Sends error message to console
            System.exit(0); // Exists program
        }
        else
        {
            try // Tries method
            {
                // New file writer is instantiated to program
                PrintWriter print = new PrintWriter(file);
                
                print.print(decryptedString); // Prints decrypted message to new file
                
                print.close(); // Closes file writer
            }
            catch(IOException exception) // Catches IO exception
            {
                System.out.println(exception); // Prints IOException to console
            }
        }
    }
}
