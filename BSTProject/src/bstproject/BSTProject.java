/**
*Program: BST Project
*This: BSTProject.java
*Author: Carrie Robinson
*Date: 16-Apr-2018
*Purpose: Test driver
*/
package bstproject;

public class BSTProject {

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        
        //insert ints
        bst.insert(43);
        bst.insert(13);
        bst.insert(47);
        bst.insert(53);
        bst.insert(10);
        bst.insert(11);
        bst.insert(9);
        bst.insert(14);
        
        //print inorder
        bst.inorder();
        System.out.println();
        
        bst.delete(13);
        bst.inorder();
        System.out.println();
        
        bst.delete(43);
        bst.inorder();
        System.out.println();
        
        //search and delete functions
        bst.search(122);
        bst.delete(213);
        bst.search(53);
        
        //find min
        bst.findMin();
        System.out.println();
        //print BFT
        bst.BFT();
    }
    
}
