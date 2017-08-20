
package adm;

import entidades.Docente;
import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class admDocente {

    public void insertaDocente(Docente d1){

    try{
     
      Connection cn=Conexion.getConexion();
          CallableStatement pst=cn.prepareCall("{Call insertDocent(?,?,?,?,?)}");
          pst.setString(1, d1.getCedula_doc());
          pst.setString(2, d1.getNombre_doc());
          pst.setString(3, d1.getApellido_doc());
          pst.setString(4, d1.getCorreo_inst());
          pst.setInt(5, d1.getObjCriterio().getId_criterio());
    
          
          pst.execute();
          //cn.commit();;
          System.out.println("Ejecutado");
      }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
      }
    }
    
    public void elminarDocente(Docente d1){
        try {
            Connection cn=Conexion.getConexion();
          CallableStatement pst=cn.prepareCall("{Call eliminarDoc(?)}");
          pst.setString(1, d1.getCedula_doc());
          pst.executeUpdate();
          
          System.out.println("Eliminado");  
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
//        public boolean modificar(Object objOld, Object objNew) {
//        boolean estado = false;
//        try {
//            Docente objO = (Docente) objOld;
//            Docente objN = (Docente) objNew;
//
//            Connection cn=Conexion.getConexion();
//            String sql = "UPDATE tDocente SET cedula_doc=?, nombre_doc=?, apellido_doc=?, correo_doc=?, fk_criterio=? WHERE id_docente=?";
//            PreparedStatement ps = cn.prepareStatement(sql);
//            ps.setString(1, objN.getCedula_doc());
//            ps.setString(2, objN.getNombre_doc());
//            ps.setString(3, objN.getApellido_doc());
//            ps.setString(4, objN.getCorreo_inst());
//            ps.setInt(5, objN.getObjCriterio().getId_criterio());
//            ps.setInt(6, objN.getId_docente());
//            ps.executeUpdate();
//            estado = true;
//        } catch (HeadlessException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        return estado;
//    }
    
    
    public void modificarDoc(Docente d2){
       try{
     
          Connection cn=Conexion.getConexion();
          CallableStatement pst=cn.prepareCall("{Call modDocente(?,?,?,?,?)}");
          pst.setString(1, d2.getCedula_doc());
          pst.setString(2, d2.getNombre_doc());
          pst.setString(3, d2.getApellido_doc());
          pst.setString(4, d2.getCorreo_inst());
          pst.setInt(5, d2.getObjCriterio().getId_criterio());
    
          
          pst.execute();
          //cn.commit();;
          System.out.println("Ejecutado");
      }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
      }
     
        
    }
    
    
    }

    
