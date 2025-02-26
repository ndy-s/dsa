package hendys.datastructures.avltrees;

public class AVLTree {
    private class AVLNode {
        private int value;
        private int height;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "AVLNode [value=" + value + "]";
        }
    }

    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }

        if (value < root.value) {
            root.leftChild = insert(root.leftChild, value);
        } else if (value > root.value) {
            root.rightChild = insert(root.rightChild, value);
        }

        setHeight(root);

        return balance(root);
    }

    private AVLNode balance(AVLNode root) {
        if (isLeftHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0) {
                root.leftChild = rotateLeft(root.leftChild);
            }

            return rotateRight(root);
        } else if (isRightHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0) {
                root.rightChild = rotateRight(root.rightChild);
            }

            return rotateLeft(root);
        }

        return root;
    }

    private AVLNode rotateLeft(AVLNode root) {
        AVLNode newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateRight(AVLNode root) {
        AVLNode newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(AVLNode node) {
        if (node == null) return true;

        if (Math.abs(balanceFactor(node)) > 1) {
            return false;
        }

        return isBalanced(node.leftChild) && isBalanced(node.rightChild);
    }

    public boolean isPerfect() {
        return isPerfect(root);
    }

    private boolean isPerfect(AVLNode node) {
        int height = height(node);
        int size = size(node);

        return size == (int) Math.pow(2, height + 1) - 1;
    }

    private int size(AVLNode root) {
        if (root == null) return 0;
        return 1 + size(root.leftChild) + size(root.rightChild);
    }

    private void setHeight(AVLNode node) {
        node.height = Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private int height(AVLNode node) {
        return (node == null) ? -1 : node.height;
    }
}
