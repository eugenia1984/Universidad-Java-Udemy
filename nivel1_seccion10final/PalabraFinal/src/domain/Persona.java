
package domain;

/*
De tener con FINAL:
public final class Persona {
}
No podría hacer que Empleado HEREDE de Persona, no puedo tener:
public class Empleado extends Persona{
    
}

*/
public class Persona {
    
    public final static int MI_CONSTANTE = 1;
    
    //Atributo privado
    private String nombre;
    
    //Getter y Setter del atributo nombre
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*
    //Si mi metodo tiene FINAL la clase hija no puede sobreescribir el metodo
    public final void imprimir(){
        System.out.println("Método imprimir");
    }
    */
    
    public void imprimir(){
        System.out.println("Método imprimir");
    }

   
}
