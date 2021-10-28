package pavel.mvc.service;

import pavel.mvc.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    List<Comment> getCommentsByBookId(int id);
}