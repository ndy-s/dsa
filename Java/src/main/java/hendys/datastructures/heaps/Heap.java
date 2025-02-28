package hendys.datastructures.heaps;

public class Heap {
    private int[] items = new int[10];
    private int size;

    public void insert(int value) {
        if (isFull()) {
            throw new IllegalStateException("Heap is full");
        }

        items[size++] = value; // 1. store value
        bubbleUp(); // 2. check value by bubble up
    }

    public int remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        int root = items[0];
        items[0] = items[--size]; // 1. reassign the latest row to the root
        items[size] = 0;

        bubbleDown(); // 2. check value by bubble down

        return root;
    }

    private void bubbleUp() {
        int index = size - 1;

        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    private void bubbleDown() {
        int index = 0;

        while (hasLeftChild(index)) {
            int largerChildIndex = largerChildIndex(index);

            if (largerChildIndex == -1 || items[index] >= items[largerChildIndex]) {
                break;
            }

            swap(index, largerChildIndex);
            index = largerChildIndex;

        }
    }

    private void swap(int firstIndex, int secondIndex) {
        var temp = items[firstIndex];
        items[firstIndex] = items[secondIndex];
        items[secondIndex] = temp;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int parentValue(int index) {
        if (index == 0) {
            throw new IllegalStateException("Root node has no parent");
        }

        return items[parentIndex(index)];
    }

    private int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private int leftChildValue(int index) {
        if (!hasLeftChild(index)) {
            throw new IllegalStateException("No left child");
        }

        return items[leftChildIndex(index)];
    }

    private int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private int rightChildValue(int index) {
        if (!hasRightChild(index)) {
            throw new IllegalStateException("No right child");
        }

        return items[rightChildIndex(index)];
    }

    private int largerChildIndex(int index) {
        if (!hasLeftChild(index)) return -1;
        if (!hasRightChild(index)) return leftChildIndex(index);

        return (leftChildValue(index) > rightChildValue(index))
                ? leftChildIndex(index)
                : rightChildIndex(index);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == items.length;
    }

    private boolean isValidParent(int index) {
        if (!hasLeftChild(index)) {
            return true;
        }

        boolean isValid = items[index] >= leftChildValue(index);

        if (hasRightChild(index)) {
            isValid = isValid && items[index] >= rightChildValue(index);
        }

        return isValid;
    }

    private boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

}
