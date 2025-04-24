/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import java.util.ArrayList;
import java.util.Date;


public class Libreria {

    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Cupones> cupones = new ArrayList<>();
    public static ArrayList<Libro> libros = new ArrayList<>();
    
    public static void main(String[] args){
        
        Usuario admin = new Usuario();
        admin.nombre = "admin";
        admin.password = "admin";
        admin.rol = "A";
        admin.usuario = "admin";
        usuarios.add(admin);
        
        Usuario vendedor = new Usuario();
        vendedor.nombre = "vendedor";
        vendedor.password = "vendedor";
        vendedor.rol = "V";
        vendedor.usuario = "vendedor";
        
        Cupones cupon1 = new Cupones();
        cupon1.codigo = "DESC10";
        cupon1.monto = 10;         
        cupon1.tipo = "%";        
        cupon1.fecha = new Date(); 

        Cupones cupon2 = new Cupones();
        cupon2.codigo = "BIENVENIDA";
        cupon2.monto = 15;
        cupon2.tipo = "Q";
        cupon2.fecha = new Date();
        
        LibroVenta l1 = new LibroVenta();
        l1.titulo = "El Principito";
        l1.autor = "Antoine de Saint-Exupéry";
        l1.genero = "Infaltil";
        l1.precio = 50;
        l1.cantidad = 10;
        
        LibroVenta l2 = new LibroVenta();
        l2.titulo = "1984";
        l2.autor = "George Orwell";
        l2.genero = "Ciencia Ficcion";
        l2.precio = 75;
        l2.cantidad = 5;
        
        LibroVenta l3 = new LibroVenta();
        l3.titulo = "Cien años de soledad";
        l3.autor = "Gabriel García Márquez";
        l3.genero = "Novela";
        l3.precio = 90;
        l3.cantidad = 8;
        
        vendedor.librosVenta.add(l1);
        vendedor.librosVenta.add(l2);
        vendedor.librosVenta.add(l3);
        
        cupones.add(cupon1);
        cupones.add(cupon2);

        usuarios.add(vendedor);
        
        Login l = new Login();
        l.setVisible(true);
    
    
    }
    
}
