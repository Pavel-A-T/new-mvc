package pavel.mvc.service;

import org.springframework.stereotype.Service;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.dao.CommentRepository;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Comment;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    private final BookRepository repository;
    private final CommentRepository commentRepository;

    public CommentServiceImpl(BookRepository repository, CommentRepository commentRepository) {
        this.repository = repository;
        this.commentRepository = commentRepository;
    }

    @Override
    @Transactional
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    @Transactional
    public List<Comment> getCommentsByBookId(int id) {
        Optional<Book> book = repository.findById(id);
        List<Comment> comments = book.get().getComments();
        return comments;
    }

}