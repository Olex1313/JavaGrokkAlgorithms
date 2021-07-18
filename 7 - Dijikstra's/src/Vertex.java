public class Vertex {
    private char label;
    private boolean isInTree;

    public Vertex(char label) {
        this.label = label;
        this.isInTree = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }

    public boolean isInTree() {
        return isInTree;
    }

    public void setInTree(boolean inTree) {
        isInTree = inTree;
    }
}