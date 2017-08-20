
package adm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class admCriterio {
Conexion conexion = new Conexion();
    Connection cn = conexion.getConexion();
    PreparedStatement ps;
    
    public void insertaCriterio(Criterio c1){

    try{
     
        Connection cn=Conexion.getConexion();
          CallableStatement pst=cn.prepareCall("{Call insertCriterio(?)}");
          pst.setString(1, c1.getNombre_criterio());
          pst.execute();
          //cn.commit();;
          System.out.println("Ejecutado");
      }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
      }
    }
    public void llenaCombo(JComboBox combo) {
     combo.removeAllItems();
        try {
            Connection conex = Conexion.getConexion();
            String sql = "SELECT id_criterio, nombre_criterio FROM tCriterio";
            PreparedStatement ps = conex.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Combo objC = new Combo(rs.getInt(1), rs.getString(2));
                combo.addItem(objC);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    }
    



