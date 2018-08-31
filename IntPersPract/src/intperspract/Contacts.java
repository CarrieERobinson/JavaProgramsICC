/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intperspract;

public class Contacts implements Comparable<Contacts>
{
    private String fName;
    private String lName;
    private String email;
    private String address;
    private String number;
    
    //constructors
    public Contacts(String fName, String lName, String email, String address, String number)
    {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.address = address;
        this.number = number;
        //System.out.println("New contact added: " + fName + " " + lName);
    }
    
//==================================getters=====================================
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
    
    @Override
    public String toString()
    {
        String msg = "Name: " + lName + ", " + fName + "\r\nE-mail: " + email + 
                "\r\nAddress: " + address + "\r\nPhone Number: " + number + "\r\n";
        return msg;
    }

    @Override
    public int compareTo(Contacts t) {
        if(!t.lName.equalsIgnoreCase(this.lName))
           return this.lName.compareToIgnoreCase(t.lName);
        else
            return this.fName.compareToIgnoreCase(t.fName);
   }
}
