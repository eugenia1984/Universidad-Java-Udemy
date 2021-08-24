/*
Es la clase super / padre / madre
 */
package domain;


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
    
}
