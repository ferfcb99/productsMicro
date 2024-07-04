package com.productsmicro.models;

public class ProductImageDto {

    private Long image_id;

    private String image_base;

    private String width;

    private String height;

    private String product_qr;

    public ProductImageDto() {
    }

    public ProductImageDto(Long image_id, String image_base, String width, String height, String product_qr) {
        this.image_id = image_id;
        this.image_base = image_base;
        this.width = width;
        this.height = height;
        this.product_qr = product_qr;
    }

    public Long getImage_id() {
        return image_id;
    }

    public void setImage_id(Long image_id) {
        this.image_id = image_id;
    }

    public String getImage_base() {
        return image_base;
    }

    public void setImage_base(String image_base) {
        this.image_base = image_base;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getProduct_id() {
        return product_qr;
    }

    public void setProduct_id(String product_id) {
        this.product_qr = product_id;
    }

    @Override
    public String toString() {
        return "ProductImageDto{" +
                "image_id=" + image_id +
                ", image_base='" + image_base + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", product_id=" + product_qr +
                '}';
    }
}
