package com.example.homefragment;

public class DataModelCart {
    int image;
    String txtCheckBox, nameProduct, colorProduct,sizeProduct, priceProduct;

    public DataModelCart(int image, String txtCheckBox, String nameProduct, String colorProduct, String sizeProduct, String priceProduct) {
        this.image = image;
        this.txtCheckBox = txtCheckBox;
        this.nameProduct = nameProduct;
        this.colorProduct = colorProduct;
        this.sizeProduct = sizeProduct;
        this.priceProduct = priceProduct;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxtCheckBox() {
        return txtCheckBox;
    }

    public void setTxtCheckBox(String txtCheckBox) {
        this.txtCheckBox = txtCheckBox;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getColorProduct() {
        return colorProduct;
    }

    public void setColorProduct(String colorProduct) {
        this.colorProduct = colorProduct;
    }

    public String getSizeProduct() {
        return sizeProduct;
    }

    public void setSizeProduct(String sizeProduct) {
        this.sizeProduct = sizeProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }
}
