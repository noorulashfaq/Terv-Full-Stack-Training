public class BinaryTreeTraversal {
    static class Node {
        int item;
        Node left, right;

        public Node(int value) {
            item = value;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree(int key) {
            root = new Node(key);
        }

        BinaryTree() {
            root = null;
        }

        void inOrderTraversal(Node node) {
            if (node == null) {
                return;
            }
            inOrderTraversal(node.left);
            System.out.print(node.item + " -> ");
            inOrderTraversal(node.right);
        }

        void preOrderTraversal(Node node) {
            if (node == null)
                return;
            System.out.print(node.item + " -> ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }

        void postOrderTraversal(Node node) {
            if (node == null)
                return;
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.item + " -> ");
        }

        Node createNode(int value) {
            return new Node(value);
        }

        Node insertLeft(Node node, int value) {
            node.left = createNode(value);
            return node.left;
        }

        Node insertRight(Node node, int value) {
            node.right = createNode(value);
            return node.right;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(23);
        Node root = tree.root;
        tree.insertLeft(root, 12);
        tree.insertRight(root, 9);
        tree.insertLeft(root.left, 5);
        tree.insertRight(root.left, 18);
        tree.insertLeft(root.right, 6);
        tree.insertRight(root.right, 15);
        tree.insertLeft(root.left.left, 2);
        tree.insertRight(root.left.left, 8);
        tree.insertLeft(root.left.right, 17);
        tree.insertRight(root.left.right, 20);

        System.out.println("\nInorder Traversal:");
        tree.inOrderTraversal(root);
        System.out.print("null");

        System.out.println("\nPreorder Traversal:");
        tree.preOrderTraversal(root);
        System.out.print("null");

        System.out.println("\nPostorder Traversal:");
        tree.postOrderTraversal(root);
        System.out.print("null");
    }
}