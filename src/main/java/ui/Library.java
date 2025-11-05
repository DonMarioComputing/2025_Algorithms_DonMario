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

        //4.Insert the book you deleted at step 2 back into the array in sorted order.
        Book lostBook = BookUtils.sortedInsert(books, removedBook);
        if (lostBook != null) {
            System.out.println("Book lost due to array being full after sorted insert: " + lostBook);
        }

        System.out.println("\nArray after inserting removed book back in sorted order:");
        System.out.println(BookUtils.toString(books));

        //5. Display the array and ask the user:
        //▪ Which book they want to delete (note: ask them the position of the book to delete)
        //▪ Whether the program should delete the first instance or all instances
        //6. Carry out the user’s chosen delete action and display the updated array
        System.out.print("\nEnter the position of the book you want to delete: ");
        int deletePos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Delete first instance or all instances? (first/all): ");
        String deleteChoice = scanner.nextLine().trim().toLowerCase();

        if (deleteChoice.equals("first")) {
            BookUtils.delete(books, books[deletePos]);
        } else if (deleteChoice.equals("all")) {
            BookUtils.deleteAll(books, books[deletePos]);
        } else {
            System.out.println("Invalid choice, skipping delete.");
        }

        System.out.println("\nArray after deletion:");
        System.out.println(BookUtils.toString(books));


    }
}