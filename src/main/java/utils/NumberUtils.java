package utils;

import java.util.Arrays;


public class NumberUtils {

    /* Exercise 1 */

    /**
     * finds the first position of a given integer value in an array
     *
     * @param arr search array
     * @param value find integer value
     * @return index of first occurrence of value, if not found -1 will pass
     * @throws NullPointerException if the supplied array is null
     */
    public static int getPos(int[] arr, int value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}