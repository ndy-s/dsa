package hendys.algorithms.sorting;

import java.util.Arrays;

public class SortingApp {
    public static void main(String[] args) {
        int[] bubbleSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var bubbleSort = new BubbleSort();
        bubbleSort.sort(bubbleSortNumbers);
        System.out.println("Bubble Sort: " + Arrays.toString(bubbleSortNumbers));

        int[] selectionSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var selectionSort = new SelectionSort();
        selectionSort.sort(selectionSortNumbers);
        System.out.println("Selection Sort: " + Arrays.toString(selectionSortNumbers));

        int[] insertionSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var insertionSort = new InsertionSort();
        insertionSort.sort(insertionSortNumbers);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionSortNumbers));

        int[] mergeSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var mergeSort = new MergeSort();
        mergeSort.sort(mergeSortNumbers);
        System.out.println("Merge Sort: " + Arrays.toString(mergeSortNumbers));

        int[] quickSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var quickSort = new QuickSort();
        quickSort.sort(quickSortNumbers);
        System.out.println("Quick Sort: " + Arrays.toString(quickSortNumbers));

        int[] countingSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var countingSort = new CountingSort();
        countingSort.sort(countingSortNumbers, 7);
        System.out.println("Counting Sort: " + Arrays.toString(countingSortNumbers));

        int[] bucketSortNumbers = { 7, 3, 1, 4, 6, 2, 3 };
        var bucketSort = new BuckerSort();
        bucketSort.sort(bucketSortNumbers, 3);
        System.out.println("Bucket Sort: " + Arrays.toString(bucketSortNumbers));
    }
}
