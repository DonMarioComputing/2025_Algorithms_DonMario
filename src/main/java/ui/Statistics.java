package ui;

import utils.DataGenerator;
import java.util.Arrays;

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
        } else {
            System.out.println("Random array cannot be generated");

        }
    }
}

