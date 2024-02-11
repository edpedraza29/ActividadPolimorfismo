package com.actividadpolimorfismo;

public class AvesTruz extends Ave{
    @Override
    public void makeSound(){
        System.out.println("<<Silencio>>");
    }
    @Override
    public void vuela(){
        System.out.println("no vuela");
    }
}