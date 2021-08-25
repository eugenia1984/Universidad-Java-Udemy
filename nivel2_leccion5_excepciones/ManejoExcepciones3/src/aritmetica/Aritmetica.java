package aritmetica;

import excepciones.OperacionExcepcion;

public class Aritmetica {
//throws OperacionExcepcion -> me avisa que puede lanzar una excepcion del tipo OperacionExcepcion
    //no es necesario tener throws OperacionExcepcion  en la firma del metodo
    public static int division(int numerador, int denominador) {
        
        if (denominador == 0) {  //si denominador es igual a 0 voy a tener excepcion
            //igualmente la excepcion la creo solo que no la reporto en la firma dle metodo
            throw new OperacionExcepcion("Division entre cero"); 
        
        } 
        //si el denominador no es 0 ->  puedo hacer la division sin ningun problema
        return numerador / denominador;
    }
}
