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
public class Gallina extends Ave {
    public static final Logger Logger = LoggerFactory.getLogger(Gallina.class);
    public Gallina(){
           Logger.debug("instanciando un gallina");
           this.setTipoSonido(new Grasnido());
           this.setTipoVuelo(new VueloConAlas());
    }        
}
