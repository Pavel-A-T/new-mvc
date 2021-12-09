package pavel.mvc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pavel.mvc.config.TestConfigService;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.entities.Author;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfigService.class,
        loader = AnnotationConfigContextLoader.class)
class BookServiceImplTest {

    @Autowired
    private BookService bookService;
    @Autowired
    private BookRepository repository;

    @Test
    void getAllBooks() {
        Genre genre = new Genre("fairy tale");
        Author author = new Author("Pushkin");
        List<Book> books = Arrays.asList(
                new Book("The Tale of Tsar Saltan", author, genre),
                new Book("Ruslan and Lyudmila", author, genre)
        );
        when(repository.findAll()).thenReturn(books);
        assertEquals(books, repository.findAll());
    }

    @Test
    void saveBook() {
        Genre genre = new Genre("story");
        Author author = new Author("Prishvin");
        Book book = new Book("Kashcheeva chain. The bishop", author, genre);
        when(repository.save(book)).thenReturn(book);
        assertEquals(book, bookService.saveBook(book));
    }

    @Test
    void getBook() {
        Genre genre = new Genre("story");
        Author author = new Author("Prishvin");
        Book book = new Book("Kashcheeva chain. The bishop", author, genre);
        Optional<Book> optional = Optional.of(book);
        int id = 5;
        when(repository.findById(id)).thenReturn(optional);
        assertEquals(optional, bookService.getBook(id));
    }

    @Test
    void delete() {
        int id = 1;
        bookService.delete(id);
        verify(repository, times(1)).deleteById(id);
    }
}