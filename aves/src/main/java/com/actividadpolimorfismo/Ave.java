package com.actividadpolimorfismo;

public abstract class Ave{
    private TipoSonido tipoSonido;
    private TipoVuelo tipoVuelo;

    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido = tipoSonido;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
    }

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }
    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}