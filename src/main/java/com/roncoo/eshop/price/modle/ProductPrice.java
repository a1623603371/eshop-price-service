package com.roncoo.eshop.price.modle;

public class ProductPrice {
    private  Long id;
    private Double value;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", productId=" + productId +
                '}';
    }
}
