
package test;

import domain.Persona;


public class TestJavaBeans {


    public static void main(String[] args) {
        //Creo un objeto de la clase Persona que es JavaBeans
        Persona persona = new Persona();  //uso el constructor vacio
        //con el metodo set inicializo los atributos
        persona.setNombre("Maria Eugenia");
        persona.setApellido("Costa");
        System.out.println("persona = " + persona);
        //Tambien puedo acceder a sus valores con el metodo get
        System.out.println("persona nombre = " + persona.getNombre());
        System.out.println("persona apellido = " + persona.getApellido());
    }
    
}
