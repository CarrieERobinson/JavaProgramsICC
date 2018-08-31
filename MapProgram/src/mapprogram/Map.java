/**
*Program: Map Program
*This: Map.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 31-Jan-2018
*Purpose: declares a map class with a generic and its functions/vars
*/
package mapprogram;

public class Map<E,Y> 
{
    private Y key; //will store key, an int value
    private E value;//stores the value, I made this a generic so that object
    //types could be added to the map

//==============================Constructor=====================================
    public Map(Y key, E value) {
        this.key = key;
        this.value = value;
    }

//==============================Constructor=====================================
    public Y getKey() {
        return key;
    }

    public void setKey(Y key) {
        this.key = key;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
    
//===========================toString()=========================================
    public String toString()
    {
        return key + "  |  " + value;
    }
}
