/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.File;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import modelos.Usuario;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Esta clase permite guardar una lista de usuarios en un archivo XML.
 * Cada usuario se escribe como un nodo <usuario> con sus datos como elementos hijos.
 */
public class EscrituraUsuariosXml {
    
    public static void guardarUsuariosEnXml(List<Usuario> usuarios, String path){
        try{
            // Se crea el generador de documentos XML
            DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder Builder = Factory.newDocumentBuilder();
            // Se crea un nuevo documento XML vacío
            Document doc = Builder.newDocument();
            
            // Se crea el nodo raíz <usuarios> y se añade al documento
            Element root = doc.createElement("usuarios");
            doc.appendChild(root);
            
            // Por cada usuario en la lista...
            for (Usuario u : usuarios) {
                // Se crea un nodo <usuario> para representar a cada usuario
                Element usuarioEl = doc.createElement("usuario");
                
                // Se añade el nodo <nombre>
                Element nombreEl = doc.createElement("nombre");
                nombreEl.appendChild(doc.createTextNode(u.nombre));// se añade el texto dentro del nodo
                usuarioEl.appendChild(nombreEl);
                
                // Se añade el nodo <nombreUsuario> (mejor que repetir "usuario")
                Element usernameEl = doc.createElement("username");
                usernameEl.appendChild(doc.createTextNode(u.usuario));
                usuarioEl.appendChild(usernameEl);
                
                Element passEl = doc.createElement("password");
                passEl.appendChild(doc.createTextNode(u.password));
                usuarioEl.appendChild(passEl);
                
                // Se añade el nodo <rol> según el valor del atributo (A = Administrador, otro = Vendedor)
                Element rolEl = doc.createElement("rol");
                rolEl.appendChild(doc.createTextNode(u.rol.equals("A") ? "Administrador" : "Vendedor"));
                usuarioEl.appendChild(rolEl);
                
                 // Finalmente, se añade el <usuario> al nodo raíz <usuarios>
                root.appendChild(usuarioEl);

                
            }
            
            // Se configura el transformador para guardar el documento XML en el archivo
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            // Se indica que se quiere indentar el XML para que sea legible
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            
            // Fuente de datos: el documento XML creado
            DOMSource source = new DOMSource (doc);
            
            // Destino: archivo en la ruta indicada por el parámetro 'path'
            StreamResult result = new StreamResult(new File (path));
            
            // Se realiza la transformación (escritura del XML)
            transformer.transform(source, result);
            
            System.out.println("Usuarios Exportedos correctamente al archivo XML");
        
        }catch(ParserConfigurationException | javax.xml.transform.TransformerException e){
            e.printStackTrace();
            
        }
        
    
    }
    
}
