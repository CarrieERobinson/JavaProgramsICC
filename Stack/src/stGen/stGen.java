/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stGen;
public class stGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(432);
        
        Stack<String> st1 = new Stack<>();
        st1.push("Welcome");
        
        System.out.println(st1.pop());
        System.out.println(st.pop() + " " + st.pop());
    }
    
}
