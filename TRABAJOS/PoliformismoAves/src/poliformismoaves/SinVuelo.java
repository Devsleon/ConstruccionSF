/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliformismoaves;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
/**
 *
 * @author Seidor Colombia
 */
public class SinVuelo implements TipoVuelo{
public static final Logger Logger = LoggerFactory.getLogger(SinVuelo.class);
    
    public void vuelo() {
        Logger.debug("No puedo volar");
        System.out.println("No puedo volar");        
    }
    
}
