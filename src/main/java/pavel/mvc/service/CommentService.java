package pavel.mvc.service;

import pavel.mvc.dto.CommentDto;
import pavel.mvc.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    List<CommentDto> getCommentsByBookId(int id);
}