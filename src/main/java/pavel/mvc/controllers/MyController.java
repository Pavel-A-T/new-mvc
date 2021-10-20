package pavel.mvc.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pavel.mvc.entities.Book;
import pavel.mvc.service.MyService;

import java.util.List;

@RestController
@RequestMapping("/")
public class MyController {
   private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public List<Book> ShowAllBooks() {
        List<Book> books = service.getAllBooks();
        return books;
    }

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping("/book/{id}")
    public Book addBook(@PathVariable int id) {
        Book book = service.getBook(id).orElse(null);
        return book;
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public Book deleteBook(@PathVariable(value = "id") int id) {
        return service.delete(id);
    }
}