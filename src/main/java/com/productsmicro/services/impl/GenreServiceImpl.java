package com.productsmicro.services.impl;


import com.productsmicro.entities.Genre;
import com.productsmicro.mappers.MapperGenre;
import com.productsmicro.models.GenreDto;
import com.productsmicro.repositories.GenreRepository;
import com.productsmicro.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Genre service implementation
 */
@Service
public class GenreServiceImpl implements GenreService {

    private GenreRepository  genreRepository;

    /**
     * Instantiates a new Genre service.
     *
     * @param genreRepository the genre repository
     */
    @Autowired
    public GenreServiceImpl(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<GenreDto> listAll() {
        List<Genre> genres = this.genreRepository.findAll();
        List<GenreDto> genresDto = MapperGenre.mapEntityListToDtoList(genres);
        return genresDto;
    }

    @Override
    public GenreDto getById(String id) {
        Optional<Genre> genre = this.genreRepository.findById(id);
        if(!genre.isPresent()){
            return null;
        }
        return MapperGenre.mapEntityToDto(genre.get());
    }

    @Override
    public GenreDto create(GenreDto entity) {
        Genre genre;
        try {
            genre = this.genreRepository.save(MapperGenre.mapDtoToEntity(entity));
            return MapperGenre.mapEntityToDto(genre);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<GenreDto> createMany(List<GenreDto> entities) {
        List<Genre> genres = new ArrayList<>();
        try {
            genres = this.genreRepository.saveAll(MapperGenre.mapDtoListToEntityList(entities));
            return MapperGenre.mapEntityListToDtoList(genres);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public GenreDto update(GenreDto entityToModify, String id) {
        return null;
    }

    @Override
    public GenreDto deleteById(String id) {
        Optional<Genre> genre = this.genreRepository.findById(id);
        if(genre.isPresent()){
            this.genreRepository.deleteById(id);
            return MapperGenre.mapEntityToDto(genre.get());
        }
        return null;
    }
}
