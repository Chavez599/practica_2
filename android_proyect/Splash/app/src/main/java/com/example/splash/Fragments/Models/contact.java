package com.example.splash.Fragments.Models;

public class contact {
    private  String name;
    private  int img;

    public contact (String name, int img) {
        this.name = name;
        this.img = img;
    }
   public String getName () { return name; }

   public void  setName (String name) { this.name = name; }

   public  int getImg() {return  img; }

   public  void  setImg(int img) { this.img = img;}
}
