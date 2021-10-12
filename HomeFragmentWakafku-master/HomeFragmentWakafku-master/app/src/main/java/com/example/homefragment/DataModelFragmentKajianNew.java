package com.example.homefragment;

public class DataModelFragmentKajianNew {

    int imageKajianNew;
    String title, desc;

    public DataModelFragmentKajianNew(int imageKajianNew, String title, String desc) {
        this.imageKajianNew = imageKajianNew;
        this.title = title;
        this.desc = desc;
    }

    public int getImageKajianNew() {
        return imageKajianNew;
    }

    public void setImageKajianNew(int imageKajianNew) {
        this.imageKajianNew = imageKajianNew;
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
