/**
*Program: Linked List Practice
*This: LinkedList.java
*Author: Carrie Robinson
*Date: 5 March 2018
*Purpose: Linked list class, declares functions of linked list
*/
package linkedlistmaxmin;
import java.util.*;

public class LinkedList {
    private Node<Integer> head = null;
    private Node<Integer> tail = null;
    private int size = 0;
    private int min;
    private int max;
    
    public void addFirst(Integer e)
    {
        Node<Integer> newNode = new Node(e);

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
        Node<Integer> current = head;
        while(current != null)
        {
            System.out.println(current.element);
            current = current.Next;
        }
    }

    public void addLast(Integer e)
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

    public void add(int index, Integer e)
    {
        if(index == 0)
            addFirst(e);
        else if(index >= size)
            addLast(e);
        else
        {
            Node<Integer> current = head;
            for(int i = 1; i < index; i++)
                current = current.Next;

            Node<Integer> temp = current.Next;
            current.Next = new Node<>(e);
            (current.Next).Next = temp;
            size++;
        }
        
    }

    public Integer removeLast()
    {
        if(size == 0)
           return null;
        else if(size == 1)
        {
            Node<Integer> temp = head;
            head = null;
            tail = null;
            size = 0;
            return temp.element;
        }
        else
        {
            Node<Integer> current = head;
            for(int i = 0; i < size - 2; i++)
                current = current.Next;
            Node<Integer> temp = tail;
            tail = current;
            tail.Next = null;
            size--;
            return temp.element;
        }

    }

    public Integer remove(int index)
    {
        if(index < 0 || index > size)
            return null;
        else if(index == 0)
        {
            Node<Integer> temp = head;
            head = head.Next;
            size--;
            return temp.element;
        }
        else
        {
            Node<Integer> current = head;

            for(int i = 0; i < index - 1; i++)
              current = current.Next;

            if(current.Next == null)
            {
                return removeLast();
            }
            else
            {
                Node<Integer> removedNode = current.Next;
                Node<Integer> temp = (current.Next).Next;
                current.Next = temp;
                size--;
                return removedNode.element;
            }
        }
    }

    public Integer removeElement(Integer e)
    {
        //Will search through nodes to find the one containing the element and
        //removes that node
        Node<Integer> current = head; //start at head
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
    
    public Integer returnMax()
    {
        //will search nodes and return max value
        Integer tempMax = head.element; //start at head
        Node<Integer> current = head; //store current node
        while(current.Next != null) //continue until end of list
        {
            //go to next node
            current = current.Next;
            if(current.element > tempMax)
            {
                //update tempMax
                tempMax = current.element;
            }
        }
        max = tempMax;
        return tempMax;
    }
    
    
    
    public Integer returnMin()
    {
        //will search nodes and return min value
        Integer tempMin = head.element; //start at head
        Node<Integer> current = head; //store current node
        
        while(current.Next != null) //continue until end of list
        {
            //go to next node
            current = current.Next;
            if(current.element < tempMin)
            {
                //update tempMin
                tempMin = current.element;
            }
        }
        current = head;
        int index = 0;
        while(current.element != tempMin)
        {
            current = current.Next;
            index++;
        }
        
        System.out.println("Min: " + tempMin);
        
        if(tempMin > 100)
        {
            swap(tempMin, returnMax());
        }
        else
        {
            removeElement(tempMin);
            tempMin+=10;
            add(index + 1, tempMin);
        }
        min = tempMin;
        return tempMin;
    }
    
    public Integer swap(Integer e1, Integer e2)
    {
        //will swap 2 elements by their element
        Node<Integer> current = head;
        int e1Ind = 0;
        int e2Ind = 0;
        
        while(current.element != e1)
        {
            e1Ind++;
            current = current.Next;
            if(current.Next == null)
                return null;
        }
        
        current = head;
        while(current.element != e2)
        {
            e2Ind++;
            current = current.Next;
            if(current.Next == null)
                return null;
        }
        
        remove(e1Ind);
        remove(e2Ind);
        add(e1Ind, e2);
        add(e2Ind, e1);
        
        return 1;
    }
    
    public Integer addMinMax()
    {
        int sum = max + min;
        Random rand = new Random();
        int index = rand.nextInt(size);
        add(index, sum);
        return sum;
    }
}

