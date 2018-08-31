/**
*Program: Doubly Linked List
*This: DoublyLinkedList.java
*Author: Carrie Robinson
*Date: 21-Mar-2018
*Purpose: Define DoublyLinkedList class
*/
package doublinkedlist;

public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;
    
    //===========================addFirst()=====================================
    public void addFirst(E e)
    {
        if(size == 0)
            head = tail = new Node<E>(e);
        else{
            Node<E> temp = new Node(e); //make new node to add
            head.Previous = temp; //set node as previous for current head
            temp.Next = head; //make sure that temp links to current head
            head = temp; //set temp as new head
            
        }
        size++;
    }
    
    //===========================addLast()======================================
    public void addLast(E e)
    {
        if(size == 0)
            head = tail = new Node<E>(e);
        else{
            Node<E> temp = new Node<E>(e); //make new node
            temp.Previous = tail; //set tail as prev of new node
            tail.Next = temp; //set new node as next for current tail
            tail = temp; //update tail
        }
        size++;
    }
    
    //===========================print()========================================
    public void print()
    {
        //print list forward
        System.out.println("===============LIST================");
        Node<E> current = head;
        for(int i = 0; i < size; i++)
        {
            System.out.println(current.element);
            current = current.Next;
        }
    }
    
    //===========================revPrint()=====================================
    public void revPrint()
    {
        //print list backward
        System.out.println("=================BACKWARD LIST===================");
        Node<E> current = tail;
        for(int i = 0; i < size; i++)
        {
            System.out.println(current.element);
            current = current.Previous;
        }
    }
    
    //===========================deleteLast()===================================
    public void deleteLast()
    {
        //set tail to second to last
        tail = tail.Previous;
        tail.Next = null; //nullify next pointer
        size--; //reduce size
    }
    
    //===========================deleteFirst()==================================
    public void deleteFirst()
    {
        //set head to next element after head
        head = head.Next;
        head.Previous = null; //set the previous pointer to null
        size--; //reduce size
    }
}
