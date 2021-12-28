package pavel.mvc.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pavel.mvc.dto.BookDto;
import pavel.mvc.entities.Book;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class );
    BookDto bookToBookDto(Book book);
    }