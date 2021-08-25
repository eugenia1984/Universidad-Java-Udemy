/*
 * MAP -> HASHMAP
 */
package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestColeccionesMap {


    public static void main(String[] args) {
        // Instancio un nuevo objeto de la clase HASHMAP
        Map miMapa = new HashMap();
        //Agrego elementos
        miMapa.put("valor1","Euge");
        miMapa.put("valor2", "Agus");
        miMapa.put("valor3", "Ana");
        //Accedo a un elemento
        String elemento = (String)miMapa.get("valor1");
        System.out.println("El valor de la primer llave es: " + elemento);
        //Si quiero recuperar el valor de todas las llaves reutilizo mi metodo
        //imprmir ya que tengo un set
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    
     public static void imprimir(Collection coleccion){
      coleccion.forEach((elemento) -> {
          System.out.println("elemento = " + elemento);
      });
    }
}
