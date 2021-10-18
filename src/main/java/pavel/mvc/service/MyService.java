package pavel.mvc.service;

import org.springframework.stereotype.Service;
import pavel.mvc.Book;
import pavel.mvc.Library;

import java.util.List;

@Service
public class MyService {

    public List<Book> getAllBooks() {
        return Library.getBooks();
    }

    public boolean addBook(Book book) {
        return Library.addBook(book);
    }

    public Book getBook(String name) {
        return Library.getBooks().stream().filter(e -> e.getName().equals(name)).findFirst().orElse(new Book());
    }
}