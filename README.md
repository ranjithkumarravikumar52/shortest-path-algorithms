Shortest-path-algorithms
======

### Dijkstra's Algorithm

#### Basic Introduction
* Can handle only positive edge weights (must be greater than zero)
* Can able to construct a shortest path tree in addition to finding a single source shortest path
* Time complexity: O(V * log V + E); where V: vertices and E: edges
* Greedy algorithm: Tries to find the global min with local min
* DS: priority queue OR binary heap (min heap for shortest path)
* Other data structures gives quadratic time complexity

#### Java Code
* Class
    * Edge
    * Vertex
    * Graph
