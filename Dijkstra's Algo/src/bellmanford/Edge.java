package bellmanford;

public class Edge {

    private Vertex sourceVertex;
    private Vertex destinationNode;
    private int weight;

    public Edge(Vertex sourceVertex, Vertex destinationNode, int weight) {
        this.sourceVertex = sourceVertex;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    public Vertex getSourceVertex() {
        return sourceVertex;
    }

    public void setSourceVertex(Vertex sourceVertex) {
        this.sourceVertex = sourceVertex;
    }

    public Vertex getDestinationNode() {
        return destinationNode;
    }

    public void setDestinationNode(Vertex destinationNode) {
        this.destinationNode = destinationNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" + "sourceVertex=" + sourceVertex + ", destinationNode=" + destinationNode + ", weight=" + weight + '}';
    }


}

