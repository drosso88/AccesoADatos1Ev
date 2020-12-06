/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author rocio
 */
public class abrirFichero {
     String ruta;
    static String rutaAuxiliar;
    File file;

    public void setFile(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }


    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRutaAuxiliar() {
        return rutaAuxiliar;
    }

    public int dameFile() {

        try {
            JFileChooser fchooser = new JFileChooser();
            int seleccion = fchooser.showOpenDialog(null);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                file = fchooser.getSelectedFile();
                ruta=file.getAbsolutePath();
                rutaAuxiliar=ruta;
                return 1;
            }
            if (seleccion == JFileChooser.CANCEL_OPTION) {
                fchooser.cancelSelection();
            }
            return 1;   

        } catch (Exception e) {
            System.out.println("Error al abrir el fichero" + e.getMessage() + "||||" + e.getLocalizedMessage());

        }
        return -1;
    }

}
    
