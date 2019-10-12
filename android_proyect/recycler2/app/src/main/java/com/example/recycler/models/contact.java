package com.example.recycler.models;

public class contact {
    String name;
    int    img;

    public int getImg() {
        return img;
    }

    public contact(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
