package com.example.homefragment;

public class DataModelFragmentKajianMenuSejarah {
    int image;
    String txtTitle, txtDesc;

    public DataModelFragmentKajianMenuSejarah(int image, String txtTitle, String txtDesc) {
        this.image = image;
        this.txtTitle = txtTitle;
        this.txtDesc = txtDesc;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public String getTxtDesc() {
        return txtDesc;
    }

    public void setTxtDesc(String txtDesc) {
        this.txtDesc = txtDesc;
    }


}
