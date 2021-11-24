package com.company;

public class Bookcase implements Furniture {
    public int price = 56000;
    public String Manufacturer = "China";
    public String Material = "birch";

    public void price(){
        System.out.println("price bookcase =" + this.price);
    }
    public void manufacturer(){
        System.out.println("made in "+this.Manufacturer);
    }
    public void material(){
        System.out.println("material: "+ this.Material);
    }
}
