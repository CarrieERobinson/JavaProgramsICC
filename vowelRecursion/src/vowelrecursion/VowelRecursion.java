/**
*Program: Vowel Recursion
*This: vowelRecursion.java
*Author: Carrie Robinson
*Date: 16-Oct-2017
*Purpose: This program uses a recursive function to count the number of vowels in
* a string given by the user.
*/
package vowelrecursion;
import java.util.Scanner;

public class VowelRecursion 
{
    public static Scanner userIn = new Scanner(System.in);
//=================================main()=======================================
    public static void main(String[] args) 
    {
        
        System.out.print("Please enter a string:  "); //prompts user for string
        String userString = userIn.nextLine(); //stores string
        int length = userString.length(); //find and store length of string
        //call function to count vowels, pass in string and length - 1 for
        //the index (will start looking for vowels from end of string)
        int vowels = countVowels(userString, length - 1);
        //print results
        System.out.println("I found " + vowels + " vowels in \"" + userString + "\"");
                        
        System.out.println("Good-Bye!");//End of program
    }
    
//================================isVowel()=====================================
    public static boolean isVowel(char letter)
    {
        letter = Character.toLowerCase(letter); //change letter to lower for easy checking
        if(letter == 'a' || letter == 'e' || 
                letter== 'i' || letter == 'o' ||
                letter == 'u') //check vowel conditions
        {
            //System.out.println("Found one!");
            return true; //if vowel, return true
        }
        else
            return false; //not vowel, return false
    }
    
//=============================countVowels()====================================
    public static int countVowels(String userString, int index)
    {
        //System.out.println(userString.charAt(index));
        if(index == 0) //base condition, stops at element 0 of string
        {
            if(isVowel(userString.charAt(index))) //check if element 0 is a vowel
            {
                return 1; //return 1 if vowel
            }
            else
                return 0; //return 0 if not vowel
        }
        else
        {
            //for all other indexes
            if(isVowel(userString.charAt(index)))
                //add 1 to following recursions if vowel
                return 1 + countVowels(userString, index - 1);
            else
                //add 0 to following recursions if not vowel
                return 0 + countVowels(userString, index - 1);

        }
    }
}
