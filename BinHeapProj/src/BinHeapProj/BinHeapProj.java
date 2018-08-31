/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinHeapProj;

import java.util.ArrayList;

public class BinHeapProj {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList();
        list.add(10);
        list.add(1);
        list.add(45);
        list.add(22);
        list.add(0);
        list.add(12);
        list.add(23);
        
        BinaryHeap heap = new BinaryHeap(list);
        heap.print();
        
    }

}
