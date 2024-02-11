package com.actividadpolimorfismo;

public class Canario extends Ave implements Volar{
    @Override
    public void makeSound(){
        System.out.println("Canario");
    }

    public void vuela(){
        System.out.println("vuela con alas");
    }
}