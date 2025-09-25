package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author michelle
 */
public class UtilitiesIsSubsetTest {

    public UtilitiesIsSubsetTest() {
    }
    /**
     * Test of isSubset method, of class NumberUtils.
     */

    @Test
    public void testisSubset() {
        System.out.println("Testing isSubset where array1 is a subset of array2");
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = true;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testisSubsetIdenticalContent() {
        System.out.println("Testing isSubset where arrays are identical");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetEqualContentDifferentOrder() {
        System.out.println("Testing isSubset where arrays are equal, but in a different order");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testisSubsetSubsetContentDifferentOrder() {
        System.out.println("Testing isSubset where array 1 is a subset, but in a different order");
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean expResult = true;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetSameLength() {
        System.out.println("Testing isSubset where arrays are same lengths");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {12, 13, 14, 15, 16};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }

    @Test
    public void testisSubsetFirstArrayLonger() {
        System.out.println("Testing isSubset where the first array is longer than the second");
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetOnlyOneElement() {
        System.out.println("Testing isSubset where only one element is in first array");
        int[] nums1 = {2};
        int[] nums2 = {-1, 2, 4, 3, 5};
        boolean expResult = true;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetMissingOneElement() {
        System.out.println("Testing isSubset where only one element is missing from the second array");
        int[] nums1 = {1, 2, 3, 5};
        int[] nums2 = {1, 2, 3, 4, 50};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetFirstArrayEmpty() {
        System.out.println("Testing isSubset where the subset array is empty");
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetFirstArrayNull() {
        System.out.println("Testing isSubset where first array is null");
        int[] nums1 = null;
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetSecondArrayEmpty() {
        System.out.println("Testing isSubset where second array is empty");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetSecondArrayNull() {
        System.out.println("Testing isSubset where second array is null");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = null;
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetBothArraysEmpty() {
        System.out.println("Testing isSubset where both arrays are empty");
        int[] nums1 = {};
        int[] nums2 = {};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetBothArraysNull() {
        System.out.println("Testing isSubset where both arrays are null");
        int[] nums1 = null;
        int[] nums2 = null;
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisSubsetDifferentLengthArraysDifferentContent() {
        System.out.println("Testing isSubset where arrays are different lengths and contain different things");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 9, 10, 11, -1, -4, 6};
        boolean expResult = false;
        boolean result = NumberUtils.isSubset(nums1, nums2);
        assertEquals(expResult, result);
    }
}
