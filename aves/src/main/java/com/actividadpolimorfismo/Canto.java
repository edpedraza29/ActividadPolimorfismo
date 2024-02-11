package com.actividadpolimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Canto implements TipoSonido{

    public static final Logger logger = LoggerFactory.getLogger(Canto.class);
    
    @Override
    public void makeSound(){
        logger.debug("Estoy cantando");
        System.out.println("Estoy cantando");
    }
}