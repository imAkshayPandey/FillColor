
package GraphClouring;

import java.util.HashMap;
import java.util.LinkedList;


public class Graph {
    int times=0;
    int V;   
    int a[]=new int[V];

    
    String paraColor="";
    LinkedList<HashMap<Integer,String>> adjListArray[];
    
    
    Graph(int V){
        this.V = V;
        adjListArray = new LinkedList[V];
        for(int i=0;i<V;i++){
            adjListArray[i] = new LinkedList<>();
        }
    }
    String Color(){
    String[] color={"Red","Yellow","Green","Blue","White"};
    
       
            this.paraColor=color[times];
        
     return this.paraColor;   
    }

    
    void addEgde(Graph graph,int src, int dest){
        
        HashMap<Integer,String> hashmap=new HashMap<>();
       // if(graph.adjListArray[dest].){
       this.times=dest;
            hashmap.put(dest,Color());
            graph.adjListArray[src].addLast(hashmap);
            this.times=src;
            hashmap.put(src, Color());
            graph.adjListArray[dest].addLast(hashmap);
        }
        //}//
    
    void printGraph(Graph graph){
       for(int v = 0; v < graph.V; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(HashMap<Integer,String> pCrawl: graph.adjListArray[v]){
                System.out.print(" -> "+pCrawl);
                
            }
            System.out.println("\n");
        }  
    }
}
