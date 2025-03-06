import java.util.ArrayList;

public class Graphs {
    
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int  d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<V; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 5));
    }
}