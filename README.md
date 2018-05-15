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
    * Edge - weight should contain only non-zero positive values
    * Vertex
    * Graph - contains Dijkstra's algorithm method


### Bellman-Ford's Algorithm
* Slower than Dijkstra's but more robust; since this can handle negative weights
* Run time O(V*E)
* Relaxes all the edges at the same time for atmost **V - 1** iteration, whereas Dijkstra does **one-edge** at a time
  * In other, there is at most V-1 edges from a source to any other node in the Graph
* Negative edge weights can be used in some arbitrary financial situations (risk-less money) like stock markets and Forex prices

#### PsuedoCode
* Initialization Phase:
  * Set the distance of source to 0
  * other vertices distances to INF
* for at most |V-1| times, repeat
  * for all e = edges(u,v) (read as from (u) to (v))
  * update(e)
* update(u, v):
  * distance(v) = min{distance(v), distance(u) + edge-weight(u,v)}
