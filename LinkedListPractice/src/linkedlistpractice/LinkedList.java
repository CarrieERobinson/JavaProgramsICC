/**
*Program: Linked List Practice
*This: LinkedList.java
*Author: Carrie Robinson, David Anguiano
*Date: 28 February 2018
*Purpose: Linked list class, declares functions of linked list
*/
package linkedlistpractice;

public class LinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    
    public void addFirst(E e)
    {
        Node<E> newNode = new Node(e);
        
        newNode.Next = head;
        head = newNode;
        
        if(tail == null)
            tail = head;
        size++;
    }
    
    public int getSize()
    {
        return size;
    }
    
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
    
    public void add(int index, E e)
    {
        if(index == 0)
            addFirst(e);
        else if(index >= size)
            addLast(e);
        else
        {
            Node<E> current = head;
            for(int i = 0; i < index; i++)
                current = current.Next;
            
            Node<E> temp = current.Next;
            current.Next = new Node<>(e);
            (current.Next).Next = temp;
            size++;
        }
    }
    
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
    
    public E remove(int index)
    {
        if(index < 0 || index > size)
            return null;
        else if(index == 0)
        {
            Node<E> temp = head;
            head = head.Next;
            size--;
            return temp.element;
        }
        else
        {
            Node<E> current = head;
            
            for(int i = 0; i < index - 1; i++)
              current = current.Next;
            
            if(current.Next == null)
            {
                return removeLast();
            }
            else
            {
                Node<E> removedNode = current.Next;
                Node<E> temp = (current.Next).Next;
                current.Next = temp;
                size--;
                return removedNode.element;
            }
        }
    }
    
    public E removeElement(E e)
    {
        //Will search through nodes to find the one containing the element and
        //removes that node
        Node<E> current = head; //start at head
        int index = 0;
        while(current.element != e)
        {
            if(current.Next == null)
            {
                System.out.println(e + " is not in the list.");
                return null;
            }
            current = current.Next;
            index++;
        }
        return remove(index);
    }
}
