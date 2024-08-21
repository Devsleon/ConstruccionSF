/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturadip;

import java.util.Date;

/**
 *
 * @author Seidor Colombia
 */
public class FacturaDIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date fechaActual = new Date();
      
      Deduccion deduccion = new Deduccion();      
      System.out.println("Deduccion:" + deduccion.calcularDeduccion(1000, 10));      
      Iva iva =new Iva();      
      System.out.println("IVA:" + iva.calcularIVA(1000));
      Factura factura = new Factura(deduccion, iva);     
      System.out.println("valor Total:" + factura.calcularTotal());
      
      

    }
    
}
