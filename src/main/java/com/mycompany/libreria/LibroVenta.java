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
    public String autor;
    public String genero;
    public double precio;
    public int cantidad;
    
    @Override
    public String toString() {
        return titulo + " (" + genero + ") - Q" + precio;
    }
}
