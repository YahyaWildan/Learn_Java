package com.example.homefragment;

public class DataModelFragmentKajianRecommendation {
    int img_header;
    String title, desc;

    public DataModelFragmentKajianRecommendation(int img_header, String title, String desc) {
        this.img_header = img_header;
        this.title = title;
        this.desc = desc;
    }

    public int getImg_header() {
        return img_header;
    }

    public void setImg_header(int img_header) {
        this.img_header = img_header;
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
