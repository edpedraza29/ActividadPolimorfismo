package com.actividadpolimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VueloConAlas implements TipoVuelo {

    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);

    @Override
    public void vuelo(){
        logger.debug("Esta volando, aleteando");
        System.out.println("Esta volando, aleteando");
    }
    
}