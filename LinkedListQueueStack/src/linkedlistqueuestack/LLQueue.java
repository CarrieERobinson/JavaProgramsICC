/**
*Program: Linked List Queue and Stack
*This: LLQueue.java
*Author: Carrie Robinson
*Date: 26-Mar-2018
*Purpose: Define methods for a linkedlist based queue
*/
package linkedlistqueuestack;

public class LLQueue<E> {
    private LinkedList<E> Queue = new LinkedList<>();
    
    //FIFO, add to last, take from front
    //=============================enqueue()====================================
    public void enqueue(E e)
    {
        Queue.addLast(e);
    }
    
    //=============================dequeue()====================================
    public void dequeue()
    {
        Queue.removeFirst();
    }
    
    //=============================print()======================================
    public void print()
    {
        System.out.println("\nQUEUE:");
        Queue.print();
    }
}
