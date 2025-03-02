package hendys.datastructures.arrays;

public class StaticArray {
    private int[] arr;
    private int length;
    private int capacity;

    // Constructor to initialize the array with a given capacity
    public StaticArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.length = 0;
    }

    // Insert n at the next open position
    public void insertEnd(int n) {
        if (length < capacity) {
            arr[length] = n;
            length++;
        } else {
            System.out.println("Array is full, cannot insert " + n);
        }
    }

    // Remove from the last position if not empty
    public void removeEnd() {
        if (length > 0) {
            arr[length - 1] = 0;
            length--;  
        } else {
            System.out.println("Array is empty, nothing to remove");
        }
    }

    // Insert n at index i, shifting elements right
    public void insertMiddle(int i, int n) {
        if (length >= capacity) {
            System.out.println("Array is full, cannot insert");
            return;
        }
        if (i < 0 || i > length) {
            System.out.println("Invalid index: " + i);
            return;
        }

        for (int index = length - 1; index >= i; index--) {
            arr[index + 1] = arr[index];
        }
        arr[i] = n;
        length++;
    }

    // Remove value at index i, shifting elements left
    public void removeMiddle(int i) {
        if (length == 0) {
            System.out.println("Array is empty, nothing to remove");
            return;
        }
        if (i < 0 || i >= length) {
            System.out.println("Invalid index: " + i);
            return;
        }

        for (int index = i + 1; index < length; index++) {
            arr[index - 1] = arr[index];
        }
        arr[length - 1] = 0;
        length--;
    }

    public void printArr() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        StaticArray sa = new StaticArray(5);
        sa.insertEnd(1);
        sa.insertEnd(2);
        sa.insertEnd(3);
        sa.printArr(); // Should print: 1 2 3
        sa.insertMiddle(1, 4);
        sa.printArr(); // Should print: 1 4 2 3
        sa.removeEnd();
        sa.printArr(); // Should print: 1 4 2
        sa.removeMiddle(1);
        sa.printArr(); // Should print: 1 2
    }
}