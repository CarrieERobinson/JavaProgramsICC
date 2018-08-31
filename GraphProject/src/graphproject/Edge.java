/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

public class Edge {
    
    int u;
    int v;
    
    public Edge(int u,int v)
    {
        this.u = u;
        this.v = v;
    } 
    
    public void print()
    {
        System.out.print("(" + u + ", " + v + ")");
    }
    
}
