package hendys.algorithms.searching;

public class JumpSearch {

    public int search(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (array[next - 1] < target && start < array.length) {
            start = next;
            next += blockSize;

            if (next > array.length) next = array.length;
        }

        for (int i = start; i < next; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }
}
