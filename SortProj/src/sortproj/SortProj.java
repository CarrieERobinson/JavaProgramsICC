/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortproj;

/**
 *
 * @author Carrie
 */
public class SortProj {

    
    public static void main(String[] args) {
       
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addLast(23);
        list.addLast(14);
        list.addLast(42);
        list.addLast(9);
        list.addLast(12);
        
        Insertion(list);
        
        list.print();
        
        
    }
 
    public static void Insertion(LinkedList<Integer> list)
    {
        for(int i = 1; i < list.getSize(); i++)
        {
            int current = list.getElement(i);
            int k;
            for (k = i - 1; k  > 0 && list.getElement(k) > current; k--)
            {
                list.add(k-1, list.getElement(k));
            }
            
            list.remove(k+i);
            list.add(k+1, current);
        }
    }
}
