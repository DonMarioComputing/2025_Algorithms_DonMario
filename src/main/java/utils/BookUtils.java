package utils;

import entities.Book;

public class BookUtils {

    //Exercise 1:
        /**
         * Creates a string representation of all the data from each book in the supplied array
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
    }



