package pavel.mvc.service;

import org.junit.jupiter.api.Test;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CommentServiceImplTest {

    private CommentRepository commentRepository = mock(CommentRepository.class);
    private BookRepository bookRepository = mock(BookRepository.class);
    private CommentService service = new CommentServiceImpl(bookRepository, commentRepository);

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