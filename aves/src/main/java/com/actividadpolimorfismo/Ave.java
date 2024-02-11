package com.actividadpolimorfismo;

public abstract class Ave{
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}