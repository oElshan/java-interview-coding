package by.andd3dfx.numeric;

/**
 * <pre>
 * Дана последовательность целых чисел.
 * Необходимо найти минимально возможное произведение пары элементов последовательности.
 * Например, для последовательности чисел {9 4 2 5 3} ответ будет 6.
 * Попробовать сделать это за O(n)
 * </pre>
 */
public class MinMultiplication {

    public int determine(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            throw new IllegalArgumentException("Should be at least 2 elements in array!");
        }

        // 1. if all are positive - return multiplication of two left
        // 2. if all are negative - return multiplication of two right
        // 3. if both negative and positive present - return multiplication of left and right

        int[] left = sortPair(arr[0], arr[1]);
        int[] right = sortPair(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            int curr = arr[i];
            if (curr < left[0]) {
                left[1] = left[0];
                left[0] = curr;
            } else if (curr < left[1]) {
                left[1] = curr;
            }

            if (curr > right[1]) {
                right[0] = right[1];
                right[1] = curr;
            } else if (curr > right[0]) {
                right[0] = curr;
            }
        }

        // 1. if all are positive - return multiplication of two left
        if (left[0] > 0) {
            return left[0] * left[1];
        }

        // 2. if all are negative - return multiplication of two right
        if (right[1] < 0) {
            return right[0] * right[1];
        }

        // 3. if both negative and positive present - return multiplication of left and right
        return left[0] * right[1];
    }

    private int[] sortPair(int first, int second) {
        if (first < second) {
            return new int[]{first, second};
        }
        return new int[]{second, first};
    }
}
