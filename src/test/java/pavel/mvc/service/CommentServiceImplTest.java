package pavel.mvc.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pavel.mvc.config.TestConfigService;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.dao.CommentRepository;
import pavel.mvc.entities.Author;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Comment;
import pavel.mvc.entities.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfigService.class,
        loader = AnnotationConfigContextLoader.class)
class CommentServiceImplTest {

    @Autowired
    private CommentService service;
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private BookRepository bookRepository;

    @Test
    void getAllComments() {
        List<Comment> comments = Arrays.asList(
                new Comment("Super!"),
                new Comment("It's good.")
        );
        when(commentRepository.findAll()).thenReturn(comments);
        assertEquals(comments, service.getAllComments());
    }


    @Test
    void getCommentsByBookId() {
        int id = 25;
        Genre genre = new Genre("story");
        Author author = new Author("Prishvin");
        Book book = new Book("Kashcheeva chain. The bishop", author, genre);
        List<Comment> commentList = Arrays.asList(
                new Comment("super"),
                new Comment("not bad")
        );
        book.setComment(commentList);
        Optional<Book> optional = Optional.of(book);

        when(bookRepository.findById(id)).thenReturn(optional);

        assertThat(service.getCommentsByBookId(id), containsInAnyOrder(
                hasProperty("description", is("super")),
                hasProperty("description", is("not bad"))
        ));

    }
}