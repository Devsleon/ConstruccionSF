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
public class VueloConAlas implements TipoVuelo{
    public static final Logger Logger = LoggerFactory.getLogger(VueloConAlas.class);
    
    public void vuelo() {
        Logger.debug("Esta volando, aleteando");
        System.out.println("Esta volando, aleteando");        
    }
    
}
