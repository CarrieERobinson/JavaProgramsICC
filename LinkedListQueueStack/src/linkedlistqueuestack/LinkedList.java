/**
*Program: Linked List Queue and Stack
*This: LinkedList.java
*Author: Carrie Robinson
*Date: 26-Mar-2018
*Purpose: Define methods for linkedlist
*/
package linkedlistqueuestack;

public class LinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    //============================addFirst()====================================
    public void addFirst(E e)
    {
        Node<E> newNode = new Node(e);
        
        newNode.Next = head;
        head = newNode;
        
        if(tail == null)
            tail = head;
        size++;
    }
    
    //===============================print()====================================
    public void print()
    {
        System.out.println("LIST:");
        Node<E> current = head;
        while(current != null)
        {
            System.out.println(current.element);
            current = current.Next;
        }
    }
    
    //============================addLast()=====================================
    public void addLast(E e)
    {
        if(tail == null)
        {
            head = tail = new Node<>(e);
        }
        else
        {
            tail.Next = new Node<>(e);
            tail = tail.Next;
        }
        size++;
    }
    
    //=========================removeLast()=====================================
    public E removeLast()
    {
        if(size == 0)
           return null;
        else if(size == 1)
        {
            Node<E> temp = head;
            head = null;
            tail = null;
            size = 0;
            return temp.element;
        }
        else
        {
            Node<E> current = head;
            for(int i = 0; i < size - 2; i++)
                current = current.Next;
            Node<E> temp = tail;
            tail = current;
            tail.Next = null;
            size--;
            return temp.element;
        }
           
    }
    
    //==========================removeFirst()===================================
    public void removeFirst()
    {
        head = head.Next;
    }
    
    
}
