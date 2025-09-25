package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesIsIdenticalTest {
    
    public UtilitiesIsIdenticalTest() {
    }
    /**
     * Test of isIdentical method, of class NumberUtils.
     */
    @Test
    public void testisIdentical() {
        System.out.println("Testing isIdentical where both arrays are identical");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = true;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalSameContentWrongOrder() {
        System.out.println("Testing isIdentical where arrays contain the same data, but in a different order");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalSameLengthDifferentContent() {
        System.out.println("Testing isIdentical where arrays are same lengths, but different content");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {12, 13, 14, 15, 16};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalDifferentFirstElement() {
        System.out.println("Testing isIdentical where array content is the same, except for the first element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {-1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalDifferentLastElement() {
        System.out.println("Testing isIdentical where array content is the same, except for the last element");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 50};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalFirstArrayEmpty() {
        System.out.println("Testing isIdentical where first array is empty");
        int[] nums1 = {};
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalFirstArrayNull() {
        System.out.println("Testing isIdentical where first array is null");
        int[] nums1 = null;
        int[] nums2 = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalSecondArrayEmpty() {
        System.out.println("Testing isIdentical where second array is empty");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalSecondArrayNull() {
        System.out.println("Testing isIdentical where second array is null");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = null;
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalBothArraysEmpty() {
        System.out.println("Testing isIdentical where both arrays are empty");
        int[] nums1 = {};
        int[] nums2 = {};
        boolean expResult = true;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalBothArraysNull() {
        System.out.println("Testing isIdentical where both arrays are null");
        int[] nums1 = null;
        int[] nums2 = null;
        boolean expResult = true;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalDifferentLengthArraysSameContent() {
        System.out.println("Testing isIdentical where arrays are different lengths, but the same to the end of the shorter one");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testisIdenticalDifferentLengthArraysDifferentContent() {
        System.out.println("Testing isIdentical where arrays are different lengths and contain different things");
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {8, 9, 10, 11, -1, -4, 6};
        boolean expResult = false;
        boolean result = NumberUtils.isIdentical(nums1, nums2);
        assertEquals(expResult, result);
    }
}
