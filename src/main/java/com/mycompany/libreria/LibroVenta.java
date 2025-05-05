/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

/**
 *
 * @author Tronquito
 */
public class LibroVenta {
    
    public String titulo;
    public int cantidad;
    public double precio;
    
    
    @Override
    public String toString() {
        return titulo + " (" + cantidad + ") - Q" + precio;
    }
    /*
    public libroEnVenta (String titulo, int cantidad, double precio){
        this.titulo = titulo;
        this.cantidad = cantidad;
        this.precio = precio;
    
    }
    
    public double getSubtotal() {
        return cantidad * precio;
    }
    */
}
