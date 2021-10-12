package com.example.homefragment;

public class DataModelProduct {
    int image;
    String name_product, price_product;

    public DataModelProduct(int image, String name_product, String price_product) {
        this.image = image;
        this.name_product = name_product;
        this.price_product = price_product;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getPrice_product() {
        return price_product;
    }

    public void setPrice_product(String price_product) {
        this.price_product = price_product;
    }
}
