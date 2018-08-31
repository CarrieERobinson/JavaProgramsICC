/**
*Program: PADwelling
*This: ApartmentHouse.java
*Author: Carrie Robinson
*Date: 23-Oct-2017
*Purpose: ApartmentHouse class to define AparmentHouse
*/
package padwelling;

public class ApartmentHouse extends RentableDwelling{
    private int numberOfApartments;
    
    public ApartmentHouse(double rent, int numberOfApartments)
    {
        super(rent);
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }
    
    public double getRentalIncome()
    {
        return numberOfApartments * getRentPerUnit();
    }
}
