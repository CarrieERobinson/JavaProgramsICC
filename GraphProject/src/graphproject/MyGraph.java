/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphproject;

import java.util.ArrayList;
import java.util.List;

public class MyGraph extends UnweightedGraph {
    
    public MyGraph()
    {
        super();
        neighbors = new ArrayList<Edge>();
        
    }
    
    public MyGraph(int numVert, Edge[] e)
    {
        super(numVert, e);
    }
    
    public void getConnectedComponents()
    {
//        neighbors = new ArrayList<Edge>();
        for (int i = 0; i < neighbors.size(); i++) {
            List<Edge> current = new ArrayList<>();
            for (int j = 0; j < current.size(); j++) {
                
            }
            
        }
    }
}
