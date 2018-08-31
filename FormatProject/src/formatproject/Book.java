/**
*Program: Format Project
*This: Book.java
*Author: Carrie Robinson
*Date: 22-Jan-2018
*Purpose: Formatting for books
*/
package formatproject;

import java.util.Date;

public class Book extends Reference{
    private String publisher;
    private String city;
    private String state;
    private String country;
    
//=============================constructor======================================

    public Book(String publisher, String city, String state, String country, String author, String title, int datePub) {
        super(author, title, datePub);
        this.publisher = publisher;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    
//=========================getters and setters==================================

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//==============================Format methods==================================
    //Each will return a formatted string
    @Override
    public String formatChicago() {
        return (this.getAuthor() + ", " + this.getTitle() + " (" + city + ", " + 
                state + ", " + country + ": " + publisher + ", " + this.getDatePub()
                + "). ");
    }

    @Override
    public String formatAPA() {
        return (this.getAuthor() + " (" + this.getDatePub() + "). " + this.getTitle()
                + city + ", " + state + ": " + publisher + ".");
    }

    @Override
    public String formatMLA() {
        return (this.getAuthor() + ". " + this.getTitle() + ". " + publisher
                + ", " + this.getDatePub() + ", " + city + ", " + state + ", "
                + country + ".");
    }
    
    
    
}
