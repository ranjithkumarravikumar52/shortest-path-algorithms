package bellmanford;

public class App {

    public static void main(String[] args) {
        Vertex S = new Vertex("S");
        Vertex A = new Vertex("A");
        Vertex B = new Vertex("B");
        Vertex C = new Vertex("C");
        Vertex D = new Vertex("D");
        Vertex E = new Vertex("E");

        S.addNeighbor(E);
        S.addNeighbor(A);

        A.addNeighbor(C);

        B.addNeighbor(A);

        C.addNeighbor(B);

        D.addNeighbor(A);
        D.addNeighbor(C);

        E.addNeighbor(D);

        S.addEdge(new Edge(S, A, 10));
        S.addEdge(new Edge(S, E, 8));

        A.addEdge(new Edge(A, C, 2));

        B.addEdge(new Edge(B, A, 1));

        C.addEdge(new Edge(C, B, -2));

        D.addEdge(new Edge(D, A, -4));
        D.addEdge(new Edge(D, C, -1));

        E.addEdge(new Edge(E, D, 1));

        Graph graph = new Graph();
        graph.addVerticesToTheGraph(S);
        graph.addVerticesToTheGraph(A);
        graph.addVerticesToTheGraph(B);
        graph.addVerticesToTheGraph(C);
        graph.addVerticesToTheGraph(D);
        graph.addVerticesToTheGraph(E);

        graph.doBellManFordAlgorithm(S);


    }
}
