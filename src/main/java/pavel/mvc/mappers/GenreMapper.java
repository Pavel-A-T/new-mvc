package pavel.mvc.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pavel.mvc.dto.GenreDto;
import pavel.mvc.entities.Genre;

@Mapper
public interface GenreMapper {
    GenreMapper INSTANCE = Mappers.getMapper(GenreMapper.class );
    GenreDto genreToGenreDto(Genre genre);
}