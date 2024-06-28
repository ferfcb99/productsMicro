package com.productsmicro.services.impl;

import com.productsmicro.entities.Category;
import com.productsmicro.mappers.MapperCategory;
import com.productsmicro.models.CategoryDto;
import com.productsmicro.repositories.CategoryRepository;
import com.productsmicro.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * The type Category service.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl (CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> listAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryDto> categoriesDto = MapperCategory.mapEntityListToDtoList(categories);
        return categoriesDto;
    }

    @Override
    public CategoryDto getById(Long id) {
        Optional<Category> category = this.categoryRepository.findById(id);
        if(!category.isPresent()){
            return null;
        }
        return MapperCategory.mapEntityToDto(category.get());
    }

    @Override
    public CategoryDto create(CategoryDto entity) {
        Category category;
        try {
            System.out.println("Entro 1");
            category = this.categoryRepository.save(MapperCategory.mapDtoToEntity(entity));
            return MapperCategory.mapEntityToDto(category);
        }catch(Exception e){
            System.out.println("Entro 1");
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public List<CategoryDto> createMany(List<CategoryDto> entities) {
        List<Category> categories;
        try {
            categories = this.categoryRepository.saveAll(MapperCategory.mapDtoListToEntityList(entities));
            return MapperCategory.mapEntityListToDtoList(categories);
        }catch(Exception e){
            return null;
        }
    }

    @Override
    public CategoryDto update(CategoryDto entityCategoryModify, Long id) {
        return null;
    }

    @Override
    public CategoryDto deleteById(Long id) {
        Optional<Category> category = this.categoryRepository.findById(id);
        if(category.isPresent()){
            this.categoryRepository.deleteById(id);
            return MapperCategory.mapEntityToDto(category.get());
        }
        return null;
    }
}
