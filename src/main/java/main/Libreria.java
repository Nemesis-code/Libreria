/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import vistas.Login;
import modelos.Proveedor;
import modelos.Venta;
import modelos.Cupon;
import modelos.Usuario;
import modelos.Libro;
import java.util.ArrayList;
import java.util.List;
import util.PersistenciaBinaria;// Clase que gestiona la carga/guardado binario

public class Libreria {
    // Lista de usuarios del sistema
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static ArrayList<Cupon> cupones = new ArrayList<>();
    public static ArrayList<Libro> libros = new ArrayList<>();
    public static ArrayList<Venta> ventas = new ArrayList<>();
    public static ArrayList<Proveedor> proveedores = new ArrayList<>();

    public static void main(String[] args) {
        cargarTodo(); // Carga datos desde archivos binarios si existen

        // Crear usuario admin si es la primera vez que se corre
        if (usuarios.isEmpty()) {
            Usuario admin = new Usuario();
            admin.nombre = "admin";
            admin.password = "admin";
            admin.rol = "A";
            admin.usuario = "admin";
            usuarios.add(admin);
        }

        Login l = new Login();
        l.setVisible(true);

    }

    public static void cargarTodo() {
        List<Usuario> listaUsuarios = PersistenciaBinaria.cargarLista("usuarios.dat");
        if (listaUsuarios != null) {
            usuarios = new ArrayList<>(listaUsuarios);// Reemplaza la lista vacía por los datos cargados
        
        }

        List<Libro> listaLibros = PersistenciaBinaria.cargarLista("libros.dat");
        if (listaLibros != null) {
            libros = new ArrayList<>(listaLibros);
        }

        List<Proveedor> listaProveedores = PersistenciaBinaria.cargarLista("proveedores.dat");
        if (listaProveedores != null) {
            proveedores = new ArrayList<>(listaProveedores);
        }

        List<Cupon> listaCupones = PersistenciaBinaria.cargarLista("cupones.dat");
        if (listaCupones != null) {
            cupones = new ArrayList<>(listaCupones);
        }

        List<Venta> listaVentas = PersistenciaBinaria.cargarLista("ventas.dat");
        if (listaVentas != null) {
            ventas = new ArrayList<>(listaVentas);
        }
    }

    public static void guardarTodo() {
        PersistenciaBinaria.guardarLista(usuarios, "usuarios.dat");
        PersistenciaBinaria.guardarLista(libros, "libros.dat");
        PersistenciaBinaria.guardarLista(proveedores, "proveedores.dat");
        PersistenciaBinaria.guardarLista(cupones, "cupones.dat");
        PersistenciaBinaria.guardarLista(ventas, "ventas.dat");
    }

}
