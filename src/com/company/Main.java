package com.company;
import static java.awt.Frame.NORMAL;

public class Main {

    public static void main(String[] args) {

        Pizzas miPizza;

        Pizzas pisa = new Builder()
                .setMasa(NORMAL)
                .setRelleno(true)
                .build();

        System.out.println(pisa.toString());

        Pizzas pimpsa = new Builder()
                .setMasa(NORMAL)
                .setRelleno(false)
                .setTipo(2)
                .cebolla(false)
                .setChampiñones(true)
                .setJamon(true)
                .build();

        System.out.println(pimpsa.toString());
    }
}