import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private final int MAX_VERTS = 10;
    private Vertex vertexArray[];
    private int adjMatrix[][];
    private int nVerts;
    private Stack<Integer> stack;

    public Graph() {
        this.vertexArray = new Vertex[MAX_VERTS];
        this.adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                this.adjMatrix[i][j] = 0;
            }
        }
        this.stack = new Stack<>();
    }

    public void addVertex(char label) {
        this.vertexArray[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        this.adjMatrix[start][end] = 1;
        this.adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(this.vertexArray[v].getLabel());
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMatrix[v][i] != 0 && !vertexArray[i].isWasVisited()) {
                return i;
            }
        }
        return -1;
    }

    public void DepthFirstSearch() {
        Stack<Integer> stack = new Stack<>();
        vertexArray[0].setWasVisited(true);
        displayVertex(0);
        stack.push(0);
        while(!stack.isEmpty()) {
            int v = getAdjUnvisitedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            }
            else {
                vertexArray[v].setWasVisited(true);
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < nVerts; i++)
            vertexArray[i].setWasVisited(false);

    }

    public void BreadFirstSearch() {
        vertexArray[0].setWasVisited(true);
        displayVertex(0);
        Queue<Integer> queue = new PriorityQueue<>();
        int v2;
        queue.add(0);
        while(!queue.isEmpty()) {
            int v = queue.remove();
            while ((v2 = getAdjUnvisitedVertex(v)) != -1) {
                vertexArray[v2].setWasVisited(true);
                displayVertex(v2);
                queue.add(v2);
            }
        }
        for (int i = 0; i < nVerts; i++)
            vertexArray[i].setWasVisited(false);
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addVertex('F'); //5
        graph.addVertex('G'); //6

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,4);
        graph.addEdge(3,5);
        graph.addEdge(5,6);

        System.out.println("Visits: ");
        graph.DepthFirstSearch();
        graph.BreadFirstSearch();
    }

}