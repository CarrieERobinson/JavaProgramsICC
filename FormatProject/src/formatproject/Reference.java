/**
*Program: Format Project
*This: Reference.java
*Author: Carrie Robinson
*Date: 22-Jan-2018
*Purpose: Declares variables for use in extending classes
*/
package formatproject;


public class Reference implements FormatableReference{

    private String author;
    private String title;
    private int datePub;
    
//==========================constructors========================================

    public Reference(String author, String title, int datePub) {
        this.author = author;
        this.title = title;
        this.datePub = datePub;
    }
    
    
//=========================SETTERS AND GETTERS==================================

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDatePub() {
        return datePub;
    }

    public void setDatePub(int datePub) {
        this.datePub = datePub;
    }

    
    
//===================================format functions===========================
    //Will be implemented based on book or jornal
    @Override
    public String formatMLA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String formatAPA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String formatChicago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
