package com.company;

public class Main {

    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard();
        Bookcase bookcase = new Bookcase();
        Outputinterface(cupboard);
        Outputinterface(bookcase);

        Outputinterface1(cupboard);
        Outputinterface1(bookcase);

        Outputinterface2(cupboard);
        Outputinterface2(bookcase);

    }
    public static void Outputinterface(Furniture furniture){
        furniture.price();
    }

    public static void Outputinterface1(Furniture furniture){
        furniture.manufacturer();
    }
    public static void Outputinterface2(Furniture furniture){
        furniture.material();
    }

}
