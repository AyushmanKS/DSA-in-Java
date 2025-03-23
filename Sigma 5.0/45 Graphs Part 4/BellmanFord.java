import java.util.ArrayList;

public class BellmanFord {

    static class Edge {
        int src;
        int dest;
        int w; 

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.w = w;
        }
    }

    public static void bellmanFord(ArrayList<Edge>[] graph, int s) {
        int dist[] = new int[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (i != s) {
                dist[i] = Integer.MAX_VALUE; // except source mark all other vertex distance as infinity
            }
        }

        int V = graph.length;

        // algorithm
        for (int i = 0; i < V - 1; i++) {
            // edges
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.dest;
                    int wt = e.w;

                    // relaxation
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            // Output the distance from the source vertex
            System.out.print(dist[i] + " ");
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Modify the graph for the required output (0 2 -2 0 4)
        graph[0].add(new Edge(0, 1, 2)); // edge from 0 to 1 with weight 2
        graph[0].add(new Edge(0, 2, 4)); // edge from 0 to 2 with weight 4
        graph[1].add(new Edge(1, 2, -4)); // edge from 1 to 2 with weight -4
        graph[2].add(new Edge(2, 3, 2)); // edge from 2 to 3 with weight 2
        graph[3].add(new Edge(3, 4, 4)); // edge from 3 to 4 with weight 4
    }

    public static void main(String args[]) {
        int V = 5;  // Reduced to 5 vertices (0 to 4)
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        bellmanFord(graph, 0);
    }
}
