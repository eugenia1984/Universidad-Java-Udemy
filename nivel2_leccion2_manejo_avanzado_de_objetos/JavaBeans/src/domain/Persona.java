/*
 * CLASE QUE SE CONSIDERA JAVABEANS
 */
package domain;

import java.io.Serializable;

//Hay que importar la clase Serializable que esta en el paquete java.io
public class Persona implements Serializable{  
    //Atributos PRIVATE
    private String nombre;
    private String apellido;
    
    //Debe tener un constructor vacio y debe ser PUBLIC
    public Persona(){
    }
    
    //se pueden agregar mas constructores, pero no son necesarios para ser JavaBeans
    //en este ejemplo los agrego para poder inicializarlos
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Metodo get y set asociado por cada atributo privado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //se pueden agregar los metodos ->
    //toString(), equals() y hashCode(), pero NO son requeridos

    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + '}';
    }
    
}
