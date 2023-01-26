package day17.IteratorsAndComparatorsLab;

import java.util.Iterator;

public class Library implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibIterator();
    }



    public final class LibIterator implements Iterator<Book> {
        private int counter = 0;
        public boolean hasNext;

        @Override
        public boolean hasNext() {
            return this.counter < books.length;
        }

        @Override
        public Book next() {
            return books[counter++];
        }
    }
}

