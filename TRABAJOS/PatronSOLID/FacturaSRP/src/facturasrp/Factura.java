/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facturasrp;

import java.util.Date;

/**
 *
 * @author Seidor Colombia
 */
public class Factura {
    private String codigo;
    private Date fechaEmision;
    private float importeFactura;
    private float porcentajeDeduccion;
    
   public Factura(String codigo, Date fechaEmision, float importeFactura, float porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }  
    public String getCodigo() {
       return codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public float getImporteFactura() {
        return importeFactura;
    }

    public float getPorcentajeDeduccion() {
        return porcentajeDeduccion;
    }
}
