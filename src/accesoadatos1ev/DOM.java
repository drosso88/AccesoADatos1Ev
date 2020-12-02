/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author rocio
 */
public class DOM {
    Document doc; //apuntador a la raiz del arbol
    
      public int anadirDOM(String chip, String nombre, String raza, 
      String fechaNac, String nombreProp, String dni, String primerApellido, 
      String segundoApellido, String descripcion, String precio, String fecha ) {
          
          
        try {
//para acceder al atributo del nodo perro
            Node nPerro = doc.createElement("perro");
            ((Element) nPerro).setAttribute("chip", chip);
            Node nPropietario = doc.createElement("propietario");
            ((Element) nPropietario).setAttribute("dni", dni);
            Node nConsulta = doc.createElement("consulta");

            //nodo para el nombre de la mascota
            Node nodoNombre = doc.createElement("nombre");
            Node nodoNombre_text = doc.createTextNode(nombre);
            nodoNombre.appendChild(nodoNombre_text);
             //nodo para la raza de la mascota
            Node nodoRaza = doc.createElement("raza");
            Node nodoRaza_text = doc.createTextNode(raza);
            nodoRaza.appendChild(nodoRaza_text);
             //nodo para fecha de nacimiento
            Node nodoFechaNac = doc.createElement("fecha_nacimiento");
            Node nodoFechaNac_text = doc.createTextNode(fecha);
            nodoFechaNac.appendChild(nodoFechaNac_text);

            // Nodo para el nombre del propietario
            Node nodoNombreProp = doc.createElement("nombreProp");
            Node nodoNombreProp_text = doc.createTextNode(nombreProp);
            nodoNombreProp.appendChild(nodoNombreProp_text);
            // Nodo para el ApellidoPrimero
            Node nodoPrimerApellido = doc.createElement("primerApellido");
            Node nodoPrimerApellido_text = doc.createTextNode(primerApellido);
            nodoPrimerApellido.appendChild(nodoPrimerApellido_text);          
              // Nodo para el segundo apellido
            Node nodoSegundoApellido = doc.createElement("segundoApellido");
            Node nodoSegundoApellido_text = doc.createTextNode(segundoApellido);
            nodoSegundoApellido.appendChild(nodoSegundoApellido_text);           
            //para acceder al atributo del nodo propietario
            Node nProp = doc.createElement("propietario");
            ((Element) nProp).setAttribute("dni", dni);
            
                // Nodo para descripcion de la consulta
            Node nodoConsulta = doc.createElement("descripcion");
            Node nodoConsulta_text = doc.createTextNode(descripcion);
            nodoConsulta.appendChild(nodoConsulta_text);           
                // Nodo para la fecha consulta
            Node nodoFecha = doc.createElement("fecha");
            Node nodoFecha_text = doc.createTextNode(fecha);
            nodoFecha.appendChild(nodoFecha_text);
                // Nodo el precio
            Node nodoPrecio = doc.createElement("precio");
            Node nodoPrecio_text = doc.createTextNode(precio);
            nodoPrecio.appendChild(nodoPrecio_text);
         
            //se añaden a Perro estos nodos
            nPerro.appendChild(nodoNombre);
            nPerro.appendChild(nodoRaza);
            nPerro.appendChild(nodoFechaNac);
            //se añaden a propietario estos nodos
            nPropietario.appendChild(nodoNombreProp);
            nPropietario.appendChild(nodoPrimerApellido);
            nPropietario.appendChild(nodoSegundoApellido);
            nPropietario.appendChild(nodoSegundoApellido);
            //se añaden a consulta estos nodos
            nConsulta.appendChild(nodoConsulta);
            nConsulta.appendChild(nodoPrecio);
            nConsulta.appendChild(nodoFecha);

            //al primer nodo del documento se le añade el hijo perro que tiene
            //sus propios hijos y atributos
            Node raiz = doc.getFirstChild();
            raiz.appendChild(nPerro);

            return 0;

        } catch (Exception e) {
            return -1;
        }
    }
    
}
