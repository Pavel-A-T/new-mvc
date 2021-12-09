package pavel.mvc.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import pavel.mvc.config.TestConfig;
import pavel.mvc.dto.CommentDto;
import pavel.mvc.service.CommentService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class,
        loader = AnnotationConfigContextLoader.class)
class CommentControllerTest {

    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentController commentController;


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