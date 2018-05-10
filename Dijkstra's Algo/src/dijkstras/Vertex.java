package dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String nameOfTheVertex; 
    private List<Edge> edgeList; 
    private List<Vertex> neighborsList;  

    public Vertex(String nameOfTheVertex) {
        this.nameOfTheVertex = nameOfTheVertex;
        edgeList = new ArrayList<>();
        neighborsList = new ArrayList<>();
    }
    
    public void addNeighbor(Vertex newVertex){
        this.neighborsList.add(newVertex);
    }
    
    public void addEdge(Edge newEdge){
        this.edgeList.add(newEdge);
    }    
    
}
