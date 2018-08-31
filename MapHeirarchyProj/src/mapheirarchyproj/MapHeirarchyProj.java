/**
*Program: Map Heirarchy Proj
*This: MyMap.java
*Author: Carrie Robinson, Brett Bonn, David Anguiano
*Date: 14 February 2018
*Purpose: Making our own HashMap
*/
package mapheirarchyproj;

public class MapHeirarchyProj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyHashMap myMappy = new MyHashMap(10, 3/4);
        myMappy.put("Hello", 5);
        myMappy.put("Bye", 3);
        myMappy.put("Java", 4);
        
        System.out.println(myMappy.containsKey("Hello"));
        System.out.println(myMappy.getKeys());
        System.out.println(myMappy.getValues());
        
        myMappy.remove("Bye");
        
        System.out.println(myMappy.getKeys());
        System.out.println(myMappy.getValues());
        
        MyHashMap myMappy2 = new MyHashMap();
        
        myMappy2.put("ICANTSPELL", 10);
        
        System.out.println(myMappy2.getKeys());
        System.out.println(myMappy2.getValues());
        myMappy2.clear();
        
        System.out.println(myMappy2.getKeys());
        System.out.println(myMappy2.getValues());
        
        
        
        
        
    }
    
}
