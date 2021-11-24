package com.company;

public class Cupboard implements Furniture {
    public int price1 = 45000;
    public String Manufacturer = "Russia";
    public String Material = "oaken";


    public void price(){
        System.out.println("price cupboard =" + this.price1);
    }
    public void manufacturer(){
        System.out.println("made in "+ this.Manufacturer);
    }
    public void material(){
        System.out.println("material: "+ this.Material);
    }


}
