package com.productsmicro.entities;


import jakarta.persistence.*;

import java.io.Serializable;

/**
 * The type Category.
 */
@Entity
@Table(name = "ss_category")
public class Category implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6379838338023035059L;

	/**
     * idCategory
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="ss_category_id", nullable = true, unique = true)
    private Long idCategory;

    /**
     * categoryName
     */
    @Column(name="ss_category_name", nullable = false, unique = true)
    private String categoryName;

    /**
     * categoryDescription
     */
    @Column(name="ss_category_descripcion", nullable = false, unique = false)
    private String categoryDescription;

    /**
     * subcategoryName
     */
    @Column(name="ss_subcategory_name", nullable = false, unique = false)
    private String subcategoryName;

    /**
     * subcategoryDescription
     */
    @Column(name="ss_subcategory_description", nullable = false, unique = false)
    private String subcategoryDescription;

    /**
     * imageCategoryDescription
     */
    @Column(name="ss_image_category_description", nullable = true, unique = false)
    private String imageCategoryDescription;

    /**
     * imageSubcategoryDescription
     */
    @Column(name="ss_image_subcategory_description", nullable = true, unique = false)
    private String imageSubcategoryDescription;


    /**
     * Instantiates a new Category.
     */
    public Category() {
    }

    /**
     * Instantiates a new Category.
     *
     * @param idCategory                  the id category
     * @param categoryName                the category name
     * @param categoryDescription         the category description
     * @param subcategoryName             the subcategory name
     * @param subcategoryDescription      the subcategory description
     * @param imageCategoryDescription    the image category description
     * @param imageSubcategoryDescription the image subcategory description
     */
    public Category(Long idCategory, String categoryName, String categoryDescription, String subcategoryName, String subcategoryDescription, String imageCategoryDescription, String imageSubcategoryDescription) {
        this.idCategory = idCategory;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
        this.subcategoryName = subcategoryName;
        this.subcategoryDescription = subcategoryDescription;
        this.imageCategoryDescription = imageCategoryDescription;
        this.imageSubcategoryDescription = imageSubcategoryDescription;
    }

    /**
     * Gets id category.
     *
     * @return the id category
     */
    public Long getIdCategory() {
        return idCategory;
    }

    /**
     * Sets id category.
     *
     * @param idCategory the id category
     */
    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    /**
     * Gets category description.
     *
     * @return the category description
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Sets category description.
     *
     * @param categoryDescription the category description
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    /**
     * Gets category name.
     *
     * @return the category name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * Sets category name.
     *
     * @param categoryName the category name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * Gets subcategory name.
     *
     * @return the subcategory name
     */
    public String getSubcategoryName() {
        return subcategoryName;
    }

    /**
     * Sets subcategory name.
     *
     * @param subcategoryName the subcategory name
     */
    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName;
    }

    /**
     * Gets image category description.
     *
     * @return the image category description
     */
    public String getImageCategoryDescription() {
        return imageCategoryDescription;
    }

    /**
     * Sets image category description.
     *
     * @param imageCategoryDescription the image category description
     */
    public void setImageCategoryDescription(String imageCategoryDescription) {
        this.imageCategoryDescription = imageCategoryDescription;
    }

    /**
     * Gets subcategory description.
     *
     * @return the subcategory description
     */
    public String getSubcategoryDescription() {
        return subcategoryDescription;
    }

    /**
     * Sets subcategory description.
     *
     * @param subcategoryDescription the subcategory description
     */
    public void setSubcategoryDescription(String subcategoryDescription) {
        this.subcategoryDescription = subcategoryDescription;
    }

    /**
     * Gets image subcategory description.
     *
     * @return the image subcategory description
     */
    public String getImageSubcategoryDescription() {
        return imageSubcategoryDescription;
    }

    /**
     * Sets image subcategory description.
     *
     * @param imageSubcategoryDescription the image subcategory description
     */
    public void setImageSubcategoryDescription(String imageSubcategoryDescription) {
        this.imageSubcategoryDescription = imageSubcategoryDescription;
    }

    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                ", subcategoryName='" + subcategoryName + '\'' +
                ", subcategoryDescription='" + subcategoryDescription + '\'' +
                ", imageCategoryDescription='" + imageCategoryDescription + '\'' +
                ", imageSubcategoryDescription='" + imageSubcategoryDescription + '\'' +
                '}';
    }
}
