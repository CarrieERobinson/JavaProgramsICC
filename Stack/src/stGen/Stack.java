/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stGen;


public class Stack<E> 
{
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
    public int getSize()
        {return list.size();}
    
    public void push(E element)
    {
        list.add(element);
    }
    
    public E pop()
    {
        E element = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return element;
    }
    
    
}
