/**
*Program: Format Project
*This: formatproject.java
*Author: Carrie Robinson
*Date: 22-Jan-2018
*Purpose: main class to test format classes
*/

package formatproject;

public class FormatProject {

    public static void main(String[] args) {
        
        //instantiate journal and format
        Journal myJ = new Journal("NY Times", 3, 5, 165, "Robert, James", "An Article",
        2017);
        System.out.println("\nAPA Format:");
        System.out.println(myJ.formatAPA());
        System.out.println("\nChicago Format:");
        System.out.println(myJ.formatChicago());
        System.out.println("\nMLA Format:");
        System.out.println(myJ.formatMLA());
        
        //instantiate chapter and format
        Chapter myC = new Chapter("Chicago Business", "Title of Book", 675, "Cool Books",
        "Canton", "Illinois", "USA", "Miller, Kevin", "Chapter 4: A New Hope", 2017 );
        
        System.out.println("\nAPA Format:");
        System.out.println(myC.formatAPA());
        System.out.println("\nChicago Format:");
        System.out.println(myC.formatChicago());
        System.out.println("\nMLA Format:");
        System.out.println(myC.formatMLA());
            
        
    }
    
}
