package ru.geekbrains.java.hw7;

import java.util.LinkedList;

public class BreadthFirstPath extends FindFirstPath{

    public BreadthFirstPath(Graph g, int source) {
        super(g,source);
        bfp(g, source);
    }

    private void bfp(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
