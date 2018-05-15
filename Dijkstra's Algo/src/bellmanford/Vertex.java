package bellmanford;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private String nameOfTheVertex;
    private List<Edge> edgeList;
    private List<Vertex> neighborsList;
    private double distance;

    public Vertex(String nameOfTheVertex) {
        this.nameOfTheVertex = nameOfTheVertex;
        edgeList = new ArrayList<>();
        neighborsList = new ArrayList<>();
    }

    public void addNeighbor(Vertex newVertex) {
        this.neighborsList.add(newVertex);
    }

    public void addEdge(Edge newEdge) {
        this.edgeList.add(newEdge);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getNameOfTheVertex() {
        return nameOfTheVertex;
    }

    public List<Vertex> getNeighborsList() {
        return neighborsList;
    }

    public List<Edge> getEdgeList() {
        return edgeList;
    }

    @Override
    public String toString() {
        return "{" + "Vertex=" + nameOfTheVertex + ", dist=" + distance + '}';
    }


}

