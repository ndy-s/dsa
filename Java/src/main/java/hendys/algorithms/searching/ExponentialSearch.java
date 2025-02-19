package hendys.algorithms.searching;

public class ExponentialSearch {

    public int search(int[] array, int target) {
        int bound = 1;

        while (bound < array.length && array[bound] < target) {
            bound *= 2;
        }

        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        return binarySearchRecursive(array, target, left, right);
    }

    private int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (right < left) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return binarySearchRecursive(array, target, left, middle - 1);
        } else {
            return binarySearchRecursive(array, target, middle + 1, right);
        }
    }
}
