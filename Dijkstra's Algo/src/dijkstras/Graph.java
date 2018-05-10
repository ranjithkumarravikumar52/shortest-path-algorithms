package dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Vertex> verticesInTheGraph;

    public Graph() {
        this.verticesInTheGraph = new ArrayList<>();
    }
    
    public List<Vertex> getVerticesInTheGraph() {
        return verticesInTheGraph;
    }

    public void setVerticesInTheGraph(List<Vertex> verticesInTheGraph) {
        this.verticesInTheGraph = verticesInTheGraph;
    }
    
    public void addVerticesToTheGraph(Vertex newVertex){
        this.verticesInTheGraph.add(newVertex);
    }
    
    public void findShortestPath(Vertex sourceVertex){
        //implement your dijkstra's algorithm here
    }
}
