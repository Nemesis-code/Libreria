/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


import modelos.Libro;
// Importa clases para manejar archivos
import java.io.FileWriter;
import java.io.File;
// Importa la clase principal donde están almacenados los libros
import main.Libreria;
// Importa clases para crear objetos JSON
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class GuardarLibrosJson {
    
     // Método público y estático que guarda libros en un archivo JSON
    public static void guardarLibrosAJson(File archivo) {
        // Crea un arreglo JSON para almacenar todos los libros
        JSONArray librosArray = new JSONArray();
         // Recorre todos los libros que hay en la lista Libreria.libros
        for (Libro libro : Libreria.libros) {
            JSONObject libroJson = new JSONObject();
            libroJson.put("titulo", libro.titulo);
            libroJson.put("autor", libro.autor);
            libroJson.put("genero", libro.genero);
            libroJson.put("precio", libro.precio);
            libroJson.put("cantidad", libro.cantidad);

             // Añade el objeto JSON del libro al arreglo de libros
            librosArray.add(libroJson);
        }

         // Intenta escribir el arreglo completo en el archivo
        try (FileWriter writer = new FileWriter(archivo)) {
             // Convierte el arreglo JSON a texto y lo escribe en el archivo
            writer.write(librosArray.toJSONString());
            writer.flush();// Asegura que todos los datos se escriban
            System.out.println("Libros guardados correctamente en JSON.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}