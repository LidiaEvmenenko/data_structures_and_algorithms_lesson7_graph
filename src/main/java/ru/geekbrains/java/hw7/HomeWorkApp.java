package ru.geekbrains.java.hw7;

public class HomeWorkApp {

    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 7);
        graph.addEdge(0, 9);
        graph.addEdge(1, 7);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 7);
        graph.addEdge(5, 9);
        graph.addEdge(6, 8);
        graph.addEdge(6, 9);
        graph.addEdge(7, 9);

        BreadthFirstPath dfp = new BreadthFirstPath(graph, 0);
        System.out.println(dfp.pathTo(6));

    }

}
