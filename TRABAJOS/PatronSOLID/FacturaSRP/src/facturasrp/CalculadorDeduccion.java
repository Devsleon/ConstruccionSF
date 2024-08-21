/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturasrp;

/**
 *
 * @author Seidor Colombia
 */
public class CalculadorDeduccion {
 public float calcularDeduccion(Factura factura) {
        float deduccion;
        if (factura.getImporteFactura() > 10000) {
            deduccion = (factura.getImporteFactura() * (factura.getPorcentajeDeduccion() + 3)) / 100;
        } else {
            deduccion = (factura.getImporteFactura() * factura.getPorcentajeDeduccion()) / 100;
        }
        return deduccion;
    }    
}
