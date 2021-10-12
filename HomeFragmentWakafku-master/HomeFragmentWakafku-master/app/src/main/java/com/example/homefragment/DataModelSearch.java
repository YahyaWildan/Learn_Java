package com.example.homefragment;

import android.widget.TextView;

public class DataModelSearch {
    String text_search;

    public DataModelSearch(String text_search) {
        this.text_search = text_search;
    }

    public String getText_search() {
        return text_search;
    }

    public void setText_search(String text_search) {
        this.text_search = text_search;
    }
}
