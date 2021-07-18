public class Solution {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge(0, 1, 3);
        graph.addEdge(0, 2, 5);
        graph.addEdge(0, 3, 7);
        graph.addEdge(1, 4, 6);
        graph.addEdge(2, 4, 4);
        graph.addEdge(2, 3, 3);
        graph.addEdge(3, 5, 3);
        graph.addEdge(4, 6, 6);
        graph.addEdge(5, 6, 4);

        System.out.println("Элементы имеют кратчайшие пути из точки A: ");
        graph.path();
        graph.clean();
    }
}