/**
*Program: Stack Program
*This: StackIn.java
*Author: Carrie Robinson, Colin Sexton, Jacob Ferneau
*Date: 18-Jan-2018
*Purpose: This is the interface for our stack classes. This will contain the
* undefined methods: pop, push, and peek.
*/
package makeastack;

public interface StackIn<T> {
    public T pop();
    public void push(T obj);
    public T peek();
}
