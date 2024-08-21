/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturadip;

import java.util.Date;

/**
 *
 * @author Seidor Colombia
 */
public class Factura {
private String codigo;
    private Date fechaEmision;
    private float importeFactura;
    private float importeIVA;
    private float importeDeduccion;
    private float importeTotal;
    private int porcentajeDeduccion;

    private CalculadorDeduccion calculadorDeduccion;
    private CalculadorIVA calculadorIVA;

    // Constructor que recibe las dependencias
    public Factura(CalculadorDeduccion calculadorDeduccion, CalculadorIVA calculadorIVA) {
        this.calculadorDeduccion = calculadorDeduccion;
        this.calculadorIVA = calculadorIVA;
    }

    // Método que calcula el total de la factura
    public float calcularTotal() {
        importeDeduccion = calculadorDeduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);
        importeIVA = calculadorIVA.calcularIVA(importeFactura);
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
        System.out.println(importeTotal);
        return importeTotal;
    }
    
}
