/**
*Program: PADwelling
*This: RentableDwelling.java
*Author: Carrie Robinson
*Date: 23-Oct-2017
*Purpose: RentableDwelling class to define RentableDwelling as abstract
*/
package padwelling;

abstract public class RentableDwelling {
    private double rentPerUnit;
    
    public RentableDwelling(double rentPerUnit)
    {
        this.rentPerUnit = rentPerUnit;
    }
    
    public double getRentPerUnit()
    {
        return this.rentPerUnit;
    }
    
    public double getRentalIncome;
}
