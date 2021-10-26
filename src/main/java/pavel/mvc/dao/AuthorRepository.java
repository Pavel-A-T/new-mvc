package pavel.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pavel.mvc.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}