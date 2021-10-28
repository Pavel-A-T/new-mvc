package pavel.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pavel.mvc.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}