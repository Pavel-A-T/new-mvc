package pavel.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pavel.mvc.entities.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
}