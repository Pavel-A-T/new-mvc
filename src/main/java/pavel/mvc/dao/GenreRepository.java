package pavel.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pavel.mvc.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}