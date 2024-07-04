package com.productsmicro.repositories;

import com.productsmicro.entities.ProductImage;
import com.productsmicro.models.ProductImageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {

    @Query("SELECT new com.productsmicro.models.ProductImageDto(pi.image_id, pi.image_base, pi.width, pi.height, pi.product.product_qr) FROM ProductImage pi WHERE pi.product.product_qr = :productId")
    public List<ProductImageDto> findByProductId(@PathVariable String productId);

}
