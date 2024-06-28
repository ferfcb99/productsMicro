package com.productsmicro.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * The type Product.
 */
@Entity
@Table(name = "ss_product")
public class Product implements Serializable {

    @Id
    @Column(name = "ss_product_qr")
    private String product_qr;

    @Column(name = "ss_product_name")
    private String product_name;

    @Column(name = "ss_product_size")
    private String product_size;

    @Column(name = "ss_product_color")
    private String product_color;

    @Column(name = "ss_product_weight")
    private Double product_weight;

    @Column(name = "ss_product_description")
    private String product_description;

    @Column(name = "ss_product_brand")
    private String product_brand;

    @Column(name = "ss_product_status")
    private String product_status;

    @Column(name = "ss_product_tags")
    private String product_tags;

    @Column(name = "ss_product_width")
    private Double product_width;

    @Column(name = "ss_product_height")
    private Double product_height;

    @Column(name = "ss_product_sku")
    private String product_sku;

    @Column(name = "ss_product_upc")
    private String product_upc;

    @Column(name = "ss_product_create_date")
    private LocalDate product_create_date;

    @Column(name = "ss_product_last_update_date")
    private LocalDate product_last_update_date;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ss_genre_id")
    private Genre genre;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ss_category_id", insertable = true, updatable = true)
    private Category category;


    /**
     * Instantiates a new Product.
     */
    public Product() {
    }

    /**
     * Instantiates a new Product.
     *
     * @param product_qr               the product qr
     * @param product_name             the product name
     * @param product_size             the product size
     * @param product_color            the product color
     * @param product_weight           the product weight
     * @param product_description      the product description
     * @param product_brand            the product brand
     * @param product_status           the product status
     * @param product_tags             the product tags
     * @param product_width            the product width
     * @param product_height           the product height
     * @param product_sku              the product sku
     * @param product_upc              the product upc
     * @param product_create_date      the product create date
     * @param product_last_update_date the product last update date
     * @param genre                    the genre
     * @param category                 the category
     */
    public Product(String product_qr, String product_name, String product_size, String product_color, Double product_weight, String product_description, String product_brand, String product_status, String product_tags, Double product_width, Double product_height, String product_sku, String product_upc, LocalDate product_create_date, LocalDate product_last_update_date, Genre genre, Category category) {
        this.product_qr = product_qr;
        this.product_name = product_name;
        this.product_size = product_size;
        this.product_color = product_color;
        this.product_weight = product_weight;
        this.product_description = product_description;
        this.product_brand = product_brand;
        this.product_status = product_status;
        this.product_tags = product_tags;
        this.product_width = product_width;
        this.product_height = product_height;
        this.product_sku = product_sku;
        this.product_upc = product_upc;
        this.product_create_date = product_create_date;
        this.product_last_update_date = product_last_update_date;
        this.genre = genre;
        this.category = category;
    }


    /**
     * Gets product qr.
     *
     * @return the product qr
     */
    public String getProduct_qr() {
        return product_qr;
    }

    /**
     * Sets product qr.
     *
     * @param product_qr the product qr
     */
    public void setProduct_qr(String product_qr) {
        this.product_qr = product_qr;
    }

    /**
     * Gets product name.
     *
     * @return the product name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * Sets product name.
     *
     * @param product_name the product name
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * Gets product size.
     *
     * @return the product size
     */
    public String getProduct_size() {
        return product_size;
    }

    /**
     * Sets product size.
     *
     * @param product_size the product size
     */
    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    /**
     * Gets product color.
     *
     * @return the product color
     */
    public String getProduct_color() {
        return product_color;
    }

    /**
     * Sets product color.
     *
     * @param product_color the product color
     */
    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    /**
     * Gets product weight.
     *
     * @return the product weight
     */
    public Double getProduct_weight() {
        return product_weight;
    }

    /**
     * Sets product weight.
     *
     * @param product_weight the product weight
     */
    public void setProduct_weight(Double product_weight) {
        this.product_weight = product_weight;
    }

    /**
     * Gets product description.
     *
     * @return the product description
     */
    public String getProduct_description() {
        return product_description;
    }

    /**
     * Sets product description.
     *
     * @param product_description the product description
     */
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    /**
     * Gets product brand.
     *
     * @return the product brand
     */
    public String getProduct_brand() {
        return product_brand;
    }

    /**
     * Sets product brand.
     *
     * @param product_brand the product brand
     */
    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }

    /**
     * Gets product status.
     *
     * @return the product status
     */
    public String getProduct_status() {
        return product_status;
    }

    /**
     * Sets product status.
     *
     * @param product_status the product status
     */
    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }


    /**
     * Gets product tags.
     *
     * @return the product tags
     */
    public String getProduct_tags() {
        return product_tags;
    }

    /**
     * Sets product tags.
     *
     * @param product_tags the product tags
     */
    public void setProduct_tags(String product_tags) {
        this.product_tags = product_tags;
    }

    /**
     * Gets product width.
     *
     * @return the product width
     */
    public Double getProduct_width() {
        return product_width;
    }

    /**
     * Sets product width.
     *
     * @param product_width the product width
     */
    public void setProduct_width(Double product_width) {
        this.product_width = product_width;
    }

    /**
     * Gets product height.
     *
     * @return the product height
     */
    public Double getProduct_height() {
        return product_height;
    }

    /**
     * Sets product height.
     *
     * @param product_height the product height
     */
    public void setProduct_height(Double product_height) {
        this.product_height = product_height;
    }

    /**
     * Gets product sku.
     *
     * @return the product sku
     */
    public String getProduct_sku() {
        return product_sku;
    }

    /**
     * Sets product sku.
     *
     * @param product_sku the product sku
     */
    public void setProduct_sku(String product_sku) {
        this.product_sku = product_sku;
    }

    /**
     * Gets product upc.
     *
     * @return the product upc
     */
    public String getProduct_upc() {
        return product_upc;
    }

    /**
     * Sets product upc.
     *
     * @param product_upc the product upc
     */
    public void setProduct_upc(String product_upc) {
        this.product_upc = product_upc;
    }

    /**
     * Gets product create date.
     *
     * @return the product create date
     */
    public LocalDate getProduct_create_date() {
        return product_create_date;
    }

    /**
     * Sets product create date.
     *
     * @param product_create_date the product create date
     */
    public void setProduct_create_date(LocalDate product_create_date) {
        this.product_create_date = product_create_date;
    }

    /**
     * Gets product last update date.
     *
     * @return the product last update date
     */
    public LocalDate getProduct_last_update_date() {
        return product_last_update_date;
    }

    /**
     * Sets product last update date.
     *
     * @param product_last_update_date the product last update date
     */
    public void setProduct_last_update_date(LocalDate product_last_update_date) {
        this.product_last_update_date = product_last_update_date;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    /**
     * Gets category.
     *
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(Category category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "Product{" +
                ", product_qr='" + product_qr + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_size='" + product_size + '\'' +
                ", product_color='" + product_color + '\'' +
                ", product_weight=" + product_weight +
                ", product_description='" + product_description + '\'' +
                ", product_brand='" + product_brand + '\'' +
                ", product_status='" + product_status + '\'' +
                ", product_tags='" + product_tags + '\'' +
                ", product_width=" + product_width +
                ", product_height=" + product_height +
                ", product_sku='" + product_sku + '\'' +
                ", product_upc='" + product_upc + '\'' +
                ", product_create_date=" + product_create_date +
                ", product_last_update_date=" + product_last_update_date +
                ", genre=" + genre +
                ", category=" + category +
                '}';
    }
}
