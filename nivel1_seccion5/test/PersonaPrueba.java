package test;

import dominio.Persona;  
//Para importar la clase Persona que tengo en otro paquete
//Si quiero importar todas las calses: import dominio.*

public class PersonaPrueba {

    public static void main(String[] args) {
    //Creo mi primer objeto de tipo Persona
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1 nombre sin cambio : " + persona1.getNombre());
    //Para cambiarle el nombre tengo que settearlo porque es atributo private
        persona1.setNombre("Juan Carlos");
        System.out.println("persona1 nombre con cambio: " + persona1.getNombre());
        System.out.println("persona1 sueldo : " + persona1.getSueldo());  
        System.out.println("persona1 eliminado: " + persona1.isEliminado());
    }
    
}
