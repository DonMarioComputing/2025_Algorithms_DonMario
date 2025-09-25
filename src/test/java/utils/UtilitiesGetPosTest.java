package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesGetPosTest {
    
    public UtilitiesGetPosTest() {
    }

    /**
     * Test of getPos method, of class NumberUtils.
     */
    @Test
    public void testGetPos() {
        System.out.println("Testing getPos where value is in first position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 1;
        int expResult = 0;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetPosMultipleOfSameValue() {
        System.out.println("Testing getPos where value appears in more than one position");
        int[] nums = {1, 2, 1, 3, 1, 4, 1, 5, 1, 6};
        int value = 1;
        int expResult = 0;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetPosNoInstancePresent() {
        System.out.println("Testing getPos where value is not present in array");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 20;
        int expResult = -1;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetPosWithEmptyArray() {
        System.out.println("Testing getPos where supplied array is empty");
        int[] nums = {};
        int value = 1;
        int expResult = -1;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPosSeekingNegativeValue() {
        System.out.println("Testing getPos where value being sought is negative");
        int[] nums = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
        int value = -1;
        int expResult = 0;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPosValueInLastSlot() {
        System.out.println("Testing getPos where value is in last position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int expResult = 9;
        int result = NumberUtils.getPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPosNullArray() {
        System.out.println("Testing getPos where array supplied is null");
        int[] nums = null;
        int value = 10;
        
        assertThrows(NullPointerException.class, () -> {
            NumberUtils.getPos(nums, value);}, "NullPointerException was expected");
    }
}
