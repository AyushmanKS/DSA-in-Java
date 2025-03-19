// uses DFS
// only for directed - Acyclic graphs

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph) {
        boolean []visited = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++) {
            if(visited[i] == false) {
                topSortUtil(graph, visited, i, s);
            }
        }

        while(!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, Stack<Integer> s) {
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if(visited[e.dest] == false) {
                topSortUtil(graph, visited, e.dest, s);
            }
        }
        s.push(curr);
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void main(String args[]) {
        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        topologicalSort(graph);
    }
}
