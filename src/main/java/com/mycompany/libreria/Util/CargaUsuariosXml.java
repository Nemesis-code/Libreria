/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria.Util;

import com.mycompany.libreria.Libreria;
import java.io.File;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import modelos.Usuario;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author mynor
 */
public class CargaUsuariosXml {
    public void cargaUsuariosDesdeXML(File archivoXML){
        try{
            DocumentBuilderFactory Factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder Builder = Factory.newDocumentBuilder();
            Document doc = Builder.parse(archivoXML);
            
            doc.getDocumentElement().normalize();
            
            NodeList listaUsuarios = doc.getElementsByTagName("usuario");
            
            //limpiar la lista antes de cargar nuvos datos
            Libreria.usuarios.clear();
            
            for (int i = 0; i < listaUsuarios.getLength(); i++) {
                Node nodo = listaUsuarios.item(i);
                
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) nodo;
                    
                    Usuario u = new Usuario();
                    u.nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    u.usuario = elemento.getElementsByTagName("username").item(0).getTextContent();
                    u.password = elemento.getElementsByTagName("password").item(0).getTextContent();
                    
                    String rol = elemento.getElementsByTagName("rol").item(0).getTextContent();
                    if (rol.equalsIgnoreCase("Administrador")) {
                        u.rol = "A";
                        
                    }else {
                        u.rol = "V";
                        
                    }
                    
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
