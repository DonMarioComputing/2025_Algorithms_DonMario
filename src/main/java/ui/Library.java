package ui;

import entities.Book;
import utils.BookGenerator;
import utils.BookUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // generate random array of Books
        //1.Display the contents of the array
        Book[] books = BookGenerator.getRandomArray(10);

        System.out.println("Initial array of books:");
        System.out.println(BookUtils.toString(books));

        //2.sort the array first [to avoid null issues [as the amendment email]]
        Arrays.sort(books);

        //3.Delete a random Book from the array based on position (remember to inform the user what was deleted)
        int randomIndex = random.nextInt(books.length);
        Book removedBook = BookUtils.emptyIndex(books, randomIndex);
        System.out.println("\nRandomly removed book at position " + randomIndex + ": " + removedBook);

    }
}