package com.productsmicro.controllers.impl;

import com.productsmicro.constants.ConstantsApiResponse;
import com.productsmicro.controllers.ProductImageController;
import com.productsmicro.models.ProductImageDto;
import com.productsmicro.publics.ResponseApi;
import com.productsmicro.services.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products_images")
public class ProductImageControllerImpl implements ProductImageController<ProductImageDto> {


    private ProductImageService productImageService;

    @Autowired
    public ProductImageControllerImpl(ProductImageService productImageService) {
        this.productImageService = productImageService;
    }

    @Override
    @GetMapping(value = "/getAllByProductId/{productId}")
    public ResponseEntity<ResponseApi<List<ProductImageDto>>> getAllByProductId(String productId) {
        return ResponseEntity
                .ok(new ResponseApi<>(String.valueOf(HttpStatus.OK), this.productImageService.getAllProductImagesByProductId(productId), ConstantsApiResponse.GET_DATA_SUCCESS));
    }

    @Override
    @GetMapping(value = "/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<List<ProductImageDto>>> listAll() {
        return null;
    }

    @Override
    @GetMapping(value = "/getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<ProductImageDto>> getById(@PathVariable Long id) {
        return null;
    }

    @Override
    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<ProductImageDto>> create(@RequestBody ProductImageDto entity) {
        return null;
    }

    @Override
    @PostMapping(value = "/createMany", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<List<ProductImageDto>>> createMany(@RequestBody List<ProductImageDto> entities) {
        return null;
    }

    @Override
    public ResponseEntity<ResponseApi<ProductImageDto>> update(ProductImageDto entityToModify, Long id) {
        return null;
    }

    @Override
    @DeleteMapping(value = "/deleteById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<ResponseApi<ProductImageDto>> deleteById(Long id) {
        return null;
    }
}
