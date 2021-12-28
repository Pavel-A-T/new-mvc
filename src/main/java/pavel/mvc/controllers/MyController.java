package pavel.mvc.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pavel.mvc.dto.BookDto;
import pavel.mvc.entities.Book;
import pavel.mvc.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyController {
   private final BookService service;

    public MyController(BookService service) {
        this.service = service;
    }
    @GetMapping("/books")
    public List<BookDto> showAllBooks() {
        List<BookDto> books = service.getAllBooks();
        return books;
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @GetMapping("/book/{id}")
    public Book addBook(@PathVariable int id) {
        Book book = service.getBook(id).orElse(null);
        return book;
    }

    @PutMapping("/book")
    public Book updateBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable(value = "id") int id) {
        service.delete(id);
    }
}