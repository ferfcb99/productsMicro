package com.productsmicro.services;

import com.productsmicro.models.CategoryDto;


import java.util.List;

/**
 * The interface Category service.
 */
public interface CategoryService {

    /**
     * List all list.
     *
     * @return the list
     */
    public List<CategoryDto> listAll();

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public CategoryDto getById(Long id);

    /**
     * Create category dto.
     *
     * @param entity the entity
     * @return the category dto
     */
    public CategoryDto create(CategoryDto entity);

    /**
     * Create many list.
     *
     * @param entities the entities
     * @return the list
     */
    public List<CategoryDto> createMany(List<CategoryDto> entities);


    /**
     * Update category dto.
     *
     * @param entityCategoryModify the entity category modify
     * @param id                   the id
     * @return the category dto
     */
    public CategoryDto update(CategoryDto entityCategoryModify, Long id);


    /**
     * Delete by id category dto.
     *
     * @param id the id
     * @return the category dto
     */
    public CategoryDto deleteById(Long id);
}
