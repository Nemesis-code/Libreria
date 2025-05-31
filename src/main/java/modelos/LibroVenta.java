/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * Representa un libro específico dentro de una venta.
 */
public class LibroVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    
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
