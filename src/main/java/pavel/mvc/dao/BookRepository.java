package pavel.mvc.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pavel.mvc.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}