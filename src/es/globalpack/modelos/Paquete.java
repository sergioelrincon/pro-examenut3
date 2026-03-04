/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.modelos;

import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author isard
 */
public class Paquete extends Envio implements Asegurable {
    private double volumen;

    public Paquete(String idSeguimiento, double peso, Direccion destino, double volumen) {
        super(idSeguimiento, peso, destino);
        this.volumen = volumen;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 5.0; 
        
        precio += (peso - 5) * 2.0;
        
        if (volumen > 1)
            precio += 10.0;
        
        return (precio);
    }

    @Override
    public double calcularSeguro(double valorMercancia) {
        return (valorMercancia * 0.03);
    }
    
}
