package pavel.mvc.service;

import pavel.mvc.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAllBooks();
    Book saveBook(Book book);
    Optional<Book> getBook(int id);
    void delete(int id);
}