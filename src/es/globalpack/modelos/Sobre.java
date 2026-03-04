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
public class Sobre extends Envio {
    private boolean esAcolchado;

    public Sobre(String idSeguimiento, double peso, Direccion destino) {
        super(idSeguimiento, peso, destino);
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = 2.0;
        
        if (esAcolchado)
                precio += 1.5;
        
        if (destino.equals("Las Palmas"))
            precio -= 0.5;
        
        return(precio);
    }
    
    
    
}
