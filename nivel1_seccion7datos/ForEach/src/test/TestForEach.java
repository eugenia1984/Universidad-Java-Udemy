
package test;

import domain.Persona;


public class TestForEach {


    public static void main(String[] args) {
        
        int edades[] = {5, 6, 8, 9};
        
        for(int edad : edades) { //tipo_variable identificador : que_quiero_iterar
            System.out.println(edad);
        }
        
        Persona personas[] = {new Persona("Eugenia"), new Persona("Juan")};
        
        for( Persona persona : personas) {
            System.out.println(persona);
        }
    }
    
}
