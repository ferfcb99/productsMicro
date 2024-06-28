package com.productsmicro.services;

import com.productsmicro.models.CategoryDto;
import com.productsmicro.models.ProductDto;

import java.util.List;

/**
 * The interface Category service.
 */
public interface ProductService {

    /**
     * List all list.
     *
     * @return the list
     */
    public List<ProductDto> listAll();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public ProductDto getById(String id);

    /**
     * Create category dto.
     *
     * @param entity the entity
     * @return the category dto
     */
    public ProductDto create(ProductDto entity);

    /**
     * Create many list.
     *
     * @param entities the entities
     * @return the list
     */
    public List<ProductDto> createMany(List<ProductDto> entities);


    /**
     * Update category dto.
     *
     * @param entityProductModify the entity category modify
     * @param id                   the id
     * @return the category dto
     */
    public ProductDto update(ProductDto entityProductModify, String id);


    /**
     * Delete by id category dto.
     *
     * @param id the id
     * @return the category dto
     */
    public ProductDto deleteById(String id);
}
