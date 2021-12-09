package pavel.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.dao.CommentRepository;
import pavel.mvc.service.BookService;
import pavel.mvc.service.BookServiceImpl;
import pavel.mvc.service.CommentService;
import pavel.mvc.service.CommentServiceImpl;

import static org.mockito.Mockito.mock;

@Configuration
public class TestConfigService {
    @Bean
    BookService bookService() {
        return new BookServiceImpl(bookRepository());
    }

    @Bean
    BookRepository bookRepository() {
        return mock(BookRepository.class);
    }

    @Bean
    CommentRepository commentRepository() {
        return mock(CommentRepository.class);
    }

    @Bean
    CommentService commentService() {
        return new CommentServiceImpl(bookRepository(), commentRepository());
    }
}
