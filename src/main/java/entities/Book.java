package entities;

public class Book {

        /**
         * The ISBN identifier for the book
         */
        private String isbn;

        /**
         * The title of the book
         */
        private String title;

        /**
         * The author of the book
         */
        private String author;

        /**
         * Constructs a new book with the given details
         * @param isbn the ISBN of the book
         * @param title the title of the book
         * @param author the author of the book
         */
        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
        }

        /**
         * Returns the ISBN of the book
         * @return the book's ISBN
         */
        public String getIsbn() {
            return isbn;
        }

        /**
         * Returns the title of the book
         * @return the book's title
         */
        public String getTitle() {
            return title;
        }

        /**
         * Returns the author of the book
         * @return the book's author
         */
        public String getAuthor() {
            return author;
        }

        /**
         * Returns a formatted string containing the book’s data
         * @return a formatted string representation of the book’s data
         */
        public String format() {
            return "\"" + title + "\" by " + author + " - ISBN: " + isbn;
        }

        /**
         * Returns a string version of this book
         * @return a string representation of the book
         */
        @Override
        public String toString() {
            return format();
        }
    }
