package adm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
    
    static Connection contacto = null;
    public static String user;
    public static String clave;
    public static boolean status = false;
    
    public static Connection getConexion(){
        status = false;
        String url = "jdbc:sqlserver://xavier255\\SQLEXPRESS;databaseName=ProyectoB";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion... revisar Driver" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(url, Conexion.user, Conexion.clave);
            status = true;
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
    
    
    public static void setcuenta(String user, String clave){
        Conexion.user = user;
        Conexion.clave = clave;
    }
    
    public static boolean getstatus(){
        return  status;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
}
