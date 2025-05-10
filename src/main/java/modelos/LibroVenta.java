/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * Representa un libro específico dentro de una venta.
 */
public class LibroVenta {
    
    public String titulo;
    public int cantidad;
    public double precio;
    
    public double getSubtotal() {
        return cantidad * precio;
    }
    
    @Override
    public String toString() {
        return titulo + " (" + cantidad + ") - Q" + precio;
    }
    
    
   
}
