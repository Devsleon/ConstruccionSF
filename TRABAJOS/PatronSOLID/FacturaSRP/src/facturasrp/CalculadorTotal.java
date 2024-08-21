/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturasrp;

/**
 *
 * @author Seidor Colombia
 */
public class CalculadorTotal {
    private CalculadorDeduccion calculadorDeduccion = new CalculadorDeduccion();
    private CalculadorIVA calculadorIVA = new CalculadorIVA();

    public float calcularTotal(Factura factura) {
        float deduccion = calculadorDeduccion.calcularDeduccion(factura);
        float iva = calculadorIVA.calcularIVA(factura);
        return (factura.getImporteFactura() - deduccion) + iva;
    }
}
