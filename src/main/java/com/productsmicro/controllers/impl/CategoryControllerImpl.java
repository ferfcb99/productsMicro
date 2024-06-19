package com.productsmicro.controllers.impl;

import com.productsmicro.constants.ApiResponseConstants;
import com.productsmicro.controllers.CategoryController;
import com.productsmicro.models.CategoryDto;
import com.productsmicro.publics.ResponseApi;
import com.productsmicro.services.CategoryService;
import com.productsmicro.services.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/categories")
public class CategoryControllerImpl implements CategoryController<CategoryDto> {

    private CategoryService categoryService;;

    @Autowired
    public CategoryControllerImpl (CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @Override
    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<List<CategoryDto>>> listAll() {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.categoryService.listAll(), ApiResponseConstants.GET_DATA_SUCCESS));
    }


    @Override
    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<CategoryDto>> getById(@PathVariable Long id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.categoryService.getById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<CategoryDto>> create(@RequestBody CategoryDto entity) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.categoryService.create(entity), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/createMany", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<List<CategoryDto>>> createMany(@RequestBody List<CategoryDto> entities) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.categoryService.createMany(entities), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    public ResponseEntity<ResponseApi<CategoryDto>> update(@RequestBody CategoryDto entityToModify, @PathVariable String id) {
        return null;
    }

    @Override
    @DeleteMapping(value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<CategoryDto>> deleteById( @PathVariable Long id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.categoryService.deleteById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }
}
