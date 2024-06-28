package com.productsmicro.services.impl;

import com.productsmicro.entities.Product;
import com.productsmicro.mappers.MapperProduct;
import com.productsmicro.models.ProductDto;
import com.productsmicro.repositories.ProductRepository;
import com.productsmicro.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDto> listAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = MapperProduct.mapListEntityToDtoList(products);
        return productDtos;
    }

    @Override
    public ProductDto getById(String id) {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()) {
            return MapperProduct.mapEntityToDto(product.get());
        }
        return null;
    }

    @Override
    public ProductDto create(ProductDto entity) {
        Product product;
        try{
            product = this.productRepository.save(MapperProduct.mapDtoToEntity(entity));
            return MapperProduct.mapEntityToDto(product);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<ProductDto> createMany(List<ProductDto> dtos) {
        List<Product> products = new ArrayList<>();
        try{
            products = this.productRepository.saveAll(MapperProduct.mapListDtoToEntityList(dtos));
            return MapperProduct.mapListEntityToDtoList(products);
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ProductDto update(ProductDto entityProductModify, String id) {
        return null;
    }

    @Override
    public ProductDto deleteById(String id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            this.productRepository.deleteById(id);
            return MapperProduct.mapEntityToDto(product.get());
        }
        return null;
    }
}
