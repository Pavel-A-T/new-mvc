package pavel.mvc.service;

import org.springframework.stereotype.Service;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.entities.Book;

import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    @Transactional
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    @Transactional
    public Optional<Book> getBook(int id) {
        return bookRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}