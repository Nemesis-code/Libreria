/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;


// Importa la clase principal donde se almacenan los usuarios
import main.Libreria;
import java.io.File;
import javax.swing.JOptionPane;
// Importa clases necesarias para leer archivos XML
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import modelos.Usuario;
// Importa clases que representan partes del documento XML
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author mynor
 */
// Clase para cargar usuarios desde un archivo XML
public class CargaUsuariosXml {
    
    // Método público que recibe un archivo XML y carga los usuarios
    public void cargaUsuariosDesdeXML(File archivoXML){
        try{
            // Crea una fábrica de constructores de documentos XML
            DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
            // Usa la fábrica para crear un constructor
            DocumentBuilder Builder = Factory.newDocumentBuilder();
            // Analiza el archivo XML y crea un objeto Document
            Document doc = Builder.parse(archivoXML);
            
             // Normaliza el documento (elimina nodos vacíos, etc.)
            doc.getDocumentElement().normalize();
            
            // Obtiene todos los elementos <usuario> del archivo
            NodeList listaUsuarios = doc.getElementsByTagName("usuario");
            
           // Limpia la lista de usuarios antes de cargar nuevos
            Libreria.usuarios.clear();
            
             // Recorre cada nodo <usuario>
            for (int i = 0; i < listaUsuarios.getLength(); i++) {
                Node nodo = listaUsuarios.item(i);
                
                // Verifica que el nodo sea un elemento (no texto o comentario)
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    // Convierte el nodo en un elemento para acceder a sus etiquetas hijas
                    Element elemento = (Element) nodo;
                    
                    // Crea un nuevo usuario y le asigna sus atributos desde el XML
                    Usuario u = new Usuario();
                    u.nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    u.usuario = elemento.getElementsByTagName("username").item(0).getTextContent();
                    u.password = elemento.getElementsByTagName("password").item(0).getTextContent();
                    
                     // Determina el rol del usuario (Administrador = A, otro = V)
                    String rol = elemento.getElementsByTagName("rol").item(0).getTextContent();
                    if (rol.equalsIgnoreCase("Administrador")) {
                        u.rol = "A";
                        
                    }else {
                        u.rol = "V";
                        
                    }
                    
                     // Agrega el usuario a la lista global de usuarios
                    Libreria.usuarios.add(u);
           
                }
                
            }
            JOptionPane.showMessageDialog(null, "Usuarios cargados Exitosamente desde el XML");
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar usuarios desde XML: ");
        }
    
    }
    
}
