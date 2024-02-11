package com.actividadpolimorfismo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;


public class TestCase {

    public static final Logger logger = LoggerFactory.getLogger(TestCase.class);
    
    public void canarioTestCase(){
        Canario canario = new Canario();
        Assert.assertNotNull(canario);

        logger.debug("canario realizaVuelo");
        System.out.println("canario realiza vuelo");
        canario.realizaVuelo();
        logger.debug("canario realizaSonido");
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
        System.out.println("canario cambiando soido ave");
        canario.setTipoSonido(new Grasnido());
        System.out.println("canario realizaSonido");
        canario.realizaSonido();
    }

}