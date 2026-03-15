/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;
import java.util.Objects;

/**
 *
 * @author isard
 */
public abstract class Envio {
    
    protected String idSeguimiento;
    protected double peso;
    protected Direccion destino;
    public String[] historialParadas;

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Envio other = (Envio) obj;
        
        return other.idSeguimiento.equals(idSeguimiento);
    }
    


    public Envio(String idSeguimiento, double peso, Direccion destino) {
        this.idSeguimiento = idSeguimiento;
        this.peso = peso;
        this.destino = destino;
        historialParadas = new String[3];
        historialParadas[0] = "Sin registro";
        historialParadas[1] = "Sin registro";
        historialParadas[2] = "Sin registro";
    }
    
    public abstract double calcularPrecioFinal();
    
}
