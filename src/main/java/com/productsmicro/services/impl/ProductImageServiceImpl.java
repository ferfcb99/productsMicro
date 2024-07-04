package com.productsmicro.services.impl;


import com.productsmicro.models.ProductImageDto;
import com.productsmicro.repositories.ProductImageRepository;
import com.productsmicro.services.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Product image service.
 */
@Service
public class ProductImageServiceImpl implements ProductImageService {

    private ProductImageRepository productImageRepository;

    /**
     * Instantiates a new Product image service.
     *
     * @param productImageRepository the product image repository
     */
    @Autowired
    public ProductImageServiceImpl(ProductImageRepository productImageRepository) {
        this.productImageRepository = productImageRepository;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<ProductImageDto> getAllProductImagesByProductId(String productId) {
        try {
            System.out.println("Entro aqui");
            return this.productImageRepository.findByProductId(productId);
        }catch(Exception e){
            System.out.println("Entro aqui 2");
            e.printStackTrace();
            return null;
        }
    }
}
