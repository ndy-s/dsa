package hendys.datastructures.arrays;

public class DynamicArray {
    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArray() {
        capacity = 2;
        length = 0;
        arr = new int[capacity];
    }

    public void pushBack(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void popBack() {
        if (length > 0) {
            length--;
            arr[length] = 0;
        }
    }

    public int get(int i) {
        if (i >= 0 && i < length) {
            return arr[i];
        }

        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds for length " + length);
    }

    public void insert(int i, int n) {
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException("Index " + i + " is invalid for length " + length);
        }

        if (length == capacity) {
            resize();
        }

        for (int j = length; j > i; j--) {
            arr[j] = arr[j - 1];
        }

        arr[i] = n;
        length++;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Getter for capacity (useful for debugging)
    public int getCapacity() {
        return capacity;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.pushBack(1);
        da.pushBack(2);
        da.pushBack(3);
        da.print();

        da.popBack();
        da.print();

        da.insert(0, 4);
        da.print();
    }
}
