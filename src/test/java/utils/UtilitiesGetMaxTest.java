package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 *
 * @author michelle
 */
public class UtilitiesGetMaxTest {

    public UtilitiesGetMaxTest() {
    }

    /**
     * Test of getMax method, of class NumberUtils.
     */
    @Test
    public void testGetMaxFirstPos() {
        System.out.println("Testing getMax where value is in first position");
        int[] nums = {101, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expResult = 101;
        int result = NumberUtils.getMax(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMaxLastPos() {
        System.out.println("Testing getMax where value is in last position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expResult = 10;
        int result = NumberUtils.getMax(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMaxMiddlePos() {
        System.out.println("Testing getMax where value is in middle of array");
        int[] nums = {1, 2, 3, 4, 5, 101, 6, 7, 8, 9, 10};
        int expResult = 101;
        int result = NumberUtils.getMax(nums);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetMaxAllNegative() {
        System.out.println("Testing getMax where all values are negative");
        int[] nums = {-849, -1, -2, -3, -4, -5, -100, -40000, -999999, -585};
        int expResult = -1;
        int result = NumberUtils.getMax(nums);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetFirstPosValueInLastSlot() {
        System.out.println("Testing getFirstPos where value is in last position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int expResult = 9;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetMaxNullArray() {
        System.out.println("Testing getMax where array supplied is null");
        int[] nums = null;
        
        assertThrows(NullPointerException.class, () -> {
            NumberUtils.getMax(nums);}, "NullPointerException was expected");
    }
}
