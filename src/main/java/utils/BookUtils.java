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

    //Exercise 4:

    /**
     * Deletes all occurrences of a specified book from the array using the shifting
     *
     * @param books the array of objects to modify
     * @param book  the object to delete
     * @return the number of instances removed from the array
     * @throws IllegalArgumentException if the supplied array or book is null
     */
    public static int deleteAll(Book[] books, Book book) {
        // validate the array
        if (books == null) {
            throw new IllegalArgumentException("Book array cannot be null");
        }

        // validate the book
        if (book == null) {
            throw new IllegalArgumentException("Book to delete cannot be null");
        }

        // track where the next non deleted book should be placed
        int writeIndex = 0;
        // tracks number of deleted books
        int countDeleted = 0;

        // loop through all books
        for (int readIndex = 0; readIndex < books.length; readIndex++) {
            // skip null slots
            if (books[readIndex] != null && books[readIndex].equals(book)) {
                // increment deleted count when found a match
                countDeleted++;
            } else {
                // keep the book by writing it at writeIndex
                books[writeIndex] = books[readIndex];
                writeIndex++;
            }
        }

        // blank out remaining slots at the end
        for (int i = writeIndex; i < books.length; i++) {
            books[i] = null;
        }

        return countDeleted;
    }

    //Exercise 5:

    /**
     * Replaces all instance of a specified book in the array with another supplied book using overwriting
     *
     * @param books the array of objects to modify
     * @param toReplace the object to be replaced
     * @param replacement the object to insert in place of toReplace
     * @return the number of books replaced in the array
     * @throws IllegalArgumentException if the array toReplace or replacement is null
     */
    public static int replace(Book[] books, Book toReplace, Book replacement) {
        // validate the array
        if (books == null) {
            throw new IllegalArgumentException("Book array cannot be null");
        }

        // validate the books
        if (toReplace == null || replacement == null) {
            throw new IllegalArgumentException("Book to replace and replacement cannot be null");
        }

        int countReplaced = 0;

        // loop through array and overwrite matching books
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(toReplace)) {
                books[i] = replacement;
                countReplaced++;
            }
        }

        return countReplaced;
    }

    //Exercise 6:

    /**
     * Inserts a Book into a sorted array using shifting
     * The Book is inserted before the first Book that is larger
     * Null slots are ignored in comparisons but can be shifted
     * If the Book belongs after the last element, it is not inserted
     *
     * @param books the array of books to be amended
     * @param toBeInserted the book to insert
     * @return the book "lost" after shifting or null if no book is lost
     * @throws IllegalArgumentException if books array or book to insert is null
     */
    public static Book sortedInsert(Book[] books, Book toBeInserted) {
        // validation
        if (books == null || toBeInserted == null) {
            throw new IllegalArgumentException("Array and Book to insert must not be null");
        }

        int insertIndex = -1;

        // find the index to insert before the first larger book
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && toBeInserted.compareTo(books[i]) < 0) {
                insertIndex = i;
                break;
            }
        }

        // do not insert if no book is larger
        if (insertIndex == -1) {
            return null;
        }

        // shift books to the right starting from the last element
        Book lostBook = books[books.length - 1]; // last book will be lost
        for (int i = books.length - 1; i > insertIndex; i--) {
            books[i] = books[i - 1];
        }

        // insert the new book
        books[insertIndex] = toBeInserted;

        return lostBook;
    }
}




