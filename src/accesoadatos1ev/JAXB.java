/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import perrosJava.ClinicaVeterinaria;
import perrosJava.ClinicaVeterinaria.Perro;

/**
 *
 * @author rocio
 */
public class JAXB {

    ClinicaVeterinaria misPerros;
    Unmarshaller u;
    JAXBContext contexto;

    public int abrirXML_JAXB(File fichero) {
        try {
            //crea una instance JAXB
            JAXBContext contexto = JAXBContext.newInstance(Perro.class);
            //crea  un obj Unmarshaller
            Unmarshaller u = contexto.createUnmarshaller();
            //Desserializa el fichero
            misPerros = (ClinicaVeterinaria) u.unmarshal(fichero);

            return 0;

        } catch (Exception e) {
            return -1;
        }

    }

    public int cerrarXML_JAXB(File file) {
        try {
            Marshaller m = contexto.createMarshaller();
            m.marshal(misPerros, file);
            return 1;
        } catch (Exception e) {
        }
        return -1;
    }

    public String recorrerJAXB() {

        String cadena_resultado = "";
        List<ClinicaVeterinaria.Perro> iperro = misPerros.getPerro();
        for (int i = 0; i < iperro.size(); i++) {
            ClinicaVeterinaria.Perro perroAuxiliar = iperro.get(i);
            List<ClinicaVeterinaria.Perro.Propietario> iPropietario = (List<ClinicaVeterinaria.Perro.Propietario>) iperro.get(i).getPropietario();
            ClinicaVeterinaria.Perro.Consulta iConsulta = iperro.get(i).getConsulta();
            cadena_resultado = cadena_resultado + "\nNueva mascota: \n" + "\nPerro: " + iperro.get(i).getChip();
            cadena_resultado = cadena_resultado + "\nNueva mascota\n" + "\nPerro: " + perroAuxiliar.getNombre();
            cadena_resultado = cadena_resultado + "\nFecha de nacimiento: " + perroAuxiliar.getFechaNacimiento();
            cadena_resultado = cadena_resultado + "\nLa raza es: " + perroAuxiliar.getRaza();
            for (int j = 0; j < iPropietario.size(); j++) {
                //esto no me lo ha cogido el binding, dará mas fallos que una escopeta de feria
                cadena_resultado = cadena_resultado + "\nPropietario: \n" + "\nDNI: " + iPropietario.get(j).getDni();
                cadena_resultado = cadena_resultado + "\nNombre: " + iPropietario.get(j).getnombreProp();
                cadena_resultado = cadena_resultado + "\nPrimer Apellido: " + iPropietario.get(j).getPrimerApellido();
                cadena_resultado = cadena_resultado + "\nSegundo Apellido: " + iPropietario.get(j).getSegundoApellido();
            }

            cadena_resultado = cadena_resultado + "Consulta: \n" + "\nDescripción: " + iConsulta.getClass();
            cadena_resultado = cadena_resultado + "\nCon la fecha: " + iConsulta.getfecha();
            cadena_resultado = cadena_resultado + "\nPrecio: " + iConsulta.getDescripcion()
                    + "\n----------------------------------\n";
        }
        return cadena_resultado;
    }

    public String cambiarRegistro(String contenidoAntiguo, String contenidoNuevo) {
        String cadena_resultado = "";
        List<ClinicaVeterinaria.Perro> iPerros = misPerros.getPerro();
        for (int i = 0; i < iPerros.size(); i++) {
            ClinicaVeterinaria.Perro perroAuxiliar = iPerros.get(i);
            //este va a fallar
            cadena_resultado = perroAuxiliar.getfecha();
            System.out.println(cadena_resultado);
            if (perroAuxiliar.getNombre().equals(contenidoAntiguo)) {
                iPerros.get(i).setChip(contenidoNuevo);

            } else if (perroAuxiliar.getPropietario().equals(contenidoAntiguo)) {

            }

        }
        for (int i = 0; i < iPerros.size(); i++) {
            ClinicaVeterinaria.Perro perroAuxiliar = iPerros.get(i);
            List<ClinicaVeterinaria.Perro.Propietario> iPropietario = (List<ClinicaVeterinaria.Perro.Propietario>) iPerros.get(i).getPropietario();
            ClinicaVeterinaria.Perro.Consulta iConsulta = iPerros.get(i).getConsulta();

            cadena_resultado = cadena_resultado + "\nNuevo nombre del perro: " + perroAuxiliar.getNombre();

            for (int j = 0; j < iPropietario.size(); j++) {
                cadena_resultado = cadena_resultado + "\nPropietario: \n" + "\nDNI: " + iPropietario.get(j).getDni();
                cadena_resultado = cadena_resultado + "\nNombre: " + iPropietario.get(j).getNombreProp();
                cadena_resultado = cadena_resultado + "\nPrimer Apellido: " + iPropietario.get(j).getPrimerApellido();
                cadena_resultado = cadena_resultado + "\nSegundo Apellido: " + iPropietario.get(j).getSegundoApellido();
            }

            return cadena_resultado;
        }
        return cadena_resultado;

    }
}
