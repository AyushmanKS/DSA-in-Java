import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {

    static class Edge {
        int src;
        int dest;
        int wt; 

        public Edge(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }

    // Pair class for managing the node and its distance in the priority queue
    static class Pair implements Comparable<Pair> {
        int n;  
        int path; 

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;  // Sort by path (distance)
        }
    }

    // Dijkstra's algorithm
    public static void dijkstra(ArrayList<Edge>[] graph, int src) {
        int dist[] = new int[graph.length];
        
        // Initialize distances to infinity for all nodes except the source node
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean visited[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));  // Add the source node with distance 0

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            int u = curr.n;

            if (visited[u]) continue;  // Skip if already visited

            visited[u] = true;  // Mark the current node as visited

            // Explore all adjacent nodes
            for (int i = 0; i < graph[u].size(); i++) {
                Edge e = graph[u].get(i);
                int v = e.dest; 
                int weight = e.wt;  

                // Relax the edge if a shorter path is found
                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.add(new Pair(v, dist[v]));  // Add the updated node to the priority queue
                }
            }
        }

        System.out.println("Shortest distances from source node " + src + ":");
        for (int i = 0; i < dist.length; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("Node " + i + " is unreachable.");
            } else {
                System.out.println("Node " + i + ": " + dist[i]);
            }
        }
    }

    // Create the graph (with weights)
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges with weights
        graph[0].add(new Edge(0, 3, 1));
        graph[2].add(new Edge(2, 3, 1));

        graph[3].add(new Edge(3, 1, 2));

        graph[4].add(new Edge(4, 0, 3));
        graph[4].add(new Edge(4, 1, 4));

        graph[5].add(new Edge(5, 0, 5));
        graph[5].add(new Edge(5, 2, 6));
    }

    public static void main(String args[]) {
        int V = 6; 
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        dijkstra(graph, 0);
    }
}
