/**
*Program: Linked List Practice
*This: Node.java
*Author: Carrie Robinson, David Anguiano
*Date: 28 February 2018
*Purpose: Node class, declares what a node is
*/
package linkedlistpractice;

public class Node<E> {
    E element;
    Node<E> Next;
    
    public Node(E e)
    {
        element = e;
    }
}
