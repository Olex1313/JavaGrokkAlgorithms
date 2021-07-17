import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static Boolean search(BinaryTree tree, Integer value) {
        Queue<Node> q = new LinkedList<>();
        q.add(tree.root);
        while (!q.isEmpty()) {
            Node tmp = q.remove();
            if (tmp.value == value)
                return true;
            if (tmp.left != null)
                q.add(tmp.left);
            if (tmp.right != null)
                q.add(tmp.right);
        }
        return false;
    }


    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node (4);
        tree.root.right = new Node(5);
        tree.root.right.left = new Node(6);
        System.out.printf(Boolean.toString(BreadthFirstSearch.search(tree, 1)));
    }
}
