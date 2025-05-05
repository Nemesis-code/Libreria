/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.util.Date;

/**
 *
 * @author mynor
 */
public class Venta {
    
    public int id;
    public String comprador;
    public String nit;
    public String direccion;
    public double total;
    public double totalSinIVA;
    public Usuario usuarioVendedor;
    public Date fecha;
    public int cantidad;
    public double descuento;
    public Libro libro;
   
    public void calcularTotales(){
        double iva = 0;
        if (libro != null && cantidad > 0) {
            total = libro.precio * cantidad;
            iva = total * 0.12;
            totalSinIVA = total - iva;
            
        }
    
    }
}
