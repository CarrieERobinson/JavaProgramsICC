/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

import java.util.Date;

/**
 *
 * @author Carrie
 */
public class HouseClass implements Comparable<HouseClass>{
    private int id;
    private double area;
    private Date built;

    //===========================Setters and getters============================
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Date getBuilt() {
        return built;
    }

    public void setBuilt(Date built) {
        this.built = built;
    }
    //===========================Setters and getters============================
    
    
    @Override
    public int compareTo(HouseClass t) {
        if(area > t.area)
            return 1;
        else return 0;
    }
    
}
