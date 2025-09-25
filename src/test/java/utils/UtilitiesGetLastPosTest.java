package utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author michelle
 */
public class UtilitiesGetLastPosTest {
    
    public UtilitiesGetLastPosTest() {
    }

    /**
     * Test of getLastPos method, of class NumberUtils.
     */
@Test
    public void testGetLastPos() {
        System.out.println("Testing getLastPos where value is in last position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 10;
        int expResult = 9;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetLastPosMultipleOfSameValue() {
        System.out.println("Testing getLastPos where value appears in more than one position");
        int[] nums = {1, 2, 1, 3, 1, 4, 1, 5, 1, 6};
        int value = 1;
        int expResult = 8;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetLastPosNoInstancePresent() {
        System.out.println("Testing getLastPos where no instance of the supplied value is present");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 20;
        int expResult = -1;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testGetLastPosWithEmptyArray() {
        System.out.println("Testing getLastPos where supplied array is empty");
        int[] nums = {};
        int value = 1;
        int expResult = -1;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastPosSeekingNegativeValue() {
        System.out.println("Testing getLastPos where value is negative");
        int[] nums = {-1, -2, -3, -4, -5, 1, 2, 3, 4, 5};
        int value = -1;
        int expResult = 0;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLastPosValueInFirstSlot() {
        System.out.println("Testing getLastPos where value is in first position");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 1;
        int expResult = 0;
        int result = NumberUtils.getLastPos(nums, value);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetLastPosNullArray() {
        System.out.println("Testing getLastPos where array supplied is null");
        int[] nums = null;
        int value = 10;
        
        assertThrows(NullPointerException.class, () -> {
            NumberUtils.getLastPos(nums, value);}, "NullPointerException was expected");
    }
}
