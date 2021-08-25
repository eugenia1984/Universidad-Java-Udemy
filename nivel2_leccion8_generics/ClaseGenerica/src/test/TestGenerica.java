
package test;

import genericos.ClaseGenerica;


public class TestGenerica {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        //para mandar a imprimir
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Euge");
        objetoString.obtenerTipo();
    }
    
}
