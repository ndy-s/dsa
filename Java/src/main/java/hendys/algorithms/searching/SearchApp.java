package hendys.algorithms.searching;

import java.util.Arrays;

public class SearchApp {
    public static void main(String[] args) {
        int[] numbers = { 7, 1, 3, 6, 5 };
        var search = new Search();

        // Linear search
        var linearIndex = search.linearSearch(numbers, 3);
        System.out.println("Linear Search Index: " + linearIndex);

        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numbersCopy);

        // Binary search (recursive)
        var binaryRecIndex = search.binarySearchRec(numbersCopy, 3);
        System.out.println("Binary Search Recursive Index: " + binaryRecIndex);

        // Binary search (iterative)
        var binaryIndex = search.binarySearch(numbersCopy, 7);
        System.out.println("Binary Search Index: " + binaryIndex);


    }
}
