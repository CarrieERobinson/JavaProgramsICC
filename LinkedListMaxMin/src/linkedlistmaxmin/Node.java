/**
*Program: Linked List Practice
*This: Node.java
*Author: Carrie Robinson
*Date: 5 March 2018
*Purpose: Declares node class
*/
package linkedlistmaxmin;

/**
 *
 * @author Carrie
 */
public class Node<E> {
    E element;
    Node<E> Next;
    
    public Node(E e)
    {
        element = e;
    }
}
