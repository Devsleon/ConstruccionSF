/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturadip;

/**
 *
 * @author Seidor Colombia
 */
public class Iva implements CalculadorIVA {
    private static final float IVA = 0.16f;

    @Override
    public float calcularIVA(float importeFactura) {
        return importeFactura * IVA;
    }
}