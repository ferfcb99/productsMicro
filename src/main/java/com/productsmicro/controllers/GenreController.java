package com.productsmicro.controllers;


import com.productsmicro.publics.ResponseApi;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Interface for operations on Gender objects with ResponseEntity and ResponseApi.
 *
 * @param <T> the type of objects that this service will operate on (Gender)
 */

public interface GenreController<T> {


    /**
     * Retrieves a list of all Gender objects wrapped in a ResponseEntity and ResponseApi.
     *
     * @return a ResponseEntity containing a ResponseApi with a list of all Gender objects
     */
    ResponseEntity<ResponseApi<List<T>>> listAll();

    /**
     * Retrieves a Gender object by its unique identifier wrapped in a ResponseEntity and ResponseApi.
     *
     * @param id the unique identifier of the Gender object
     * @return a ResponseEntity containing a ResponseApi with the Gender object with the specified id
     */
    ResponseEntity<ResponseApi<T>> getById(String id);

    /**
     * Creates a new Gender object wrapped in a ResponseEntity and ResponseApi.
     *
     * @param entity the Gender object to be created
     * @return a ResponseEntity containing a ResponseApi with the created Gender object
     */
    ResponseEntity<ResponseApi<T>> create(T entity);

    /**
     * Creates multiple new Gender objects wrapped in a ResponseEntity and ResponseApi.
     *
     * @param entities a List of Gender objects to be created
     * @return a ResponseEntity containing a ResponseApi with a list of the created Gender objects
     */
    ResponseEntity<ResponseApi<List<T>>> createMany(List<T> entities);

    /**
     * Updates an existing Gender object wrapped in a ResponseEntity and ResponseApi.
     *
     * @param entityToModify the Gender object with updated information
     * @param id the unique identifier of the Gender object to be updated
     * @return a ResponseEntity containing a ResponseApi with the updated Gender object
     */
    ResponseEntity<ResponseApi<T>> update(T entityToModify, String id);

    /**
     * Deletes a Gender object by its unique identifier wrapped in a ResponseEntity and ResponseApi.
     *
     * @param id the unique identifier of the Gender object to be deleted
     * @return a ResponseEntity containing a ResponseApi with the deleted Gender object
     */
    ResponseEntity<ResponseApi<T>> deleteById(String id);


}
