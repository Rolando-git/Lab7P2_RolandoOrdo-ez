package Principal;

import java.util.ArrayList;
import java.util.Date;

public class album {
    
    private String nombre;
    private Date publicacion;
    private String genero;
    private String formato;
    private String productor;
    private ArrayList<cancion> canciones = new ArrayList();
    
    public album() {
    }
    
    public album(String nombre, Date publicacion, String genero, String formato, String productor) {
        this.nombre = nombre;
        this.publicacion = publicacion;
        this.genero = genero;
        this.formato = formato;
        this.productor = productor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Date getPublicacion() {
        return publicacion;
    }
    
    public void setPublicacion(Date publicacion) {
        this.publicacion = publicacion;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public String getProductor() {
        return productor;
    }
    
    public void setProductor(String productor) {
        this.productor = productor;
    }
    
    public ArrayList<cancion> getCanciones() {
        return canciones;
    }
    
    public void setCanciones(cancion c) {
        this.canciones.add(c);
    }
    
    @Override
    public String toString() {
        return "album{" + "nombre=" + nombre + ", publicacion=" + publicacion + ", genero=" + genero + ", formato=" + formato + ", productor=" + productor + ", canciones=" + canciones + '}';
    }
    
}
