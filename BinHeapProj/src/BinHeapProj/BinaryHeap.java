/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinHeapProj;

import java.util.ArrayList;

public class BinaryHeap {
    private ArrayList<Integer> heap = new ArrayList();
    
    public BinaryHeap(ArrayList<Integer> list)
    {
        //if i is even then i/2 = parent of i
        for(int i = 0; i < list.size(); i++)
        {
            //check if heap is empty, if so, first element will start as root
            if(heap.isEmpty())
                heap.add(0, list.get(i));
            else //otherwise search for proper place for current element
            {
                int j = 0;
                while(j < i && heap.get(j) > list.get(i))
                {
                    j++;
                }
                heap.add(j, list.get(i));
            }
        }
        
    }
    
    public void print()
    {
        System.out.println("HEAP");
        //simple print statement
        for(int i = 0; i < heap.size(); i++)
        {
            System.out.println(heap.get(i));
        }
    }
    
    
}
