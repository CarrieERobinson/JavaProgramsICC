/**
*Program: Linked List Queue and Stack
*This: LinkedListQueueStack.java
*Author: Carrie Robinson
*Date: 26-Mar-2018
*Purpose: Test Driver
*/
package linkedlistqueuestack;

public class LinkedListQueueStack {

    public static void main(String[] args) {
        //Make queue and stack
        LLStack<Integer> st = new LLStack();
        LLQueue<Integer> qu = new LLQueue();
        
        //push 3 to stack, pop 1, print
        st.push(5);
        st.push(2);
        st.push(18);
        st.pop();
        
        st.print();
        
        //enqueue 3 to queue, dequeue 1, print
        qu.enqueue(17);
        qu.enqueue(1);
        qu.enqueue(43);
        qu.dequeue();
        
        qu.print();
    }
    
}
