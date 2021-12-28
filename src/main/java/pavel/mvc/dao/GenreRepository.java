package pavel.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pavel.mvc.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}