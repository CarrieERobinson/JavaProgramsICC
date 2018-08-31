/**
*Program: BST Project
*This: TreeNode.java
*Author: Carrie Robinson
*Date: 16-Apr-2018
*Purpose: class to define TreeNode object
*/
package bstproject;

public class TreeNode<E> {
    E element;
    TreeNode<E> left;
    TreeNode<E> right;
    
    public TreeNode(E o)
    {
        element = o;
    }
}
