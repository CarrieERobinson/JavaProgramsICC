/**
*Program: PADwelling
*This: PADwelling.java
*Author: Carrie Robinson
*Date: 23-Oct-2017
*Purpose: test client for RentableDwelling class and ApartmentHouse class
*/
package padwelling;

public class PADwelling {
    public static void main(String[] args) {
        ApartmentHouse myApt = new ApartmentHouse(230.00, 12);
        System.out.printf("Rent: $%.2f\nApartment Units: %d\nRental Income: $%.2f\n",
                myApt.getRentPerUnit(), myApt.getNumberOfApartments(),
                myApt.getRentalIncome());
    }
    
}
