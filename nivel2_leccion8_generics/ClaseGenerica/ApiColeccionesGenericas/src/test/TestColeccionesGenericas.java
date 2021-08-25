/**
 * INTEFACE LIST
 * siempre importo del paquete JAVA.UTIL y como voy a utilizar varias pongo .*
 * Una LISTA es similar al array porque puedo agregar varios elementos a mi lista
 */
package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestColeccionesGenericas {
    
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); //creo la lista definiendo el tipo e inicializando el objeto
        //Agrego elementos con el metodo -> .add(String)
        //String porque en antes aclare <String>
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0); //Los recupero directo sin tener que convertir a (String)
        System.out.println(elemento);
        
        //imprimo mi lista
        imprimir(miLista);
                
        //Creo un SET y lo convierto a tipo GENERIC
        Set<String> miSet = new HashSet<>(); 
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
        
        // Instancio un nuevo objeto de la clase HASHMAP y lo convierto de tipo GENERIC
        Map<String, String> miMapa = new HashMap<>(); 
        //Agrego elementos
        miMapa.put("valor1","Euge");
        miMapa.put("valor2", "Agus");
        miMapa.put("valor3", "Ana");
        //Si duplico una key se va a sustituir el valor en vez de Ana ahora es Mia
        miMapa.put("valor3", "Mia");
        String elementos = miMapa.get("valor1"); //Accedo a un elemento
        System.out.println("El valor de la primer llave es: " + elementos);
        //Si quiero recuperar el valor de todas las llaves reutilizo mi metodo
        //imprmir ya que tengo un set
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection<String> coleccion){
        coleccion.forEach((elemento) -> {
            System.out.println("elemento = " + elemento);
        }); 
    //    for(String elemento : coleccion) {
    //        System.out.println("elemento = " + elemento);
    //    }
    }
}
