package com.actividadpolimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SinVuelo implements TipoVuelo {
    
    public static final Logger logger = LoggerFactory.getLogger(SinVuelo.class);

    @Override
    public void vuelo(){
        logger.debug("no puede volar");
        System.out.println("no puede volar");
    }
}