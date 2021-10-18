package pavel.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pavel.mvc.Author;
import pavel.mvc.Book;
import pavel.mvc.Comment;
import pavel.mvc.EntityBook;
import pavel.mvc.Genre;
import pavel.mvc.service.MyService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MyController {
   private final MyService service;

    public MyController(MyService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String ShowAllBooks(Model model) {
        List<Book> books = service.getAllBooks();
        model.addAttribute("allBooks", books);
        return "all-books";
    }

    @RequestMapping("/addNewBook")
    public String addNewBook(Model model) {
        EntityBook book = new EntityBook();
        model.addAttribute("book", book);
        return "book";
    }

    @RequestMapping("/addBook")
    public String addBook(@ModelAttribute("book") EntityBook entityBook) {
        service.addBook(new Book(entityBook.getName(), new Author(entityBook.getAuthor()),
                new Genre(entityBook.getGenre()), new Comment(entityBook.getComment())));
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String updateBook(@RequestParam("id") String name, Model model) {
        Book book = service.getBook(name);
        EntityBook entityBook = new EntityBook();
        entityBook.setName(book.getName());
        entityBook.setGenre(book.getGenre().getGenre());
        entityBook.setAuthor(book.getAuthor().getAuthor());
        entityBook.setComment(book.getComment().getDescription());
        if (book.getName() != null) {
            model.addAttribute("book", entityBook);
        }
           return "book";
    }

    @RequestMapping("/askDetails")
    public String askBook() {
        return "details-book";
    }

    @RequestMapping("/showDetails")
    public String showBookDetails(HttpServletRequest request, Model model) {
        String bookName = request.getParameter("bookName");
        model.addAttribute("nameAttribute", bookName);

        return "show-book-view";
    }
}