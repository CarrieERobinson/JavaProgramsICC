/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueprog;

/**
 *
 * @author Carrie
 */
public class Queue<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
    
    public int getSize()
        {return list.size();}
    
    public void enqueue(E element)
    {
        list.add(list.size(), element);
    }
    
    public E dequeue()
    {
        java.util.ArrayList<E> tempList = new java.util.ArrayList<E>(list);
        E element = list.get(0);
//        for(int i = 0; i < list.size(); i++)
//        {
//            System.out.println(list.get(i));
//        }
        
        for(int i = getSize() - 2; i >= 0; i--)
        {
            list.add(i, tempList.get(i + 1));
        }
        return element;
    }
}
