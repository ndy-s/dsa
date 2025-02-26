package hendys.datastructures.avltrees;

public class AVLTreesApp {
    public static void main(String[] args) {
        var tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);

        System.out.println("Is AVL Tree balanced? " + tree.isBalanced());
        System.out.println("Is AVL Tree perfect? " + tree.isPerfect());
    }
}
