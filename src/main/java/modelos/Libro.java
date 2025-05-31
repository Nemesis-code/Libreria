
package modelos;
//Representa un libro en el inventario.

import java.io.Serializable;


public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public String titulo;
    public String autor;
    public String genero;
    public double precio;
    public int cantidad;
    public String proveedor;//importente para saver de que proveedor viene cada libro
    
}
