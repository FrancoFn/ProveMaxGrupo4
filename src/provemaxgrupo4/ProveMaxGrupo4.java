/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4;

import provemaxgrupo4.AccesoADatos.Conexion;
import provemaxgrupo4.Vistas.Menu;

/**
 *
 * @author bruno
 */
public class ProveMaxGrupo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conexion.getConexion();     
        Menu.getWindows();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        }
        );
    }
    
}
