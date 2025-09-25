package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author michelle
 */
public class UtilitiesIsEqualTest {

    public UtilitiesIsEqualTest() {
    }
    /**
     * Test of isEqual method, of class NumberUtils.
     */
    @Test
    public void testisEqual() {
        System.out.println("Testing isEqual where arrays are identical");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = true;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualSameContentWrongOrder() {
        System.out.println("Testing isEqual where arrays contain the same data, but in a different order");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean expResult = true;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualSameLengthDifferentContent() {
        System.out.println("Testing isEqual where arrays are same lengths, but different content");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {12, 13, 14, 15, 16};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualDifferentFirstElement() {
        System.out.println("Testing isEqual where array content is the same, except for the first element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {-1, 2, 4, 3, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualDifferentLastElement() {
        System.out.println("Testing isEqual where array content is the same, except for the last element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 50};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualFirstArrayEmpty() {
        System.out.println("Testing isEqual where first array is empty");
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualFirstArrayNull() {
        System.out.println("Testing isEqual where first array is null");
        int[] nums1 = null;
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualSecondArrayEmpty() {
        System.out.println("Testing isEqual where second array is empty");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualSecondArrayNull() {
        System.out.println("Testing isEqual where second array is null");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = null;
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualBothArraysEmpty() {
        System.out.println("Testing isEqual where both arrays are empty");
        int[] nums1 = {};
        int[] nums2 = {};
        boolean expResult = true;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualBothArraysNull() {
        System.out.println("Testing isEqual where both arrays are null");
        int[] nums1 = null;
        int[] nums2 = null;
        boolean expResult = true;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualDifferentLengthArraysSameContent() {
        System.out.println("Testing isEqual where arrays are different lengths, but the same to the end of the shorter one");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisEqualDifferentLengthArraysDifferentContent() {
        System.out.println("Testing isEqual where arrays are different lengths and contain different things");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 9, 10, 11, -1, -4, 6};
        boolean expResult = false;
        boolean result = NumberUtils.isEqual(nums1, nums2);
        assertEquals(expResult, result);
    }
}
