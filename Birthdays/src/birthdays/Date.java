/**
*Program: Birthdays
*This: Date.java
*Author: Carrie Robinson, Colin Sexton
*Date: 6-Dec-2017
*Purpose: This is just a simple date class, stores month, day, and year attributes
* and has a toString for printing
*/
package birthdays;

/**
 *
 * @author Carrie
 */
public class Date{    
   public String month; 
   public String day; 
   public String year; 
  
   public Date(String m, String d, String y)
   { 
   month=m;
   day=d;
   year=y; 
  } 
   
   @Override
   public String toString()
   {
       return(month + "/" + day + "/" + year);
               
   }
} 

