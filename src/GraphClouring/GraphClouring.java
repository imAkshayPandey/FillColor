
package GraphClouring;


public class GraphClouring {

    
    public static void main(String[] args) {
         
     int V=5;
     Graph graph = new Graph(V);
     graph.addEgde(graph, 0, 1);
     graph.addEgde(graph, 0, 2);
     
     
     graph.addEgde(graph, 3, 4);
 
//     graph.addEgde(graph, 2, 1);
     graph.addEgde(graph, 2, 3);
   //  graph.addEgde(graph, 2, 4);
//     graph.addEgde(graph, 2, 5);
//     graph.addEgde(graph, 3, 1);
//     graph.addEgde(graph, 3, 2);
//     graph.addEgde(graph, 3, 4);
//     graph.addEgde(graph, 4, 2);
//     graph.addEgde(graph, 4, 3);
//     graph.addEgde(graph, 4, 5);
//     graph.addEgde(graph, 5, 2);
//     graph.addEgde(graph, 5, 4);
     System.out.println(graph.adjListArray[0]);
     graph.printGraph(graph);
    }
    
}
