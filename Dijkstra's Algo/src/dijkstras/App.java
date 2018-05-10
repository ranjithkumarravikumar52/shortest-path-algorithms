package dijkstras;

public class App {

    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");
        
        //add edges to vertex 1
        Edge e1 = new Edge(v1, v2, 7);
        Edge e2 = new Edge(v1, v3, 9);
        Edge e3 = new Edge(v1, v6, 14);
        v1.addEdge(e1);
        v1.addEdge(e2);
        v1.addEdge(e3);
        
        //add edges to vertex 2
        Edge e4 = new Edge(v2, v3, 10);
        Edge e5 = new Edge(v2, v4, 11);
        v2.addEdge(e4);
        v2.addEdge(e5);
        
        //add edges to vertex 3
        Edge e6 = new Edge(v3, v6, 2);
        Edge e7 = new Edge(v3, v4, 11);
        v3.addEdge(e6);
        v3.addEdge(e7);
        
        //add edges to vertex 4
        Edge e8 = new Edge(v4, v5, 6);
        v4.addEdge(e8);
        
        //add edges to vertex 5
        Edge e9 = new Edge(v6, v5, 9);
        v6.addEdge(e9);
        
        //Add neighbors - vertex 1
        v1.addNeighbor(v6);
        v1.addNeighbor(v3);
        v1.addNeighbor(v2);
        
        //Add neighbors - vertex 2
        v2.addNeighbor(v3);
        v2.addNeighbor(v4);
        
        //Add neighbors - vertex 3
        v3.addNeighbor(v6);
        v3.addNeighbor(v4);
        
        //Add neighbors - vertex 4
        v4.addNeighbor(v5);
        
        //Add neighbors - vertex 6
        v6.addNeighbor(v5);
        
        Graph graph1 = new Graph();
        graph1.addVerticesToTheGraph(v1);
        graph1.addVerticesToTheGraph(v2);
        graph1.addVerticesToTheGraph(v3);
        graph1.addVerticesToTheGraph(v4);
        graph1.addVerticesToTheGraph(v5);
        graph1.addVerticesToTheGraph(v6);
        
        graph1.findShortestPath(v1);
        
        
        

    }
}
