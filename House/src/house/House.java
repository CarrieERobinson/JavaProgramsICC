/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Carrie
 */
public class House {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HouseClass myHouse = new HouseClass();
        HouseClass yourHouse = new HouseClass();
        
        myHouse.setId(1);
        yourHouse.setId(2);
        
        myHouse.setArea(2000);
        yourHouse.setArea(1230);
        
        if(myHouse.compareTo(yourHouse) > 0)
        {
            System.out.println("My house is bigger than yours!");
        }else
            System.out.println("Who cares which one of us has the bigger house?");

    }
    
}
