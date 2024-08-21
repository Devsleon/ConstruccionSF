/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturasrp;

/**
 *
 * @author Seidor Colombia
 */
public class CalculadorIVA {
     private static final float IVA = 0.16f;

    public float calcularIVA(Factura factura) {
        return factura.getImporteFactura() * IVA;
    }   
}
