/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

// Importa la clase Libro desde el paquete modelos
import modelos.Libro;

// Importa clases para trabajar con archivos
import java.io.File;
import java.io.FileReader;

// Importa la clase principal que contiene la lista de libros
import main.Libreria;

// Importa clases para manejar JSON (de la librería json-simple)
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// Clase pública que se encarga de cargar libros desde un archivo JSON
public class CargaLibrosJson {

    
    // Método estático que recibe un archivo JSON y carga los libros
    public static void cargarLibrosDesdeJson(File archivo) {
        
        // Crea un parser para leer y analizar el archivo JSON
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader(archivo)) {
            
              // Lee el contenido del archivo y lo convierte a un arreglo de objetos JSON
            JSONArray librosArray = (JSONArray) parser.parse(reader);

            // Itera sobre cada objeto (libro) dentro del array
            for (Object obj : librosArray) {
                JSONObject libroJson = (JSONObject) obj;

                // Convierte el objeto genérico a un objeto JSON específico
                Libro libro = new Libro();
                libro.titulo = (String) libroJson.get("titulo");
                libro.autor = (String) libroJson.get("autor");
                libro.genero = (String) libroJson.get("genero");
                libro.precio = Double.parseDouble(libroJson.get("precio").toString());
                libro.cantidad = Integer.parseInt(libroJson.get("cantidad").toString());

                 // Agrega el libro a la lista global de libros en la clase Libreria
                Libreria.libros.add(libro);
            }

            System.out.println("Libros cargados desde JSON correctamente.");
        } catch (Exception e) {
            // Si hay un error (por ejemplo, formato incorrecto o archivo no encontrado), imprime el error
            e.printStackTrace();
        }
    }
}
