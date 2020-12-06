/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rocio
 */
public class guardarFichero {
    JAXB gesJaxb = new JAXB();

    public void guardarConJAXB(String txtGuardar, String ruta) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(ruta));
            bw.write(txtGuardar);

            bw.close();

        } catch (IOException ex) {
            Logger.getLogger(guardarFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
            
    
      

