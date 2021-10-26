package pavel.mvc.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import pavel.mvc.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}