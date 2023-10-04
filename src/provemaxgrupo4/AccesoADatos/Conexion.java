/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provemaxgrupo4.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class Conexion {
    private static final String url = "jdbc:mariadb://localhost/";
    private static final String DB = "provemax";
    private static final String usuario = "root";
    private static final String pass = "";
    private static Connection connection;

    public Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection ==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection((url+DB),usuario,pass);
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"Error al cargar los driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error al conectarse");
            }
        }return connection;
    }
    
    
}
