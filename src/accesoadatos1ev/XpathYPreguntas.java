/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.NodeList;

/**
 *
 * @author rocio
 */
public class XpathYPreguntas {
    DOM miGesDOM = new DOM();
    abrirFichero af = new abrirFichero();
    String salida = "";

    public int ejecutarXpath(String variableNodo,String valorNodoDeterminado) {
        try {

            miGesDOM.abrirElXml(new File (af.getRutaAuxiliar()));
            XPath xpath = XPathFactory.newInstance().newXPath();
            XPathExpression expresion = xpath.compile(expresionBusqueda(variableNodo, valorNodoDeterminado));
            Object result = expresion.evaluate(miGesDOM.getDoc(), XPathConstants.NODESET);
            NodeList listaDeNodos = (NodeList) result;

            for (int i = 0; i < listaDeNodos.getLength(); i++) {
                 salida = salida + "\n" + listaDeNodos.item(i).getFirstChild().getNodeValue();
            }
            System.out.println(salida);
            return 1;
        } catch (Exception e) {
            return -1;
        }
    }
    public String expresionBusqueda(String pregunta1, String pregunta2){
   String salidaVariable="/ClinicaVeterinaria/perro/"+pregunta1+"[.='"+pregunta2+"']";
        System.out.println(salidaVariable);
        return salidaVariable;
    }

}
