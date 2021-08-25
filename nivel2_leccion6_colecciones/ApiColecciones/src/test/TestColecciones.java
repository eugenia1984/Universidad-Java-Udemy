/**
 * INTEFACE LIST
 * siempre importo del paquete JAVA.UTIL y como voy a utilizar varias pongo .*
 * Una LISTA es similar al array porque puedo agregar varios elementos a mi lista
 */
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        //creo la lista definiendo el tipo e inicializando el objeto
        List miLista = new ArrayList();
        
        //Agrego elementos con el metodo -> .add(Object)
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        
        //Imprimio con for each o puedo usar arrow function
        //Si fuera con for each -> paso la lista como argumento en el ciclo FOR
        //for(Object elemento : miLista){
        //   System.out.println("elemento = " + elemento);
        //}
        //con arrow function
        miLista.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        });
    }
    
}
