package pavel.mvc.config;

import static org.mockito.Mockito.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pavel.mvc.controllers.CommentController;
import pavel.mvc.controllers.MyController;
import pavel.mvc.service.BookService;
import pavel.mvc.service.CommentService;

@Configuration
public class TestConfig {

    @Bean
    BookService bookService() {
        return mock(BookService.class);
    }

    @Bean
    MyController myController() {
        return new MyController(bookService());
    }

    @Bean
    CommentService commentService() {
        return mock(CommentService.class);
    }

    @Bean
    CommentController commentController() {
        return new CommentController(commentService());
    }
}