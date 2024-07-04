package com.productsmicro.entities;


import jakarta.persistence.*;

import java.io.Serializable;

/**
 * The type Product image.
 */
@Entity
@Table(name = "ss_product_image")
public class ProductImage implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ss_image_id", nullable = true, unique = true)
    private Long image_id;

    @Column(name = "ss_image_base")
    private String image_base;

    @Column(name = "ss_width")
    private String width;

    @Column(name = "ss_height")
    private String height;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ss_product_id")
    private Product product;

    /**
     * Instantiates a new Product image.
     */
    public ProductImage() {
    }

    /**
     * Instantiates a new Product image.
     *
     * @param image_id   the image id
     * @param image_base the image base
     * @param width      the width
     * @param height     the height
     * @param product    the product
     */
    public ProductImage(Long image_id, String image_base, String width, String height, Product product) {
        this.image_id = image_id;
        this.image_base = image_base;
        this.width = width;
        this.height = height;
        this.product = product;
    }

    /**
     * Gets image id.
     *
     * @return the image id
     */
    public Long getImage_id() {
        return image_id;
    }

    /**
     * Sets image id.
     *
     * @param image_id the image id
     */
    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    /**
     * Gets image base.
     *
     * @return the image base
     */
    public String getImage_base() {
        return image_base;
    }

    /**
     * Sets image base.
     *
     * @param image_base the image base
     */
    public void setImage_base(String image_base) {
        this.image_base = image_base;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     */
    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * Gets product.
     *
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * Sets product.
     *
     * @param product the product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "image_id=" + image_id +
                ", image_base='" + image_base + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", product=" + product +
                '}';
    }
}
