package com.example.custom_adapter;

public class Costumes {
    private String name;
    private int image;
    private int level;
    private String category;


    public Costumes(String name, int image, int level, String category) {
        this.name = name;
        this.image = image;
        this.level = level;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int getLevel() {
        return level;
    }

    public String getCategory() {
        return category;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCategory(String category) {
        this.category = category;
    }


}
