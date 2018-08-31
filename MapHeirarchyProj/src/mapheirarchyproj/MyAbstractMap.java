/**
*Program: Map Heirarchy Proj
*This: MyMap.java
*Author: Carrie Robinson, Brett Bonn, David Anguiano
*Date: 14 February 2018
*Purpose: Making our own HashMap
*/
package mapheirarchyproj;

import java.util.ArrayList;

public class MyAbstractMap<K,V> implements MyMap{
    private ArrayList<K> keys;
    private ArrayList<V> values;
    private int initialCapacity;
    private float loadFactor;
    
    public MyAbstractMap()
    {
        keys = new ArrayList<K>(initialCapacity);
        values = new ArrayList<V>(initialCapacity);
        
    }

    @Override
    public void clear() {
        keys.removeAll(keys);
        values.removeAll(values);
    }

    @Override
    public boolean containsKey(Object key) {
        if(keys.contains(key))
            return true;
        else return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if(values.contains(value))
            return true;
        else return false;
    }

    @Override
    public Object get(Object key) {
        for(int i = 0; i < keys.size(); i++)
        {
            if(keys.get(i) == key)
            {
                return values.get(i);
            }
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        
        if(keys.size() >= (loadFactor * this.initialCapacity))
        {
            initialCapacity*=2;
        }
        
        keys.add((K)key);
        values.add((V)value);
        return value;
    }

    @Override
    public Object remove(Object key) {
        for(int i = 0; i < keys.size(); i++)
        {
            if(keys.get(i) == key)
            {
                Object temp = values.get(i);
                keys.remove(i);
                values.remove(i);
                return temp;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return keys.size();
    }

    public ArrayList<K> getKeys() {
        return keys;
    }

    public void setKeys(ArrayList<K> keys) {
        this.keys = keys;
    }

    public ArrayList<V> getValues() {
        return values;
    }

    public void setValues(ArrayList<V> values) {
        this.values = values;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    public void setInitialCapacity(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public float getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(float loadFactor) {
        this.loadFactor = loadFactor;
    }
    
    
    
}
