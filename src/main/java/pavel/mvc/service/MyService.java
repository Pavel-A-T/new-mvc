package pavel.mvc.service;

import pavel.mvc.entities.Book;
import pavel.mvc.entities.Library;

import java.util.List;
import java.util.Optional;

public interface MyService {
    List<Book> getAllBooks();
    Book addBook(Book book);
    Optional<Book> getBook(int id);
    Book updateBook(Book updateBook);
    Book delete(int id);
}