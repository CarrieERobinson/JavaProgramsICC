/**
*Program: Format Project
*This: Chapter.java
*Author: Carrie Robinson
*Date: 22-Jan-2018
*Purpose: Formatting for chapters
*/
package formatproject;

import java.util.Date;

public class Chapter extends Book{
    private String editorName;
    private String bookTitle;
    private int pages;
    
//=============================Constructor======================================

    public Chapter(String editorName, String bookTitle, int pages, String publisher, String city, String state, String country, String author, String title, int datePub) {
        super(publisher, city, state, country, author, title, datePub);
        this.editorName = editorName;
        this.bookTitle = bookTitle;
        this.pages = pages;
    }
    
    
//============================getters and setters===============================

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
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
    public String formatChicago() {
        return (this.getAuthor() + ", " + this.getTitle() + " (" + this.getCity() 
                + ", " + this.getState() + ", " + this.getCountry() + ": " + 
                this.getPublisher() + ", " + this.getDatePub()+ "). ");
    }

    @Override
    public String formatAPA() {
        return (this.getAuthor() + " (" + this.getDatePub() + "). " + this.getTitle()
                + this.getCity() + ", " + this.getState() + ": " + 
                this.getPublisher() + ".");
    }

    @Override
    public String formatMLA() {
        return (this.getAuthor() + ". " + this.getTitle() + ". " + bookTitle +
                ", " + editorName + ", " + this.getPublisher()
                + ", " + this.getDatePub() + ", " + this.getCity() + ", " + this.getState() + ", "
                + this.getCountry() + ".");
    }
    
}
