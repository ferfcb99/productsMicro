package com.productsmicro.models;


import java.io.Serializable;

public class CategoryDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2725232380961919393L;

	/**
     * idCategory
     */
    private Long idCategory;

    /**
     * categoryName
     */
    private String categoryName;

    /**
     * categoryDescription
     */
    private String categoryDescription;

    /**
     * subcategoryName
     */
    private String subcategoryName;

    /**
     * subcategoryDescription
     */
    private String subcategoryDescription;

    /**
     * imageCategoryDescription
     */
    private String imageCategoryDescription;

    /**
     * imageSubcategoryDescription
     */
    private String imageSubcategoryDescription;


    /**
     * Instantiates a new Category.
     */
    public CategoryDto() {
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
    public CategoryDto(Long idCategory, String categoryName, String categoryDescription, String subcategoryName, String subcategoryDescription, String imageCategoryDescription, String imageSubcategoryDescription) {
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
        return "CategoryDto{" +
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
