/*
Es la clase super / padre / madre
 */
package domain;

import java.util.Objects;


public class Empleado {
    //atributo protected para que las clases hijas puedan acceder 
    //directamente a los atributos
    private String nombre;
    private double sueldo;
    
    //constructor publico pra poder ser utilizado desde otras clases
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //metodo que se va a sobreescribir desde la clase hija
    //me regresa una cadena con el valor de cada atributo de la clase
    //voy a simular el metodo toString
    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo = " + this.sueldo;
    }
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //toString
    @Override
    public String toString() {
        return "Empleado{" + "nombre = " + nombre + ", sueldo = " + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {  //si es el mismo objeto que paso por parametro
            return true;
        }
        if (obj == null) {  //si es null, son distintos
            return false;
        }
        if (getClass() != obj.getClass()) {  //si el tipo de la clase son diferentes
            return false;
        }
        final Empleado other = (Empleado) obj;  //hacemos un cast de la clase object a la clase empleado
        //comparo los atributos de la clase
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {  //comparamos los atributos de nombre
            return false;
        }
        return true;
    }
    
}
