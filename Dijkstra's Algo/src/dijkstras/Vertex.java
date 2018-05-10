package dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String nameOfTheVertex; 
    private List<Edge> edgeList; 
    private List<Vertex> neighborsList;  
    private int minimumDistance; 
    private Vertex predecessorVertex;
    
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

    public int getMinimumDistance() {
        return minimumDistance;
    }

    public void setMinimumDistance(int minimumDistance) {
        this.minimumDistance = minimumDistance;
    }

    public Vertex getPredecessorVertex() {
        return predecessorVertex;
    }

    public void setPredecessorVertex(Vertex predecessorVertex) {
        this.predecessorVertex = predecessorVertex;
    }
    
    
    
}
