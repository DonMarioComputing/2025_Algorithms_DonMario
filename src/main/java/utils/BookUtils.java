package utils;

import entities.Book;

public class BookUtils {

    //Exercise 1:

    /**
     * Creates a string representation of all the data from each book in the supplied array
     *
     * @param books an array of objects to be displayed
     * @return a string containing the text of every Book in the array or "No books found" if the array is empty
     * @throws IllegalArgumentException if the supplied array is null
     */
    public static String toString(Book[] books) {
        // Handle null array
        if (books == null) {
            throw new IllegalArgumentException("Book array cannot be null");
        }

        // Handle empty array
        if (books.length == 0) {
            return "No books found";
        }

        String result = "";

        for (int i = 0; i < books.length; i++) {
            if (i > 0) {
                result += "\n";
            }

            if (books[i] == null) {
                result += i + ") null";
            } else {
                // Format() method returning the text
                result += i + ") " + books[i].format();
            }
        }

        return result;
    }

    //Exercise 2:

    /**
     * Removes the Book at a specified index in the supplied array using an overwriting
     *
     * @param books the array of objects to modify
     * @param index the position in the array to overwrite
     * @return the object that was previously stored at that position or if that slot was already empty
     * @throws IllegalArgumentException  if the supplied array is null
     * @throws IndexOutOfBoundsException if the supplied index is less than 0 or greater than or equal to the array length
     */
    public static Book emptyIndex(Book[] books, int index) {
        // check for a null array
        if (books == null) {
            throw new IllegalArgumentException("Book array cannot be null");
        }

        // check for invalids, less than 0 or outside array bounds
        if (index < 0 || index >= books.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }

        // store the book currently at the given index
        Book removedBook = books[index];

        // overwrite that index with null
        books[index] = null;

        // return the original book that was stored at this position
        return removedBook;
    }

    //Exercise 3:

    /**
     * Deletes the first occurrence of a specified book from the array using the shifting
     *
     * @param books the array of objects to modify
     * @param book  the object to delete
     * @return true if a book was found and deleted or false if not
     * @throws IllegalArgumentException if the supplied array or book is null
     */
    public static boolean delete(Book[] books, Book book) {
        // validate the array
        if (books == null) {
            throw new IllegalArgumentException("Book array cannot be null");
        }

        // validate the book
        if (book == null) {
            throw new IllegalArgumentException("Book to delete cannot be null");
        }

        // loop through the array to find the first occurrence
        for (int i = 0; i < books.length; i++) {
            // skip null slots
            if (books[i] == null) continue;

            // check for equality and compares ISBN, title, author
            if (books[i].equals(book)) {

                // shift all subsequent elements left
                for (int j = i; j < books.length - 1; j++) {
                    books[j] = books[j + 1];
                }

                // blank out the last slot
                books[books.length - 1] = null;

                // successfully deleted the book
                return true;
            }
        }

        // book not found in the array
        return false;
    }
}



