package dijkstras;

public class Edge {
    private Vertex sourceNode; 
    private Vertex destinationNode; 
    private int weight; 

    public Edge(Vertex sourceNode, Vertex destinationNode, int weight) {
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    public Vertex getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(Vertex sourceNode) {
        this.sourceNode = sourceNode;
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
        return "Edge{" + "sourceNode=" + sourceNode + ", destinationNode=" + destinationNode + ", weight=" + weight + '}';
    }
    
    
}
