package pavel.mvc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pavel.mvc.dao.BookRepository;
import pavel.mvc.dao.CommentRepository;
import pavel.mvc.dto.BookDto;
import pavel.mvc.dto.CommentDto;
import pavel.mvc.entities.Book;
import pavel.mvc.entities.Comment;
import pavel.mvc.mappers.BookMapper;

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
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public List<CommentDto> getCommentsByBookId(int id) {
        Optional<Book> optional = repository.findById(id);
        Book book = optional.get();
        if (book != null) {
            book.getComments();
            BookDto bookDto = BookMapper.INSTANCE.bookToBookDto(book);
            List<CommentDto> comments = bookDto.getComments();
            return comments;
        }
        return null;
    }

}