package hendys.algorithms.sorting;

public class QuickSort {

    public void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    // array with 10 length
    // 0, 9
    // 0, 3 (left)
    // 5, 9 (right)
    private void sort(int[] array, int start, int end) {
        if (start >= end) return;

        // Partition
        var boundary = parition(array, start, end);

        // Sort left
        sort(array, start, boundary - 1);

        // Sort right
        sort(array, boundary + 1, end);
    }

    private int parition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;
        for (var i = start; i <= end; i++) {
            if (array[i] <= pivot) swap(array, i, ++boundary);
        }

        return boundary;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
