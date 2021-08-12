
package domain;


public class Persona {
    
    //Atributo
    private String nombre;
    
    //constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + '}';
    }
    
    
    
}
