package bstproject;

/**
*Program: BST Project
*This: Tree.java
*Author: Carrie Robinson
*Date: 16-Apr-2018
*Purpose: Interface for tree object classes
*/

public interface Tree<E> {
    public boolean search(E e); //returns true if element is in tree
    public boolean insert(E e); //inserts new element into tree
    public boolean delete(E e); //find and remove element from tree
    
    public void inorder(); //display nodes in order
}
