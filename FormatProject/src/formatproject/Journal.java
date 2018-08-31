/**
*Program: Format Project
*This: Journal.java
*Author: Carrie Robinson
*Date: 22-Jan-2018
*Purpose: Formatting for journals
*/
package formatproject;

import java.util.Date;

public class Journal extends Reference{
    private String source;
    private int volume;
    private int number;
    private int pages;
    
//===============================constructors===================================

    public Journal(String source, int volume, int number, int pages, String author, String title, int datePub) {
        super(author, title, datePub);
        this.source = source;
        this.volume = volume;
        this.number = number;
        this.pages = pages;
    }
    
    
//==============================getters and setters=============================

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
//==============================Format methods==================================
    //Each will return a formatted string
    @Override
    public String formatMLA() {
        return(this.getAuthor() + ". " + this.source + ". " + this.getTitle() +
                ", " + volume + ", " + number + ", " + this.getDatePub() + ".");
    }

    @Override
    public String formatAPA() {
        return(this.getAuthor() + " (" + this.getDatePub() + "). " + this.getSource()
                + ". " + this.getTitle() + ", " + volume + "(" + number + "), " + pages + "." );
    }

    @Override
    public String formatChicago() {
        return(this.getAuthor() + ", " + this.getTitle() + " " + this.getSource()
                + " " + volume + " no." + number + " (" + this.getDatePub() + "). " +
                ": " + pages + "." );
    }
    
}
