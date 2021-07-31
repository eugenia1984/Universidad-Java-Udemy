package herencia;

public class Persona {

    //Atributos
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    //constructores

    public Persona() {
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Persona { " + "nombre = " + nombre + ", genero = " + genero + 
                ", edad = " + edad + ", direccion = " + direccion + super.toString() +'}';
    }
    
}
