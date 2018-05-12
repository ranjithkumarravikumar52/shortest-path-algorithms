package dijkstras;

import java.util.ArrayList;
import java.util.List;

public class Vertex implements Comparable<Vertex>{
    private String nameOfTheVertex; 
    private List<Edge> edgeList; 
    private List<Vertex> neighborsList;  
    private int minimumDistance; 
    private Vertex predecessorVertex;
    private boolean isVisited; 
    
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

    public String getNameOfTheVertex() {
        return nameOfTheVertex;
    }

    public void setNameOfTheVertex(String nameOfTheVertex) {
        this.nameOfTheVertex = nameOfTheVertex;
    } 

    public List<Vertex> getNeighborsList() {
        return neighborsList;
    }

    public void setNeighborsList(List<Vertex> neighborsList) {
        this.neighborsList = neighborsList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Integer.compare(this.minimumDistance, otherVertex.getMinimumDistance());
    }

    public boolean isIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    @Override
    public String toString() {
        return "Vertex{" + "nameOfTheVertex=" + nameOfTheVertex + ", minimumDistance=" + minimumDistance + ", predecessorVertex=" + predecessorVertex + '}';
    }


    
    
    
    
    
    
    
    
    
}
