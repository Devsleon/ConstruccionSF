package poliformismoaves;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author Seidor Colombia
 */
public class AvesTruz extends Ave{

   public static final Logger Logger = LoggerFactory.getLogger(AvesTruz.class);
   
   public AvesTruz(){
       Logger.debug("instanciando aveztruz");
       this.setTipoSonido(new SinCanto()); 
       this.setTipoVuelo(new SinVuelo());
   }
           
}
