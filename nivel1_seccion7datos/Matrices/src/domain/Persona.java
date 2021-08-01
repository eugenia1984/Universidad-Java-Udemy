
package domain;

public class Persona {
    
    //atributo
    private String nombre;
    
    //Constructor

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Pesona{" + "nombre = " + nombre + '}';
    }
    
}

    

