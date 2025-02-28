package hendys.datastructures.heaps;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Heap sort
        int[] numbers = { 5, 3, 10, 1, 4, 2 };
        var heap = new Heap();

        for (var number : numbers) {
            heap.insert(number);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = heap.remove();
        }

        System.out.println(Arrays.toString(numbers));

        // heapify algorithm
        int[] heapifyNumbers = { 5, 3, 8, 4, 1, 2 };

        MaxHeap.heapify(heapifyNumbers);
        System.out.println(Arrays.toString(heapifyNumbers));
    }
}
