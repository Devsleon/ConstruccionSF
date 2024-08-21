/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facturasrp;

import java.util.Date;

/**
 *
 * @author Seidor Colombia
 */
public class FacturaSRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Date fechaActual = new Date();
      Factura factura = new Factura("100001", fechaActual, 1000, 10);
      CalculadorDeduccion deducuccion = new CalculadorDeduccion();      
      System.out.println("Deduccion:" + deducuccion.calcularDeduccion(factura));      
      CalculadorIVA iva =new CalculadorIVA();
      System.out.println("IVA:" + iva.calcularIVA(factura));
      CalculadorTotal total = new CalculadorTotal();
      System.out.println("valor Total:" + total.calcularTotal(factura));
      
    }
    
}
