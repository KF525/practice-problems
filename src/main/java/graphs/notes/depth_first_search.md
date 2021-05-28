#####Depth First Search: 
Like solving for a maze.
Recursively explore the graph, backtracking as necessary, marking what we have visited (breadcrumbs). 
**Not following shortest paths here**

Basic logic:

`//Iterating over the outgoing edges from s
//Will only visit all nodes reachable by s
parent = {s: None} //structure to mark what has been visited
DFS-Visit(V, AdjacencyList, s):
  for v in Adj\[s\]: //iterating over all the
    if v not in parent:
       parent\[v\] = s; // mark as visited
       DFS-Visit(AdjacencyList, v)


//This will handle the case that it is a disconnected graph
//This will find all the different clusters
DFS(V, AdjacencyList:
  parent = {}
  for s in V: //iterating over the choices of s
     if s not in parent:
        parent\[s\] = None;
        DFS-Visit(V, AdjacencyList, s)`

Look at all outgoing edges from vertex s. For each one (v), have we visited this already. If not, mark it as seen, and then visit all of its outgoing edges. **Be careful not to revisit vertices. Each should only be visited up to once.**
Runtime Complexity: O(v + e) vertices + all edges, visit each vertex once, visit each edge connected to a given vertex.

Useful in the way it classifies edges

Resources: https://www.youtube.com/watch?v=AfSk24UTFS8