package com.example.homefragment;

public class DataModelFavoriteProduct {
    int image_favorite;
    String name_product, color_product, size_product, price_harga;

    public DataModelFavoriteProduct(int image_favorite, String name_product, String color_product, String size_product, String price_harga) {
        this.image_favorite = image_favorite;
        this.name_product = name_product;
        this.color_product = color_product;
        this.size_product = size_product;
        this.price_harga = price_harga;
    }

    public int getImage_favorite() {
        return image_favorite;
    }

    public void setImage_favorite(int image_favorite) {
        this.image_favorite = image_favorite;
    }

    public String getName_product() {
        return name_product;
    }

    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    public String getColor_product() {
        return color_product;
    }

    public void setColor_product(String color_product) {
        this.color_product = color_product;
    }

    public String getSize_product() {
        return size_product;
    }

    public void setSize_product(String size_product) {
        this.size_product = size_product;
    }

    public String getPrice_harga() {
        return price_harga;
    }

    public void setPrice_harga(String price_harga) {
        this.price_harga = price_harga;
    }
}
