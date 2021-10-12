package com.example.homefragment;

public class DataModelFragmentKajianFavorite {

    int image_header;
    String title, desc;

    public DataModelFragmentKajianFavorite(int image_header, String title, String desc) {
        this.image_header = image_header;
        this.title = title;
        this.desc = desc;
    }

    public int getImage_header() {
        return image_header;
    }

    public void setImage_header(int image_header) {
        this.image_header = image_header;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
