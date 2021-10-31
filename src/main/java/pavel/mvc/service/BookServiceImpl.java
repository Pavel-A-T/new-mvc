package pavel.mvc.service;

import org.springframework.stereotype.Service;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.dto.BookDto;
import pavel.mvc.entities.Book;
import pavel.mvc.mappers.BookMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookDto> bookDtos = books
                .stream()
                .map(book -> BookMapper.INSTANCE.bookToBookDto(book))
                .collect(Collectors.toList());
        return bookDtos;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Optional<Book> getBook(int id) {
        return bookRepository.findById(id);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }
}