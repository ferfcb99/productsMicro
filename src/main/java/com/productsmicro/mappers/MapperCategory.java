package com.productsmicro.mappers;

import com.productsmicro.entities.Category;
import com.productsmicro.models.CategoryDto;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Category mapper.
 */
public final class MapperCategory {

    /**
     * Map dto to entity category.
     *
     * @param dto the dto
     * @return the category
     */
    public static Category mapDtoToEntity(CategoryDto dto) {
        Category category = new Category();
        category.setIdCategory(dto.getIdCategory());
        category.setCategoryName(dto.getCategoryName());
        category.setCategoryDescription(dto.getCategoryDescription());
        category.setSubcategoryName(dto.getSubcategoryName());
        category.setSubcategoryDescription(dto.getSubcategoryDescription());
        category.setImageCategoryDescription(dto.getImageCategoryDescription());
        category.setImageSubcategoryDescription(dto.getImageSubcategoryDescription());
        return category;
    }

    /**
     * Map entity to dto category dto.
     *
     * @param category the category
     * @return the category dto
     */
    public static CategoryDto mapEntityToDto(Category category) {
        CategoryDto dto = new CategoryDto();
        dto.setIdCategory(category.getIdCategory());
        dto.setCategoryName(category.getCategoryName());
        dto.setCategoryDescription(category.getCategoryDescription());
        dto.setSubcategoryName(category.getSubcategoryName());
        dto.setSubcategoryDescription(category.getSubcategoryDescription());
        dto.setImageCategoryDescription(category.getImageCategoryDescription());
        dto.setImageSubcategoryDescription(category.getImageSubcategoryDescription());
        return dto;
    }

    /**
     * Map dto list to entity list list.
     *
     * @param categoryDtoList the category dto list
     * @return the list
     */
    public static List<Category> mapDtoListToEntityList(List<CategoryDto> categoryDtoList){
        List<Category> categoryList = new ArrayList<>();
        for(CategoryDto dto : categoryDtoList){
            categoryList.add(mapDtoToEntity(dto));
        }
        return categoryList;
    }

    /**
     * Map entity list to dto list list.
     *
     * @param categoryList the category list
     * @return the list
     */
    public static List<CategoryDto> mapEntityListToDtoList(List<Category> categoryList){
        List<CategoryDto> categoryDtoList = new ArrayList<>();
        for(Category category : categoryList){
            categoryDtoList.add(mapEntityToDto(category));
        }
        return categoryDtoList;
    }

}
