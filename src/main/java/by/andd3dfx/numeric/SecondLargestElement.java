package by.andd3dfx.numeric;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 * Find the second-largest element in array of numbers
 *
 * @see <a href="https://youtu.be/TYU9OsImhP8">Video solution</a>
 */
public class SecondLargestElement {

    public static int find(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array size should be at least 2!");
        }

        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static int find2(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array size should be at least 2!");
        }

        int max_1 = max(array[0], array[1]);
        int max_2 = min(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            if (array[i] >= max_1) {
                max_2 = max_1;
                max_1 = array[i];
                continue;
            }
            if (array[i] >= max_2) {
                max_2 = array[i];
                continue;
            }
        }
        return max_2;
    }
}
