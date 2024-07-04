package com.productsmicro.services;

import com.productsmicro.models.ProductImageDto;

import java.util.List;

/**
 * The interface Product image service.
 */
public interface ProductImageService {


    /**
     * Gets all product images by product id.
     *
     * @param productId the product id
     * @return the all product images by product id
     */
    public List<ProductImageDto> getAllProductImagesByProductId(String productId);

}
