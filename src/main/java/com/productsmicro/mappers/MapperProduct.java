package com.productsmicro.mappers;

import com.productsmicro.entities.Product;
import com.productsmicro.models.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class MapperProduct {

    public static Product mapDtoToEntity(ProductDto dto) {
        Product product = new Product();
        product.setProduct_qr(dto.getProduct_qr());
        product.setProduct_name(dto.getProduct_name());
        product.setProduct_size(dto.getProduct_size());
        product.setProduct_color(dto.getProduct_color());
        product.setProduct_weight(dto.getProduct_weight());
        product.setProduct_description(dto.getProduct_description());
        product.setProduct_brand(dto.getProduct_brand());
        product.setProduct_status(dto.getProduct_status());
        product.setProduct_tags(dto.getProduct_tags());
        product.setProduct_width(dto.getProduct_width());
        product.setProduct_sku(dto.getProduct_sku());
        product.setProduct_upc(dto.getProduct_upc());
        product.setProduct_create_date(LocalDate.now());
        product.setProduct_last_update_date(LocalDate.now());
        product.setGenre(
            MapperGenre.mapDtoToEntity(dto.getGenreDto())
        );
        product.setCategory(
            MapperCategory.mapDtoToEntity(dto.getCategoryDto())
        );
        return product;
    }

    public static ProductDto mapEntityToDto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setProduct_qr(product.getProduct_qr());
        productDto.setProduct_name(product.getProduct_name());
        productDto.setProduct_size(product.getProduct_size());
        productDto.setProduct_color(product.getProduct_color());
        productDto.setProduct_weight(product.getProduct_weight());
        productDto.setProduct_description(product.getProduct_description());
        productDto.setProduct_brand(product.getProduct_brand());
        productDto.setProduct_status(product.getProduct_status());
        productDto.setProduct_tags(product.getProduct_tags());
        productDto.setProduct_width(product.getProduct_width());
        productDto.setProduct_sku(product.getProduct_sku());
        productDto.setProduct_upc(product.getProduct_upc());
        productDto.setProduct_create_date(LocalDate.now());
        productDto.setProduct_last_update_date(LocalDate.now());
        productDto.setGenreDto(
                MapperGenre.mapEntityToDto(product.getGenre())
        );
        productDto.setCategoryDto(
                MapperCategory.mapEntityToDto(product.getCategory())
        );
        return productDto;
    }

    public static List<Product> mapListDtoToEntityList(List<ProductDto> dtoList) {
        List<Product> products = new ArrayList<>();
        for (ProductDto dto : dtoList) {
            products.add(mapDtoToEntity(dto));
        }
        return products;
    }

    public static List<ProductDto> mapListEntityToDtoList(List<Product> products) {
        List<ProductDto> dtos = new ArrayList<>();
        for (Product product : products) {
            dtos.add(mapEntityToDto(product));
        }
        return dtos;
    }

}
