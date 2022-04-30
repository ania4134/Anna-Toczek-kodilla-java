package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Book book1 = new Book("title nr 1", "author nr 1", LocalDate.of(1999, 5, 9));
        Book book2 = new Book("title nr 2", "author nr 2", LocalDate.of(1954, 12, 9));
        Book book3 = new Book("title nr 3", "author nr 3", LocalDate.of(2012, 11, 29));
        Book book4 = new Book("title nr 4", "author nr 4", LocalDate.of(1912, 1, 10));

        Library myLibrary = new Library("My library");
        myLibrary.getBooks().add(book1);
        myLibrary.getBooks().add(book2);
        myLibrary.getBooks().add(book3);
        myLibrary.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = myLibrary.shallowCopy();
            clonedLibrary.setName("Shallow copied library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = myLibrary.deepCopy();
            deepClonedLibrary.setName("Deep copied library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        myLibrary.getBooks().remove(book2);
        myLibrary.getBooks().remove(book3);

        //Then
        System.out.println(myLibrary);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, myLibrary.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), myLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), myLibrary.getBooks());
    }
}
