package com.example.testexample.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BanerModel {
    @SerializedName("image")
    @Expose
    private String image;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("desc")
    @Expose
    private String desc;

    /*public BanerModel(String image, String title, String desc) {
        this.image = image;
        this.title = title;
        this.desc = desc;
    }*/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
