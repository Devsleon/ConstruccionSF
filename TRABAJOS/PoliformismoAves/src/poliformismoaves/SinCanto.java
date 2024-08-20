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
public class SinCanto  implements TipoSonido{
public static final Logger Logger = LoggerFactory.getLogger(SinCanto.class);
    
    public void makeSound() {
        Logger.debug("<<Silencio>>");
        System.out.println("<<Silencio>>");
    }
    
}
