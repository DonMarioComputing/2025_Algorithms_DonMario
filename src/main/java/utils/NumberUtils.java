package utils;

import java.util.Arrays;


public class NumberUtils {

    /* Exercise 1 */

    /**
     * finding the first position of a given integer value in an array
     *
     * @param arr the search array
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

    /* Exercise 2 */
    /**
     * finding the last position on the given integer value in array
     *
     * @param arr the search array
     * @param value find integer value
     * @return index of last occurrence of value, if not found -1 will pass
     * @throws NullPointerException if the supplied array is null
     */
    public static int getLastPos(int[] arr, int value) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == value) return i;
        }
        return -1;
    }




}