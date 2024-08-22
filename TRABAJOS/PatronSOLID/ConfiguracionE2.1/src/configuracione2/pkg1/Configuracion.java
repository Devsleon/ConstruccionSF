/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracione2.pkg1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Seidor Colombia
 */
public class Configuracion {
    private List<Loadable> loadables = new ArrayList<>();
    private List<Saveable> saveables = new ArrayList<>();
    private List<Notificar> notificar = new ArrayList<>();
   

    public void cargarConfiguracion() {               
        loadables.add(new ConfiguracionSistema());
        loadables.add(new ConfiguracionUsuario());
        loadables.add(new ConfiguracionHoraria());        

        for (Loadable l : loadables) {
            l.load();
        }
    }

    public void salvarConfiguracion() {
        ConfiguracionSistema ConfgSis = new ConfiguracionSistema();
        ConfiguracionUsuario ConfgUser = new ConfiguracionUsuario();
        saveables.add(new ConfiguracionSistema());
        saveables.add(new ConfiguracionUsuario());
        for (Saveable s : saveables) {
            s.save();            
        }        
    }    
    public void NotificarConfiguracion(){
        ConfiguracionSistema ConfgSis = new ConfiguracionSistema();
        ConfiguracionUsuario ConfgUser = new ConfiguracionUsuario();
        notificar.add(new ConfiguracionSistema());
        notificar.add(new ConfiguracionUsuario());
        for (Notificar n : notificar) {
            n.notificar();
        }  
    }
}
