/**
*Program: BST Project
*This: BST.java
*Author: Carrie Robinson
*Date: 16-Apr-2018
*Purpose: BST class that defines the BST
*/
package bstproject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST<E extends Comparable<E>> implements Tree<E>{
    
    private TreeNode<E> root;
    private int size;
    
    //============================constructor=====================================
    public BST()
    {
        //init size to 0
        size = 0;
    }
    
    //============================insert()======================================
    @Override
    public boolean insert(E e) {
        if(root == null) //if root hasn't been initialized
            root = new TreeNode(e); //new element is root
        else //if root has been initialized
        {
            TreeNode<E> current = root; //start at root
            TreeNode<E> parent = current; //keep track of previous node

            while(current != null)
            {
                if(e.compareTo(current.element) > 0) //new element is greater than current
                {
                    //continue to right node
                    parent = current;
                    current = current.right;
                }
                else if(e.compareTo(current.element) < 0) //new element is less than current
                {
                    //continue to the left node
                    parent = current;
                    current = current.left;
                }
                else //new element is equal to current element, don't add new element
                    return false;
            }
            
            //insert element
            if(e.compareTo(parent.element) > 0) //greater than parent
                parent.right = new TreeNode(e);
            else if(e.compareTo(parent.element) < 0) //less than parent
                parent.left = new TreeNode(e);
        }
        
        size++; //increment size
        return true; //let user know element was added
    }
    
    //============================delete()======================================
    @Override
    public boolean delete(E e) {
        if(root == null) //if root hasn't been initialized
            return false; //nothing to delete
        else //if root has been initialized
        {
            TreeNode<E> current = root; //start at root
            TreeNode<E> parent = current; //keep track of previous node

            while(current != null)
            {
                //element to delete is greater than current
                if(e.compareTo(current.element) > 0) 
                {
                    //continue to right node
                    parent = current;
                    current = current.right;
                }
                //element to delete is less than current
                else if(e.compareTo(current.element) < 0) 
                {
                    //continue to the left node
                    parent = current;
                    current = current.left;
                }
                else //current is the node to delete
                {
                    //find rightmost node
                    TreeNode<E> rightMost = current.left;
                    //keep track of parent of rightmost
                    TreeNode<E> rightMostParent = rightMost;
                    
                    while(rightMost.right != null)
                    {
                        parent = rightMost;
                        rightMost = rightMost.right;
                    }
                    
                    //replace current with rightmost
                    current.element = rightMost.element;
                    //remove rightmost 
                    rightMostParent.right = rightMost.left;
                    
                    size--; //decrease size
                    
                    System.out.println("Element " + e + " deleted from tree");
                    return true; //element was deleted
                }
            }
        }
        System.out.println("Element " + e + " not found!");
        return false;
    }
    
    //============================search()======================================
    @Override
    public boolean search(E element)
    {
        TreeNode<E> current = root; //Begin at root
        while(current != null) //end loop when reach leaf
        {
            //if search value is less than current element value
            if(element.compareTo(current.element) < 0) 
            { //search element will be to right of current
                current = current.left;
            }
            //if search value is greater than current element value
            else if(element.compareTo(current.element) > 0)
            { //search element will be to the right of current element
                current = current.right;
            }
            else //element == current.element, element is found
            {
                System.out.println("Element " + element + " found!");
                return true;
            }
        }
        System.out.println("Element " + element + " not found!");
        return false; //element not found in tree :(
    }

    
    //============================inorder()=====================================
    //displays inorder traversal using a stack
    @Override
    public void inorder() {
        if(root != null)
        {
            System.out.println("INORDER TRAVERSAL");
            //stack to hold nodes as tree is traversed
            Stack<TreeNode> nodes = new Stack<>();

            //index node
            TreeNode<E> current = root;

            while(current != null)
            {
                //push current node onto stack
                nodes.push(current);
                //go left
                current = current.left;
            }

            //if the stack is not empty
            while(nodes.size() > 0)
            {
                //set current to top of stack, start looking for right children
                current = nodes.pop();
                //print results
                System.out.print(current.element + " ");
                
                if(current.right != null)
                {
                    //start traversing to the right
                    current = current.right;
                    nodes.push(current);
                    
                    //follow all the way down the left again
                    while(current.left != null)
                    {
                        current = current.left;
                        nodes.push(current);
                    }
                }
            }
            System.out.println();
        }
        //stack is empty
    }
    

    //============================findMin()=====================================
    public void findMin()
    {
        if(root != null) //tree not empty
        { 
            TreeNode<E> current = root;
            while(current.left != null)
            {
                //go to last left leaf
                current = current.left;
            }
            System.out.println("Minimum Number: " + current.element); //print
        }else System.out.println("Tree is empty!");
    }
    
    public void BFT()
    {
        if(root != null)//tree is not empty
        {
            System.out.println("BREADTH FIRST TRAVERSAL");
            Queue<TreeNode> nodes = new LinkedList<>();
            TreeNode current = root; //start at root
            
            nodes.add(current);
            
            while(!nodes.isEmpty())
            {
                current = nodes.remove(); //dequeue
                System.out.print(current.element + " ");//print elements
                
                //add left and right nodes next to continue down tree
                if(current.left != null)
                    nodes.add(current.left);
                if(current.right != null)
                    nodes.add(current.right);
            }
            System.out.println();
        }
    }
    
}
