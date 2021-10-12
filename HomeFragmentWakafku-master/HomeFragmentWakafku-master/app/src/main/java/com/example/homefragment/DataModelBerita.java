package com.example.homefragment;

public class DataModelBerita {

    int image;
    String header, desc, time;

    public DataModelBerita(int image, String header, String desc, String time) {
        this.image = image;
        this.header = header;
        this.desc = desc;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
