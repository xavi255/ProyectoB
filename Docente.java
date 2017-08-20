
package entidades;


public class Docente {
    
    private int id_docente;
    private String cedula_doc;
    private String nombre_doc;
    private String apellido_doc;
    private String correo_inst;
    private Criterio objCriterio;
    
    public Docente() {
        this.cedula_doc = "";
        this.nombre_doc = "";
        this.apellido_doc = "";
        this.correo_inst = "";
        this.objCriterio = null;
    }

    public Docente(int id_docente, String cedula_doc, String nombre_doc, String apellido_doc, String correo_inst, Criterio objCriterio) {
        this.id_docente = id_docente;
        this.cedula_doc = cedula_doc;
        this.nombre_doc = nombre_doc;
        this.apellido_doc = apellido_doc;
        this.correo_inst = correo_inst;
        this.objCriterio = objCriterio;
    }

    
    public Docente(String cedula_doc, String nombre_doc, String apellido_doc, String correo_inst, Criterio objCriterio) {
        this.cedula_doc = cedula_doc;
        this.nombre_doc = nombre_doc;
        this.apellido_doc = apellido_doc;
        this.correo_inst = correo_inst;
        this.objCriterio = objCriterio;
    }   


   
    public String getCedula_doc() {
        return cedula_doc;
    }

    
    public void setCedula_doc(String cedula_doc) {
        this.cedula_doc = cedula_doc;
    }

    
    public String getNombre_doc() {
        return nombre_doc;
    }

    
    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    
    public String getApellido_doc() {
        return apellido_doc;
    }

    
    public void setApellido_doc(String apellido_doc) {
        this.apellido_doc = apellido_doc;
    }

    
    public String getCorreo_inst() {
        return correo_inst;
    }

    
    public void setCorreo_inst(String correo_inst) {
        this.correo_inst = correo_inst;
    }

    
    public Criterio getObjCriterio() {
        return objCriterio;
    }

    
    public void setObjCriterio(Criterio objCriterio) {
        this.objCriterio = objCriterio;
    }

   
    public int getId_docente() {
        return id_docente;
    }

   
    public void setId_docente(int id_docente) {
        this.id_docente = id_docente;
    }

    
    
}
