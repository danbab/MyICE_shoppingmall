package com.course.myice;

public class Stuffs {
    String MD_name;
    String MD_price;
    int image_id;
    int image_id2;
    String MD_text;

    public Stuffs (int id ,int id2, String name, String price,String text){
        this.MD_name=name;
        this.MD_price=price;
        this.image_id=id;
        this.image_id2=id2;
        this.MD_text=text;
    }
    public String getMD_name(){return MD_name;}
    public String getMD_price(){return MD_price;}
    public int getImageID(){return image_id;}
    public int getImageID2(){return image_id;}
    public String getMD_text(){return MD_text;}

}
