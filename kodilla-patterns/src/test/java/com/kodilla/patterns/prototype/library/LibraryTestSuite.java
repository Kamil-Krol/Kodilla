package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks()
    {
        //Given
        Library library = new Library("Library");
        Book book1 = new Book("Book1","Author1", LocalDate.of(1980,06,21));
        Book book2 = new Book("Book2","Author2", LocalDate.of(1970,05,18));
        Book book3 = new Book("Book3","Author3", LocalDate.of(19600,10,03));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //shallow clone
        Library libraryClone = null;
        try {
            libraryClone = library.shallowCopy();
            libraryClone.setName("Library Clone");
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(libraryClone);

        //deepClone
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("deepClonedLibrary");
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println(e);
        }

        //When

        library.getBooks().remove(book1);

        int size = library.getBooks().size();
        int cloneSize = libraryClone.getBooks().size();
        int deepCloneSize = deepClonedLibrary.getBooks().size();



        //Then
        assertEquals(2,size);
        assertEquals(2,cloneSize);

        assertEquals(3,deepCloneSize);
    }
}
