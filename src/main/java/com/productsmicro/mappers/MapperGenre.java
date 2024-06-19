package com.productsmicro.mappers;


import com.productsmicro.entities.Genre;
import com.productsmicro.models.GenreDto;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Genre mapper.
 */
public final class MapperGenre {

    /**
     * Map dto to entity genre.
     *
     * @param genreDto the genre dto
     * @return the genre
     */
    public static Genre mapDtoToEntity(GenreDto genreDto) {
        return new Genre(genreDto.getGenre_id(), genreDto.getGenre_name(), genreDto.getGenre_description());
    }

    /**
     * Map entity to dto genre dto.
     *
     * @param genre the genre
     * @return the genre dto
     */
    public static GenreDto mapEntityToDto(Genre genre) {
        return new GenreDto(genre.getGenre_id(), genre.getGenre_name(), genre.getGenre_description());
    }

    /**
     * Map dto list to entity list list.
     *
     * @param genreDtoList the genre dto list
     * @return the list
     */
    public static List<Genre> mapDtoListToEntityList(List<GenreDto> genreDtoList) {
        List<Genre> genreList = new ArrayList<>();
        for (GenreDto genreDto : genreDtoList) {
            genreList.add(mapDtoToEntity(genreDto));
        }
        return genreList;
    }

    /**
     * Map entity list to dto list list.
     *
     * @param genreList the genre list
     * @return the list
     */
    public static List<GenreDto> mapEntityListToDtoList(List<Genre> genreList) {
        List<GenreDto> genreDtoList = new ArrayList<>();
        for (Genre genre : genreList) {
            genreDtoList.add(mapEntityToDto(genre));
        }
        return genreDtoList;
    }

}
