import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int color[] = new int[graph.length];

        for (int i = 0; i < color.length; i++) {
            color[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if (color[i] == -1) { // if no color - perform BFS
                q.add(i);
                color[i] = 0; // color the first node

                while (!q.isEmpty()) {
                    int curr = q.remove();

                    for (Edge e : graph[curr]) {
                        if (color[e.dest] == -1) {
                            color[e.dest] = 1 - color[curr];
                            q.add(e.dest);
                        } else if (color[e.dest] == color[curr]) {
                            return false; // Graph is not bipartite
                        }
                    }
                }
            }
        }
        return true;
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));

        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
        int V = 5;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        if (isBipartite(graph)) {
            System.out.println("The graph is Bipartite");
        } else {
            System.out.println("The graph is NOT Bipartite");
        }
    }
}
