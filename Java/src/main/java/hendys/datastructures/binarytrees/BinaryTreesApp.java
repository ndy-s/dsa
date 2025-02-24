package hendys.datastructures.binarytrees;

public class BinaryTreesApp {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        System.out.println("Search value: " + tree.search(7));

        System.out.println("PreOrder Traversal");
        tree.traversePreOrder();

        System.out.println("InOrder Traversal");
        tree.traverseInOrder();

        System.out.println("PostOrder Traversal");
        tree.traversePostOrder();

        System.out.println("Height: " + tree.height());
        System.out.println("Min: " + tree.min());
        System.out.println("Min BST: " + tree.minBst());

        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(8);
        tree2.insert(10);
        System.out.println("Is Equals? " + tree.equals(tree2));

        tree.swapRoot();
        System.out.println("Tree is Binary Search Tree? " + tree.isBinarySearchTree());

        System.out.println("Tree at Distance 2");
        var list = tree.getNodeAtDistance(2);
        for (var item : list) {
            System.out.println(item);
        }

        System.out.println("Traverse Level Order");
        tree.traverseLevelOrder();

    }
}
