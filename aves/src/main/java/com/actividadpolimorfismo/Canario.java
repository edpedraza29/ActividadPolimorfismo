package com.actividadpolimorfismo;

public class Canario extends Ave{
    @Override
    public void makeSound(){
        System.out.println("Canario");
    }
    @Override
    public void vuela(){
        System.out.println("vuela con alas");
    }
}