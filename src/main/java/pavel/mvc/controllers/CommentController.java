package pavel.mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pavel.mvc.dto.CommentDto;
import pavel.mvc.service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @GetMapping("/comments/{id}")
    public List<CommentDto> showCommentsByBookId(@PathVariable(value = "id") int id) {
        List<CommentDto> comments = service.getCommentsByBookId(id);
        return comments;
    }
}