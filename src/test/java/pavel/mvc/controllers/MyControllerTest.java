package pavel.mvc.controllers;

import org.junit.jupiter.api.Test;
import pavel.mvc.dto.AuthorDto;
import pavel.mvc.dto.BookDto;
import pavel.mvc.dto.GenreDto;
import pavel.mvc.entities.Author;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Genre;
import pavel.mvc.service.BookService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyControllerTest {

    private BookService bookService = mock(BookService.class);
    private MyController myController = new MyController(bookService);

    @Test
    void showAllBooks() {
        GenreDto genre = new GenreDto(1, "fairy tale");
        AuthorDto author = new AuthorDto(2,"Pushkin");
        List<BookDto> expected = Arrays.asList(
                new BookDto(1,"The Tale of Tsar Saltan",   author, genre, null),
                new BookDto(2,"Ruslan and Lyudmila", author, genre, null)
        );
        when(bookService.getAllBooks()).thenReturn(expected);
        List<BookDto> actual = myController.showAllBooks();
        assertEquals(expected, actual);
    }

    @Test
    void addBook() {
        Genre genre = new Genre("story");
        Author author = new Author("Prishvin");
        Book book = new Book("Kashcheeva chain. The bishop", author, genre);
        when(bookService.saveBook(book)).thenReturn(book);
        assertEquals(book, myController.addBook(book));
    }

    @Test
    void updateBook() {
        Genre genre = new Genre("story");
        Author author = new Author("Prishvin");
        Book book = new Book("Kashcheeva chain. The bishop", author, genre);
        when(bookService.saveBook(book)).thenReturn(book);
        assertEquals(book, myController.updateBook(book));
    }

    @Test
    void deleteBook() {
        int id = 1;
        myController.deleteBook(id);
        verify(bookService, times(1)).delete(id);
    }

}