/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AL;
import java.util.ArrayList;
public class AL {

 public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();    
    List<Integer> list2 = new LinkedList<>();
 
    test(list1, "Time for ArrayList is ");
    test(list2, "Time for LinkedList is ");
    } 
 
  public static void test(List<Integer> list, String title) {
  long startTime = System.currentTimeMillis();
 
    for (int i = 0; i < 1000000; i++) {
        list.add(0, i);
         }

    long time = System.currentTimeMillis() - startTime;
      System.out.println(title + time + " milliseconds");
   }
  } 
