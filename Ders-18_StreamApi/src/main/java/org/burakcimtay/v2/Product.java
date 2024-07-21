package org.burakcimtay.v2;

import java.util.StringJoiner;

public class Product {

    private int id;
    private String productName;
    private Float price;

    public Product(int id, String productName, Float price) {
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("productName='" + productName + "'")
                .add("price=" + price)
                .toString();
    }
}
