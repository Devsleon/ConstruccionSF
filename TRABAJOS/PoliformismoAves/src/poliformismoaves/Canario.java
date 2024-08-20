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
public class Canario extends Ave {
    public static final Logger Logger = LoggerFactory.getLogger(Canario.class);
    public Canario(){
           Logger.debug("instanciando un canario");
           this.setTipoSonido(new Canto()); 
           this.setTipoVuelo(new VueloConAlas());
    }    

}
