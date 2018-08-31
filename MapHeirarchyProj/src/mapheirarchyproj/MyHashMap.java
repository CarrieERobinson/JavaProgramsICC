/**
*Program: Map Heirarchy Proj
*This: MyMap.java
*Author: Carrie Robinson, Brett Bonn, David Anguiano
*Date: 14 February 2018
*Purpose: Making our own HashMap
*/
package mapheirarchyproj;

import java.util.ArrayList;
import java.util.HashMap;

public class MyHashMap<K,V> extends MyAbstractMap {
    
    
    public MyHashMap(){
        this.setInitialCapacity(10);
        this.setLoadFactor(3/4);
    }
    public MyHashMap(int initialCapacity, float loadFactor)
    {
        this.setInitialCapacity(initialCapacity);
        this.setLoadFactor(loadFactor);
    }
    
    public MyHashMap(HashMap<? extends K,? extends V> m)
    {
        ArrayList<K> keys = (ArrayList<K>) m.keySet();
        ArrayList<V> values = (ArrayList<V>) m.values();
        
        this.setInitialCapacity(keys.size());
        this.setLoadFactor(3/4);
        this.setKeys(keys);
        this.setValues(values);
    }
}
