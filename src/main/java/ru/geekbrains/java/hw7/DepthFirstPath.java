package ru.geekbrains.java.hw7;

import java.util.LinkedList;

public class DepthFirstPath extends FindFirstPath{

    public DepthFirstPath(Graph g, int source) {
        super(g, source);
        dfp(g, source);
    }

    private void dfp(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfp(g, w);
            }
        }
    }

}
