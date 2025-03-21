package hendys.algorithms.searching;

public class BinarySearch {

    public int search(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return -1;
    }

    public int searchRecursive(int[] array, int target) {
        return searchRecursive(array, target, 0, array.length - 1);
    }

    private int searchRecursive(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return searchRecursive(array, target, left, middle - 1);
        } else {
            return searchRecursive(array, target, middle + 1, right);
        }
    }

}
