package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest()
    {
        //Given
        BookA bookA1 = new BookA("Author1","Title1",2001,"1");
        BookA bookA2 = new BookA("Author2","Title2",2002,"2");
        BookA bookA3 = new BookA("Author3","Title3",2003,"3");

        Set<BookA> bookASet = new HashSet<>();
        bookASet.add(bookA1);
        bookASet.add(bookA2);
        bookASet.add(bookA3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int median = medianAdapter.publicationYearMedian(bookASet);

        //Then
        assertEquals(2002,median);
    }
}
