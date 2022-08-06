package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {

        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Jan Brzechwa", "Smiechu warte", 1997, "E15");
        Book book2 = new Book("Stieg Larsson", "Dziewczyna z tatuażem", 2015, "S60");
        Book book3 = new Book("Tadeusz Bacela", "Chłopcy z morza", 1995, "B26");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int result = adapter.publicationYearMedian(bookSet);

        //Then
        Assertions.assertEquals(2002, result);
    }
}
