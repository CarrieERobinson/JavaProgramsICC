/**
*Program: Map Heirarchy Proj
*This: MyMap.java
*Author: Carrie Robinson, Brett Bonn, David Anguiano
*Date: 14 February 2018
*Purpose: Making our own HashMap
*/
package mapheirarchyproj;

public interface MyMap <V,K> {
    public void clear();
    public boolean containsKey(Object key);
    public boolean containsValue(Object value);
    public V get(Object key);
    public V put(K key, V value);
    public V remove(Object key);
    public int size();
}
