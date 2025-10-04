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

    /* Exercise 3 */
    /**
     * checking if two arrays are identical (the same data in the same order)
     *
     * @param a first array
     * @param b second array
     * @return "true" value will pass if identical, "false" if not
     */
    public static boolean isIdentical(int[] a, int[] b) {
        // identical if both arrays null
        if (a == null && b == null) return true;

        // not identical if one array is null
        if (a == null || b == null) return false;

        // not identical if each array has different length
        if (a.length != b.length) return false;

        // compare every element one by one
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;

        // identical if all checks passed
        return true;
    }

    /* Exercise 4 */
    /**
     * checking if two arrays has the same elements (order will not check)
     *
     * @param a first array
     * @param b second array
     * @return "true" value will pass if arrays has the same elements, "false" if not
     */
    public static boolean isEqual(int[] a, int[] b){
        // equal if both arrays are null
        if (a == null && b == null) return true;

        // not equal if one array is null
        if (a == null || b == null) return false;

        // not equal if arrays have different lengths
        if(a.length != b.length) return false;

        // to avoid modifying originals copy arrays
        int[] copyA = Arrays.copyOf(a, a.length);
        int[] copyB = Arrays.copyOf(b, b.length);
        // sort arrays, because order does not matter
        Arrays.sort(copyA);
        Arrays.sort(copyB);
        // compare sorted elements one by one
        for (int i = 0; i < copyA.length; i++) {
            if (copyA[i] != copyB[i]) return false;
        }
        return true;
    }

    /* Exercise 5 */
    /**
     * checking if array "a" is a strict subset of array "b"
     *
     * @param a potential subset
     * @param b potential original array
     * @return  "true" value will pass if "a" is a subset of "b", false if not
     */
    public static boolean isSubset(int[] a, int[] b) {
        if (a == null || b == null || a.length == 0 || a.length >= b.length) return false;

    // create a boolean array to track elements in "b" that have already matched
        boolean[] used = new boolean[b.length];

        // loop through each element in array 'a'
        for (int i = 0; i < a.length; i++) {
            // if current element of "a" exists in "b"
            boolean found = false;
            // check if this element exists in "b" and has not used yet
            for (int j = 0; j < b.length; j++) {
                if (!used[j] && a[i] == b[j]) {
                    used[j] = true;
                    found = true;
                    break;
                }
            }
            // "a" is not a subset if element from "a" is not found in "b"
            if (!found) return false;
        }

        return true;
    }

    /* Exercise 6 */
    /**
     * returns the largest number in an array
     *
     * @param arr the search array
     * @return give the largest number in array
     * @throws IllegalArgumentException if array is empty
     * @throws NullPointerException if array is null
     */
    public static int getMax(int[] arr) {
        if (arr.length == 0)
            throw new IllegalArgumentException("Array is empty:");
        if (arr == null)
            throw new NullPointerException("Array is null");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max= arr[i];
        }
        return max;
    }


}