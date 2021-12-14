package pavel.mvc.controllers;

import org.junit.jupiter.api.Test;
import pavel.mvc.dto.CommentDto;
import pavel.mvc.service.CommentService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class CommentControllerTest {


    private CommentService commentService = mock(CommentService.class);
    private CommentController commentController = new CommentController(commentService);


    @Test
    void showCommentsByBookId() {
        int id = 5;
        List<CommentDto> expected = Arrays.asList(
                new CommentDto(5, "super"),
                new CommentDto(5, "not bad")
        );
        when(commentService.getCommentsByBookId(id)).thenReturn(expected);
        assertEquals(expected, commentController.showCommentsByBookId(id));
    }
}