import java.util.Stack;

public class DijkstrasAlgorithm {
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
            this.stack = new Stack<Integer>();
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

        public void DepthFirstSearch() {

        }


    }

    public class Vertex {
        private char label;
        private boolean wasVisited;

        public Vertex(final char label) {
            this.label = label;
            this.wasVisited = false;
        }

        public char getLabel() {
            return this.label;
        }

        public boolean isWasVisited() {
            return this.wasVisited;
        }

        public void setWasVisited(final boolean wasVisited) {
            this.wasVisited = wasVisited;
        }
    }
}
