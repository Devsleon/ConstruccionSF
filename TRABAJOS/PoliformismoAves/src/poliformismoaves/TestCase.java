/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliformismoaves;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Seidor Colombia
 */
public class TestCase {
     public static final Logger Logger = LoggerFactory.getLogger(PoliformismoAves.class);
        public  void canarioTestCase(){
            Canario canario = new Canario();
            Logger.debug("Canario RealizaVuelo");
            System.out.println("Canario RealizaVuelo");
            canario.realizaVuelo();
            Logger.debug("Canario RealizaSonido");
            System.out.println("Canario RealizaSonido");
            canario.realizaSonido();
            System.out.println("Canario cambiando sonido ave");
            canario.setTipoSonido(new Grasnido());
            System.out.println("Canario RealizaSonido");
            canario.realizaSonido();            
        }
}
