/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

// Importa clases necesarias para entrada/salida y manejo de archivos
import java.io.*;
import java.util.List;

public class PersistenciaBinaria {
    // Método genérico para guardar una lista en un archivo binario
    public static <T> void guardarLista(List<T> lista, String ruta) {
        try (
                 // Abre un flujo de salida hacia el archivo
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))
                ) {
             // Escribe toda la lista como un solo objeto en el archivo
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();// Muestra error si ocurre
        }
    }
     // Método genérico para cargar una lista desde un archivo binario
    public static <T> List<T> cargarLista(String ruta) {
         // Abre un flujo de entrada desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
             // Lee el objeto del archivo y lo convierte en una lista del tipo correcto
            return (List<T>) ois.readObject();
        } catch (Exception e) {
            return null;  // Si algo falla, retorna null (puedes cambiar a lista vacía)
        }
    }
    
}
