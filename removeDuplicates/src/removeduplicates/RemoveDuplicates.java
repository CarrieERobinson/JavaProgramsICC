/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removeduplicates;
import java.util.*;

public class RemoveDuplicates {

    public static <E> void main(String[] args) 
    {
        ArrayList<String> stringList = new ArrayList<>();
        //Add strings to arrayList
            stringList.add("Test String");
            stringList.add("Carrie");
            stringList.add("CMPSC");
            stringList.add("Test String");
            stringList.add("Test String");
            stringList.add("CMPSC");
            stringList.add("Carrie");
            stringList.add("Test String");

        stringList = removeDuplicates(stringList);
        printList(stringList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList(list.size());
        for (E aList : list) {
            if (!newList.contains(aList))
                newList.add(aList);
        }
        return newList;
    }
    
    public static <E> void printList(ArrayList<E> list)
    {
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
