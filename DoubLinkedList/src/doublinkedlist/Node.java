/**
*Program: Doubly Linked List
*This: Node.java
*Author: Carrie Robinson
*Date: 21-Mar-2018
*Purpose: Define Node class
*/
package doublinkedlist;

public class Node<E> {
    E element;
    Node<E> Previous;
    Node<E> Next;
    
    public Node(E e)
    {
        element = e;
    }
}
