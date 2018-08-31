/**
*Program: Linked List Queue and Stack
*This: Node.java
*Author: Carrie Robinson
*Date: 26-Mar-2018
*Purpose: Define the Node class
*/
package linkedlistqueuestack;

public class Node<E> {
    E element;
    Node Next;
    
    public Node(E e)
    {
        element = e;
    }
}
