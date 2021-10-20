package pavel.mvc.service;

import org.springframework.stereotype.Service;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Library;

import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public List<Book> getAllBooks() {
        return Library.getBooks();
    }

    @Override
    public Book addBook(Book book) {
        return Library.addBook(book);
    }

    @Override
    public Optional<Book> getBook(int id) {
        return Library.getBooks().stream().filter(e -> e.getId() == id).findFirst();
    }

    public Book updateBook(Book updateBook) {
        Book book = Library.getBookById(updateBook.getId()).orElse(null);
        if (book != null) {
            Library.getBooks().remove(book);
            Library.getBooks().add(updateBook);
            return updateBook;
        }
        return book;
    }

    @Override
    public Book delete(int id) {
        Book book = Library.getBookById(id).orElse(null);
        if (book != null) {
            Library.getBooks().remove(book);
        }
        return book;
    }
}