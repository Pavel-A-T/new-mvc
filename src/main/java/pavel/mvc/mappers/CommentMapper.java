package pavel.mvc.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pavel.mvc.dto.CommentDto;
import pavel.mvc.entities.Comment;

@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class );
    CommentDto commentToCommentDto(Comment comment);
}