package com.productsmicro.services.impl;

import com.productsmicro.entities.Category;
import com.productsmicro.mappers.CategoryMapper;
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
        List<CategoryDto> categoriesDto = CategoryMapper.mapEntityListToDtoList(categories);
        return categoriesDto;
    }

    @Override
    public CategoryDto getById(Long id) {
        Optional<Category> category = this.categoryRepository.findById(id);
        if(!category.isPresent()){
            return null;
        }
        return CategoryMapper.mapEntityToDto(category.get());
    }

    @Override
    public CategoryDto create(CategoryDto entity) {
        Category category;
        try {
            category = this.categoryRepository.save(CategoryMapper.mapDtoToEntity(entity));
            return CategoryMapper.mapEntityToDto(category);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<CategoryDto> createMany(List<CategoryDto> entities) {
        List<Category> categories;
        try {
            categories = this.categoryRepository.saveAll(CategoryMapper.mapDtoListToEntityList(entities));
            return CategoryMapper.mapEntityListToDtoList(categories);
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
            return CategoryMapper.mapEntityToDto(category.get());
        }
        return null;
    }
}
