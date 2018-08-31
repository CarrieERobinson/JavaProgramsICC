/**
*Program: Doubly Linked List
*This: DoubLinkedList.java
*Author: Carrie Robinson
*Date: 21-Mar-2018
*Purpose: Test driver
*/
package doublinkedlist;

public class DoubLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        
        //add some to first
        DLL.addFirst(1); 
        DLL.addFirst(7);
        DLL.addFirst(564);
        
        //print
        DLL.print();
        
        //add some to last
        DLL.addLast(126);
        DLL.addLast(16);
        DLL.addLast(1233);
        
        //print
        DLL.print();
        
        //delete first and last elements
        DLL.deleteLast();
        DLL.deleteFirst();
        
        //print foreward and backwards
        DLL.print();
        DLL.revPrint();
    }
    
}
