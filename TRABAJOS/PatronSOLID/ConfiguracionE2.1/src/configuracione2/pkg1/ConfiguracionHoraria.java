/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package configuracione2.pkg1;

/**
 *
 * @author Seidor Colombia
 */
public class ConfiguracionHoraria implements Loadable,Notificable {
 @Override
 public void load() {
        System.out.println("Configuracion horaria cargada");
    }  

    @Override
    public void notificable() {
        System.out.println("Notificar");
    }
}
