package com.example.testexample.Models;

public class OfferModel {
    private String name;
    private String desc;
    private String image;
    private String groupName;

    public OfferModel(String name, String desc, String image, String groupName) {
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}

