/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//driver de conexion
import java.sql.ResultSet;//resultado final de datos
import java.sql.ResultSetMetaData;//resultado de metadatos
import java.sql.SQLException;//Tratamiento de Errros de BD SQL
import java.sql.Statement;//Generador de sentencias SQL
import java.text.SimpleDateFormat;//Formatear datos
import java.util.Date;//fecha de sistema
import javax.swing.ImageIcon;//Tratamiento de imagenes
import javax.swing.JOptionPane;//ventanas emergentes
import javax.swing.table.DefaultTableModel;//tabla de datos
import pojos.Predio;
public class Conexion {
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;//punto final para tratamiento de los datos
    
     //metodo para conectar a bd
    public void conectarBase() {
        try { //inicia try
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdtramite", "adminedith", "edith123");
            JOptionPane.showMessageDialog(null, "Conexion a BD OK\n\nTramite Ciudadano");
            stmt = cn.createStatement();//genera sentencias sobre objetos de base de datos
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 1: \n" + ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos 2:" + e);
        }
    }//termina metodo conectar
    
}
