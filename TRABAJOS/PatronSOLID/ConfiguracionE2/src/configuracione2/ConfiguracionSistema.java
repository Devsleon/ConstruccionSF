package configuracione2;


import configuracione2.RecursoPersistente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Seidor Colombia
 */
public class ConfiguracionSistema implements RecursoPersistente{
    @Override
    public void load(){
        System.out.println("Configuracion sistema cargada");
    }
    @Override
    public void save(){
        System.out.println("Configuracion sistema almacenada");
    }
}
