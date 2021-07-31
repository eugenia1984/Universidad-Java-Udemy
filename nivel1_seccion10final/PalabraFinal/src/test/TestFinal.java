package test;

import domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable = 10;
        
        System.out.println("miVariable = " + miVariable);
        
        /*
        No puedo reasignarle el valor a la variable porque ya tiene final
        //miVariable = 20;
        */
        
        /*
        //No puedo reasignar valor a una constante
        //Persona.MI_CONSTANTE = 5;
      
        */
        
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);    
        
        final Persona persona1 = new Persona();
        //persona1 = newPersona();
        persona1.setNombre("Eugenia");
        System.out.println("persona1 nombre: " + persona1.getNombre());
        persona1.setNombre("Ana");
        System.out.println("persona1 nombre modificado: " + persona1.getNombre());
    }
    
}
