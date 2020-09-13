package com.newbie.creational.prototype;

public class ProductFactory {
    Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductFactory(Product product) {
        this.product = product;
    }

    Product cloneCreater(){
        return (Product) product.clone();
    }

}
