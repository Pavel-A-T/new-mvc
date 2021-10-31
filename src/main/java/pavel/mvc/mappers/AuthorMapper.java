package pavel.mvc.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pavel.mvc.dto.AuthorDto;
import pavel.mvc.entities.Author;

@Mapper
public interface AuthorMapper {
    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class );
    AuthorDto authorToAuthorDto(Author author);
}