package hendys.algorithms.searching;

import java.util.Arrays;

public class SearchApp {
    public static void main(String[] args) {
        int[] numbers = { 7, 1, 3, 6, 5 };

        // Linear search
        LinearSearch linearSearch = new LinearSearch();
        int linearIndex = linearSearch.search(numbers, 3);
        System.out.println("Linear Search Index: " + linearIndex);

        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersCopy);

        // Binary search (recursive)
        BinarySearch binarySearch = new BinarySearch();
        int binaryRecIndex = binarySearch.searchRecursive(numbersCopy, 3);
        System.out.println("Binary Search Recursive Index: " + binaryRecIndex);

        // Binary search (iterative)
        int binaryIndex = binarySearch.search(numbersCopy, 7);
        System.out.println("Binary Search Index: " + binaryIndex);

        // Ternary search (recursive)
        TernarySearch ternarySearch = new TernarySearch();
        int ternaryIndex = ternarySearch.search(numbersCopy, 3);
        System.out.println("Ternary Search Index: " + ternaryIndex);

        // Jump search
        JumpSearch jumpSearch = new JumpSearch();
        int jumpIndex = jumpSearch.search(numbersCopy, 7);
        System.out.println("Jump Search Index: " + jumpIndex);

        // Exponential search
        ExponentialSearch exponentialSearch = new ExponentialSearch();
        int exponentialIndex = exponentialSearch.search(numbersCopy, 3);
        System.out.println("Exponential Search Index: " + exponentialIndex);
    }
}
