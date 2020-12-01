/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import perrosJava.ClinicaVeterinaria;
import perrosJava.ClinicaVeterinaria.Perro;

/**
 *
 * @author rocio
 */
public class JAXB {
        ClinicaVeterinaria misPerros;

   public int abrirXML_JAXB(File fichero) {
       try {
           //crea una instance JAXB
           JAXBContext contexto= JAXBContext.newInstance(Perro.class);
           //crea  un obj Unmarshaller
           Unmarshaller u = contexto.createUnmarshaller();
           //Desserializa el fichero
           misPerros = (ClinicaVeterinaria)u.unmarshal(fichero);
           
           return 0;
           
       } catch (Exception e) {
           return -1;
       }
        
    }

    public String recorrerJAXB() {
        
        String cadena_resultado = "";
     return cadena_resultado;
    
}
}
            
