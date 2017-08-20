
package entidades;


public class Criterio {
    
    private int id_criterio;
    private String nombre_criterio;

    public Criterio() {
    }
    
    public Criterio(int id_criterio, String nombre_criterio) {
        this.id_criterio = id_criterio;
        this.nombre_criterio = nombre_criterio;
    }
    
    public Criterio(String nombre_criterio) {
        this.nombre_criterio = nombre_criterio;
    }    

    
    public int getId_criterio() {
        return id_criterio;
    }

   
    public void setId_criterio(int id_criterio) {
        this.id_criterio = id_criterio;
    }

    
    public String getNombre_criterio() {
        return nombre_criterio;
    }

    
    public void setNombre_criterio(String nombre_criterio) {
        this.nombre_criterio = nombre_criterio;
    }

}
