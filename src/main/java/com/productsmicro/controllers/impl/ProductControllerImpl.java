package com.productsmicro.controllers.impl;

import com.productsmicro.constants.ApiResponseConstants;
import com.productsmicro.controllers.ProductController;
import com.productsmicro.models.ProductDto;
import com.productsmicro.publics.ResponseApi;
import com.productsmicro.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductControllerImpl implements ProductController<ProductDto> {

    private ProductService productService;

    @Autowired
    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<List<ProductDto>>> listAll() {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productService.listAll(), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<ProductDto>> getById(@PathVariable String id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productService.getById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<ProductDto>> create(@RequestBody ProductDto entity) {

        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productService.create(entity), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    @PostMapping(value = "/createMany", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<List<ProductDto>>> createMany(@RequestBody List<ProductDto> entities) {
        System.out.println("Entro 6");
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productService.createMany(entities), ApiResponseConstants.GET_DATA_SUCCESS));
    }

    @Override
    public ResponseEntity<ResponseApi<ProductDto>> update(@RequestBody ProductDto entityToModify, @PathVariable  String id) {
        return null;
    }

    @Override
    @DeleteMapping(value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseApi<ProductDto>> deleteById(@PathVariable String id) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productService.deleteById(id), ApiResponseConstants.GET_DATA_SUCCESS));
    }
}
