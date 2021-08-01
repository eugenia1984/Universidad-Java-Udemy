
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
//Creo un nuevo arreglo de tipo Object
    Persona personas[] = new Persona[2];
        
//Relleno mi arreglo    
    personas[0] = new Persona("Eugenia");
    personas[1] = new Persona("Marcos");
    
//Lo imprimo recorriendolo con un for
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas con índice: " + i + " : " + personas[i]);
          
        }
    }
}
