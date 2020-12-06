/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import perrosJava.ClinicaVeterinaria;

/**
 *
 * @author rocio
 */
public class SAX {

    //este obj es el q recorre el fichero para mostrar el contenido
    SAXParser parser;
    ManejadorSAX sh;
    File ficheroXML;
  
   

    public int abrirXMLSAX(File fichero) {
        try {
           
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //esto interpretara el XML
            parser = factory.newSAXParser();

            //se crea una instncia del manejador que recorrerá el XML secuencialmente
            sh = new ManejadorSAX();
             ficheroXML = fichero;

            return 0;

        } catch (Exception e) {
            return -1;
        }

    }

    String reccorrerSAX() throws SAXException {
       
        try {
            sh.cadena_resultado="";
            parser.parse(ficheroXML, sh);
                 return sh.cadena_resultado;
        } catch (IOException ex) {
           return "error al parsear con SAX";
        }
    }
}
class ManejadorSAX extends DefaultHandler {
    
    String cadena_resultado="";

    @Override
    public void characters(char[] ch, int start, int lenght) throws SAXException {
        for(int i = start; i<lenght+start; i++){
        cadena_resultado = cadena_resultado + ch[i];
        }
        cadena_resultado = cadena_resultado.trim() + "\n";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equals("perro")) {
                cadena_resultado= cadena_resultado + "-------------------------------------------------\n";
            }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("perro")) {
            cadena_resultado = cadena_resultado + "El número de chip es: " + attributes.getValue(attributes.getQName(0).trim());

        } else if (qName.equals("raza")) {
            cadena_resultado = cadena_resultado + "\t" + "La raza es: ".trim();
        } else if (qName.equals("fecha_nacimiento")) {
            cadena_resultado = cadena_resultado + "\t" + "Nacido el: ".trim();
        } else if (qName.equals("nombre")) {
            cadena_resultado = cadena_resultado + "\t" + "El nombre de la mascota es: ".trim();
        } else if (qName.equals("propietario")) {
            cadena_resultado = cadena_resultado + "El propietario es: ";
            cadena_resultado = cadena_resultado + ("\t\nDNI: " + attributes.getValue(attributes.getQName(0)).trim());
        } else if (qName.equals("nombreProp")) {
            cadena_resultado = cadena_resultado + "\t" + ("Nombre: ").trim();
        } else if (qName.equals("primerApellido")) {
            cadena_resultado = cadena_resultado + "\t" + ("Primer Apellido: ").trim();
        } else if (qName.equals("segundoApellido")) {
            cadena_resultado = cadena_resultado + "\t" + ("Segundo Apellido: ").trim();
        } else if (qName.equals("consulta")) {
            cadena_resultado = cadena_resultado + "Detalle de la visita: ";
        } else if (qName.equals("fecha")) {
            cadena_resultado = cadena_resultado + "\t" + ("Fecha: ").trim();
        } else if (qName.equals("descripcion")) {
            cadena_resultado = cadena_resultado + "\t" + ("El motivo de la consulta fue: ").trim();
        } else if (qName.equals("precio")) {
            cadena_resultado = cadena_resultado + "\t" + ("Precio del servicio: ").trim();
        }
    }
}
    
    
    

