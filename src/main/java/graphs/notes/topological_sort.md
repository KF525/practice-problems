#####Topological Sort:
Given a graph (or perhaps more accurately, a topology) that needs to be sorted into some logical order. Use DFS.

Topological order: Reverse of finishing times of vertices. Visit all vertices in graph and every time a vertex is finished add to stack. Then pop everything off the stack (reverse that previous order) and that is the topological order.

Resources: https://www.youtube.com/watch?v=AfSk24UTFS8
