package mx.com.gm.peliculas.domain;
//Es la CLASE ENTIDAD -> ATRIBUTO EN BS
//tambien llamada CLASE DOMINIO
public class Pelicula {
    //Atributo
    private String nombre;
    
    //constructor vacio
    public Pelicula() {
    }

    //constructor con argumento
    public Pelicula(String nombre) {
        this.nombre = nombre;
    }
    
    //getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //toString
    @Override
    public String toString() {
        //return "Pelicula{" + "nombre = " + nombre + '}';
        return this.nombre;
    } 
    
}
