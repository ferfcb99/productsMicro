package com.productsmicro.services;


import com.productsmicro.entities.Genre;
import com.productsmicro.models.GenreDto;

import java.util.List;

/**
 * Interface for operations on Gender objects.
 *
 */
public interface GenreService {

    /**
     * Retrieves a list of all Gender objects.
     *
     * @return a List of all Gender objects
     */
    public List<GenreDto> listAll();

    /**
     * Retrieves a Gender object by its unique identifier.
     *
     * @param id the unique identifier of the Gender object
     * @return the Gender object with the specified id
     */
    public GenreDto getById(String id);

    /**
     * Creates a new Gender object.
     *
     * @param entity the Gender object to be created
     * @return the created Gender object
     */
    public GenreDto create(GenreDto entity);

    /**
     * Creates multiple new Gender objects.
     *
     * @param entities a List of Gender objects to be created
     * @return a List of the created Gender objects
     */
    public List<GenreDto> createMany(List<GenreDto> entities);

    /**
     * Updates an existing Gender object.
     *
     * @param entityGenreoModify the Gender object with updated information
     * @param id the unique identifier of the Gender object to be updated
     * @return the updated Gender object
     */
    public GenreDto update(GenreDto entityGenreoModify, String id);

    /**
     * Deletes a Gender object by its unique identifier.
     *
     * @param id the unique identifier of the Gender object to be deleted
     * @return the deleted Gender object
     */
    public GenreDto deleteById(String id);
}
