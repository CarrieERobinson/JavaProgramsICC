/**
*Program: File encryption
*This: FileEncryption.java
*Author: Colin Sexton, Carrie Robinson
*Date: Oct. 4, 2017
*Purpose:
          * Encrypts a program by shifting ascii values by 5
**/
package fileencryption;
//-----Imports-----
import java.util.*;
import java.io.*;

public class FileEncryption {
    //Scanner for user input
    public static Scanner userIn = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //will store string to be encrypted
        String userString = "";
        //prompt for paragraph
        System.out.println("Please enter a paragraph:");
        //store user input
        userString = userIn.nextLine();
        //encrypt input
        String encryptedText = encrypt(userString);
        //try to open file
        File file = new File("Encryption.txt");
        if(file.exists())
        {
            //infom that file already exists
            System.out.println("File Already Exists!");
        }
        else //makes new file and adds encrypted message
        {
            try{
                PrintWriter pwt = new PrintWriter(file);
                pwt.print(encryptedText);
                pwt.close();
            }catch(FileNotFoundException ex)//catch exception for file not found
            {
                System.out.println(ex);
            }
        }
    }
    
    public static String encrypt(String userString)
    {
        int asciiCode; //for storing ascii code
        String encryptedString = ""; //store encrypted string
        for(int i = 0; i < userString.length(); i++)
        {
            //conver char to ascii value
            asciiCode = (int) userString.charAt(i);
            //shift 5 in ascii value
            asciiCode = asciiCode + 5;
            //add char value to string
            encryptedString = encryptedString + (char) asciiCode;
        }
        System.out.println(encryptedString);
        //return encrypted message
        return encryptedString;
    }
    
}
