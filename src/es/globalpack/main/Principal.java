/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.globalpack.main;

import es.globalpack.modelos.Paquete;
import es.globalpack.modelos.detalles.Direccion;

/**
 *
 * @author isard
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioFinal;
        
        // 1. Instanciar objetos
        Direccion dir = new Direccion("Calle Mayor 5", "35002", "Las Palmas");
        Paquete p1 = new Paquete("GP-999", 8.5, dir, 1.2);
        //Paquete p2 = new Paquete("GP-999", 8.5, dir, 1.2);    // Paquete de prueba, para comprobar el método equals

        // 2. Acceder y modificar el array del historial 
        p1.historialParadas[0] = "Madrid";
        p1.historialParadas[1] = "Sevilla";

        // 3. Recorrer el historial con bucle for y length 
        System.out.println("Historial de paradas del envío:");
        for (int i = 0; i < p1.historialParadas.length; i++) {
            System.out.println("Parada " + i + ": " + p1.historialParadas[i]);
        }

        precioFinal = p1.calcularPrecioFinal();
        System.out.println("Precio final del paquete: " + precioFinal);
        System.out.println("Seguro del paquete: " + p1.calcularSeguro(precioFinal));
        
        /*
        // Comprobamos si los paquetes p1 y p2 son iguales
        if (p2.equals(p1))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
        */
    }    
}
