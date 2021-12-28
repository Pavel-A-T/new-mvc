package pavel.mvc.service;

import pavel.mvc.dto.BookDto;
import pavel.mvc.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<BookDto> getAllBooks();
    Book saveBook(Book book);
    Optional<Book> getBook(int id);
    void delete(int id);
}