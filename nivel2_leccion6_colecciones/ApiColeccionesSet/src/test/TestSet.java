/*
 * SET
 */
package test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        //Creo un SET
        Set miSet = new HashSet();
        //Agrego elementos
        miSet.add("Enero");
        miSet.add("Febrero");
        miSet.add("Marzo");
        miSet.add("Abril");
        miSet.add("Mayo");
        miSet.add("Junio");
        miSet.add("Julio");
        miSet.add("Agosto");
        miSet.add("Septiembre");
        miSet.add("Octubre");
        miSet.add("Noviembre");
        miSet.add("Diciembre");
        //Los muestro invocando al metodo imprimir
        imprimir(miSet);
    }
    public static void imprimir(Collection coleccion){
        for(Object elemento : coleccion) {
            System.out.println("elemento = " + elemento);
        }
        //tambien podia con arrow function :
        // coleccion.forEach((elemento) -> {
        //    System.out.println("elemento = " + elemento);
        // });
    }
    
}
