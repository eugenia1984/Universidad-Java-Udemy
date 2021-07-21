package dominio;

public class Persona {

    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    //constructor
    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    //Metodos getters y setter del atributo nombre
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //Metodos getters y setter del atributo sueldo
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }
    
    //Metodos getters(IS por ser booleano) y setter del atributo eliminado
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(Boolean eliminado){
        this.eliminado = eliminado;
    }
}
