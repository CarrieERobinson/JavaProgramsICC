/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carrie
 */
public class UnweightedGraph<V> {
    protected List<List<Edge>> neighbors;

//========================Constructors==========================================
    public UnweightedGraph()
    {
        neighbors = new ArrayList<>();
    }
    
    public UnweightedGraph(int numVert, Edge[] e)
    {
        neighbors = new ArrayList<>();
        for(int i = 0; i < numVert; i++) 
        {
            //add edges for each vertice
            List<Edge> edges = new ArrayList<>();
            for (int j = 0; j < e.length; j++) {
                if(e[j].u >= numVert || e[j].v >= numVert)
                {
                    //check for valid edge input
                    System.out.println("Invalid Edge: ");
                    e[j].print();
                }
                else if(e[j].u == i)
                    edges.add(e[j]);
                else if(e[j].v == i)
                {
                    //reverses u and v positions to display current vertex first
                    Edge temp = new Edge(e[j].v, e[j].u);
                    edges.add(temp);
                }
            }
            neighbors.add(edges);
        }
    }
    
    public void print()
    {
        //iterate through vertices
        for (int i = 0; i < neighbors.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            //iterate through and print edges for each vertex
            for (int j = 0; j < neighbors.get(i).size(); j++) {
                neighbors.get(i).get(j).print();
                System.out.print(", ");
            }
            System.out.println("");
            
        }
    }
    
}
