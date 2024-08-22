/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracione2.pkg1;

/**
 *
 * @author Seidor Colombia
 */
public class ConfiguracionSistema implements Loadable, Saveable, Notificar{
    @Override
    public void load() {
           System.out.println("Configuracion sistema cargada");
       }

    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }   

    @Override
    public void notificar() {
        System.out.println("Notificando Configuracion del sistema");
    }
}
