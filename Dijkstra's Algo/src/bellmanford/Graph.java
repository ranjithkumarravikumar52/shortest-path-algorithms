package bellmanford;

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

    public void addVerticesToTheGraph(Vertex newVertex) {
        this.verticesInTheGraph.add(newVertex);
    }

    public void doBellManFordAlgorithm(Vertex sourceVertex) {
        initializationPhase(sourceVertex);
        for (int i = 0; i < this.getVerticesInTheGraph().size() - 1; i++) {
            for (Vertex vertexIndex : this.getVerticesInTheGraph()) {
                for (Edge edgeIndex : vertexIndex.getEdgeList()) {
                    update(edgeIndex, edgeIndex.getSourceVertex(), edgeIndex.getDestinationNode());
                }
            }
            printAllVertices();
        }
    }

    private void printAllVertices() {
        for (Vertex vertexIndex : this.getVerticesInTheGraph()) {
            System.out.print(vertexIndex+" ");
        }
        System.out.println();
    }

    private void update(Edge edgeIndex, Vertex sourceVertex, Vertex destinationNode) {
        double calculatedDistance = Double.min(destinationNode.getDistance(), sourceVertex.getDistance() + edgeIndex.getWeight());
        destinationNode.setDistance(calculatedDistance);
    }

    private void initializationPhase(Vertex sourceVertex) {
        sourceVertex.setDistance(0);
        for (Vertex vertexIndex : this.getVerticesInTheGraph()) {
            if (!vertexIndex.getNameOfTheVertex().equals(sourceVertex.getNameOfTheVertex())) {
                vertexIndex.setDistance(Double.POSITIVE_INFINITY);
            }
        }
    }


}
