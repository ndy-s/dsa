package hendys.algorithms.sorting;

import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args) {
        int[] numbers = { 7, 3, 1, 4, 6, 2, 3 };
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println("Buble Sort: " + Arrays.toString(numbers));
    }
}
