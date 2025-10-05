package ui;

import utils.DataGenerator;
import java.util.Arrays;
import utils.NumberUtils;

public class Statistics {
    public static void main(String[] args) {
        // create a hard coded array
        int[] hardCodedArray = {10, 20, 10, 20, 60, 10, 5, 60, 5, 60};
        // generate a random array
        int[] randomArray = DataGenerator.getRandomArray(10);

        // display arrays
        System.out.println("Hard coded array contents: ");
        System.out.println(Arrays.toString(hardCodedArray));

        System.out.println("\nRandomly generated array contents: ");
        if (randomArray != null) {
            System.out.println(Arrays.toString(randomArray));

        // use NumberUtils.getMax() to find and display the largest value in random array
            try {
                int largest = NumberUtils.getMax(randomArray);
                System.out.println("\nLargest value in the random array: " + largest);

                // use NumberUtils.getPos() to find the position it first appears
                int firstPos = NumberUtils.getPos(randomArray, largest);
                if (firstPos != -1) {
                    System.out.println("This largest value first appears at index: " + firstPos);
                } else {
                    System.out.println("Cannot find the position of the largest value");
                }

                // use NumberUtils.getLastPos() to find the last position of the largest value
                int lastPos = NumberUtils.getLastPos(randomArray, largest);
                if (lastPos != -1) {
                    System.out.println("This largest value last appears at index: " + lastPos);
                } else {
                    System.out.println("Cannot find the last position of the largest value");
                }

            } catch (Exception e) {
                System.out.println("Error finding largest value: " + e.getMessage());
            }

            // check if arrays are identical (same order and same values)
            if (NumberUtils.isIdentical(hardCodedArray, randomArray)) {
                System.out.println("The arrays are identical");
            }
            // check if arrays are equal (same elements, different order)
            else if (NumberUtils.isEqual(hardCodedArray, randomArray)) {
                System.out.println("The arrays are equal");
            }
            // check if hard coded array is a subset of the random array
            else if (NumberUtils.isSubset(hardCodedArray, randomArray)) {
                System.out.println("The hard coded array is a subset of the random array");
            }
            // check if random array is a subset of the hard coded array
            else if (NumberUtils.isSubset(randomArray, hardCodedArray)) {
                System.out.println("The random array is a subset of the hard coded array");
            }
            // if not, no relationship
            else {
                System.out.println("The arrays are not identical, equal, or subsets");
            }


        } else {
            System.out.println("Random array cannot be generated");

        }
    }
}

