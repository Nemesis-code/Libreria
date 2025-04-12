/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libreria;

import java.util.ArrayList;


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
        usuarios.add(vendedor);
        
        Login l = new Login();
        l.setVisible(true);
    
    
    }
    
}
