/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

/**
 *
 * @author Carrie
 */
public class GraphProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Edge e1 = new Edge(1, 0);
        Edge e2 = new Edge(5, 0);
        Edge e3 = new Edge(1, 3);
        Edge e4 = new Edge(1, 2);
        Edge e5 = new Edge(2, 0);
        Edge e6 = new Edge(1, 4);
        Edge e7 = new Edge(4, 3);
        
        Edge[] e = {e1,e2,e3,e4,e5,e6,e7};
        
        UnweightedGraph ug = new UnweightedGraph(6, e);
        ug.print();
    }
    
}
